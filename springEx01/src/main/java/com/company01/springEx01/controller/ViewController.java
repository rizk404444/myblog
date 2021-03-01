package com.company01.springEx01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company01.springEx01.logic.Board;
import com.company01.springEx01.service.BoardService;
import com.company01.springEx01.service.BoardServiceImpl;

@Controller
@RequestMapping("view/*")
public class ViewController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("view/dashboard")
	public ModelAndView dashboard() {
		List<Board> result = boardService.getBoardList(); 
		System.out.println(result);
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}