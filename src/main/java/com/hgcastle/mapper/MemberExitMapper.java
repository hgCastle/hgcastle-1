package com.hgcastle.mapper;

import com.hgcastle.dto.MemberDTO;

import java.util.Map;

public interface MemberExitMapper {

    MemberDTO selectId(Map<String, String>map);
}
