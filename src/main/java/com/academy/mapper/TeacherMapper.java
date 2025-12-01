package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Teacher Mapper Interface
 * lectureTeacherSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface TeacherMapper {

    /**
     * Kind 목록 조회
     */
    List<HashMap<String, String>> getKindList(HashMap<String, String> params);

    /**
     * 과목 목록 조회
     */
    List<HashMap<String, String>> getSubjectList(HashMap<String, String> params);

    /**
     * 강사 목록 조회
     */
    List<HashMap<String, String>> teacherList(HashMap<String, String> params);

    /**
     * 강사 목록 카운트
     */
    int teacherListCount(HashMap<String, String> params);

    /**
     * 강사 전체 목록 조회
     */
    List<HashMap<String, String>> teacherAllList(HashMap<String, String> params);

    /**
     * 강사 ID 중복 체크
     */
    int teacherIdCheck(HashMap<String, String> params);

    /**
     * 강사 등록
     */
    void teacherInsert(Object obj);

    /**
     * 강사 상세 조회
     */
    List<HashMap<String, String>> teacherView(HashMap<String, String> params);

    /**
     * 강사 수정
     */
    void teacherUpdate(Object obj);

    /**
     * 강사 카테고리 등록
     */
    void teacherCategoryInsert(Object obj);

    /**
     * 강사 과목 등록
     */
    void teacherSubjectInsert(Object obj);

    /**
     * 강사 과목 수정
     */
    void teacherSubjectUpdate(Object obj);

    /**
     * 강사 과목 개수
     */
    int teacherSubjectCount(Object obj);

    /**
     * 강사 사용여부 수정
     */
    void teacherIsUseUpdate(Object obj);

    /**
     * 강사 삭제
     */
    void teacherDelete(HashMap<String, String> params);

    /**
     * 강사 카테고리 삭제
     */
    void teacherCategoryDelete(Object obj);

    /**
     * 강사 과목 삭제
     */
    void teacherSubjectDelete(Object obj);

    /**
     * 강사 순서 업데이트
     */
    void teacherSeqUpdate(Object obj);

    /**
     * 강사 교재 로그
     */
    List<HashMap<String, String>> teacherBookLog(HashMap<String, String> params);

    /**
     * 강사 메인 카테고리 등록
     */
    void teacherMain_Category_Insert(Object obj);

    /**
     * 강사 메인 카테고리 삭제
     */
    void teacherMain_Category_Delete(Object obj);

    /**
     * 강사 소개 카테고리 등록
     */
    void teacherIntro_Category_Insert(Object obj);

    /**
     * 강사 소개 F 카테고리 등록
     */
    void teacherIntro_F_Category_Insert(Object obj);

    /**
     * 강사 소개 카테고리 삭제
     */
    void teacherIntro_Category_Delete(Object obj);

    /**
     * 강사 소개 F 카테고리 삭제
     */
    void teacherIntro_F_Category_Delete(Object obj);

    /**
     * 강사 메인 목록 조회
     */
    List<HashMap<String, String>> teacherMainList(HashMap<String, String> params);

    /**
     * 강사 메인 목록 카운트
     */
    int teacherMainListCount(HashMap<String, String> params);

    /**
     * 강사 목록 검색
     */
    List<HashMap<String, String>> findTeacherList(HashMap<String, String> params);

    /**
     * 강사 메인 카테고리 과목
     */
    int teacherMain_Category_Subject(Object obj);

    /**
     * 강사 소개 카테고리 과목
     */
    int teacherIntro_Category_Subject(Object obj);

    /**
     * 강사 소개 F 카테고리 과목
     */
    int teacherIntro_F_Category_Subject(Object obj);

    /**
     * 강사 소개 목록 조회
     */
    List<HashMap<String, String>> teacherIntroList(HashMap<String, String> params);

    /**
     * 강사 소개 목록 카운트
     */
    int teacherIntroListCount(HashMap<String, String> params);

    /**
     * 강사 소개 OFF 목록 조회
     */
    List<HashMap<String, String>> teacherIntro_offList(HashMap<String, String> params);

    /**
     * 강사 소개 OFF 목록 카운트
     */
    int teacherIntro_offListCount(HashMap<String, String> params);

    /**
     * 강사 전체 목록 카운트
     */
    int teacherAllListCount(HashMap<String, String> params);
}