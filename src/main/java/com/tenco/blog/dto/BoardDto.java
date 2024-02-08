package com.tenco.blog.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class BoardDto {

	private int no;
	private String title;
	private String content;
	private String writer;
	private int delete_yn;
	private Timestamp created_date;
	private Timestamp modified_date;

}
