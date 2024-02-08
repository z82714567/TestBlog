package com.tenco.blog.repository.entity;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardEntity {

	private Integer no;
	private String title;
	private String content;
	private String writer;
	private Integer delete_yn;
	private Timestamp created_date;
	private Timestamp modified_date;
}
