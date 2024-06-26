package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

public interface MemberInsertMapper {
    int insertMember(MemberDTO newMember);
}
