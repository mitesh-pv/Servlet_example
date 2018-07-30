package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import com.login.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/logindb")
	private DataSource dataSource;
	
	private UserAuth userAuth;
	 
    public Login() {
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
			check(request,response);
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	
	}
	private void check(HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean i=false;
		HttpSession session = null;
		
		List<UsersClass> usersClass=userAuth.getUsers();
		
		//alterations added 
		String username=null;
		
	    String uname=request.getParameter("uname");
	    String passwd=request.getParameter("passwd");
	    
	    for(UsersClass u:usersClass) {
	    	if((uname).equals(u.users)&& (passwd).equals(u.passwd)) {
	    		
	    		//session =request.getSession();
	    		//session.setAttribute("username", uname);
	    		
	    		UpdatedUser upUser=userAuth.updateUser(username);
	    		
	    		response.setContentType("text/html");
	 		    PrintWriter pWriter =response.getWriter();
	 		   
	 		    pWriter.println("<html><body>"+upUser.getlName()+" </html></body>");
	    		
	    		username=uname;
	    		    		
	    		i=true;
	    		break;	    		
	        }	    	
	    }
	    
	  
	    
	    
	    if(i) {
		   
		   UpdatedUser upUser=userAuth.updateUser(username);
		   
		   response.setContentType("text/html");
		   PrintWriter pWriter =response.getWriter();
		   
		   pWriter.println("<html><body>hello </html></body>");
		   //pWriter.println(upUser.getlName());
		   //pWriter.println("</html></body>");
		   
		   /*
		   //create new dispatcher and set the attribute to pass it on to the welcome.jsp page
		    request.setAttribute("User",upUser);
		   
		   //session.setAttribute("USER",upUser);
			
			//send to the JSP page(view)
			RequestDispatcher dispatcher=request.getRequestDispatcher("/welcome.jsp");
			dispatcher.forward(request,response);
		   //
		   
		  //response.sendRedirect("welcome.jsp");	   
		   */
	   }else {
		   response.sendRedirect("Login.jsp");
	   }
	
	    
	  
	}
	
}
