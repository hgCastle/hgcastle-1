package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

public interface MemberDeleteMapper {
    int deleteMembersById(MemberDTO memberDTO);
}
