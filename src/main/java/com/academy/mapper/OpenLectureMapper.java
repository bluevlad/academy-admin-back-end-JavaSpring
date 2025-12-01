package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * OpenLecture Mapper Interface
 * lectureOffSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface OpenLectureMapper {

    /**
     * 오픈강의 목록 조회
     */
    List<HashMap<String, String>> openlectureList(HashMap<String, String> params);

    /**
     * 오픈강의 목록 카운트
     */
    int openlectureListCount(HashMap<String, String> params);

    /**
     * 교재 목록 조회
     */
    List<HashMap<String, String>> bookList(HashMap<String, String> params);

    /**
     * 교재 목록 카운트
     */
    int bookListCount(HashMap<String, String> params);

    /**
     * 브릿지 강의코드 시퀀스 조회
     */
    List<HashMap<String, String>> getBridgeLeccodeSeq(HashMap<String, String> params);

    /**
     * 종강 강의코드 시퀀스 조회
     */
    List<HashMap<String, String>> getJongLeccodeSeq(HashMap<String, String> params);

    /**
     * 오픈강의 코드 조회
     */
    List<HashMap<String, String>> getopenLeccode(HashMap<String, String> params);

    /**
     * 브릿지 강의코드 조회
     */
    List<HashMap<String, String>> getBridgeLeccode(HashMap<String, String> params);

    /**
     * 브릿지 강의코드
     */
    List<HashMap<String, String>> BridgeLeccode(HashMap<String, String> params);

    /**
     * 오픈강의 등록
     */
    void openlectureInsert(HashMap<String, String> params);

    /**
     * 오픈강의 브릿지 등록
     */
    void openlectureBridgeInsert(HashMap<String, String> params);

    /**
     * 오픈강의 교재 등록
     */
    void openlectureBookInsert(HashMap<String, String> params);

    /**
     * 오픈강의 교재 등록2
     */
    void openlectureBookInsert2(HashMap<String, String> params);

    /**
     * 오픈강의 뷰 목록
     */
    List<HashMap<String, String>> openlectureViewList(HashMap<String, String> params);

    /**
     * 오픈강의 조회
     */
    List<HashMap<String, String>> openlectureView(HashMap<String, String> params);

    /**
     * 오픈강의 뷰 교재 목록
     */
    List<HashMap<String, String>> openlectureViewBookList(HashMap<String, String> params);

    /**
     * 오픈강의 교재 삭제
     */
    void openlectureBookDelete(HashMap<String, String> params);

    /**
     * 오픈강의 수정
     */
    void openlectureUpdate(HashMap<String, String> params);

    /**
     * 오픈강의 사용여부 수정
     */
    void openlectureIsUseUpdate(HashMap<String, String> params);

    /**
     * 강의 On/Off 수정
     */
    void Modify_Lecture_On_Off(HashMap<String, String> params);

    /**
     * 오픈강의 삭제
     */
    void openlectureDelete(HashMap<String, String> params);

    /**
     * 오픈강의 브릿지 삭제
     */
    void openlectureBridgeDelete(HashMap<String, String> params);

    /**
     * 강의 이동 수정
     */
    void lecMovUpdate(HashMap<String, String> params);

    /**
     * 오픈강의 순서 목록
     */
    List<HashMap<String, String>> openlectureSeqList(HashMap<String, String> params);

    /**
     * 오픈강의 순서 수정
     */
    void openlectureSeqUpdate(HashMap<String, String> params);

    /**
     * 오픈강의 종강 뷰 목록
     */
    List<HashMap<String, String>> openlectureViewJongList(HashMap<String, String> params);

    /**
     * 오픈강의 종강 목록
     */
    List<HashMap<String, String>> openlectureJongList(HashMap<String, String> params);

    /**
     * 오픈강의 종강 목록 카운트
     */
    int openlectureJongListCount(HashMap<String, String> params);

    /**
     * 오픈강의 종강 조회
     */
    List<HashMap<String, String>> openlectureJongView(HashMap<String, String> params);

    /**
     * 오픈강의 종강 과목 목록
     */
    List<HashMap<String, String>> openlectureJongSubjectList(HashMap<String, String> params);

    /**
     * 오픈강의 종강 과목 목록 카운트
     */
    int openlectureJongSubjectListCount(HashMap<String, String> params);

    /**
     * 오픈강의 종강 등록
     */
    void openlectureLecJongInsert(HashMap<String, String> params);

    /**
     * 오픈강의 선택 종강 번호 등록
     */
    void openlectureChoiceJongNoInsert(HashMap<String, String> params);

    /**
     * 오픈강의 뷰 강의코드 목록
     */
    List<HashMap<String, String>> openlectureViewLeccodeList(HashMap<String, String> params);

    /**
     * 오픈강의 종강 삭제
     */
    void openlectureLecJongDelete(HashMap<String, String> params);

    /**
     * 오픈강의 선택 종강 번호 삭제
     */
    void openlectureChoiceJongNoDelete(HashMap<String, String> params);

    /**
     * 오픈강의 결제 목록
     */
    List<HashMap<String, String>> openlecturePayList(HashMap<String, String> params);

    /**
     * 오픈강의 종강 결제 목록
     */
    List<HashMap<String, String>> openlectureJongPayList(HashMap<String, String> params);

    /**
     * 오픈강의 데이터 메모 뷰 목록
     */
    List<HashMap<String, String>> openlectureDataMemoViewList(HashMap<String, String> params);

    /**
     * 오픈강의 데이터 뷰 목록
     */
    List<HashMap<String, String>> openlectureDataViewList(HashMap<String, String> params);

    /**
     * 오픈강의 데이터 동영상 뷰 목록
     */
    List<HashMap<String, String>> openlectureDataMovieViewList(HashMap<String, String> params);

    /**
     * 오픈강의 데이터 동영상 목록
     */
    List<HashMap<String, String>> openlectureDataMovieList(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 등록
     */
    void openlectureMovieInsert(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 삭제
     */
    void openlectureMovieDelete(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 수정
     */
    void openlectureMovieUpdate(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 파일 삭제
     */
    void openlectureMovieFileDelete(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 메모 등록
     */
    void openlectureMovieMemoInsert(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 메모 수정
     */
    void openlectureMovieMemoUpdate(HashMap<String, String> params);

    /**
     * 오픈강의 동영상 메모 삭제
     */
    void openlectureMovieMemoDelete(HashMap<String, String> params);

    /**
     * 오픈강의 삭제 체크
     */
    int openlectureDeleteCheck(HashMap<String, String> params);

    /**
     * 재생 정보
     */
    List<HashMap<String, String>> playinfo(HashMap<String, String> params);

    /**
     * 무료 관리자 동영상 조회
     */
    List<HashMap<String, String>> getCbMovie4_free_admin(HashMap<String, String> params);

    /**
     * 무료 관리자 동영상 카운트
     */
    int getCbMovie4_free_admin_count(HashMap<String, String> params);

    /**
     * 오픈강의 온라인 상세 조회
     */
    HashMap<String, String> openlectureOnDetailS(HashMap<String, String> params);

    /**
     * PMP 다운로드 로그 등록
     */
    void insertPmpDownLog(HashMap<String, String> params);

    /**
     * 오픈강의 WMV
     */
    List<HashMap<String, String>> openlectureWMV(HashMap<String, String> params);

    /**
     * 오픈강의 다운로드 카운트
     */
    List<HashMap<String, String>> openlectureDown_Count(HashMap<String, String> params);
}