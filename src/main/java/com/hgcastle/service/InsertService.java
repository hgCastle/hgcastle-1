package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberInsertMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.InsertTemplate.getSqlSession;

public class InsertService {

    private MemberInsertMapper mapper;

    public boolean insertMember(MemberDTO newMember) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MemberInsertMapper.class);

        int result = mapper.insertMember(newMember);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
}
