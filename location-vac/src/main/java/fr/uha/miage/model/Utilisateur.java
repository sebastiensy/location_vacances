package fr.uha.miage.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue
	private int idUser;
	
	private String nomUser;
	private String prenomUser;
	private String emailUser;
	private String mdpUser;
	private Date dateNaissanceUser;
	private String telUser;
	private boolean droitUser;
	private String photoUser;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getMdpUser() {
		return mdpUser;
	}
	public void setMdpUser(String mdpUser) {
		this.mdpUser = mdpUser;
	}
	public Date getDateNaissanceUser() {
		return dateNaissanceUser;
	}
	public void setDateNaissanceUser(Date dateNaissanceUser) {
		this.dateNaissanceUser = dateNaissanceUser;
	}
	public String getTelUser() {
		return telUser;
	}
	public void setTelUser(String telUser) {
		this.telUser = telUser;
	}
	public boolean isDroitUser() {
		return droitUser;
	}
	public void setDroitUser(boolean droitUser) {
		this.droitUser = droitUser;
	}
	public String getPhotoUser() {
		return photoUser;
	}
	public void setPhotoUser(String photoUser) {
		this.photoUser = photoUser;
	}
	
	
	
	
	

}
