package com.examJeeGotRemy.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examJeeGotRemy.models.Utilisateur;
import com.examJeeGotRemy.services.UtilisateurService;

/**
 * Servlet implementation class AdminListeEmploye
 */
public class AdminListeEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UtilisateurService utilisateurService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminListeEmployeServlet() {
        super();
        this.utilisateurService = new UtilisateurService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Utilisateur> utilisateurs = new ArrayList<>();
		
		try {
			utilisateurs = this.utilisateurService.getAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("utilisateurs", utilisateurs);
		request.getRequestDispatcher("adminListeEmploye.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
