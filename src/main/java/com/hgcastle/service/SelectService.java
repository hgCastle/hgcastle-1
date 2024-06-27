package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberMapperSelect;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hgcastle.common.Template.getSqlSession;

public class SelectService {

    private MemberMapperSelect mapper;

    public void viewAllMembers() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        List<MemberDTO> memberList = mapper.viewAllMembers();

        for(MemberDTO memberDTO :memberList) {
            System.out.println(memberDTO);
        }
        sqlSession.close();

    }

    public MemberDTO viewMembersById(String id) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        MemberDTO member = mapper.viewMembersById(id);

        sqlSession.close();

        return member;
    }

    public MemberDTO viewMembersByName(String name) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        MemberDTO member = mapper.viewMembersByName(name);

        sqlSession.close();

        return member;
    }

    public void viewMembersByWarnCount() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        List<MemberDTO> memberList = mapper.viewMembersByWarnCount();

        if (memberList.isEmpty()) {
            System.out.println("경고누적횟수가 1 이상인 회원이 없습니다.");
        } else {
            for (MemberDTO memberDTO : memberList) {
                System.out.println(memberDTO);
            }
        }
            sqlSession.close();
        }


    public void viewMembersByQuitDate() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        List<MemberDTO> memberList = mapper.viewMembersByQuitDate();

        if (memberList.isEmpty()) {
            System.out.println("현재 탈퇴한 회원이 없습니다.");
        } else {
            for (MemberDTO memberDTO : memberList) {
                System.out.println(memberDTO);
            }
        }
        sqlSession.close();
    }
}
