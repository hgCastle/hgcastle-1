package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface MemberInsertMapper {

    int insertMember(MemberDTO newMember);
    List<MemberDTO> selectAllMember();
}
