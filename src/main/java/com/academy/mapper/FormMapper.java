package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Form Mapper Interface
 * lectureFormSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface FormMapper {

    /**
     * 학습형태 목록 조회
     */
    List<HashMap<String, String>> formList(HashMap<String, String> params);

    /**
     * 학습형태 목록 카운트
     */
    int formListCount(HashMap<String, String> params);

    /**
     * 학습형태 코드 생성
     */
    String formGetCode();

    /**
     * 학습형태 등록
     */
    void formInsert(HashMap<String, String> params);

    /**
     * 학습형태 상세 조회
     */
    List<HashMap<String, String>> formView(HashMap<String, String> params);

    /**
     * 학습형태 수정
     */
    void formUpdate(HashMap<String, String> params);

    /**
     * 학습형태 삭제
     */
    void formDelete(HashMap<String, String> params);

    /**
     * 학습형태 중복 체크
     */
    int formCheck(HashMap<String, String> params);

    /**
     * 코드 목록 조회
     */
    List<HashMap<String, String>> getCodeList(HashMap<String, String> params);
}