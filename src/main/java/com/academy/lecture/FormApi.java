package com.academy.lecture;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.common.CORSFilter;
import com.willbes.platform.util.CommonUtil;
import com.willbes.web.lecture.service.FormService;

import egovframework.rte.fdl.property.EgovPropertyService;

@RestController
@RequestMapping("/api/form")
public class FormApi extends CORSFilter {

    @Resource(name="propertiesService")
    protected EgovPropertyService propertiesService;

	private FormService formservice;

	@Autowired
	public FormApi(FormService formservice) {
		this.formservice = formservice;
	}

	/**
	 * @Method Name : list
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 학습형태 목록 조회
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@GetMapping(value="/list")
	public JSONObject list(@ModelAttribute HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		/* 페이징 */
		int currentPage = Integer.parseInt(params.get("currentPage"));
		int pageRow = Integer.parseInt(params.get("pageRow"));
		int startNo = (currentPage - 1) * pageRow;
		int endNo = startNo + pageRow;
		params.put("startNo", String.valueOf(startNo));
		params.put("endNo", String.valueOf(endNo));
		/* 페이징 */

		List<HashMap<String, String>> list = formservice.formList(params);
		int listCount = formservice.formListCount(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("list", list);
		result.put("totalCount", listCount);
		result.put("totalPage", (int) Math.ceil((double) listCount / pageRow));
		result.put("currentPage", currentPage);

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : view
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 학습형태 상세 조회
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@GetMapping(value="/view")
	public JSONObject view(@ModelAttribute HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		List<HashMap<String, String>> view = formservice.formView(params);
		params.put("SEARCHPCODE", "LEC_FORM");
		params.put("SEARCHCODEISUSE", "Y");
		List<HashMap<String, String>> codelist = formservice.getCodeList(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("view", view);
		result.put("codelist", codelist);

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : codeCheck
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 코드 중복 체크
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@GetMapping(value="/codeCheck")
	public JSONObject codeCheck(@ModelAttribute HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

	    int listCount = formservice.formCheck(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("available", listCount == 0);
		result.put("message", listCount > 0 ? "이미 사용중인 코드입니다" : "사용 가능한 코드입니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : save
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 학습형태 등록
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@PostMapping(value="/save")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject save(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		formservice.formInsert(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "학습형태가 등록되었습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : update
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 학습형태 수정
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@PutMapping(value="/update")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject update(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		formservice.formUpdate(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "학습형태가 수정되었습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : delete
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 학습형태 삭제
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@DeleteMapping(value="/delete")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject delete(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		formservice.formDelete(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "학습형태가 삭제되었습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : listDelete
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 학습형태 다중 삭제
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@DeleteMapping(value="/listDelete")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject listDelete(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		String[] DEL_ARR = request.getParameterValues("DEL_ARR");
		if(DEL_ARR != null){
			for(int i=0; i<DEL_ARR.length; i++){
				params.put("CODE", DEL_ARR[i]);
				formservice.formDelete(params);
			}
		}

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", DEL_ARR != null ? DEL_ARR.length + "개의 학습형태가 삭제되었습니다" : "삭제된 학습형태가 없습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : setParam
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 파라미터 SETTING
	 * @param params
	 * @param request
	 * @return HashMap
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void setParam(HashMap<String, String> params, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession(false);
		if(session != null) {
			HashMap<String, String> loginInfo = (HashMap<String, String>)session.getAttribute("AdmUserInfo");
			if(loginInfo != null) {
				params.put("REG_ID",loginInfo.get("USER_ID"));
				params.put("UPD_ID",loginInfo.get("USER_ID"));
			}
		}

		params.put("currentPage", CommonUtil.isNull(request.getParameter("currentPage"), "1"));
		params.put("pageRow", CommonUtil.isNull(request.getParameter("pageRow"), propertiesService.getInt("pageUnit")+""));
		params.put("SEARCHTYPE", CommonUtil.isNull(request.getParameter("SEARCHTYPE"), ""));
		params.put("SEARCHTEXT", CommonUtil.isNull(request.getParameter("SEARCHTEXT"), ""));
		params.put("CODE", CommonUtil.isNull(request.getParameter("CODE"), ""));
		params.put("NAME", CommonUtil.isNull(request.getParameter("NAME"), ""));
		params.put("SEQ", CommonUtil.isNull(request.getParameter("SEQ"), ""));
		params.put("ISUSE", CommonUtil.isNull(request.getParameter("ISUSE"), "Y"));
		params.put("ONOFFDIV", CommonUtil.isNull(request.getParameter("ONOFFDIV"), ""));
		params.put("PCODE", CommonUtil.isNull(request.getParameter("PCODE"), ""));
		params.put("SEARCHPCODE", CommonUtil.isNull(request.getParameter("SEARCHPCODE"), ""));
		params.put("SEARCHCODEISUSE", CommonUtil.isNull(request.getParameter("SEARCHCODEISUSE"), ""));
	}

}