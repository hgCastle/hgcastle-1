package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface SelectMemberMapper {

    List<MemberDTO> viewAllMembers();

    MemberDTO viewMembersById(String id);

    MemberDTO viewMembersByName(String name);

    List<MemberDTO> viewMembersByWarnCount();

    List<MemberDTO> viewMembersByQuitDate();
}
