<%@page import="candidatos.Marina"%>
<%@page import="candidatos.Fidelis"%>
<%@page import="candidatos.Aecio"%>
<%@page import="candidatos.Dilma"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Resultado</title>
</head>
<body>
	<table>
		<tr>
			<td>Dilma: </td>
			<td><%=application.getAttribute("dilma") %></td>
		</tr>
		<tr>
			<td>Aecio: </td>
			<td><%=application.getAttribute("aecio") %></td>
		</tr>
		<tr>
			<td>Fidelis: </td>
			<td><%=application.getAttribute("fidelis") %></td>
		</tr>
		<tr>
			<td>Marina: </td>
			<td><%=application.getAttribute("marina") %></td>
		</tr>
	</table>
</body>
</html>