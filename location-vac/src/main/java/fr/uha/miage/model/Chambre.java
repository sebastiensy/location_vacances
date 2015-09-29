package fr.uha.miage.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chambre {
	@Id
	@GeneratedValue
	private int idChambre;
	
	
	public int getIdChambre() {
		return idChambre;
	}


	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}


	public Location getLoc() {
		return loc;
	}


	public void setLoc(Location loc) {
		this.loc = loc;
	}


	// many to one (1,1 >> 1,N)
	@ManyToOne
	@JoinColumn(name = "idLoc")
	private Location loc;
	
	
	
	
}
