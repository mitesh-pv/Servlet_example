package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.sql.DataSource;

public class UserAuth {
	
private DataSource dataSource;
	int i=1,j=1;
	
	public UserAuth(DataSource theDataSource) {
		dataSource=theDataSource;
	}
	
	public List<UsersClass> getUsers() throws Exception{
		
		List<UsersClass> users=new ArrayList<>();
		try {
			
			Connection myConn=dataSource.getConnection();
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery("select * from users");
			
			
			 
			while(myRs.next()) {
				String username=myRs.getString("username");
				String passwd=myRs.getString("password");
				
				UsersClass usersClass=new UsersClass(username, passwd);
				users.add(usersClass);
											
			}
			return users;
			      
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		return users;

	}
	
	public List<Location> getLocation(String curLoc,String date)throws Exception{
		
		List<Location> locations=new ArrayList<>();
		
		try {
			
			String query="select * FROM locations where current_loc=\'"+curLoc+"\'";
								
			Connection myConn=dataSource.getConnection();
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery(query);
			
			while(myRs.next()) {
				int loc_id=myRs.getInt(1);
				String cur_loc=myRs.getString(2);
				String places=myRs.getString(3);
				String distance=myRs.getString(4);
				int rate_per_day=myRs.getInt(5);
				
				Location locClass=new Location(loc_id,cur_loc,places,distance, rate_per_day,date);
				locations.add(locClass);
											
			}			
		}catch(Exception e) {
			throw new Exception(e);
		}
		
		return locations;
	}
	
	public void addUsers(UsersClass book) throws Exception{
		Connection myConn=null;
		PreparedStatement myStmt=null;
		
		try {
			myConn=dataSource.getConnection();
			
			String sql="insert into logindb.users values(?,?,?,?,?,?)";
			
			myStmt=myConn.prepareStatement(sql);
			
			myStmt.setString(1,book.users);
			myStmt.setString(2,book.passwd);
			myStmt.setString(3,book.fName);
			myStmt.setString(4,book.lName);
			myStmt.setString(5,book.gender);
			myStmt.setInt(6,0);
			
			myStmt.execute();
			
		}catch(Exception exc){
			throw new SQLException(exc);
		
		}finally{
			close(myConn,myStmt,null);
			
		}
		
		
			
	}
/*	
	public List<Location> updateLocation(String date, String place, String distance, int rate, int locid) {
				
		Connection myConn=null;
		PreparedStatement myStmt=null;
		
		try {
			myConn=dataSource.getConnection();
			
			String sql="insert into logindb.reserves values(?,?,?,?,?)";
			
			myStmt=myConn.prepareStatement(sql);
			
			myStmt.setString(1,book.users);
			myStmt.setString(2,book.passwd);
			myStmt.setString(3,book.fName);
			myStmt.setString(4,book.lName);
			myStmt.setString(5,book.gender);
			
			myStmt.execute();
			
		}catch(Exception exc){
			throw new SQLException(exc);
		
		}finally{
			close(myConn,myStmt,null);
			
		}
		
		return null;
	}*/

	private void close(Connection myConn, PreparedStatement myStmt, Object object) throws SQLException {
		myConn.close();
		myStmt.close();
	}

	public void addReserves(NewBookClass book)throws Exception {
		Connection myConn=null;
		PreparedStatement myStmt=null;
		
		try {
			
			
			int li=Integer.valueOf(book.locid);
			int mem=Integer.valueOf(book.numMem);
			int ds=Integer.valueOf(book.numDays);
			int r=Integer.valueOf(book.rate);
			myConn=dataSource.getConnection();
			
			String sql="insert into reserves values (?,?,?,?,?,?,?,?)";
			
			myStmt=myConn.prepareStatement(sql);
			i++;
			myStmt.setLong(1,i);
			myStmt.setLong(2,li);
			myStmt.setString(3,book.place);
			myStmt.setLong(4,mem);
			myStmt.setLong(5,ds);
			myStmt.setString(6,book.date);
			myStmt.setString(7,book.user);
			myStmt.setLong(8,r);
			
			myStmt.execute();
			
			
		}catch(Exception exc){
			throw new SQLException(exc);
		
		}finally{
			close(myConn,myStmt,null);
			
		}
			
	}

	public List<AdminClass> getAdmin() {
		List<AdminClass> admins=new ArrayList<>();
		try {
			
			Connection myConn=dataSource.getConnection();
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery("select * from admin");
			
						 
			while(myRs.next()) {
				String username=myRs.getString("uname");
				String passwd=myRs.getString("passwd");
				
				AdminClass adminClass=new AdminClass(username, passwd);
				admins.add(adminClass);
											
			}
			return admins;
			      
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		return admins;

	}

	public void addComment(String name, String comment) throws ServletException, SQLException {
				
			
			Connection myConn=null;
			PreparedStatement myStmt=null;
			
			try {
				
				myConn=dataSource.getConnection();
				
				String sql="insert into feedback values (?,?,?)";
				
				myStmt=myConn.prepareStatement(sql);
			
				j++;
				myStmt.setLong(1,j);
				myStmt.setString(2, name);
				myStmt.setString(3, comment);
				myStmt.execute();
				
			
			}catch(Exception e) {
				throw new ServletException(e);
			}finally{
				close(myConn,myStmt,null);
			}
		}

	public List<LocationClass> getLocations() throws ServletException {
		
		List<LocationClass> locations=new ArrayList<>();
		
		try {
			
			String query="select * FROM locations ";
								
			Connection myConn=dataSource.getConnection();
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery(query);
			
			while(myRs.next()) {
				
				int loc_id=myRs.getInt(1);
				String cur_loc=myRs.getString(2);
				String places=myRs.getString(3);
				String distance=myRs.getString(4);
				int rate_per_day=myRs.getInt(5);
				
				
				LocationClass loc=new LocationClass(loc_id,cur_loc,places,distance,rate_per_day);
				locations.add(loc);
											
			}	
			
			return locations;
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}

	public void deleteEntry(LocationClass loc) throws SQLException {
		
		int i=loc.getLoc_id();
		
			
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// convert student id to int
			//int locId = Integer.parseInt(theStudentId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create sql to delete student
			String sql = "delete from locations where loc_id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, i);
			
			// execute sql statement
			myStmt.execute();
			
			return;
		}
		finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}
	}

	public void addNewLocation(LocationClass locationClass) throws ServletException, SQLException {
		Connection myConn=null;
		PreparedStatement myStmt=null;
		
		try {
			
			myConn=dataSource.getConnection();
			
			String sql="insert into locations values (?,?,?,?,?)";
			
			myStmt=myConn.prepareStatement(sql);
		
			
			myStmt.setLong(1,locationClass.getLoc_id());
			myStmt.setString(2,locationClass.getCur_loc());
			myStmt.setString(3,locationClass.getPlaces());
			myStmt.setString(4,locationClass.getDistance());
			myStmt.setLong(5,locationClass.getRate_per_day());
			
			myStmt.execute();
		
		}catch(Exception e) {
			throw new ServletException(e);
		}finally{
			close(myConn,myStmt,null);
		}
		
	}

	public List<NewFeeds> getFeeds() throws ServletException {
		
		List<NewFeeds> getFeeds=new ArrayList<>();
		
	try {
			
			String query="select * from logindb.feedback";
								
			Connection myConn=dataSource.getConnection();
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery(query);
			
			while(myRs.next()) {
				
				int k=Integer.parseInt(myRs.getString(1));
				String name=myRs.getString(2);
				String feed=myRs.getString(3);
				
				
				NewFeeds f=new NewFeeds(k,name,feed);
				getFeeds.add(f);
											
			}	
			
			return getFeeds;
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}

	public UpdatedUser updateUser(String uname) throws ServletException {
		
		UpdatedUser up;
		
try {
			
			
			String query="select * from logindb.users where username=\'"+uname+"\'";
								
			Connection myConn=dataSource.getConnection();
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery(query);
			
			String n=myRs.getString(1);
			String p=myRs.getString(2);
			String nm=myRs.getString(3);
			String lnm=myRs.getString(4);
			String g=myRs.getString(5);
			int c=myRs.getInt(6);
			
			incUser(uname,c+1);
		
			//increment the count of the login of the user and send back the object to the servlet class 
			
			n=myRs.getString(1);
			p=myRs.getString(2);
			nm=myRs.getString(3);
			lnm=myRs.getString(4);
			g=myRs.getString(5);
			c=myRs.getInt(6);
			//pass the UpdatedUser class to the login page to set the attribute and set requestdispatcher
			
			up=new UpdatedUser(n, p, nm, lnm, g, c);
			
			
			
			return up;
			
		}catch(Exception e) {
			throw new ServletException(e);
		}

	
	}

	private void incUser(String uname,int c) throws ServletException {
		
		Connection myConn=null;
		PreparedStatement myStmt=null;
		
		try {
			
			myConn=dataSource.getConnection();
			
			String sql="update logindb.users set count=? where username=\'"+uname+"\'";
			//String sql="UPDATE DBUSER SET USERNAME = ? WHERE USER_ID = ?;
			
			myStmt=myConn.prepareStatement(sql);
			
			myStmt.setInt(1, c);
			
			myStmt.execute();
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
			
				
	}
}

