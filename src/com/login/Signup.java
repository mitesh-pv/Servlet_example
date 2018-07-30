package com.login;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
    
    public Signup() {
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
		
		try {
			String command=request.getParameter("command");
			
			if(command==null) {
				command="add";
			}
			
							
					addUser(request,response);
					response.sendRedirect("Login.jsp");
		
		 
			
				
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
	}
		
	/*private void checkLocation(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		String curLoc=request.getParameter("current_loc");
		
		//get location from the db util
		List<Location> locations=userAuth.getLocation(curLoc);
		
		//add student to the request 
		request.setAttribute("LOCATION",locations);
		
		//send to the JSP page(view)
		RequestDispatcher dispatcher=request.getRequestDispatcher("/listLocations.jsp");
		dispatcher.forward(request,response);
	}*/


	
	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		String fName=request.getParameter("firstName");
		String lName=request.getParameter("lastName");
		String passwd=request.getParameter("password");
		String username=request.getParameter("username");
		String gender=request.getParameter("gender");
		
		UsersClass usersClass = new UsersClass(username,passwd,fName,lName,gender);
		
		try {
			userAuth.addUsers(usersClass);
		}catch(Exception exc) {
			throw new ServletException(exc);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
