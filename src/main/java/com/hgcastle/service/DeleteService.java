package com.hgcastle.service;

import com.hgcastle.mapper.MemberDeleteMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.Template.getSqlSession;

public class DeleteService {

    private MemberDeleteMapper memberDeleteMapper;

    public boolean deleteMemberId(String id) {
        SqlSession sqlSession = getSqlSession();

        memberDeleteMapper = sqlSession.getMapper(MemberDeleteMapper.class);

        int result = memberDeleteMapper.deleteMemberId(id);

        if (result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
