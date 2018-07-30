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


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	
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
			deleteEntry(request,response);
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}

	
	private void deleteEntry(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String loc_id=String.valueOf(request.getParameter("locId"));
		String cur_loc=request.getParameter("current");
		String places=request.getParameter("place");
		String distance=request.getParameter("distance");
		String rate_per_day=request.getParameter("rate");
		
		int rate=Integer.parseInt(rate_per_day);
		int locid=Integer.parseInt(loc_id);
		
		
		
		LocationClass loc=new LocationClass(locid,cur_loc,places,distance, rate);
		
		
	    userAuth.deleteEntry(loc);
		
		List<LocationClass> location=userAuth.getLocations();
		
		request.setAttribute("LOC",location);
		
		//send to the JSP page(view)
		RequestDispatcher dispatcher=request.getRequestDispatcher("/data.jsp");
		dispatcher.forward(request,response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
