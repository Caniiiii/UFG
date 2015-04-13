<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>AcoesProjetos</title>

<!-- Bibliotecas do Bootstrap e JQuery -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<header>
		<hgroup>
			<h1>Sistema de Acoes e Projetos</h1>
		</hgroup>
	</header>
	
	<nav>
		<ul class="nav nav-pills">
  			<li class="active"><a href="menu.jsp">Home</a></li>
  			<li><a href="acoes.jsp">Acões</a></li>
  			<li><a href="projetos.jsp">Projetos</a></li>
  			<li><a href="sobre.jsp">Sobre</a></li>
  			<li><a href="index.jsp">Sair</a></li>
		</ul><br/>
	</nav>
	
	<section>
		<h2>Minhas Ações</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Acoes</th>
					<th>Quantidade</th>
					<th>Total</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Petrobrás</td>
					<td>5</td>
					<td>R$ 200,00</td>
				</tr>
			</tbody>
		</table><br/>
		
		<h2>Meus Projetos</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Projeto</th>
					<th>Prazo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Construcao da casa</td>
					<td>15 dias</td>
				</tr>
			</tbody>
		</table>
	</section>
</body>
</html>