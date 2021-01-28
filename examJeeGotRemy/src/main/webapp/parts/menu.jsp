<%@ page contentType="text/html;charset=UTF-8" language="java"%>
	<%
		if (request.getSession().getAttribute("user") == null) {
		response.sendRedirect("loginServlet");
	}
		

	%>
<div style="display: flex;justify-content: flex-end;background-color:grey;">
<a class="btn btn-primary" href='<%out.println(request.getContextPath());%>/listeEmployeServlet' style="margin: 5px;">Liste des employés</a>
<a class="btn btn-primary" href='<%out.println(request.getContextPath());%>/logoutServlet' style="margin: 5px;">Déconnection</a>
</div>