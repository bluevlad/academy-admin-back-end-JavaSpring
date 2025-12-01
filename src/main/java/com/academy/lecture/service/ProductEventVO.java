package com.academy.lecture.service;

import java.io.Serializable;
import java.util.Date;

import com.academy.common.CommonVO;

/**
 * ProductEvent Value Object
 * TB_PRODUCT_EVENT 테이블 매핑 VO
 */
public class ProductEventVO extends CommonVO implements Serializable {

    private static final long serialVersionUID = 1L;

    // ProductEvent specific fields
    private String eventId;         // EVENT_ID - 이벤트 ID
    private String eventNm;         // EVENT_NM - 이벤트명
    private String eventType;       // EVENT_TYPE - 이벤트 타입
    private Integer eventAmount;    // EVENT_AMOUNT - 이벤트 금액
    private Date stDate;            // ST_DATE - 시작일
    private Date edDate;            // ED_DATE - 종료일
    private String eventYn;         // EVENT_YN - 이벤트 여부

    // Lecture 관련 fields
    private String leccode;         // LECCODE - 강의 코드

    // Search 관련 fields
    private String searchType;      // SEARCHTYPE - 검색 타입
    private String searchKeyword;   // SEARCHKEYWORD - 검색어
    private String catCd;           // CAT_CD - 카테고리 코드
    private String sjtCd;           // SJT_CD - 과목 코드
    private String menuId;          // MENU_ID - 메뉴 ID

    // Getters and Setters
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventNm() {
        return eventNm;
    }

    public void setEventNm(String eventNm) {
        this.eventNm = eventNm;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getEventAmount() {
        return eventAmount;
    }

    public void setEventAmount(Integer eventAmount) {
        this.eventAmount = eventAmount;
    }

    public Date getStDate() {
        return stDate;
    }

    public void setStDate(Date stDate) {
        this.stDate = stDate;
    }

    public Date getEdDate() {
        return edDate;
    }

    public void setEdDate(Date edDate) {
        this.edDate = edDate;
    }

    public String getEventYn() {
        return eventYn;
    }

    public void setEventYn(String eventYn) {
        this.eventYn = eventYn;
    }

    public String getLeccode() {
        return leccode;
    }

    public void setLeccode(String leccode) {
        this.leccode = leccode;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public String getCatCd() {
        return catCd;
    }

    public void setCatCd(String catCd) {
        this.catCd = catCd;
    }

    public String getSjtCd() {
        return sjtCd;
    }

    public void setSjtCd(String sjtCd) {
        this.sjtCd = sjtCd;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
    }
}