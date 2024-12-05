<%@page import="com.ipartek.almacen.pojos.Producto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<ul>
		<c:forEach items="${productos}" var="p">
		<li>
			${p.nombre}: ${p.precio}€
		</li>	
		</c:forEach>
	</ul>
</body>
</html>