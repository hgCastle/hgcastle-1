package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hgcastle.common.Template.getSqlSession;

public class MemberService {

    private MemberMapper mapper;

    public boolean insertMember(MemberDTO newMember) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        int result = mapper.insertMember(newMember);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean isIdDuplicate(String id) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> idList = memberList.stream().map(MemberDTO::getId).toList();

        sqlSession.close();

        if (idList.contains(id)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNicknameDuplicate(String nickname) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> nicknameList = memberList.stream().map(MemberDTO::getNickname).toList();

        sqlSession.close();

        if (nicknameList.contains(nickname)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPhoneDuplicate(String phone) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> phoneList = memberList.stream().map(MemberDTO::getPhone).toList();

        sqlSession.close();

        if (phoneList.contains(phone)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRrnDuplicate(String rrn) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> rrnList = memberList.stream().map(MemberDTO::getRrn).toList();

        sqlSession.close();

        if (rrnList.contains(rrn)) {
            return true;
        } else {
            return false;
        }
    }

    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();

        sqlSession.close();

        return memberList;
    }

    public MemberDTO selectMemberById(String id) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        MemberDTO member = mapper.selectMemberById(id);

        sqlSession.close();

        return member;
    }
}
