package com.academy.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * CategorySeries Mapper Interface
 * lectureCategorySeriesSQL.xml 매퍼 파일과 연동
 */
@Mapper
public interface CategorySeriesMapper {

    /**
     * 카테고리 시리즈 등록
     */
    void catSeriesInsert(Object obj);

    /**
     * 카테고리 시리즈 삭제 (카테고리 코드별)
     */
    void catSeriesDeleteWthCatCd(Object obj);

    /**
     * 카테고리 시리즈 삭제 (시리즈 코드별)
     */
    void catSeriesDeleteWthSrsCd(Object obj);
}