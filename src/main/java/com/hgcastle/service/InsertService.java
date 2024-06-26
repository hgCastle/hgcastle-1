package com.hgcastle.service;

import com.hgcastle.common.MemberDTO;
import com.hgcastle.mapper.MemberInsertMapper;
import org.apache.ibatis.session.SqlSession;

import static com.hgcastle.common.InsertTemplate.getSqlSession;

public class InsertService {

    private MemberInsertMapper mapper;

    public void insertMember(MemberDTO newMember) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MemberInsertMapper.class);

        int result = mapper.insertMember(newMember);

        System.out.println();
        if (result > 0) {
            System.out.println("===========================");
            System.out.println("신규 회원 등록이 완료되었습니다.");
            System.out.println("===========================");
            sqlSession.commit();
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!! 회원 등록을 실패했습니다 !!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            sqlSession.rollback();
        }
        sqlSession.close();
    }


}
