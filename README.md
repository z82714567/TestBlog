# 스프링부트 블로그 만들기

![pic](main.png)

## 요구사항
- 게시판을 구현하시오
- 익명 게시판 사이트입니다. 로그인이 없습니다.
- 제목과 내용은 20자를 넘어갈 수 없습니다.
- 글쓰기, 글목록보기, 글수정하기, 글삭제하기
- JSP,Mustache 선택 가능 
- JPA, 마이바티스 선택 가능 

## 심화1
위 요구사항을 만족하였다면 아래 1가지를 해보시오.
- 글목록보기를 5개씩 페이징하세요. prev, next 버튼 구현

## 심화2
위 요구사항을 만족하였다면 아래 1가지를 해보시오.
- 전체 글 개수가 21개라면, prev [0][1][2][3][4] next
- 예시) 3번을 클릭하면 ?page=3 페이지로 이동되면 됩니다.
- 예시) 글 개수가 21개이기 때문에 0~4 까지 번호가 만들어집니다.

## 기술스택

- Springboot 3.2.2
- JDK 21, 17 선택
- h2, MySQL 선택 

## 의존성

- Lombok
- DevTools
- Spring WEB
- JPA
- h2
- Mustache


# TestBlog
