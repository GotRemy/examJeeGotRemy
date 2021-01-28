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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        this.utilisateurService = new UtilisateurService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean redirection = true;
		try {
			for(Utilisateur utilisateur : this.utilisateurService.getAll()) {
				
				if(utilisateur.getUsername().equals(username) && utilisateur.getPassword().equals(password)) {
					if(utilisateur.getRole().equals("admin")) {
						request.getSession().setAttribute("admin", "admin");
						response.sendRedirect("adminListeEmployeServlet");
					}
					else if(utilisateur.getRole().equals("user")) {
						request.getSession().setAttribute("user", "user");
						response.sendRedirect("listeEmployeServlet");
					}
					else {
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
					
					redirection=false;
				}
			}
			if(redirection) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
