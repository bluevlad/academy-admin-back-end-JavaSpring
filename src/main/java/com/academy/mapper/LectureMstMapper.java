package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * LectureMst Mapper Interface
 * lectureMstSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface LectureMstMapper {

    /**
     * 강의 마스터 목록 조회
     */
    List<HashMap<String, String>> lecturemstList(HashMap<String, String> params);

    /**
     * 강의 마스터 목록 카운트
     */
    int lecturemstListCount(HashMap<String, String> params);

    /**
     * 브릿지 마스터 코드 시퀀스 조회
     */
    List<HashMap<String, String>> getBridgeMstcodeSeq(HashMap<String, String> params);

    /**
     * 브릿지 마스터 코드 조회
     */
    List<HashMap<String, String>> getBridgeMstcode(HashMap<String, String> params);

    /**
     * 마스터 코드 조회
     */
    List<HashMap<String, String>> getMstcode(HashMap<String, String> params);

    /**
     * 강의 마스터 등록
     */
    void lecturemstInsert(HashMap<String, String> params);

    /**
     * 강의 브릿지 등록
     */
    void lectureBridgeInsert(HashMap<String, String> params);

    /**
     * 강의 교재 등록2
     */
    void lectureBookInsert2(HashMap<String, String> params);

    /**
     * 강의 데이터 메모 뷰 목록
     */
    List<HashMap<String, String>> lectureDataMemoViewList(HashMap<String, String> params);

    /**
     * 강의 데이터 뷰 목록
     */
    List<HashMap<String, String>> lectureDataViewList(HashMap<String, String> params);

    /**
     * 강의 WMV
     */
    List<HashMap<String, String>> lectureWMV(HashMap<String, String> params);

    /**
     * 강의 다운로드 카운트
     */
    List<HashMap<String, String>> lectureDown_Count(HashMap<String, String> params);

    /**
     * 강의 삭제 체크
     */
    int lectureDeleteCheck(HashMap<String, String> params);

    /**
     * 강의 조회
     */
    List<HashMap<String, String>> lectureView(HashMap<String, String> params);

    /**
     * 강의 뷰 교재 목록
     */
    List<HashMap<String, String>> lectureViewBookList(HashMap<String, String> params);

    /**
     * 강의 뷰 목록
     */
    List<HashMap<String, String>> lectureViewList(HashMap<String, String> params);

    /**
     * 강의 교재 삭제
     */
    void lectureBookDelete(HashMap<String, String> params);

    /**
     * 강의 마스터 수정
     */
    void lecturemstUpdate(HashMap<String, String> params);

    /**
     * 강의 교재 등록
     */
    void lectureBookInsert(HashMap<String, String> params);

    /**
     * 강의 삭제
     */
    void lectureDelete(HashMap<String, String> params);

    /**
     * 강의 브릿지 삭제
     */
    void lectureBridgeDelete(HashMap<String, String> params);
}