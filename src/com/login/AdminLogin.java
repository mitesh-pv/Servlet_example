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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	 
    public AdminLogin() {
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
			checkAdmin(request,response);
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	
	}
	
	private void checkAdmin(HttpServletRequest request, HttpServletResponse response)throws Exception {
		boolean i=false;
		
		List<AdminClass> adminClass=userAuth.getAdmin();
		
	    String uname=request.getParameter("uname");
	    String passwd=request.getParameter("passwd");
	    
	    for(AdminClass u:adminClass) {
	    	if((uname).equals(u.uname)&& (passwd).equals(u.passwd)) {
	    		
	    		HttpSession session =request.getSession();
	    		session.setAttribute("username", uname);
	    		i=true;
	    		break;	    		
	        }	    	
	    }
	    
	   if(i) {
		   //response.sendRedirect("data.jsp");
		   
		   	List<LocationClass> locClass=userAuth.getLocations();
		   
		   	request.setAttribute("LOC",locClass);
			
			//send to the JSP page(view)
			RequestDispatcher dispatcher=request.getRequestDispatcher("/data.jsp");
			dispatcher.forward(request,response);
		   
	   }else {
		   response.sendRedirect("Admin.jsp");
	   }
	
	    
	  
	}
	

		
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
