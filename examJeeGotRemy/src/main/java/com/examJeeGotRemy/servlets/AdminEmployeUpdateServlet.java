package com.examJeeGotRemy.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examJeeGotRemy.models.Utilisateur;
import com.examJeeGotRemy.services.UtilisateurService;

/**
 * Servlet implementation class AdminEmployeUpdateServlet
 */
public class AdminEmployeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UtilisateurService utilisateurService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminEmployeUpdateServlet() {
        super();
        this.utilisateurService = new UtilisateurService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		try {
			Utilisateur utilisateur = this.utilisateurService.getById(id);
			
			request.setAttribute("utilisateur", utilisateur);
			request.getRequestDispatcher("adminEmployeUpdate.jsp").forward(request, response);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Integer id = Integer.parseInt(request.getParameter("id"));
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String image = request.getParameter("image");
			String dateEntre = request.getParameter("dateEntre");
			int tel = Integer.parseInt(request.getParameter("tel"));
			String role = request.getParameter("role");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Utilisateur utilisateur = new Utilisateur(id, nom, prenom, image, dateEntre, tel, role, username, password);
			this.utilisateurService.update(utilisateur);
			response.sendRedirect("adminListeEmployeServlet");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
