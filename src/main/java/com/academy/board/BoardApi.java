package com.academy.board;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.board.service.BoardService;
import com.academy.board.service.BoardVO;
import com.academy.common.CORSFilter;
import com.academy.common.PaginationInfo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Board", description = "게시판 관리 API")
@RestController
@RequestMapping("/api/board")
public class BoardApi extends CORSFilter {

	private final BoardService boardService;

    public BoardApi(BoardService boardService) {
        this.boardService = boardService;
    }

	@Operation(summary = "게시판 목록 조회", description = "페이징 처리된 게시판 목록을 조회합니다.")
	@GetMapping(value = "/getBoardList")
	public JSONObject getBoardList(@ModelAttribute("BoardVO") BoardVO boardVO) throws Exception { 
		
		HashMap<String,Object> jsonObject = new HashMap<String,Object>();
		
		/** paging */
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(boardVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(boardVO.getPageUnit());
		paginationInfo.setPageSize(boardVO.getPageSize());

		boardVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		boardVO.setLastIndex(paginationInfo.getLastRecordIndex());
		boardVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		jsonObject.put("boardList", boardService.selectBoardList(boardVO));

		int totCnt = boardService.selectBoardListTotCnt(boardVO);
		paginationInfo.setTotalRecordCount(totCnt);
		jsonObject.put("paginationInfo", paginationInfo);
		
		JSONObject jObject = new JSONObject(jsonObject);
		
		return jObject;
	}

	@Operation(summary = "게시판 상세 조회", description = "게시판 상세 정보를 조회합니다.")
	@GetMapping(value = "/getBoardDetail")
	public JSONObject getBoardDetail(@ModelAttribute("BoardVO") BoardVO boardVO) throws Exception { 

		HashMap<String,Object> jsonObject = new HashMap<String,Object>();
		
		jsonObject.put("boardDetail", boardService.getBoardDetail(boardVO));

		JSONObject jObject = new JSONObject(jsonObject);
		
		return jObject;
	}

	@Operation(summary = "게시물 등록", description = "새로운 게시물을 등록합니다.")
	@PostMapping(value = "/insertBoard")
	public JSONObject insertBoard(@ModelAttribute("BoardVO") BoardVO boardVO) throws Exception { 

		HashMap<String,Object> jsonObject = new HashMap<String,Object>();

		try {
			boardService.insertBoard(boardVO);
			jsonObject.put("retMsg", "OK");
		} catch (Exception e){
			jsonObject.put("retMsg", "FAIL");
			e.printStackTrace();
		}
		
		JSONObject jObject = new JSONObject(jsonObject);

		return jObject;
	}

	@Operation(summary = "게시물 수정", description = "게시물 정보를 수정합니다.")
	@PostMapping(value="/updateBoard")
	public JSONObject updateBoard(@ModelAttribute("BoardVO") BoardVO boardVO) throws Exception {
		
		HashMap<String,Object> jsonObject = new HashMap<String,Object>();
		
		try {
			boardService.updateBoard(boardVO);
			jsonObject.put("retMsg", "OK");
		} catch (Exception e){
			jsonObject.put("retMsg", "FAIL");
			e.printStackTrace();
		}
	
		JSONObject jObject = new JSONObject(jsonObject);

		return jObject;
	}

	@Operation(summary = "게시물 삭제", description = "게시물을 삭제합니다.")
	@PostMapping(value="/deleteBoard")
	public JSONObject deleteBoard(@ModelAttribute("BoardVO") BoardVO boardVO) throws Exception {

		HashMap<String,Object> jsonObject = new HashMap<String,Object>();
		
		try {
			boardService.deleteBoard(boardVO);
			jsonObject.put("retMsg", "OK");
		} catch (Exception e){
			jsonObject.put("retMsg", "FAIL");
			e.printStackTrace();
		}
		
		JSONObject jObject = new JSONObject(jsonObject);

		return jObject;
	}

}