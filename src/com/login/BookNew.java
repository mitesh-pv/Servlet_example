package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/BookNew")
public class BookNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
    
    public BookNew() {
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
		
		/*response.setContentType("text/html");
		
		PrintWriter p=response.getWriter();
		p.println("<html><body>hello this is a test</body></html>");
		*/
		try{
			/*int rate=Integer.parseInt(request.getParameter("rate"));
		
			response.setContentType("text/html");
												
					PrintWriter p=response.getWriter();
					p.println("<html><body>hello this is"+rate+" a test</body></html>");
			*/
			/*String date=request.getParameter("date");
			String place=request.getParameter("place");
			String distance=request.getParameter("distance");
			String current=request.getParameter("current");
			int rate=Integer.parseInt(request.getParameter("rate"));
			int locid=Integer.parseInt(request.getParameter("locId"));
			String user=request.getParameter("ownname");
			int numMem=Integer.parseInt(request.getParameter("members"));
			int numDays=Integer.parseInt(request.getParameter("days"));
			
			NewBookClass book=new NewBookClass(date,place,distance,rate,locid,current,user,numDays,numMem);
			*/
			
			
	
			
			bookStart(request,response);
			
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
	}

	
	private void bookStart(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String date=request.getParameter("date");
		String place=request.getParameter("dest");
		String distance=request.getParameter("dist");
		String current=request.getParameter("src");
		String rate=request.getParameter("rate");
		String locid=request.getParameter("locId");
		String user=request.getParameter("ownname");
		String numMem=request.getParameter("members");
		String numDays=request.getParameter("days");
			
		NewBookClass book=new NewBookClass(date,place,distance,rate,locid,current,user,numDays,numMem);
		
		/*
		response.setContentType("text/html");
		
		PrintWriter p=response.getWriter();
		p.println("<html><body>hello this is"+place+" a test</body></html>");
		*/
			
	
		try {
			userAuth.addReserves(book);
			
			//set the attribute 
			request.setAttribute("BOOKS",book);
			
			//send to the JSP page(view)
			RequestDispatcher dispatcher=request.getRequestDispatcher("/finalReserve.jsp");
			dispatcher.forward(request,response);
			
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
