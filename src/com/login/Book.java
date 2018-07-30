package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/Book")
public class Book extends HttpServlet {
private static final long serialVersionUID = 1L;
	    
	
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	
	public Book() {
        super();
        
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
		
		try{
			/*int rate=Integer.parseInt(request.getParameter("rate"));
		
			response.setContentType("text/html");
												
					PrintWriter p=response.getWriter();
					p.println("<html><body>hello this is"+rate+" a test</body></html>");
			*/
			String date=request.getParameter("date");
			String place=request.getParameter("place");
			String distance=request.getParameter("distance");
			String current=request.getParameter("current");
			int rate=Integer.parseInt(request.getParameter("rate"));
			int locid=Integer.parseInt(request.getParameter("locId"));
			
			BookClass books=new BookClass(date,place,distance,current,rate,locid);
			
			booking(request,response,books);
			
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
	}

	
	private void booking(HttpServletRequest request, HttpServletResponse response,BookClass books) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		
		
		//response.setContentType("text/html");
											
		//PrintWriter p=response.getWriter();
		//p.println("<html><body>hello this is"+rate+" a test</body></html>");
		
		request.setAttribute("BOOKS",books);
				
		RequestDispatcher dispatcher=request.getRequestDispatcher("/booked.jsp");
		dispatcher.forward(request,response);
				
		
	}

	private void bookLocation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date=request.getParameter("date");
		String place=request.getParameter("place");
		String distance=request.getParameter("distance");
		String current=request.getParameter("current");
		int rate=Integer.parseInt(request.getParameter("rate"));
		int locid=Integer.parseInt(request.getParameter("locId"));
		
		//List<Location> bookDtl=userAuth.updateLocation(date,place,distance,rate,locid);
		
		
		//BookClass books=new BookClass(date,place,distance,current,rate,locid);
		
		
		//request.setAttribute("BOOKS",books);
		
		//create the request dispatcher 
		RequestDispatcher dispatcher=request.getRequestDispatcher("/booked.jsp");
		dispatcher.forward(request,response);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
