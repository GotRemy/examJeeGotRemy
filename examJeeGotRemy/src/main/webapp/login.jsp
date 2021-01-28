<html>
<head>
<%@ include file="parts/head.jsp" %>
<title>Login</title>
</head>
<body>

  <div id="container" style="margin-top: 10%;display: flex;justify-content: center;">

                <form action='loginServlet' method='post' class="formulaire needs-validation" style="display: flex;flex-direction: column;">
                  	<h1 style="margin-left: 10px;">Bienvenue !</h1>
  					<h3 style="margin-left: 10px;">Connectez vous</h3>
                <input type='text' placeholder='username' class="form-control" name='username' required minlength="1" autocomplete="off" style="margin: 5px;"/> <br>
                <input type='password' placeholder='password' class="form-control" name='password' required minlength="1" autocomplete="off" style="margin: 5px;"/> <br>
                
                <input type='submit' class="btn btn-primary" value='valider' style="width: 100%; margin: 5px;"/>
                
                </form>
	</div>

</body>
</html>