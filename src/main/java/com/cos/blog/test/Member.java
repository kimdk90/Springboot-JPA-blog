package com.cos.blog.test;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
@Data //getter + setter
//@AllArgsConstructor //모든 페이지를 다 사용하는 생성자
@NoArgsConstructor	//빈 생성자
//@RequiredArgsConstructor //final 이 있는 변수의 생성자 생성
public class Member {
	private  int id;
	private  String username;
	private  String password;
	private  String email;
	
	@Builder
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
}
