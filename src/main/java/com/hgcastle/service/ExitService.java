package com.hgcastle.service;


import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberExitMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.Template.getSqlSession;


public class ExitService {

    private MemberExitMapper memberExitMapper;


    public MemberDTO selectMemberId(String id) {

        SqlSession sqlSession = getSqlSession();

        memberExitMapper = sqlSession.getMapper(MemberExitMapper.class);

        MemberDTO member = memberExitMapper.selectMemberId(id);

        sqlSession.close();

        return member;
    }
}

