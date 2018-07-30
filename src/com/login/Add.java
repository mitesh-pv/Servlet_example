package com.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	    
	
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	
	public Add() {
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
			addLocation(request,response);
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}

	
	private void addLocation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		int loc_id=Integer.parseInt(request.getParameter("loc_id"));
		String cur_loc=request.getParameter("current");
		String places=request.getParameter("dest");
		String distance=request.getParameter("dist");;
		int rate_per_day=Integer.parseInt(request.getParameter("rate"));
		
		LocationClass locationClass=new LocationClass(loc_id,cur_loc,places,distance,rate_per_day);
		
		userAuth.addNewLocation(locationClass);
		
		List<LocationClass> loc=userAuth.getLocations();
		
		List<LocationClass> location=userAuth.getLocations();
		
		request.setAttribute("LOC",location);
		
		//send to the JSP page(view)
		RequestDispatcher dispatcher=request.getRequestDispatcher("/data.jsp");
		dispatcher.forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
