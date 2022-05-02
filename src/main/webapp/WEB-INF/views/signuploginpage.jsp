<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="mystyle.css">
</head>

<body>
  <div>
  <h2>ZohoSplits</h2>
</div>
<form action="<%= request.getContextPath() %>/register" method="post">
  <div class="container">
    <div class="row">
      <div class="vl">
        <span class="vl-innertext">or</span>
      </div>
      <div class="col" style="float: left;">
        <h3>Login</h3>
        <input type="email" name="emailID" placeholder="Email ID" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
      </div>
      <div class="col" style="float: right;">
        <h3>Sign Up!</h3>
        <input type="email" name="emailID" placeholder="Email ID" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="password" name="confirmpassword" placeholder="Confirm Password" required>
        <input type="submit" value="SignUp">
      </div>
    </div>
  </div>
  </form>
</body>
</html>