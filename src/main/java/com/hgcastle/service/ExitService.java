package com.hgcastle.service;


import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberExitMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.ExitTemplate.getSqlSession;


public class ExitService {

    private MemberExitMapper mapper;

    public boolean exitMembersById(MemberDTO memberDTO) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberExitMapper.class);

        int result = mapper.exitMembersById(memberDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

}

