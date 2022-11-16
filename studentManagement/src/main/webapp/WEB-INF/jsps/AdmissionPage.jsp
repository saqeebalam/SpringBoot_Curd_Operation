<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="text-align:center;">Welcome To PSA</h2>
	<form action="saveLead" method="post">
	  <h4>Personal Details</h4>
	  <table>
	    <tr>
	      <td>First Name</td>
	      <td><input type="text" name="firstName"/></td>
	    </tr>
	     <tr>
	      <td>Last Name</td>
	      <td><input type="text" name="lastName"/></td>
	    </tr>
	    <tr>
	      <td>City</td>
	      <td><input type="text" name="city"/></td>
	    </tr>
	    <tr>
	      <td>Email</td>
	      <td><input type="text" name="email"/></td>
	    </tr>
	    <tr>
	      <td>Mobile Number</td>
	      <td><input type="text" name="mobile"/></td>
	    </tr>
	  </table>
	  <h4>Education Details</h4>
	 <label for="education">Chose your Degree:</label>
  <select name="education" >
    <option value="Engineering">Engineering</option>
    <option value="BCA/MCA">BCA/MCA</option>
    <option value="BSC/MSC">BSC/MSC</option>
    <option value="BBA/MBA">BBA/MBA</option>
  </select>
  <br><br>
	<input type="submit" value="Save">
	</form>	
	${msg }
</body>
</html>