<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teams</title>
</head>

<style type="text/css">
.body {
	background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSS-uCt51kF0iFuR6TuNiJTZCRIzEwWNiNrYydvHhM6jblysxgY");
}
</style>

<body>

<form action="addTeam" method="post" >
<h2>Add Team:</h2>
<br>
  Team Id:<br>
  <input type="number" name="id">
  <br>
  Name:<br>
  <input type="text" name="name" >
  <br><br>
  Players:
  <br>
  	<c:forEach items="${avaPlayer}" var="player">
			<input type="checkbox" name=teamPlayers value=${player.id } >${player.name}<br>
		</c:forEach>
   <br>

   Country:<br>
  <input type="text" name="country" >
 
  <br><br>
  <input type="SUBMIT" value="submit">
</form>
<br>
 
<h2>Display Teams:</h2>

<a href= "showTeams"><button>Display</button></a>
<br>
<br>
<br>
<a href="index"><button>Home</button></a>
</body>
</html>