<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" type="image/JPG" href="image\\logo.JPG" />
<title>Register</title>
<link rel="stylesheet" type="text/css" href="css\\vurivoj.css">
<script type="text/javascript" src="js\\vurivoj.js"></script>
</head>
<body background="image\\homeback.jpg">
	<%
		if (request.getAttribute("flagval") != null) {
			if (request.getAttribute("flagval").toString().equalsIgnoreCase("showmsg")) {
	%>
	<div id="snackbar"></div>
	<script type="text/javascript">
		
		validateEntry();
	</script>
	<%
		} else {
			}
		}
	%>
	<div id="navbar">
		<a href="index.html"> <img src="image\\logo.JPG"
			style="width: 101px; margin: -27px; padding-left: 0px;">
		</a> <a href="index.html">Home</a> <a href="login.html">Log In</a> <a
			href="#contact">Contact</a>
	</div>
	<div
		style="width: 30%; border-radius: 5px; background-color: #45796d59; padding: 20px; margin-top: 85px; margin-bottom: 50px; margin-left: 33%;">
		<center>
			<form name="form" action="register.htm" method="post" class="double"
				onsubmit="return validateSubmit()">
				<h1 style="color: #8dd890;">Register User</h1>
				<input type="text" name="name" placeholder="Enter Name"
					onkeyup="validateName()"><br> <br> <input
					type="text" name="email" placeholder="Enter Email"
					onfocusout="validateEmail()"><br> <br> <input
					type="number" name="phone" placeholder="Enter Phone Number"
					onfocusout="validatePhone()"><br> <br> <input
					type="text" name="address" placeholder="Enter Adderss"><br>
				<br> <input type="password" name="password"
					placeholder="Enter Password" onfocusout="validatePassword()"><br>
				<br> <input type="password" name="confpass"
					placeholder="Confirm Password"
					onfocusout="validateConfirmpassword()"><br> <br>
				<input type="submit" value="Register" class="button button1"><br>
				<br> <b>Registered User ? Click<a href="login.html">
						Here </a>to Log IN
				</b> <br> <br> <br>
			</form>
		</center>
	</div>
	<div id="snackbar"></div>
</body>
</html>