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

    public void viewMembersById(String id) {

        try (SqlSession sqlSession = getSqlSession()) {
            mapper = sqlSession.getMapper(MemberMapperSelect.class);
            List<MemberDTO> memberList = mapper.viewMembersById(id);
            for (MemberDTO memberDTO : memberList) {
                System.out.println(memberDTO);
            }
        }
    }

    public void viewMembersByName(String name) {

        try (SqlSession sqlSession = getSqlSession()) {
            mapper = sqlSession.getMapper(MemberMapperSelect.class);
            List<MemberDTO> memberList = mapper.viewMembersByName(name);
            for (MemberDTO memberDTO : memberList) {
                System.out.println(memberDTO);
            }
        }
    }

    public void viewMembersByWarnCount() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        List<MemberDTO> memberList = mapper.viewMembersByWarnCount();

        for(MemberDTO memberDTO :memberList) {
            System.out.println(memberDTO);
        }

        sqlSession.close();
    }

    public void viewMembersByQuitDate() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapperSelect.class);

        List<MemberDTO> memberList = mapper.viewMembersByQuitDate();

        for(MemberDTO memberDTO :memberList) {
            System.out.println(memberDTO);
        }

        sqlSession.close();
    }
}
