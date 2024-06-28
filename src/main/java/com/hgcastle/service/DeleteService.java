package com.hgcastle.service;

import com.hgcastle.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.Template.getSqlSession;

public class DeleteService {

    private MemberMapper memberMapper;

    public String deleteMember(String id) {
        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.deleteMember(id);

        if (result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
