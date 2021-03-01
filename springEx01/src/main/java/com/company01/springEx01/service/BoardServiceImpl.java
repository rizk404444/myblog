package com.company01.springEx01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company01.springEx01.dao.BoardDAO;
import com.company01.springEx01.logic.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDAO boardDAO;
	
	public List<Board> getBoardList(){
		return boardDAO.getBoardList();
	}
	
}
