
<html>
<head>
<%@ include file="parts/head.jsp" %>
<title>Admin - Ajouter un employé</title>
</head>
<body>
	<%@ include file="parts/adminMenu.jsp" %>
	
	<div id="container" style="display: flex;justify-content: center; margin-top:5%;">
	<form method="post" action='adminEmployeAddServlet' enctype="multipart/form-data" style="display: flex;flex-direction: column; width: 20%;">
	
	    <div class="form-group">
	        <label for="nom">Nom</label>
	        <input type="text" class="form-control"
	               id="nom"
	               name="nom"
	               placeholder="Enter un nom">
	    </div>

	    <div class="form-group">
	        <label for="prenom">Prénom</label>
	        <input type="text" class="form-control"
	               id="prenom"
	               name="prenom"
	               placeholder="Enter un prénom">
	    </div>
	    
   	    <div class="form-group">
	        <label for="tel">Numéro de téléphone professionnel</label>
	        <input type="text" class="form-control"
	               id="tel"
	               name="tel"
	               placeholder="Enter un numéro de téléphone">
	    </div>
	    
   	    <div class="form-group">
	        <label for="role">Rôle</label>
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
	               placeholder="Enter un Username">
	    </div>
	    
   	    <div class="form-group">
	        <label for="password">Password</label>
	        <input type="text" class="form-control"
	               id="password"
	               name="password"
	               placeholder="Enter un password">
	    </div>
	    
   	    <div class="form-group">
	        <label for="dateEntre">Date d'entrée dans l'entreprise</label>
	        <input type="date" class="form-control"
	               id="dateEntre"
	               name="dateEntre" style="padding: 0 0 0 13;">
	    </div>


	
	    <div class="form-group">
	        <label for="image">Image à upload</label>
	        <input type="file" accept="image/jpeg"
	               class="form-control"
	               id="image"
	               name="image"
	               placeholder="Veuillez upload un fichier">
	    </div>
	    
	    <input type='submit' class="btn btn-primary" value='valider' style="width: 100%; margin: 5px;"/>
	    	    
	</form>
	</div>
	
</body>
</html>