<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@ include file="parts/head.jsp" %>
<title>Admin - Liste des Employes</title>
</head>
<body>
<%@ include file="parts/adminMenu.jsp" %>


	
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Nom</th>
	      <th scope="col">Prenom</th>
	      <th scope="col">Editer/Supprimer</th>
	    </tr>
	  </thead>
	  <tbody>
	  
	  	<c:forEach var="utilisateur" items="${requestScope.utilisateurs}">
		    <tr>
		      <th scope="row">${utilisateur.id }</th>
		      <td>${utilisateur.nom }</td>
		      <td>${utilisateur.prenom }</td>
		      <td>${utilisateur.role }</td>
		      <td>
		      	<a class="btn btn-primary" href="<%out.println(request.getContextPath());%>/adminEmployeUpdateServlet?id=${utilisateur.id}">Editer !</a>
				<a class="btn btn-primary" href="<%out.println(request.getContextPath());%>/adminEmployeDeleteServlet?id=${utilisateur.id}">Supprimer !</a>
		      </td>
		    </tr>
			
		</c:forEach>
	    
	  </tbody>
	</table>
	
</body>
</html>