package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberDeleteMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.Template.getSqlSession;


public class DeleteService {

    private MemberDeleteMapper mapper;

    public boolean deleteMembersById(MemberDTO memberDTO) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberDeleteMapper.class);

        int result = mapper.deleteMembersById(memberDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

}
