package com.examJeeGotRemy.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.examJeeGotRemy.models.Utilisateur;
import com.examJeeGotRemy.utils.DataConnect;

public class UtilisateurService {

	private Connection connection;
	
	public UtilisateurService() {
		try {
			this.connection = DataConnect.getInstance().getConnection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Utilisateur> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Utilisateur> utilisateurs = new ArrayList<>();
		
		String query = "select * from utilisateur;";
		PreparedStatement prepareStatement = this.connection.prepareStatement(query);
		ResultSet resultSet = prepareStatement.executeQuery();
		
		while(resultSet.next()) {
			
			Integer id = resultSet.getInt("id");
			String nom = resultSet.getString("nom");
			String prenom = resultSet.getString("prenom");
			String image = resultSet.getString("image");
			String dateEntre = resultSet.getString("dateEntre");
			int tel = resultSet.getInt("tel");
			String role = resultSet.getString("role");
			String username = resultSet.getString("username");
			String password = resultSet.getString("password");
			Utilisateur utilisateur = new Utilisateur(id, nom, prenom, image, dateEntre, tel, role, username, password);
			utilisateurs.add(utilisateur);
		}
		
		resultSet.close();
		prepareStatement.close();
		
		return utilisateurs;
	}

	public Utilisateur getById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "select * from utilisateur where id = ?;";
		
		try {
			PreparedStatement prepareStatement = this.connection.prepareStatement(query);
			prepareStatement.setInt(1, id);
			ResultSet resultSet = prepareStatement.executeQuery();
			
			if(resultSet.next()) {

				Integer idRetourner = resultSet.getInt("id");
				String nom = resultSet.getString("nom");
				String prenom = resultSet.getString("prenom");
				String image = resultSet.getString("image");
				String dateEntre = resultSet.getString("dateEntre");
				int tel = resultSet.getInt("tel");
				String role = resultSet.getString("role");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				Utilisateur utilisateur = new Utilisateur(id, nom, prenom, image, dateEntre, tel, role, username, password);
				
				return utilisateur;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public void create(Utilisateur t) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into utilisateur (nom, prenom, image, dateEntre, tel, role, username, password) values (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement prepareStatement = this.connection.prepareStatement(query);
			prepareStatement.setString(1, t.getNom());
			prepareStatement.setString(2, t.getPrenom());
			prepareStatement.setString(3, t.getImage());
			prepareStatement.setString(4, t.getDateEntre());
			prepareStatement.setInt(5, t.getTel());
			prepareStatement.setString(6, t.getRole());
			prepareStatement.setString(7, t.getUsername());
			prepareStatement.setString(8, t.getPassword());
			
			prepareStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Utilisateur t) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update utilisateur set nom = ?, prenom = ?, image = ?, dateEntre = ?, tel = ?, role = ?, username = ?, password = ? where id = ?";
		try {
			PreparedStatement prepareStatement = this.connection.prepareStatement(query);
			prepareStatement.setString(1, t.getNom());
			prepareStatement.setString(2, t.getPrenom());
			prepareStatement.setString(3, t.getImage());
			prepareStatement.setString(4, t.getDateEntre());
			prepareStatement.setInt(5, t.getTel());
			prepareStatement.setString(6, t.getRole());
			prepareStatement.setString(7, t.getUsername());
			prepareStatement.setString(8, t.getPassword());
			prepareStatement.setInt(9, t.getId());
			
			prepareStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Utilisateur t) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "delete from utilisateur where id = ?";
		try {
			PreparedStatement prepareStatement = this.connection.prepareStatement(query);
			prepareStatement.setInt(1, t.getId());
			
			prepareStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
