<%@page contentType="text/html;charset = UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<title>Player Details</title>

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}

.body {
	background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSS-uCt51kF0iFuR6TuNiJTZCRIzEwWNiNrYydvHhM6jblysxgY");
}
</style>

<body>
	<table border="1" style="font-size: 18px">
		<tr>
			<th>Player ID</th>
			<th>Player Name</th>
			<th>Player Age</th>
			<th>Player Type</th>
			<th>Batting Average</th>
			<th>Bowling Average</th>
			
		</tr>

		<c:forEach  items="${playerList}" var="player">
			<tr>
				<td>${player.id}</td>
				<td>${player.name}</td>
				<td>${player.age}</td>
				<td>${player.type}</td>
				<td>${player.battingavg}</td>
				<td>${player.bowlingavg}</td>
				
			</tr>
			
		</c:forEach>
	</table>
	
	<pre>
	<a href="player"><button>Back</button>  </a>
	
	<a href="index"><button>Home</button>  </a>
	</pre>
</body>
</html>
