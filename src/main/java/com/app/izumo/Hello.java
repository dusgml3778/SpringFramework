package com.app.izumo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	// static이 없어도 호출 가능한 이유 톰캣이 객체 생성해주기 때문
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello");
	}
}
