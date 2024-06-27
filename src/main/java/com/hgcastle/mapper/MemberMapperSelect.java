package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.lang.reflect.Member;
import java.util.List;

public interface MemberMapperSelect {

    List<MemberDTO> viewAllMembers();

    MemberDTO viewMembersById(String id);

    MemberDTO viewMembersByName(String name);

    List<MemberDTO> viewMembersByWarnCount();

    List<MemberDTO> viewMembersByQuitDate();
}
