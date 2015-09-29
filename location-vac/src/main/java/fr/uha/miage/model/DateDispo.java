package fr.uha.miage.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DateDispo {

	@Id
	@GeneratedValue
	private int idDateDispo;
	
	private Date dateDebutDispo;
	private Date dateFinDispo;
	public int getIdDateDispo() {
		return idDateDispo;
	}
	public void setIdDateDispo(int idDateDispo) {
		this.idDateDispo = idDateDispo;
	}
	public Date getDatDebutDispo() {
		return dateDebutDispo;
	}
	public void setDatDebutDispo(Date datDebutDispo) {
		this.dateDebutDispo = datDebutDispo;
	}
	public Date getDateFinDispo() {
		return dateFinDispo;
	}
	public void setDateFinDispo(Date dateFinDispo) {
		this.dateFinDispo = dateFinDispo;
	}
	
	
	
}
