package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Subject Mapper Interface
 * lectureSubjectSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface SubjectMapper {

    /**
     * 과목 목록 조회
     */
    List<HashMap<String, String>> subjectList(HashMap<String, String> params);

    /**
     * 과목 목록 카운트
     */
    int subjectListCount(HashMap<String, String> params);

    /**
     * 과목 코드 생성
     */
    String subjectGetCode(HashMap<String, String> params);

    /**
     * 과목 등록
     */
    void subjectInsert(HashMap<String, String> params);

    /**
     * 과목 상세 조회
     */
    List<HashMap<String, String>> subjectView(HashMap<String, String> params);

    /**
     * 과목 수정
     */
    void subjectUpdate(HashMap<String, String> params);

    /**
     * 과목 삭제
     */
    void subjectDelete(HashMap<String, String> params);

    /**
     * 과목 중복 체크
     */
    int subjectCheck(HashMap<String, String> params);

    /**
     * 과목 카테고리 등록
     */
    void subjectCategoryInsert(HashMap<String, String> params);

    /**
     * 과목 카테고리 삭제
     */
    void subjectCategoryDelete(HashMap<String, String> params);

    /**
     * 과목 카테고리 삭제 (카테고리별)
     */
    void subjectCategoryDeleteByCat(HashMap<String, String> params);

    /**
     * 과목 카테고리 순서 등록
     */
    void subjectCategoryOrderInsert(HashMap<String, String> params);

    /**
     * 과목 카테고리 순서 개수 체크
     */
    int chkSubjectCategoryOrderCnt(HashMap<String, String> params);

    /**
     * 과목 카테고리 개수 체크
     */
    int chkSubjectCategoryCnt(HashMap<String, String> params);

    /**
     * 과목 카테고리 순서 인덱스 조회
     */
    String getSubjectCategoryOrderIdx(HashMap<String, String> params);

    /**
     * 과목 카테고리 순서 삭제 (On/Off별)
     */
    void subjectCategoryOrderDeleteByOnoff(HashMap<String, String> params);

    /**
     * 과목 카테고리 순서 삭제
     */
    void subjectCategoryOrderDelete(HashMap<String, String> params);

    /**
     * 과목 카테고리 상세 조회
     */
    List<HashMap<String, String>> subjectCategoryView(HashMap<String, String> params);

    /**
     * 과목 카테고리 목록 조회
     */
    List<HashMap<String, String>> findSubjectCategoryList(HashMap<String, String> params);

    /**
     * 메인 카테고리 과목 순서 등록
     */
    void main_category_subject_order_Insert(HashMap<String, String> params);
}