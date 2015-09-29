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
	
	private Date datDebutDispo;
	private Date dateFinDispo;
	public int getIdDateDispo() {
		return idDateDispo;
	}
	public void setIdDateDispo(int idDateDispo) {
		this.idDateDispo = idDateDispo;
	}
	public Date getDatDebutDispo() {
		return datDebutDispo;
	}
	public void setDatDebutDispo(Date datDebutDispo) {
		this.datDebutDispo = datDebutDispo;
	}
	public Date getDateFinDispo() {
		return dateFinDispo;
	}
	public void setDateFinDispo(Date dateFinDispo) {
		this.dateFinDispo = dateFinDispo;
	}
	
	
	
}
