package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.sql.Date;
import java.util.List;

public interface MemberMapper {

    List<MemberDTO> selectAllMember();
    List<MemberDTO> selectMemberByWarnCount();
    List<MemberDTO> selectQuitMember();
    MemberDTO selectMemberById(String id);
    MemberDTO selectMemberByName(String name);
    int insertMember(MemberDTO newMember);
    int updateWithdrawMember(String id, Date quitDate);
}
