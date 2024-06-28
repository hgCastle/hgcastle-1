package com.hgcastle.service;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.mapper.LoginMemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hgcastle.common.Template.getSqlSession;

public class LoginService {

    private LoginMemberMapper mapper;

    public boolean isItExistId(String id) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(LoginMemberMapper.class);

        List<MemberDTO> memberList = mapper.selectAllMember();
        List<String> idList = memberList.stream().map(MemberDTO::getId).toList();

        if (idList.contains(id)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String id, String yourPassword) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(LoginMemberMapper.class);

        MemberDTO member = mapper.selectMemberById(id);
        String password = member.getPassword();

        if (password.equals(yourPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
