package kr.ac.sungkyul.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebUtil {
	public static void redirect(String url, HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		response.sendRedirect(url);
	}
	
	public static void forward(String path, HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/form.jsp");	//request 연장
		rd.forward(request, response);
	}
}
