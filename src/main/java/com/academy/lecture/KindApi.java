package com.academy.lecture;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.willbes.web.lecture.service.KindService;

import egovframework.rte.fdl.property.EgovPropertyService;

@RestController
@RequestMapping("/api/kind")
public class KindApi extends CORSFilter {

	@Resource(name="propertiesService")
	protected EgovPropertyService propertiesService;

	private KindService kindservice;

	@Autowired
	public KindApi(KindService kindservice) {
		this.kindservice = kindservice;
	}

	/**
	 * @Method Name : list
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 카테고리 목록 조회
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

		params.put("Seq_Update", "N");
		List<HashMap<String, String>> list = kindservice.kindList(params);
		int listCount = kindservice.kindListCount(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("list", list);
		result.put("totalCount", listCount);
		result.put("totalPage", (int) Math.ceil((double) listCount / pageRow));
		result.put("currentPage", currentPage);

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : getSeqUpdateList
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 순서 업데이트용 전체 목록 조회
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@GetMapping(value="/seqUpdateList")
	public JSONObject getSeqUpdateList(@ModelAttribute HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		params.put("startNo", "0");
		params.put("endNo", "1000");
		params.put("Seq_Update", "Y");
		List<HashMap<String, String>> list = kindservice.kindList(params);
		int listCount = kindservice.kindListCount(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("list", list);
		result.put("totalCount", listCount);

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : seqUpdate
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 직종 순번 수정
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@PutMapping(value="/seqUpdate")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject seqUpdate(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		String[] NUM = request.getParameterValues("Num");
		String[] SEQARR = request.getParameterValues("SEQ");
		String[] CODE = request.getParameterValues("CODE_NO");
		String[] CODE_NM = request.getParameterValues("CODE_NM");
		if(SEQARR != null){
			for(int i=0; i<SEQARR.length; i++){
				params.put("NUM", NUM[i]);
				params.put("SEQ", SEQARR[i]);
				params.put("CODE", CODE[i]);
				params.put("CODE_NM", CODE_NM[i]);

				kindservice.SeqUpdate(params);
			}
		}

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "순서가 수정되었습니다");

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

		int listCount = kindservice.kindCheck(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("available", listCount == 0);
		result.put("message", listCount > 0 ? "이미 사용중인 코드입니다" : "사용 가능한 코드입니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : save
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 카테고리 등록
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@PostMapping(value="/save")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject save(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		kindservice.kindInsert(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "카테고리가 등록되었습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : view
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 카테고리 상세 조회
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@GetMapping(value="/view")
	public JSONObject view(@ModelAttribute HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		List<HashMap<String, String>> view = kindservice.kindView(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("view", view);

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : update
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 카테고리 수정
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@PutMapping(value="/update")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject update(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		kindservice.kindUpdate(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "카테고리가 수정되었습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : delete
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 카테고리 삭제
	 * @param request
	 * @return JSONObject
	 * @throws Exception
	 */
	@DeleteMapping(value="/delete")
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public JSONObject delete(@RequestBody HashMap<String, String> params, HttpServletRequest request) throws Exception {
		setParam(params, request);

		kindservice.kindDelete(params);

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", "카테고리가 삭제되었습니다");

		JSONObject jObject = new JSONObject(result);
		return jObject;
	}

	/**
	 * @Method Name : listDelete
	 * @작성일 : 2013. 10.
	 * @Method 설명 : 카테고리 다중 삭제
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
				kindservice.kindDelete(params);
			}
		}

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		result.put("message", DEL_ARR != null ? DEL_ARR.length + "개의 카테고리가 삭제되었습니다" : "삭제된 카테고리가 없습니다");

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
		params.put("Seq_Update", CommonUtil.isNull(request.getParameter("Seq_Update"), ""));
	}

}