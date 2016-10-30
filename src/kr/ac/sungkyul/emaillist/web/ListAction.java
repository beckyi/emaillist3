package kr.ac.sungkyul.emaillist.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sungkyul.emaillist.dao.EmailListDao;
import kr.ac.sungkyul.emaillist.vo.EmailListVo;
import kr.ac.sungkyul.web.Action;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list = dao.getList();
		
		//request 범위(scope)에 List 객체를 저장
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list.jsp");	//request 연장
	}

}
