<%@page import="conversores.StringToInt"%>
<%@page import="candidatos.Marina"%>
<%@page import="candidatos.Fidelis"%>
<%@page import="candidatos.Aecio"%>
<%@page import="candidatos.Dilma"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	try {
		String votoStr = request.getParameter("voto");
		votoStr = votoStr == null ? "0" : votoStr;
		
		int voto = StringToInt.toInt(votoStr);
		switch (voto) {
		case 1:
			Dilma.dilma++;
			application.setAttribute("dilma", Dilma.dilma);
			break;
		case 2:
			Dilma.aecio++;
			application.setAttribute("aecio", Dilma.aecio);
			break;
		case 3:
			Dilma.fidelis++;
			application.setAttribute("fidelis", Dilma.fidelis);
			break;
		case 4:
			Dilma.marina++;
			application.setAttribute("marina", Dilma.marina);
			break;
		}
	} catch (Exception e) {
		
	}
%>
<html>
<head>
<title>Urna</title>
</head>
<body>
	<form>
		<button name="voto" value="1">Dilma</button>
		<br />
		<button name="voto" value="2">Aecio</button>
		<br />
		<button name="voto" value="3">Fidelis</button>
		<br />
		<button name="voto" value="4">Marina</button>
		<br />
	</form>
	<a href="resultado.jsp">Resultado</a>

</body>
</html>