package com.hgcastle.dao;

import com.hgcastle.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

public class DeleteDAO {

    public MemberDTO deleteMember(SqlSession sqlSession, String id) {

        return sqlSession.selectOne("MemberDeleteMemberMapper.deleteMember", id);
    }
}
