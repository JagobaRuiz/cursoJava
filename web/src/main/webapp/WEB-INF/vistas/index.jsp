<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<div class="row row-cols-1 row-cols-md-3 row-cols-lg-4 g-4">
	<c:forEach items="${productos}" var="p">
		<div class="col">
	<!-- TARJETAS O FICHAS -->	
 			<div class="card h-100"> 
 				<img src="https://picsum.photos/400/300?${p.id}" class="card-img-top" alt="...">
 				<div class="card-body">
					<h5 class="card-title">${p.nombre}</h5>
					<p class="card-text">${p.precio}€</p>
					<p class="card-text">
						<a class="btn btn-primary stretched-link" href="ficha?id=${p.id}">Ver ficha</a>
					</p>
 				</div>
				<div class="card-footer">
					<small class="text-body-secondary">${p.fechaCaducidad}</small>
				</div>
			</div>
		 </div>
 </c:forEach>
 </div>
			


<!-- LIST GROUP -->

<!-- <div class="list-group"> -->
<%--   <a href="ficha?id=${p.id}" class="list-group-item list-group-item-action active stretched-link" aria-current="true"> --%>
<!--     <div class="d-flex w-100 justify-content-between"> -->
<%--       <h5 class="mb-1">${p.nombre}</h5> --%>
<%--       <small>${p.precio}€</small> --%>
<!--     </div> -->
<%--     <p class="mb-1">${p.fechaCaducidad}</p> --%>
<!--     <small>And some small print.</small> -->
<!--   </a> -->
<!-- </div> -->

<!-- TABLA -->

<!-- <table class="table table-striped table-hover"> -->
<!--  <thead> -->
<!--  <tr> -->
<!--       <th scope="col">Nombre</th> -->
<!--       <th scope="col">Precio</th> -->
<!--       <th scope="col">Fecha de caducidad</th> -->
<!--       <th scope="col">Acciones</th> -->
<!--     </tr> -->
<!--  </thead> -->
<!--  <tbody> -->
<%--  		<c:forEach items="${productos}" var="p"> --%>
<!--     <tr> -->
<%--       <td>${p.nombre}</td> --%>
<%--       <td>${p.precio}€</td> --%>
<%--       <td>${p.fechaCaducidad}</td> --%>
<%--       <td><a class= "btn btn-primary" href="ficha?id=${p.id}">Ver ficha</a></td> --%>
<!--     </tr> -->
<%--     </c:forEach> --%>
<!--    </tbody>  -->
<!-- </table> -->


<!-- ACCORDION -->

<!-- <div class="accordion" id="accordionExample"> -->
<%-- <c:forEach items="${productos}" var="p"> --%>
<!--   <div class="accordion-item"> -->
<!--     <h2 class="accordion-header"> -->
<%--       <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapse${p.id}" aria-expanded="true" aria-controls="collapse${p.id}"> --%>
<%--         ${p.nombre} --%>
<!--       </button> -->
<!--     </h2> -->
<%--     <div id="collapse${p.id}" class="accordion-collapse collapse show" data-bs-parent="#accordionExample"> --%>
<!--       <div class="accordion-body"> -->
<%--         <strong>${p.fechaCaducidad}</strong> --%>
<%--         <span class="badge text-bg-primary">${p.precio}</span> --%>
<%--         <a class= "btn btn-primary" href="ficha?id=${p.id}">Ver ficha</a> --%>
        
<!--       </div> -->
<!--     </div> -->

<%--
<ul>
	<c:forEach items="${productos}" var="p">
		<li>${p.nombre}: ${p.precio} -> ${p.fechaCaducidad}</li>
	</c:forEach>
</ul>
 --%>
<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>