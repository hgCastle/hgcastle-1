package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface LoginMemberMapper {

    List<MemberDTO> selectAllMember();
    MemberDTO selectMemberById(String id);
}
