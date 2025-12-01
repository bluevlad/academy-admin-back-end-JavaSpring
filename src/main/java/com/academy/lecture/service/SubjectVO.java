package com.academy.lecture.service;

import java.io.Serializable;

import com.academy.common.CommonVO;

/**
 * Subject Value Object
 * TB_SUBJECT_INFO 테이블 매핑 VO
 */
public class SubjectVO extends CommonVO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Subject specific fields
    private String sjtCd;       // SJT_CD - 과목 코드
    private String sjtNm;       // SJT_NM - 과목 이름
    private String pSjtCd;      // P_SJT_CD - 부모 과목 코드
    private Integer sjtDepth;   // SJT_DEPTH - 과목 깊이
    private Integer sjtOrdr;    // SJT_ORDR - 과목 순서
    // isUse, regDt, regId, updDt, updId inherited from CommonVO

    // Display fields
    private String isUseNm;     // ISUSENM - 사용여부명
    private String pSjtNm;      // P_SJT_NM - 부모 과목명

    public String getSjtCd() {
        return sjtCd;
    }

    public void setSjtCd(String sjtCd) {
        this.sjtCd = sjtCd;
    }

    public String getSjtNm() {
        return sjtNm;
    }

    public void setSjtNm(String sjtNm) {
        this.sjtNm = sjtNm;
    }

    public String getpSjtCd() {
        return pSjtCd;
    }

    public void setpSjtCd(String pSjtCd) {
        this.pSjtCd = pSjtCd;
    }

    public Integer getSjtDepth() {
        return sjtDepth;
    }

    public void setSjtDepth(Integer sjtDepth) {
        this.sjtDepth = sjtDepth;
    }

    public Integer getSjtOrdr() {
        return sjtOrdr;
    }

    public void setSjtOrdr(Integer sjtOrdr) {
        this.sjtOrdr = sjtOrdr;
    }

    public String getIsUseNm() {
        return isUseNm;
    }

    public void setIsUseNm(String isUseNm) {
        this.isUseNm = isUseNm;
    }

    public String getpSjtNm() {
        return pSjtNm;
    }

    public void setpSjtNm(String pSjtNm) {
        this.pSjtNm = pSjtNm;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
    }
}