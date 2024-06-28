package com.hgcastle.service;


import com.hgcastle.dao.ExitDAO;
import com.hgcastle.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;


import static com.hgcastle.common.Template.getSqlSession;

public class ExitService {

    private final ExitDAO exitDAO;

    public ExitService(){
        exitDAO = new ExitDAO();

    }

    public MemberDTO selectId(String id) {

        SqlSession sqlSession = getSqlSession();

        MemberDTO member = exitDAO.selectId(sqlSession,id);

        sqlSession.close();

        return member;
    }

}

