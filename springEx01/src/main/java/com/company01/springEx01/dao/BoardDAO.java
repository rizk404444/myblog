package com.company01.springEx01.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company01.springEx01.logic.Board;

@Repository
public class BoardDAO {
	
	@Autowired
	public SqlSession sqlSession;
		
	public List<Board> getBoardList(){
		
		return sqlSession.selectList("getBoardList");
		
	}
	
}
