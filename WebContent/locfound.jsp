<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.login.*"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="css/style.css">
<title>Choose Your Location</title>

<link rel="shortcut icon" type="image/png" href="http://www.pngmart.com/files/1/Green-Leaves-PNG-File.png"/>

	<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:700" rel="stylesheet"> 
	
	<!-- to include the bootstrap properties into the webpage -->
	<link rel="stylesheet" type="text/css" href="bootstrap.css">
	<link rel="stylesheet" type="text/css" href="example.css">
	<!-- two links for the google fonts  -->
	<link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Kreon" rel="stylesheet">
	<!-- to resolve the javascript error -->
	<script src="https://code.jquery.com/jquery-3.2.1.js" integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE=" crossorigin="anonymous"></script>
      <!-- include the javascript link from the bootstrap webpage -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   
    <link href="https://fonts.googleapis.com/css?family=Lobster+Two:700|Pacifico" rel="stylesheet">






<!-- BOOTSTRAP LINKS  -->

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<!-- BOOTSTRAP LINKS-->



<title>Enter Details</title>


<!-- style css -->
<style>
			
			
			
			#datepicker{		
				width: 180px; margin: 0 20px 20px 20px;
			}
			#datepicker > span:hover{
				cursor: pointer;
			}

			.logout1{
				position: relative;
			}
			/**/
		.navbar-brand{

			/*font-family: 'Lobster', cursive;*/
			font-family: 'Roboto Slab', serif;
		}

		.navbar-nav{
			/*font-family: 'Kreon', serif;*/
			font-family: 'Roboto Slab', serif;
		}

		body{
			background: url(https://images.alphacoders.com/744/744255.jpg);
			background-size: cover;
			background-position: center;
			/*color: white;*/
			/*font-family: 'Lobster', cursive;*/

		}

		#content{
			text-align:  center;
			padding-top: 10%;
			font-color: black;
			
		} 
		
		#ownname1{
			width: 20%;
		}
		#members1{
			width: 20%;
			
		}
		#days1{
			width:20%;
		}

			html{
				height: 100%;
			}

			h1{
				font-weight: 700;
				font-size: 5em;
			}
			hr{
				width: 400px;
				border-top: 1px solid #f8f8f8;
				border-bottom: 1px solid #909999;
			} 

			#none{
				font-family: 'Lobster Two', cursive;
				font-size: 2em;
			}        

			.btn1{
				font-family: 'Roboto Slab', serif;
			outline: none;
			border: none;
			cursor: pointer;
			display: block;
			position: relative;
			background-color: #2c3e50;
			font-size: 16px;
			font-weight: 300px;
			color: grey;
			text-transform: uppercase;
			letter-spacing: 2px;
			padding: 18px 30px;
			margin: 0 auto;
			border-radius: 20px;
			box-shadow: 0px 6px #525e6b;
		}
		.btn1:hover{

			box-shadow: 0px 4px #525e6b;
			top: 2px;

		}
		.btn1:active{
			top: 4px;
			box-shadow: 0px 2px #525e6b;

		}
				
		.navbar-inverse{
			 background: #2c3e50;
		}

		.navbar-inverse .navbar-nav>li>a{
		    color: white;
		}

		.navbar-inverse .navbar-brand {
		    color: white;
		}
		.btn1{
			color: white;
		}

	</style>




</head>
<body>

<!-- HEADER PAGE -->
<header> 
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
 	  	<div class="navbar-header"> 
 	  	    <!-- to activate the hamberger icon -->
 	  	     <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span> 
		 <!--   the below three spans are responsible for the three bars on the hamberger icon--> 
		         <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
            </button>  
            <!-- for the logo -->
	  	 	<a class="navbar-brand" href="#"><span class="glyphicon glyphicon-tent" aria-hidden="true"></span>PLAN-YOUR-TRIP</a>
	  	 	
	    </div> 
	    <!-- hamberger should include the following options -->
	    <div class="collapse navbar-collapse container" id="bs-example-navbar-collapse-1">
		 	 <ul class="nav navbar-nav">
		 	    <li><a href="C:\Users\DELL PC\Documents\PROJECT\landing-page\about.html">About</a></li>
		 	    	 	 	
		 	 </ul>
		 	 <ul class="nav navbar-nav navbar-right">
		 	 	<li><a href="">Contact</a></li>
		 	 	<li><a href="Login.jsp">Logout</a></li>
		 	 </ul>
		</div>
	</div>
  </nav>
</header>	
<br>
<br>
 

<!-- HEADER PAGE -->

<%
	List<Location> loc =(List<Location>)request.getAttribute("LOCATION");
%>

<div id="content">
<div class="container jumbotron">
<div id="wrapper">
		<div id="header">
			<h2>CHOOSE DESTINATION</h2>
		</div>
	</div>

	<div id="container">
	
		
		
		
		
			<table class="table table-bordered">
				<tr>
					<th>PLACES</th>
					<th>DISTANCES</th>
					<th>RATE</th>
					<th>DATE</th>
					<th>SRC</th>
					<th>ACTION</th>
				</tr>
				
			    <% for (Location tempLoc : loc) { %>
							
					<c:url var="tempLink" value="Book">
						<c:param name="place" value="<%= tempLoc.getPlaces() %>"/>
						<c:param name="distance" value="<%=tempLoc.getDistance()%>"/>
						<c:param name="rate" value="<%=String.valueOf(tempLoc.getRate())%>"/>
						<c:param name="date" value="<%=tempLoc.getDate()%>"/>
						<c:param name="current" value="<%=tempLoc.getCurrent_loc()%>"/>
						<c:param name="locId" value="<%=String.valueOf(tempLoc.getLocId())%>"/>
						
					</c:url>		
											
					<tr>
						<td><%= tempLoc.getPlaces() %></td>
						<td><%= tempLoc.getDistance()%></td>
						<td><%= tempLoc.getRate()%></td>
						<td><%=tempLoc.getDate()%></td>
						<td><%=tempLoc.getCurrent_loc()%></td>
						<td><a href="${tempLink}"><input class="btn btn-success" type="submit" name="book" value="book"/></a></td>
					</tr>
				<% } %>
				
				
			</table>
			
		
		</div>
	
	</div>
	

</body>
</html>