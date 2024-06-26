package com.hgcastle.mapper;

import com.hgcastle.common.MemberDTO;

import java.util.List;

public interface MemberMapperSelect {

    List<MemberDTO> viewAllMembers();

    List<MemberDTO> viewMembersById(String id);

    List<MemberDTO> viewMembersByName();

    List<MemberDTO> viewMembersByWarnCount();

    List<MemberDTO> viewMembersByQuitDate();
}
