package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/getfeedback")
public class getfeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	 
    public getfeedback() {
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
			getfeedlist(request,response);
		}catch(Exception e) {
			throw new ServletException(e);
		}


		
		
	}

	
	private void getfeedlist(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			
			List<NewFeeds> newfeeds=userAuth.getFeeds();
			
			/*response.setContentType("text.html");
			PrintWriter o=response.getWriter();
			String t="null";
		
			for(NewFeeds a:newfeeds) {
				 t=a.getName();
			}
			o.println("<html><body>"+ t+"</body></html>");
			*/
			
			request.setAttribute("FEEDS",newfeeds);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/feedback.jsp");
			dispatcher.forward(request,response);
				
			
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
