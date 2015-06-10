<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Cadastro</title>
</head>
<body>
	<h1>Cadastro</h1>
	<form action="formulario" method="post">
		<label>Nome:</label>
		<input type="text" name="nome"/>
		<label>Senha:</label>
		<input type="password" name="senha"/>
		<button type="submit">Salvar</button>
	</form>
</body>
</html>