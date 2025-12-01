package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Kind Mapper Interface
 * lectureKindSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface KindMapper {

    /**
     * Kind 목록 조회 (간단)
     */
    List<HashMap<String, String>> getKindList(Object obj);

    /**
     * Kind 목록 조회
     */
    List<HashMap<String, String>> kindList(HashMap<String, String> params);

    /**
     * Kind 목록 카운트
     */
    int kindListCount(HashMap<String, String> params);

    /**
     * Kind 등록
     */
    void kindInsert(HashMap<String, String> params);

    /**
     * Kind 상세 조회
     */
    List<HashMap<String, String>> kindView(HashMap<String, String> params);

    /**
     * Kind 수정
     */
    void kindUpdate(HashMap<String, String> params);

    /**
     * Kind 삭제
     */
    void kindDelete(HashMap<String, String> params);

    /**
     * Kind 중복 체크
     */
    int kindCheck(HashMap<String, String> params);

    /**
     * Kind 코드 조회
     */
    List<HashMap<String, String>> selectKindCode();

    /**
     * 순서 업데이트
     */
    void SeqUpdate(HashMap<String, String> params);

    /**
     * 시리즈 카테고리 트리 조회
     */
    List<HashMap<String, Object>> getSeriesCateTree();

    /**
     * 최대 순서 조회
     */
    HashMap<String, Object> getMaxOrdr(Object obj);
}