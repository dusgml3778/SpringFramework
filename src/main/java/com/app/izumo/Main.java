package com.app.izumo;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// helloŬ������ class��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�
		Class helloClass = Class.forName("com.app.izumo.Hello");
		Hello hello = (Hello) helloClass.newInstance();
		Method main=helloClass.getDeclaredMethod("main");
		main.setAccessible(true);
		
		main.invoke(hello);

	}

}
