<%@ page contentType="text/html;charset=UTF-8" language="java"%>
	<%
		if (request.getSession().getAttribute("admin") == null) {
		response.sendRedirect("loginServlet");
	}
		

	%>
<div style="display: flex;justify-content: flex-end;background-color:grey;">
<a class="btn btn-primary" href='<%out.println(request.getContextPath());%>/adminListeEmployeServlet' style="margin: 5px;">Liste des employés</a>
<a class="btn btn-primary" href='<%out.println(request.getContextPath());%>/adminEmployeAddServlet' style="margin: 5px;">Ajouter un Employé</a>
<a class="btn btn-primary" href='<%out.println(request.getContextPath());%>/logoutServlet' style="margin: 5px;">Déconnection</a>
</div>