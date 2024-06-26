package com.hgcastle.dao;

import com.hgcastle.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

public class ExitDAO {

    public MemberDTO selectId(SqlSession sqlSession, String id) {

        return sqlSession.selectOne("MemberExitMapper.selectId", id);
    }
}
