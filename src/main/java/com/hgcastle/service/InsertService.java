package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberInsertMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hgcastle.common.Template.getSqlSession;

public class InsertService {

    private MemberInsertMapper mapper;

    public boolean insertMember(MemberDTO newMember) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberInsertMapper.class);

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

        mapper = sqlSession.getMapper(MemberInsertMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> idList = memberList.stream().map(MemberDTO::getId).toList();

        if (idList.contains(id)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNicknameDuplicate(String nickname) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberInsertMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> nicknameList = memberList.stream().map(MemberDTO::getNickname).toList();

        if (nicknameList.contains(nickname)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPhoneDuplicate(String phone) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberInsertMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> phoneList = memberList.stream().map(MemberDTO::getPhone).toList();

        if (phoneList.contains(phone)) {
            return true;
        } else {
            return false;
        }
    }
}
