package com.tenco.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tenco.blog.dto.saveFormDto;
import com.tenco.blog.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	// 목록 화면
	@GetMapping("/")
	public String index() {
		return "index";
	}

	// 글 쓰기 화면
	@GetMapping("/board/saveForm")
	public String saveForm() {
		// prefix: /WEB-INF/view/  
		// board/saveForm
		// suffix: .jsp
		
		// /WEB-INF/view/board/saveForm.jsp
		return "board/saveForm";
	}

	// 글 수정 화면
	@GetMapping("/board/{no}/updateForm")
	public String updateForm(@PathVariable int no) {
		return "board/updateForm";
	}

	// 글 쓰기 기능
	@PostMapping("/board/save")
	public String save(saveFormDto saveDto) {
		service.insertBoard(saveDto);
		return "redirect:/";
	}

	// 글 수정 기능
	@PostMapping("/board/{no}/update")
	public String update(@PathVariable int no) {
		return "redirect:/";
	}

	// 글 삭제
	@PostMapping("/board/{no}/delete")
	public String delete(@PathVariable int no) {
		return "redirect:/";
	}
}
