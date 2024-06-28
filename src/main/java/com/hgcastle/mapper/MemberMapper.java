package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {

    List<MemberDTO> selectAllMember();
    int insertMember(MemberDTO newMember);
    MemberDTO selectMemberById(String id);
}
