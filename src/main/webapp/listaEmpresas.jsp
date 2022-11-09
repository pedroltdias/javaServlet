<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Empresas - JSP</title>
</head>
<body>
	Lista de Empresas: <br/>
	<ul>
		<c:forEach items="${empresas}" var="empresa" >
			<li>${empresa.nome}</li>
		</c:forEach>
	</ul>
</body>
</html>