package com.hgcastle.service;


import com.hgcastle.mapper.MemberExitMapper;
import org.apache.ibatis.session.SqlSession;


import static com.hgcastle.common.Template.getSqlSession;

public class ExitService {

    private MemberExitMapper memberExitMapper;

    public void selectId(String id) {

        SqlSession sqlSession = getSqlSession();




    }

}

