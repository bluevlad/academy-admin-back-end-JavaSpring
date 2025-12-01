package com.academy.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Series Mapper Interface
 * lectureSeriesSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface SeriesMapper {

    /**
     * 시리즈 목록 조회
     */
    List<HashMap<String, String>> seriesList(Object obj);

    /**
     * 시리즈 목록 카운트
     */
    int seriesListCount(Object obj);

    /**
     * 시리즈 등록
     */
    void seriesInsert(Object obj);

    /**
     * 시리즈 상세 조회
     */
    List<HashMap<String, String>> seriesView(Object obj);

    /**
     * 시리즈 수정
     */
    void seriesUpdate(Object obj);

    /**
     * 시리즈 삭제
     */
    void seriesDelete(Object obj);

    /**
     * 시리즈 중복 체크
     */
    int seriesCheck(Object obj);

    /**
     * 카테고리 삭제
     */
    void categoryDelete(Object obj);
}