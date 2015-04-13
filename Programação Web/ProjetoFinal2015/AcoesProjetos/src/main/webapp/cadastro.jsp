<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<hgroup>
			<h1>Sistema de Acoes e Projetos</h1>
			<h2>Cadastro</h2>
		</hgroup>
	</header>

	<section>
		<form action="index.jsp" method="post">
			<label>Usuário:</label>
			<input type="text" name="login"/><br/>
			<label>Senha:</label>
			<input type="password" name="password"/><br/>
			<label>Nome:</label>
			<input type="text" name="name"/><br/>
			<label>E-mail:</label>
			<input type="email" name="email"/><br/>
			
			<input type="submit" value="Salvar"/>
			<input type="reset" value="Limpar"/>
			<a href="index.jsp"><button>Voltar</button></a>
		</form>
	</section>
	
	<footer>
		<a href="sobre.jsp">Sobre o sistema</a>
	</footer>
</body>
</html>