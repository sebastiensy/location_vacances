package fr.uha.miage.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reserver {

	@Id
	ReserverId idRes;

	public ReserverId getIdRes() {
		return idRes;
	}

	public void setIdRes(ReserverId idRes) {
		this.idRes = idRes;
	}
	
	@Column(name="dateRDebut")
	private Date dateDebut;

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	@Column(name="dateRFin")
	private Date dateFin;

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	@Column(name="prixReserv")
	private double prixR;

	public double getPrixR() {
		return prixR;
	}

	public void setPrixR(double prixR) {
		this.prixR = prixR;
	}
	
	
}
