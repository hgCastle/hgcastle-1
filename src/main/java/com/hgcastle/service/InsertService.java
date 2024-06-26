package com.hgcastle.service;

import com.hgcastle.common.MemberDTO;
import com.hgcastle.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.Template.getSqlSession;

public class InsertService {

    private MemberMapper mapper;

    public static void insertMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MemberMapper.class);
    }
}
