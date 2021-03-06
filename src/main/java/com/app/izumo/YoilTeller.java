package com.app.izumo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTeller {

	@RequestMapping("/getYoil")
	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 1.입력
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");

		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		// 2.처리
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1.Sunday 2. Monday
		char yoil = " 일월화수목금토".charAt(dayOfWeek);

		// 3.출력
		response.setContentType("text/html"); // 응답의 형식을 html로 지정
		response.setCharacterEncoding("utf-8"); // 응답의 인코딩을 utf-8로 지정
		PrintWriter out = response.getWriter(); // reponse 객체에서 브라우저로의 출력 스트림을 얻는다
		out.println(year + " year " + month + " month " + day + " day ");
		out.println(yoil);

	}

}
