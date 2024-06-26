package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface MemberMapperSelect {

    List<MemberDTO> viewAllMembers();

    List<MemberDTO> viewMembersById(String id);

    List<MemberDTO> viewMembersByName(String name);

    List<MemberDTO> viewMembersByWarnCount();

    List<MemberDTO> viewMembersByQuitDate();
}
