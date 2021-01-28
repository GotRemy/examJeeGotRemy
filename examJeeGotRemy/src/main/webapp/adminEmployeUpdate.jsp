<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@ include file="parts/head.jsp" %>
<title>Admin - Modifié un employé</title>
</head>
<body>
	<%@ include file="parts/adminMenu.jsp" %>
	
	<div id="container" style="display: flex;justify-content: center; margin-top:5%;">
	<form method="post" action='adminEmployeUpdateServlet' enctype="multipart/form-data" style="display: flex;flex-direction: column; width: 20%;">


	    	
	    <div class="form-group">
	        <label for="nom">Nom</label>
	        <input type="text" class="form-control"
	               id="nom"
	               name="nom"
	               value="${requestScope.utilisateur.nom}">
	    </div>

	    <div class="form-group">
	        <label for="prenom">Prénom</label>
	        <input type="text" class="form-control"
	               id="prenom"
	               name="prenom"
	               value="${requestScope.utilisateur.prenom}">
	    </div>
	    
   	    <div class="form-group">
	        <label for="tel">Numéro de téléphone professionnel</label>
	        <input type="text" class="form-control"
	               id="tel"
	               name="tel"
	               value="${requestScope.utilisateur.tel}">
	    </div>
	    
   	    <div class="form-group">
	        <label for="role">Rôle actuel : ${requestScope.utilisateur.role}</label>
	        <select class="form-control" id="role" name="role">
			    <option value="admin">admin</option>
			    <option value="user" selected>user</option>
		  	</select>
	    </div>
		
	    <div class="form-group">
	        <label for="username">Username</label>
	        <input type="text" class="form-control"
	               id="username"
	               name="username"
	               value="${requestScope.utilisateur.username}">
	    </div>
	    
   	    <div class="form-group">
	        <label for="password">Password</label>
	        <input type="text" class="form-control"
	               id="password"
	               name="password"
	               value="${requestScope.utilisateur.password}">
	    </div>
	    
   	    <div class="form-group">
	        <label for="dateEntre">Date d'entrée dans l'entreprise</label>
	        <input type="date" class="form-control"
	               id="dateEntre"
	               name="dateEntre" 
	               value="${requestScope.utilisateur.dateEntre}"
	               style="padding: 0 0 0 13;">
	    </div>


	      <c:choose>
		    <c:when test="${utilisateur.image.equals('')}">
		        <td>Il n'y a pas d'image pour cette employé</td>
		    </c:when>    
		    <c:otherwise>
		       	<td>Image actuelle de l'employé <br><img src="uploads/${utilisateur.image }" style="width:500px;"></td>
   		        <input type="hidden" class="form-control"
	               id="img"
	               name="img"
	               value="${utilisateur.image }">
		    </c:otherwise>
		</c:choose>
	    <div class="form-group">
	        <label for="image">Nouvelle image</label>
	        <input type="file" accept="image/jpeg"
	               class="form-control"
	               id="image"
	               name="image">
	    </div>
	    
	    <input type='submit' class="btn btn-primary" value='valider' style="width: 100%; margin: 5px;"/>
	    	    
	</form>
	</div>
	
</body>
</html>