<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Fiz outra alteração no projeto</title>

<!-- Bibliotecas do Bootstrap e JQuery -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>	
	<header>
		<hgroup>
			<h1>Sistema de Acoes e Projetos</h1>
			<h2>Login</h2>
		</hgroup>
	</header>

	<section>
		<form action="menu.jsp" method="post">
			<label>Usuário:</label>
			<input type="text" name="login"/>
			<label>Senha:</label>
			<input type="password" name="password"/>
			<input type="submit" value="Entrar"/>
		</form>
		<a href="cadastro.jsp">Quero me cadastrar</a>
	</section>
	
	<footer>
		<a href="sobre.jsp">Sobre o sistema</a>
	</footer>
</body>
</html>