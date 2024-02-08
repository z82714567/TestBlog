package com.tenco.blog.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.blog.repository.entity.BoardEntity;

@Mapper
public interface BoardRepository {

	public void insert(BoardEntity boardEntity);
	public BoardEntity selectBoard(Integer no);
	public List<BoardEntity> selectBoards(); 
	public void update(BoardEntity boardEntity);
	public void delete(Integer no);
}
