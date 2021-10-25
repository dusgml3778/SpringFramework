package com.app.izumo;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// hello클래스의 class객체(클래스의 정보를 담고 있는 객체)를 얻어온다
		Class helloClass = Class.forName("com.app.izumo.Hello");
		Hello hello = (Hello) helloClass.newInstance();
		Method main=helloClass.getDeclaredMethod("main");
		main.setAccessible(true);
		
		main.invoke(hello);

	}

}
