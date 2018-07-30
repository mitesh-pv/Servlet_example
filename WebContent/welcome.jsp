<%@page import="com.login.UpdatedUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome page</title>
	
	<!-- ******************************************************************************************************************* -->
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
	
	
	
	<!--  -->
		
	<!-- ******************************************************************************************************************* -->

	<link rel="stylesheet" type="text/css" href="css/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/css/datepicker.css">
	<script type="text/javascript" src="css/js/jquery.min.js"></script>
	<script type="text/javascript" src="css/js/bootstrap-datepicker.js"></script>



			<style>
			/**/
			.bootstrap-select {
  				max-width: 200px;
			}
			#what{
				
				width:30%;
			}
			.bootstrap-select .btn {
  				background-color: #141414;
  				border-style: solid;
  				border-left-width: 3px;
  				border-left-color: #00DDDD;
  				border-top: none;
  				border-bottom: none;
  				border-right: none;
  				color: white;
  				font-weight: 200;
  				padding: 12px 12px;
  				font-size: 16px;
  				margin-bottom: 10px;
  				-webkit-appearance: none;
  				-moz-appearance: none;
  				appearance: none;
			}
			.bootstrap-select .dropdown-menu {
  				margin: 15px 0 0;
			}
			select::-ms-expand {
  				/* for IE 11 */
  				display: none;
			}
			/**/
			#datepicker{
				width: 180px; 
				margin: 0 20px 20px 20px;
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
			background: url(https://corporate-rebels.com/Blog/wp-content/uploads/2016/08/tVOXxeS63a-1920x1080.jpg);
			background-size: cover;
			background-position: center;
			/*color: white;*/
			/*font-family: 'Lobster', cursive;*/

		}

		#content{
			text-align:  center;
			padding-top: 15%;
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
    	* IE8 and below */
    	background: rgb(200, 54, 54);
    	/* all other browsers */
    	/*background: rgba(200, 54, 54, 0.5);*/
    	background:rgba(242, 210, 93, 0.3);
    	border-radius: 20px;
}
#white {
    background: rgb(255, 255, 255);
}

 #selectop{
 	color: white;
 	
 }
 #date{
 	color:white;
 }
 h2{
 	color:white;
 }

.alert{
	padding-top: 5%;0
}
	</style>
</head>
<body>



<!-- ************************************************************************************************************ -->
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
	  	 	<a class="navbar-brand" href="#"><span class="glyphicon glyphicon-tent" aria-hidden="true"></span> PLAN-YOUR-TRIP</a>
	  	 	
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

<!--this is the section where user is supposed to enter his location and baed on that he'll be getting the options booking the ticket   -->
  
 <br>
 <br>
 <br>
 <%
			//UpdatedUser up=(UpdatedUser)request.getAttribute("User");
			//BookClass bookClass =(BookClass)request.getAttribute("BOOKS");
			
%>		
 
 
 <div class="alert alert-success container" role="alert" style="text-align: center">welcome </div>
 
   <div id="content">
 <form action="Plan" method="GET">	
 	<input type="hidden" name="command" value="find"/> 	
 	<div class="container">
		<div class="jumbotron" id="jumbo">
		
		
		
		<h2>WELCOME</h2>
		<br>
		
			
		
			<div align="center">
 						<label for="select" id="selectop">Current Location:</label>	
						<br>
  						 <select name="location"  style="width:30%" class="form-control selectpicker show-tick"> 
							<option value="location" selected disabled>location</option>
  							<option value="bangalore">Bangalore</option> 
  							<option value="tumkur">Tumkur</option>
  							<option value="mangalore">Mangalore</option>
						</select>
				</div>
						
		<!--  -->
		

		
		<!--  -->					
			
	
			
			<br>
			<label id="date">Date for the trip :</label><br>
			<input type="date" name="date" value="date">
			<br>
			<br>	
			<input type="submit" class="btn btn-info" value="submit">
		</div>
	</div>
</form>
</div>


<script src="https://code.jquery.com/jquery-3.2.1.js" integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script> 


</body>
</html>