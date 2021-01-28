<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@ include file="parts/head.jsp" %>
<title>Détail employé</title>
</head>
<body>
<%@ include file="parts/menu.jsp" %>


	
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Colonne</th>
	      <th scope="col">Résultat</th>
	    </tr>
	  </thead>
	  <tbody>

	    <tr>
	      <td>Nom</td>
	      <td>${utilisateur.nom }</td>
	    </tr>
	    
   	    <tr>
	      <td>Prénom</td>
	      <td>${utilisateur.prenom }</td>
	    </tr>
	    
   	    <tr>
	      <td>Date d'entré</td>
	      <td>${utilisateur.dateEntre }</td>
	    </tr>
	    
   	    <tr>
	      <td>Téléphone</td>
	      <td>${utilisateur.tel }</td>
	    </tr>
	    
   	    <tr>
	      <td>Rôle</td>
	      <td>${utilisateur.role }</td>
	    </tr>
	
   	    <tr>
	      <td>Image</td>
	      
	      <c:choose>
		    <c:when test="${utilisateur.image.equals('')}">
		        <td>Il n'y a pas d'image pour cette employé</td>
		    </c:when>    
		    <c:otherwise>
		       	<td><img src="uploads/${utilisateur.image }" style="width:500px;"></td>
		    </c:otherwise>
		</c:choose>

	    </tr>
	    
	  </tbody>
	</table>
</body>
</html>