package com.hgcastle.service;

import com.hgcastle.common.MemberDTO;
import com.hgcastle.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hgcastle.common.Template.getSqlSession;

public class SelectService {

    private MemberMapper mapper;

    public void viewAllMembers() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.viewAllMembers();

        for(MemberDTO memberDTO :memberList) {
            System.out.println(memberDTO);
        }
        sqlSession.close();

    }

    public void viewMembersById() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        sqlSession.close();
    }

    public void viewMembersByName() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        sqlSession.close();
    }

    public void viewMembersByWarnCount() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        sqlSession.close();
    }

    public void viewMembersByQuitDate() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        sqlSession.close();
    }
}
