<%@page import="conversores.StringToInt"%>
<%@page import="candidatos.Marina"%>
<%@page import="candidatos.Fidelis"%>
<%@page import="candidatos.Aecio"%>
<%@page import="candidatos.Dilma"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
int dilma = StringToInt.toInt(request.getParameter("dilma"));
int aecio = StringToInt.toInt(request.getParameter("aecio"));
int marina = StringToInt.toInt(request.getParameter("marina"));
int fidelis = StringToInt.toInt(request.getParameter("fidelis"));

application.setAttribute("candidato1", dilma);
application.setAttribute("candidato2", aecio);
application.setAttribute("candidato3", marina);
application.setAttribute("candidato4", fidelis);

dilma = Dilma.calcular();

application.setAttribute("dilma", dilma);
application.setAttribute("aecio", aecio);
application.setAttribute("marina", marina);
application.setAttribute("fidelis", fidelis);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<button name="Dilma"><%dilma %></button><br/>
		<button name="Aecio" /><%aecio %></button><br/>
		<button name="Fidelis" /><%fidelis %></button><br/>
		<button name="Marina" /><%marina %></button><br/>
	</form>
</body>
</html>