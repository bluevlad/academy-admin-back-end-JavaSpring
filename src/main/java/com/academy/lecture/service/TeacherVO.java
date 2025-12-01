package com.academy.lecture.service;

import java.io.Serializable;

import com.academy.common.CommonVO;

/**
 * Teacher (MA Member) Value Object
 * TB_MA_MEMBER 테이블 매핑 VO
 */
public class TeacherVO extends CommonVO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Teacher specific fields
    private Integer maSn;           // MA_SN - 강사 일련번호
    private String userId;          // USER_ID - 사용자 ID
    private String userNm;          // USER_NM - 사용자 이름
    private String userPwd;         // USER_PWD - 비밀번호
    private String email;           // EMAIL - 이메일
    private String pic;             // PIC - 사진 (소)
    private String intro;           // INTRO - 소개
    private String lecIntro;        // LEC_INTRO - 강의 소개
    private String orgPic;          // ORG_PIC - 원본 사진
    private String orgIntro;        // ORG_INTRO - 원본 소개
    private String picDetail;       // PIC_DETAIL - 상세 사진
    private String memType;         // MEM_TYPE - 회원 유형
    private Integer orderSeq;       // ORDER_SEQ - 정렬 순서
    // isUse, regDt, regId, updDt, updId inherited from CommonVO

    // Display fields
    private String isUseNm;         // ISUSENM - 사용여부명
    private String memTypeNm;       // MEM_TYPENM - 회원 유형명

    public Integer getMaSn() {
        return maSn;
    }

    public void setMaSn(Integer maSn) {
        this.maSn = maSn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getLecIntro() {
        return lecIntro;
    }

    public void setLecIntro(String lecIntro) {
        this.lecIntro = lecIntro;
    }

    public String getOrgPic() {
        return orgPic;
    }

    public void setOrgPic(String orgPic) {
        this.orgPic = orgPic;
    }

    public String getOrgIntro() {
        return orgIntro;
    }

    public void setOrgIntro(String orgIntro) {
        this.orgIntro = orgIntro;
    }

    public String getPicDetail() {
        return picDetail;
    }

    public void setPicDetail(String picDetail) {
        this.picDetail = picDetail;
    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public Integer getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getIsUseNm() {
        return isUseNm;
    }

    public void setIsUseNm(String isUseNm) {
        this.isUseNm = isUseNm;
    }

    public String getMemTypeNm() {
        return memTypeNm;
    }

    public void setMemTypeNm(String memTypeNm) {
        this.memTypeNm = memTypeNm;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
    }
}