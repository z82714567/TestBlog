package com.tenco.blog.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class saveFormDto {

	private String writer;
	private String title;
	private String content;
}
