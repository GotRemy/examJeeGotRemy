package com.examJeeGotRemy.servlets;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.examJeeGotRemy.models.Utilisateur;
import com.examJeeGotRemy.services.UtilisateurService;

/**
 * Servlet implementation class AdminEmployeAddServlet
 */
public class AdminEmployeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UtilisateurService utilisateurService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminEmployeAddServlet() {
        super();
        this.utilisateurService = new UtilisateurService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("adminEmployeAdd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String applicationPath = request.getServletContext().getRealPath("");
	        // constructs path of the directory to save uploaded file
	        String uploadFilePath = applicationPath + File.separator + "uploads";


	        File uploadFolder = new File(uploadFilePath);
	        if (!uploadFolder.exists()) {
	            uploadFolder.mkdirs();
	        }

	        String uniqueID = UUID.randomUUID().toString();
	        String filePath = uploadFilePath + File.separator + uniqueID +".jpg";


	        // write all files in upload folder
	        for (Part part : request.getParts()) {
	            if (part != null && part.getSize() > 0) {


	                part.write(filePath);
	            }
	        }
	        
			try {
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				int tel  = Integer.parseInt(request.getParameter("tel"));
				String role = request.getParameter("role");
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String image = uniqueID +".jpg";
				String dateEntre  = request.getParameter("dateEntre");
				
				Utilisateur utilisateur = new Utilisateur(nom, prenom, image, dateEntre, tel, role, username, password);
				this.utilisateurService.create(utilisateur);
				response.sendRedirect("adminListeEmployeServlet");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
