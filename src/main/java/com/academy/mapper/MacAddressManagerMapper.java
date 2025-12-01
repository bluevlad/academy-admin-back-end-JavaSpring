package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * MacAddressManager Mapper Interface
 * lectureMacAddressManagerSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface MacAddressManagerMapper {

    /**
     * MAC 주소 관리자 목록 조회
     */
    List<HashMap<String, String>> macaddressmanagerList(HashMap<String, String> params);

    /**
     * 디바이스 목록 조회
     */
    List<HashMap<String, String>> devicelist(HashMap<String, String> params);

    /**
     * MAC 주소 조회
     */
    List<HashMap<String, String>> macaddressView(HashMap<String, String> params);

    /**
     * MAC 주소 관리자 목록 카운트
     */
    int macaddressmanagerListCount(HashMap<String, String> params);

    /**
     * MAC 주소 관리자 수정
     */
    void macaddressmanagerUpdate(HashMap<String, String> params);

    /**
     * MAC 주소 관리자 수정1
     */
    void macaddressmanagerUpdate1(HashMap<String, String> params);
}