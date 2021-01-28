package com.examJeeGotRemy.models;

import java.sql.Date;

public class Utilisateur {

	private int id;
	private String nom;
	private String prenom;
	private String image;
	private String dateEntre;
	private int tel;
	private String role;
	private String username;
	private String password;
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param image
	 * @param dateEntre
	 * @param tel
	 * @param role
	 */
	public Utilisateur(int id, String nom, String prenom, String image, String dateEntre, int tel, String role, String username, String password) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.dateEntre = dateEntre;
		this.tel = tel;
		this.role = role;
		this.username = username;
		this.password = password;
	}
	
	//sans id
	public Utilisateur(String nom, String prenom, String image, String dateEntre, int tel, String role, String username, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.dateEntre = dateEntre;
		this.tel = tel;
		this.role = role;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDateEntre() {
		return dateEntre;
	}

	public void setDateEntre(String dateEntre) {
		this.dateEntre = dateEntre;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
