package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {

    List<MemberDTO> selectAllMember();
    List<MemberDTO> selectMemberByWarnCount();
    List<MemberDTO> selectQuitMember();
    MemberDTO selectMemberById(String id);
    MemberDTO selectMemberByName(String name);
    int insertMember(MemberDTO newMember);
    int updateWithdrawMember(String id, String date);
}
