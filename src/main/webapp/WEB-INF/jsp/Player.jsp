<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Players</title>
</head>

<style type="text/css">
.body {
	background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSS-uCt51kF0iFuR6TuNiJTZCRIzEwWNiNrYydvHhM6jblysxgY");
}
</style>

<body>

<form action="addPlayer" method="post" >
<h2>Add Player:</h2>
<br>
  Player Id:<br>
  <input type="number" name="id">
  <br>
  Name:<br>
  <input type="text" name="name" >
  <br><br>
  Type:
  	<select name ="type" >
  	 <option value="1" onclick="/gettype">Batsman</option>
 	 <option value="2" onclick="/gettype">Bowler</option>
 	 <option value="3" onclick="/gettype">All Rounder</option>
	</select>
   <br>
   <br>
   Age:<br>
  <input type="number" name="age" >
  <br>
   Batting Average:<br>
  <input type="number" name="battingavg" >
  <br>
   Bowling Average:<br>
  <input type="number" name="bowlingavg" >
  <br><br>
  <input type="SUBMIT" value="submit">
</form>
<br>
 
<h2>Display All Players:</h2>

<a href= "showPlayers"><button>Display</button></a>
<br>
<br>
<br>
<a href="index"><button>Home</button></a>
</body>
</html>