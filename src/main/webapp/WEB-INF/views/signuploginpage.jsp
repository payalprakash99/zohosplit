<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
html {
	font-family: "didot";
}

h2 {
	font-size: 60px;
	margin: 0;
	text-align: center;
	line-height: .9;
}

body {
	margin: 10;
}

.container {
	position: relative;
	top: 25%;
	padding-left: 50px;
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 40px 20px 30px 100px;
	margin-top: 100px;
}

.vl {
	position: absolute;
	left: 50%;
	transform: translate(-90%);
	border: 2px solid #ddd;
	height: 220px;
}

.vl-innertext {
	position: absolute;
	top: 50%;
	transform: translate(-50%, -50%);
	background-color: #f1f1f1;
	border: 1px solid #ccc;
	border-radius: 50%;
	padding: 8px 10px;
}

input, .btn {
	width: 50%;
	padding: 12px;
	border: none;
	border-radius: 4px;
	margin: 5px 0;
	opacity: 0.85;
	display: inline-block;
	font-size: 17px;
	line-height: 20px;
	text-decoration: none; /* remove underline from anchors */
}

input[type=submit] {
	background-color: #17202A;
	color: white;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #5D6D7E;
}

.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
<!-- <script type="text/javascript">
	function addUser() {
		var emailid = document.getElementById("useremail").value;
		var password = document.getElementById("password").value;
		var confirmpassword = document.getElementById("confirmpassword").value;

		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4) {
				var data = xhr.responseText;
				console.log(data);
			}
			xhr.open('POST', 'http://localhost:8080/ZohoSplits/register', true);
			xhr.send(null);
		}

	}
	function login() {
		var emailid = document.getElementById("loginemail").value;
		var password = document.getElementById("loginpassword");

	}
</script> -->
</head>

<body>
	<div>
		<h2>ZohoSplits</h2>
	</div>
	<br>
	<div class="container">

		<div class="row">
			<div>
				<form action="/ZohoSplits/login" method="POST">

					<div class="col" style="float: left;">
						<h3>Login</h3>
						<input type="email" name="emailID" placeholder="Email ID">
						<input type="password" name="password" placeholder="Password">
						<input type="submit" name="Login">
						<%
						String login_msg=(String)request.getAttribute("error");  
						if(login_msg!=null)
						out.println("<br><font color=red size=4px>"+login_msg+"</font><br>");
						%>
					</div>


				</form>
			</div>
			<div>
				<form action="/ZohoSplits/register" method="POST">

					<div class="vl">
						<span class="vl-innertext">or</span>
					</div>

					<div class="col" style="float: right; margin-left: 70px;">
						<h3>Sign Up!</h3>
						<input type="text" name="userName" placeholder="User Name">
						<input type="email" name="emailID" placeholder="Email ID">
						<input type="password" name="password" placeholder="Password">
						<input type="submit" id="signup" name="signup">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>