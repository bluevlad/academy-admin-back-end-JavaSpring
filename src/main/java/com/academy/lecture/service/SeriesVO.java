package com.academy.lecture.service;

import java.io.Serializable;

import com.academy.common.CommonVO;

/**
 * Series Value Object
 * TB_SERIES_INFO 테이블 매핑 VO
 */
public class SeriesVO extends CommonVO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Series specific fields
    private String srsCd;       // SRS_CD - 시리즈 코드
    private String srsNm;       // SRS_NM - 시리즈 이름
    private String srsDiv;      // SRS_DIV - 시리즈 구분
    // isUse, regDt, regId, updDt, updId inherited from CommonVO

    // Display fields
    private String srsDivNm;    // SRS_DIVNM - 시리즈 구분명
    private String isUseNm;     // ISUSENM - 사용여부명

    public String getSrsCd() {
        return srsCd;
    }

    public void setSrsCd(String srsCd) {
        this.srsCd = srsCd;
    }

    public String getSrsNm() {
        return srsNm;
    }

    public void setSrsNm(String srsNm) {
        this.srsNm = srsNm;
    }

    public String getSrsDiv() {
        return srsDiv;
    }

    public void setSrsDiv(String srsDiv) {
        this.srsDiv = srsDiv;
    }

    public String getSrsDivNm() {
        return srsDivNm;
    }

    public void setSrsDivNm(String srsDivNm) {
        this.srsDivNm = srsDivNm;
    }

    public String getIsUseNm() {
        return isUseNm;
    }

    public void setIsUseNm(String isUseNm) {
        this.isUseNm = isUseNm;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
    }
}