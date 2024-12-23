<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<p>${producto}</p>
<form method="post" enctype="multipart/form-data" action="fc/admin/producto" class="needs-validation" novalidate>
	<div class="row mb-3">
		<label for="id" class="col-sm-2 col-form-label">Id</label>
		<div class="col-sm-10">
			<input type="number" readonly class="form-control" id="id" name="id" value="${producto.id}">
		</div>
	</div>
	<div class="row mb-3">
		<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
		<div class="col-sm-10">
			<input type="text"required class="form-control" id="nombre" name="nombre" value="${producto.nombre}">
<!-- 			<div class="invalid-feedback">El nombre no se puede dejar vacío</div> -->
		</div>
	</div>
	<div class="row mb-3">
		<label for="precio" class="col-sm-2 col-form-label">Precio</label>
		<div class="col-sm-10">
			<input type="number" required min="0" step=".01" class="form-control" id="precio" name="precio" value="${producto.precio}">
<!-- 			<div class="invalid-feedback">El precio es obligatorio y no puede ser negativo</div> -->
		</div>
	</div>
	<div class="row mb-3">
		<label for="url" class="col-sm-2 col-form-label">URL</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="url" name="url" value="${producto.url}">
		</div>
	</div>
	<div class="row mb-3">
		<label for="imagen" class="col-sm-2 col-form-label">Imagen</label>
		<div class="col-sm-10">
			<input type="file" accept="image/jpeg" class="form-control" id="imagen" name="imagen">
		</div>
	</div>
	<div class="row mb-3">
		<label for="descripcion" class="col-sm-2 col-form-label">Descripción</label>
		<div class="col-sm-10">
			<textarea rows="7" class="form-control" id="descripcion"
				name="descripcion">${producto.descripcion}</textarea>
		</div>
	</div>
	
	<div class="row mb-3">
		<div class="offset-sm-2 col-sm-10">
			<button class="btn btn-primary">Guardar</button>
		</div>
	</div>
</form>

<%--
	<ul>
		<c:forEach items="${producto.errores.values()}" var="error">
			<li>${error}</li>
		</c:forEach>
	</ul>
	--%>
<script src="js/tinymce/tinymce.min.js"></script>
<script>
	tinymce.init({
		selector : 'textarea',
		language: 'es',
		menubar: false,
	});
</script>
<script src="js/validacion.js"></script>

<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>