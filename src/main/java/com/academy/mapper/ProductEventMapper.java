package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * ProductEvent Mapper Interface
 * ProductEvent 관련 XML 매퍼 파일과 연동
 */
@Mapper
public interface ProductEventMapper {

    /**
     * 상품 이벤트 목록 조회
     */
    List<HashMap<String, String>> list(HashMap<String, String> params);

    /**
     * 상품 이벤트 목록 카운트
     */
    int listCount(HashMap<String, String> params);

    /**
     * 상품 이벤트 단건 조회
     */
    HashMap<String, String> getOne(HashMap<String, String> params);

    /**
     * 상품 목록 조회
     */
    List<HashMap<String, String>> list_prd(HashMap<String, String> params);

    /**
     * 상품 이벤트 등록
     */
    void insert(HashMap<String, String> params);

    /**
     * 상품 이벤트 수정
     */
    void update(HashMap<String, String> params);

    /**
     * 강의 등록
     */
    void lec_insert(HashMap<String, String> params);

    /**
     * 강의 삭제
     */
    void lec_delete(HashMap<String, String> params);
}