package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class feedback
 */
@WebServlet("/feedback")
public class feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	
	public feedback() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	@Override
   	public void init() throws ServletException {
   		//create our student db util and pass in the conn pool    	
       	try {
       		userAuth=new UserAuth(dataSource);
       	}catch(Exception e) {
       		throw new ServletException(e);
       	}
   	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			getFeedback(request,response);
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	
	private void getFeedback(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		String name=request.getParameter("name");
		String comment=request.getParameter("comment");
		
		try {
			userAuth.addComment(name,comment);
			
			response.sendRedirect("thankyou.jsp");			
			
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
