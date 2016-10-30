package kr.ac.sungkyul.emaillist.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sungkyul.emaillist.dao.EmailListDao;
import kr.ac.sungkyul.emaillist.vo.EmailListVo;
import kr.ac.sungkyul.web.Action;
import kr.ac.sungkyul.web.WebUtil;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String firstname = request.getParameter("fn");
		String lastname = request.getParameter("ln");
		String email = request.getParameter("email");
		
		EmailListVo vo = new EmailListVo();
		vo.setFirstname(firstname);
		vo.setLastname(lastname);
		vo.setEmail(email);
		   
		EmailListDao dao = new EmailListDao();
		dao.insert(vo);
		
		WebUtil.redirect("/WEB-INF/views/form.jsp", request, response);
	}

}
