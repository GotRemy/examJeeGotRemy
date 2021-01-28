<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@ include file="parts/head.jsp" %>
<title>D�tail employ�</title>
</head>
<body>
<%@ include file="parts/menu.jsp" %>


	
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Colonne</th>
	      <th scope="col">R�sultat</th>
	    </tr>
	  </thead>
	  <tbody>

	    <tr>
	      <td>Nom</td>
	      <td>${utilisateur.nom }</td>
	    </tr>
	    
   	    <tr>
	      <td>Pr�nom</td>
	      <td>${utilisateur.prenom }</td>
	    </tr>
	    
   	    <tr>
	      <td>Date d'entr�</td>
	      <td>${utilisateur.dateEntre }</td>
	    </tr>
	    
   	    <tr>
	      <td>T�l�phone</td>
	      <td>${utilisateur.tel }</td>
	    </tr>
	    
   	    <tr>
	      <td>R�le</td>
	      <td>${utilisateur.role }</td>
	    </tr>
	
   	    <tr>
	      <td>Image</td>
	      
	      <c:choose>
		    <c:when test="${utilisateur.image.equals('')}">
		        <td>Il n'y a pas d'image pour cette employ�</td>
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