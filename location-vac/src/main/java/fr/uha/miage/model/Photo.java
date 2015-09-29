package fr.uha.miage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Photo {

	@Id
	@GeneratedValue
	private int idPhoto;
	
	private String nomPhoto;
	
	@ManyToOne
	@JoinColumn(name="idLoc")
	private Location locs;

	public int getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(int idPhoto) {
		this.idPhoto = idPhoto;
	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public Location getLocs() {
		return locs;
	}

	public void setLocs(Location locs) {
		this.locs = locs;
	}
	
	
}
