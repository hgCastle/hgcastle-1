package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface InsertMemberMapper {

    int insertMember(MemberDTO newMember);
    List<MemberDTO> selectAllMember();
}
