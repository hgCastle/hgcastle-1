package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.MemberInsertMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

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

    public String inputId() {
        Scanner sc = new Scanner(System.in);
        SqlSession sqlSession = getSqlSession();
        String obj = "아이디";

        mapper = sqlSession.getMapper(MemberInsertMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> idList = memberList.stream().map(MemberDTO::getId).toList();



    }
}
