package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllertest {
	
	@GetMapping("/temp/home")
	public String tempHome() {
		//파일리턴 기본경로 : src/main/resources/static
		//리턴명 : /home.html
		//풀경로 : src/main/resources/static/home.html
		return "/home.html";
	}
	
	//yml에서 
	//	spring:
	//		  mvc:
	//		    view:
	//		      prefix: /WEB-INF/views/
	//		      suffix: .jsp
	//설정했을때
	//  prefix: /WEB-INF/views/
	// suffix: .jsp
	// 풀경로 : /WEB-INF/views/test.jsp
	@GetMapping("/temp/jsp")
	public String tempImg() {
		return "/test";
	}
}
