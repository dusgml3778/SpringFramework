package com.app.izumo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	// static�� ��� ȣ�� ������ ���� ��Ĺ�� ��ü �������ֱ� ����
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello");
	}
}
