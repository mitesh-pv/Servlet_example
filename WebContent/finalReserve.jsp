<%@ page import="java.util.*, com.login.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- BOOTSTRAP -->
<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   
    <link href="https://fonts.googleapis.com/css?family=Lobster+Two:700|Pacifico" rel="stylesheet">

		<style>
			/**/
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
			background: url(http://xinature.com/wp-content/uploads/2016/10/mountains-dawn-mountain-tent-winter-light-camping-background-wallpapers.jpg);
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

		#jumbo {
		    /* IE8 and below */
	    	background: rgb(200, 54, 54);
	    	/* all other browsers */
	    	/*background: rgba(200, 54, 54, 0.5);*/
	    	background:rgba(121, 168, 224, 0.7);
	    	/*rgb(57, 73, 197)*/
	    	border-radius: 15px;
		}
		#white {
		    background: rgb(255, 255, 255);
		}
		


	</style>
<!--  -->

</head>
<body>


<!-- header -->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
 	  	<div class="navbar-header">
 	  	    <!-- to activate the hamberger icon -->
 	  	    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		  <!-- the below three spans are responsible for the three bars on the hamberger icon -->
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
		 	 	<li><a href="Login.jsp ">Logout</a></li>
		 	 </ul>
		</div>
	</div>
  </nav>


<%
	NewBookClass bookClass =(NewBookClass)request.getAttribute("BOOKS");
%>
<!--  -->

<div id="content">
<div class="container jumbotron" id="jumbo">
<div id="wrapper">
		<div id="header">
			<h2>  Booking Successful.....</h2>
			<h3 text-align="center">Please check the Details below</h3>
		</div>
	</div>

	<div id="container">
	
		
		
		
		<table class="table table-striped">
		
					<tr class="active">
						<td>NAME: </td>
						<td><input type="hidden" name="src" value="<%=bookClass.getCurrent()%>"/><%=bookClass.getUser()%></td> 
					</tr>
					<tr class="success">
						<td>Source: </td>
						<td><input type="hidden" name="src" value="<%=bookClass.getCurrent()%>"/><%=bookClass.getCurrent()%></td> 
					</tr>
					<tr class="warning">
						<td>Destination:</td>
						<td><input type="hidden" name="dest" value="<%=bookClass.getPlace()%>"/><%=bookClass.getPlace()%></td>
					</tr>
					<tr class="info">
						<td>Distance: </td>
						<td><input type="hidden" name="dist" value="<%=bookClass.getDistance()%>"/><%=bookClass.getDistance()%></td>
					</tr>
					<tr class="danger">
						<td>Date: </td>
						<td><input type="hidden" name="date" value="<%=bookClass.getDate()%>"/><%=bookClass.getDate()%></td>
					</tr>
					<tr class="active">
						<td>Number of Members: </td>
						<td><%=bookClass.getNumMem()%></td>
					</tr>
					<tr class="success">
						<td>Days of Trip: </td>
						<td><%=bookClass.getNumDays() %></td>
					</tr>
					<tr class="warning">
						<td>Total Cost: </td>
						<td><%=bookClass.getCost() %></td>
					</tr>
											
					<input type="hidden" name="locId" value="<%=bookClass.getLocid() %>"/>
										
				</table>
				
					
		
		</div>
	
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	
	<div class="container jumbotron" id="jumbo">
		<h3>Your feedback means a lot to us.....</h3>
		<h4>Feedback here</h4>
		
		<form action="feedback" id="usrform">
  				Your Name: <input type="text" name="name">
  				<br>
  				<br>
  				<textarea rows="4" cols="50" name="comment" form="usrform" placeholder="                            enter your feedback here"></textarea>
  				<br>
  				<input type="submit" value ="submit" class="btn btn-info">
		</form>	
		<br>
		
		
	</div>



</body>
</html>