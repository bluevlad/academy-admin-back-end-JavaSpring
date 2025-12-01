package com.academy.lecture.service;

import java.io.Serializable;

import com.academy.common.CommonVO;

/**
 * Lecture Value Object
 * TB_LEC_MST 테이블 매핑 VO
 */
public class LectureVO extends CommonVO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Lecture specific fields
    private Integer seq;                        // SEQ - 시퀀스
    private String leccode;                     // LECCODE - 강의 코드
    private String categoryCd;                  // CATEGORY_CD - 카테고리 코드
    private String learningCd;                  // LEARNING_CD - 학습형태 코드
    private String subjectTeacher;              // SUBJECT_TEACHER - 강사
    private String subjectTeacherPayment;       // SUBJECT_TEACHER_PAYMENT - 강사 급여
    private String orgLeccode;                  // ORG_LECCODE - 원본 강의 코드
    private String subjectTitle;                // SUBJECT_TITLE - 강의 제목
    private String subjectDesc;                 // SUBJECT_DESC - 강의 설명 (CLOB)
    private String subjectMemo;                 // SUBJECT_MEMO - 강의 메모 (CLOB)
    private String subjectKeyword;              // SUBJECT_KEYWORD - 키워드
    private String subjectPeriod;               // SUBJECT_PERIOD - 수강기간
    private String subjectOffOpenYear;          // SUBJECT_OFF_OPEN_YEAR - 오프라인 개강년도
    private String subjectOffOpenMonth;         // SUBJECT_OFF_OPEN_MONTH - 오프라인 개강월
    private String subjectOffOpenDay;           // SUBJECT_OFF_OPEN_DAY - 오프라인 개강일
    private String subjectDiscount;             // SUBJECT_DISCOUNT - 할인율
    private String subjectPrice;                // SUBJECT_PRICE - 가격
    private String subjectPoint;                // SUBJECT_POINT - 포인트
    private String subjectMovie;                // SUBJECT_MOVIE - 동영상
    private String subjectPmp;                  // SUBJECT_PMP - PMP
    private String subjectMoviePmp;             // SUBJECT_MOVIE_PMP - 동영상+PMP
    private String subjectMovieMp4;             // SUBJECT_MOVIE_MP4 - 동영상 MP4
    private String subjectMovieVodMp4;          // SUBJECT_MOVIE_VOD_MP4 - VOD MP4
    private String subjectOption;               // SUBJECT_OPTION - 옵션
    private String subjectIsuse;                // SUBJECT_ISUSE - 사용여부
    private String subjectSjtCd;                // SUBJECT_SJT_CD - 과목 코드
    private String subjectVodDefaultPath;       // SUBJECT_VOD_DEFAULT_PATH - VOD 기본 경로
    private String subjectWideDefaultPath;      // SUBJECT_WIDE_DEFAULT_PATH - WIDE 기본 경로
    private String subjectMp4DefaultPath;       // SUBJECT_MP4_DEFAULT_PATH - MP4 기본 경로
    private String subjectPmpDefaultPath;       // SUBJECT_PMP_DEFAULT_PATH - PMP 기본 경로
    private String subjectPass;                 // SUBJECT_PASS - 패스
    private String subjectJang;                 // SUBJECT_JANG - 장
    private String reCourse;                    // RE_COURSE - 재수강
    private String lecTypeChoice;               // LEC_TYPE_CHOICE - 강의 타입 선택
    private String lecGubun;                    // LEC_GUBUN - 강의 구분
    private String recGubun;                    // REC_GUBUN - 녹화 구분
    private String iconGubun;                   // ICON_GUBUN - 아이콘 구분
    private String lecSchedule;                 // LEC_SCHEDULE - 강의 일정
    private String lecCount;                    // LEC_COUNT - 강의 수
    private String plan;                        // PLAN - 계획 (CLOB)
    private String giftFlag;                    // GIFT_FLAG - 선물 플래그
    private String giftCouponCcode;             // GIFT_COUPON_CCODE - 선물 쿠폰 코드
    private String giftLeccode;                 // GIFT_LECCODE - 선물 강의 코드
    private String couponName;                  // COUPON_NAME - 쿠폰 이름
    private String giftName;                    // GIFT_NAME - 선물 이름
    private String teacherno;                   // TEACHERNO - 강사 번호
    private String moCouponName;                // MO_COUPON_NAME - 모바일 쿠폰 이름
    private String moCouponCcode;               // MO_COUPON_CCODE - 모바일 쿠폰 코드
    private String freeTab;                     // FREE_TAB - 무료 탭
    private String subjectMonitormode;          // SUBJECT_MONITORMODE - 모니터 모드
    private String mustPrfImg;                  // MUST_PRF_IMG - 필수 프로필 이미지
    private String selPrfImg;                   // SEL_PRF_IMG - 선택 프로필 이미지
    private String lecBaesu;                    // LEC_BAESU - 강의 배수
    // regDt, regId, updDt, updId, isUse inherited from CommonVO

    // Display fields (조인 결과용)
    private String categoryNm;                  // CATEGORY_NM - 카테고리명
    private String subjectNm;                   // SUBJECT_NM - 과목명
    private String subjectTeacherNm;            // SUBJECT_TEACHER_NM - 강사명
    private String learningNm;                  // LEARNING_NM - 학습형태명
    private String bridgeLeccode;               // BRIDGE_LECCODE - 브릿지 강의코드
    private String isUseNm;                     // ISUSENM - 사용여부명

    // Getters and Setters
    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getLeccode() {
        return leccode;
    }

    public void setLeccode(String leccode) {
        this.leccode = leccode;
    }

    public String getCategoryCd() {
        return categoryCd;
    }

    public void setCategoryCd(String categoryCd) {
        this.categoryCd = categoryCd;
    }

    public String getLearningCd() {
        return learningCd;
    }

    public void setLearningCd(String learningCd) {
        this.learningCd = learningCd;
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public String getSubjectTeacherPayment() {
        return subjectTeacherPayment;
    }

    public void setSubjectTeacherPayment(String subjectTeacherPayment) {
        this.subjectTeacherPayment = subjectTeacherPayment;
    }

    public String getOrgLeccode() {
        return orgLeccode;
    }

    public void setOrgLeccode(String orgLeccode) {
        this.orgLeccode = orgLeccode;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public String getSubjectMemo() {
        return subjectMemo;
    }

    public void setSubjectMemo(String subjectMemo) {
        this.subjectMemo = subjectMemo;
    }

    public String getSubjectKeyword() {
        return subjectKeyword;
    }

    public void setSubjectKeyword(String subjectKeyword) {
        this.subjectKeyword = subjectKeyword;
    }

    public String getSubjectPeriod() {
        return subjectPeriod;
    }

    public void setSubjectPeriod(String subjectPeriod) {
        this.subjectPeriod = subjectPeriod;
    }

    public String getSubjectOffOpenYear() {
        return subjectOffOpenYear;
    }

    public void setSubjectOffOpenYear(String subjectOffOpenYear) {
        this.subjectOffOpenYear = subjectOffOpenYear;
    }

    public String getSubjectOffOpenMonth() {
        return subjectOffOpenMonth;
    }

    public void setSubjectOffOpenMonth(String subjectOffOpenMonth) {
        this.subjectOffOpenMonth = subjectOffOpenMonth;
    }

    public String getSubjectOffOpenDay() {
        return subjectOffOpenDay;
    }

    public void setSubjectOffOpenDay(String subjectOffOpenDay) {
        this.subjectOffOpenDay = subjectOffOpenDay;
    }

    public String getSubjectDiscount() {
        return subjectDiscount;
    }

    public void setSubjectDiscount(String subjectDiscount) {
        this.subjectDiscount = subjectDiscount;
    }

    public String getSubjectPrice() {
        return subjectPrice;
    }

    public void setSubjectPrice(String subjectPrice) {
        this.subjectPrice = subjectPrice;
    }

    public String getSubjectPoint() {
        return subjectPoint;
    }

    public void setSubjectPoint(String subjectPoint) {
        this.subjectPoint = subjectPoint;
    }

    public String getSubjectMovie() {
        return subjectMovie;
    }

    public void setSubjectMovie(String subjectMovie) {
        this.subjectMovie = subjectMovie;
    }

    public String getSubjectPmp() {
        return subjectPmp;
    }

    public void setSubjectPmp(String subjectPmp) {
        this.subjectPmp = subjectPmp;
    }

    public String getSubjectMoviePmp() {
        return subjectMoviePmp;
    }

    public void setSubjectMoviePmp(String subjectMoviePmp) {
        this.subjectMoviePmp = subjectMoviePmp;
    }

    public String getSubjectMovieMp4() {
        return subjectMovieMp4;
    }

    public void setSubjectMovieMp4(String subjectMovieMp4) {
        this.subjectMovieMp4 = subjectMovieMp4;
    }

    public String getSubjectMovieVodMp4() {
        return subjectMovieVodMp4;
    }

    public void setSubjectMovieVodMp4(String subjectMovieVodMp4) {
        this.subjectMovieVodMp4 = subjectMovieVodMp4;
    }

    public String getSubjectOption() {
        return subjectOption;
    }

    public void setSubjectOption(String subjectOption) {
        this.subjectOption = subjectOption;
    }

    public String getSubjectIsuse() {
        return subjectIsuse;
    }

    public void setSubjectIsuse(String subjectIsuse) {
        this.subjectIsuse = subjectIsuse;
    }

    public String getSubjectSjtCd() {
        return subjectSjtCd;
    }

    public void setSubjectSjtCd(String subjectSjtCd) {
        this.subjectSjtCd = subjectSjtCd;
    }

    public String getSubjectVodDefaultPath() {
        return subjectVodDefaultPath;
    }

    public void setSubjectVodDefaultPath(String subjectVodDefaultPath) {
        this.subjectVodDefaultPath = subjectVodDefaultPath;
    }

    public String getSubjectWideDefaultPath() {
        return subjectWideDefaultPath;
    }

    public void setSubjectWideDefaultPath(String subjectWideDefaultPath) {
        this.subjectWideDefaultPath = subjectWideDefaultPath;
    }

    public String getSubjectMp4DefaultPath() {
        return subjectMp4DefaultPath;
    }

    public void setSubjectMp4DefaultPath(String subjectMp4DefaultPath) {
        this.subjectMp4DefaultPath = subjectMp4DefaultPath;
    }

    public String getSubjectPmpDefaultPath() {
        return subjectPmpDefaultPath;
    }

    public void setSubjectPmpDefaultPath(String subjectPmpDefaultPath) {
        this.subjectPmpDefaultPath = subjectPmpDefaultPath;
    }

    public String getSubjectPass() {
        return subjectPass;
    }

    public void setSubjectPass(String subjectPass) {
        this.subjectPass = subjectPass;
    }

    public String getSubjectJang() {
        return subjectJang;
    }

    public void setSubjectJang(String subjectJang) {
        this.subjectJang = subjectJang;
    }

    public String getReCourse() {
        return reCourse;
    }

    public void setReCourse(String reCourse) {
        this.reCourse = reCourse;
    }

    public String getLecTypeChoice() {
        return lecTypeChoice;
    }

    public void setLecTypeChoice(String lecTypeChoice) {
        this.lecTypeChoice = lecTypeChoice;
    }

    public String getLecGubun() {
        return lecGubun;
    }

    public void setLecGubun(String lecGubun) {
        this.lecGubun = lecGubun;
    }

    public String getRecGubun() {
        return recGubun;
    }

    public void setRecGubun(String recGubun) {
        this.recGubun = recGubun;
    }

    public String getIconGubun() {
        return iconGubun;
    }

    public void setIconGubun(String iconGubun) {
        this.iconGubun = iconGubun;
    }

    public String getLecSchedule() {
        return lecSchedule;
    }

    public void setLecSchedule(String lecSchedule) {
        this.lecSchedule = lecSchedule;
    }

    public String getLecCount() {
        return lecCount;
    }

    public void setLecCount(String lecCount) {
        this.lecCount = lecCount;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getGiftFlag() {
        return giftFlag;
    }

    public void setGiftFlag(String giftFlag) {
        this.giftFlag = giftFlag;
    }

    public String getGiftCouponCcode() {
        return giftCouponCcode;
    }

    public void setGiftCouponCcode(String giftCouponCcode) {
        this.giftCouponCcode = giftCouponCcode;
    }

    public String getGiftLeccode() {
        return giftLeccode;
    }

    public void setGiftLeccode(String giftLeccode) {
        this.giftLeccode = giftLeccode;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getTeacherno() {
        return teacherno;
    }

    public void setTeacherno(String teacherno) {
        this.teacherno = teacherno;
    }

    public String getMoCouponName() {
        return moCouponName;
    }

    public void setMoCouponName(String moCouponName) {
        this.moCouponName = moCouponName;
    }

    public String getMoCouponCcode() {
        return moCouponCcode;
    }

    public void setMoCouponCcode(String moCouponCcode) {
        this.moCouponCcode = moCouponCcode;
    }

    public String getFreeTab() {
        return freeTab;
    }

    public void setFreeTab(String freeTab) {
        this.freeTab = freeTab;
    }

    public String getSubjectMonitormode() {
        return subjectMonitormode;
    }

    public void setSubjectMonitormode(String subjectMonitormode) {
        this.subjectMonitormode = subjectMonitormode;
    }

    public String getMustPrfImg() {
        return mustPrfImg;
    }

    public void setMustPrfImg(String mustPrfImg) {
        this.mustPrfImg = mustPrfImg;
    }

    public String getSelPrfImg() {
        return selPrfImg;
    }

    public void setSelPrfImg(String selPrfImg) {
        this.selPrfImg = selPrfImg;
    }

    public String getLecBaesu() {
        return lecBaesu;
    }

    public void setLecBaesu(String lecBaesu) {
        this.lecBaesu = lecBaesu;
    }

    // Display fields getters and setters
    public String getCategoryNm() {
        return categoryNm;
    }

    public void setCategoryNm(String categoryNm) {
        this.categoryNm = categoryNm;
    }

    public String getSubjectNm() {
        return subjectNm;
    }

    public void setSubjectNm(String subjectNm) {
        this.subjectNm = subjectNm;
    }

    public String getSubjectTeacherNm() {
        return subjectTeacherNm;
    }

    public void setSubjectTeacherNm(String subjectTeacherNm) {
        this.subjectTeacherNm = subjectTeacherNm;
    }

    public String getLearningNm() {
        return learningNm;
    }

    public void setLearningNm(String learningNm) {
        this.learningNm = learningNm;
    }

    public String getBridgeLeccode() {
        return bridgeLeccode;
    }

    public void setBridgeLeccode(String bridgeLeccode) {
        this.bridgeLeccode = bridgeLeccode;
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