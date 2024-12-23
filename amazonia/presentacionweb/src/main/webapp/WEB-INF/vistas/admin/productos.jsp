<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<form action="fc/admin/productos-borrar" method="post">
<table class="table table-striped table-hover table-bordered">
	<caption>Productos</caption>
	<thead class="table-dark">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Precio</th>
			<th>Url</th>
			<th>Acciones</th>
			<th>X</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${productos}" var="p">
			<tr>
				<th>${p.id}</th>
				<td>${p.nombre}</td>
				<td><fmt:formatNumber type="currency" value="${p.precio}" /></td>
				<td>${p.url}</td>
				<td><a href="fc/admin/producto?id=${p.id}" class="btn btn-primary btn-sm">Editar</a>
				<a onclick="javascript:return confirm('¿Estás seguro de que quieres borrar ${p.nombre}?')" href="fc/admin/producto-borrar?id=${p.id}" class="btn btn-danger btn-sm">Borrar</a></td>
				<td><input type="checkbox" name="id" value="${p.id}" class="form-check-input"></td>
			</tr>
		</c:forEach>
	</tbody>
	<tfoot class="table-dark">
		<tr>
			<td colspan="4"></td>
			<td><a class="btn btn-sm btn-primary" href="fc/admin/producto">Añadir</a></td>
			<td><button class="btn btn-sm btn-danger"><i class="bi bi-trash"></i></button></td>
</table>
</form>

<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>
