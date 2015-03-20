<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
try{
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	int numero1;
	int numero2;
	int resultado;
	numero1 = Integer.parseInt(n1);
	numero2 = Integer.parseInt(n2);
	
	char op = request.getParameter("op");
	
	switch(op){
		case '+':
			resultado = numero1+numero2;
			break;
		case '*':
			resultado = numero1*numero2;
			break;
		case '-':
			resultado = numero1-numero2;
			break;
		case '/':
			resultado = numero1/numero2;
			break;
			
	}
	out.print("Resultado: "+ resultado + "<br/>");
	out.print("Digite os Numeros:");
}catch(Exception x){
	out.print("Digite os Numeros:");
}
%>
</head>
<body>
	<form>
		<input type="text" name="n1"> <br/>
		<input type="text" name="op"> <br/>
		<input type="text" name="n2"> <br/>
		<input type="submit" value="Calcular"> <br/>
	</form>
</body>
</html>