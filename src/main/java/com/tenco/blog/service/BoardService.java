package com.tenco.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tenco.blog.dto.BoardDto;
import com.tenco.blog.dto.saveFormDto;
import com.tenco.blog.repository.entity.BoardEntity;
import com.tenco.blog.repository.interfaces.BoardRepository;

@Service
public class BoardService {
	
	
	private final BoardRepository repository;
	private final BoardEntity boardEntity;
	
	public BoardService (BoardRepository boardRepository, BoardEntity boardEntity) {
		this.repository = boardRepository;
		this.boardEntity = boardEntity;
	}
	
	
	
	public void insertBoard(saveFormDto saveFormDto) {
		
		BoardEntity boardEntity = BoardEntity.builder()
				.title(saveFormDto.getTitle())
				.content(saveFormDto.getContent())
				.writer(saveFormDto.getWriter())
				.build();
		
		repository.insert(boardEntity);
	}
	
	public BoardEntity selectBoard(Integer no) {
		return repository.selectBoard(no);
	}
	
	public List<BoardEntity> selectBoards() {
		return repository.selectBoards();
	}
	
	public void updateBoard(BoardDto dto) {
		repository.update(boardEntity);
	}
	
	public void deleteBoard(Integer no) {
		repository.delete(no);
	}
	
	
	

}
