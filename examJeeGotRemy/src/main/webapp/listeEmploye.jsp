<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta>
<%@ include file="parts/head.jsp" %>
<title>Liste des Employes</title>

</head>
<body>
<%@ include file="parts/menu.jsp" %>


	
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Nom</th>
	      <th scope="col">Prénom</th>
	      <th scope="col">Détail</th>
	    </tr>
	  </thead>
	  <tbody>
	  
	  	<c:forEach var="utilisateur" items="${requestScope.utilisateurs}">
		    <tr>
		      <td>${utilisateur.nom }</td>
		      <td>${utilisateur.prenom }</td>
		      <td>
		      	<a class="btn btn-primary" href="<%out.println(request.getContextPath());%>/detailEmployeServlet?id=${utilisateur.id}">Détail</a>
		      </td>
		    </tr>
			
		</c:forEach>
	    
	  </tbody>
	</table>
	
</body>
</html>