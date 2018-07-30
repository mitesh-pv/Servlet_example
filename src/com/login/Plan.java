package com.login;

import java.io.*;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/Plan")
public class Plan extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	    
	
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	
	public Plan() {
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
			String command=request.getParameter("command");
			
			if(command==null) {
				command="find";
			}
						
			checkLocation(request,response);
			
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
			
	}
	
	private void checkLocation(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		String curLoc=request.getParameter("location");
		String date=request.getParameter("date");
		
		//get location from the db util
		List<Location> locations=userAuth.getLocation(curLoc,date);
						
		//add student to the request 
		request.setAttribute("LOCATION",locations);
				
		//send to the JSP page(view)
		RequestDispatcher dispatcher=request.getRequestDispatcher("/locfound.jsp");
		dispatcher.forward(request,response);
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
