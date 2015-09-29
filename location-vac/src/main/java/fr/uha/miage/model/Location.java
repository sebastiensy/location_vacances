package fr.uha.miage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Location {
	
	@Id
	@GeneratedValue
	private int idLoc;
	
	private String nomLoc;
	private int capaciteLoc;
	private String villeLoc;
	private String descLoc;
	private String paysLoc;
	private String adresseLoc;
	private int cpLocal;
	private double prixLoc;
	
	
	// id tp en clé étrangere
	// many to one (1,1 >> 1,N)
	@ManyToOne
	@JoinColumn(name = "idTp")
	private TypePropriete idTp ;
	
	
	
	// pr une loc= plusieurs chambres
	@OneToMany
	private List<Chambre> chambres;
	
	
	// une location a au moins une photo
	@OneToMany
	private List<Photo> photos;
	
	public int getIdLoc() {
		return idLoc;
	}


	public void setIdLoc(int idLoc) {
		this.idLoc = idLoc;
	}


	public String getNomLoc() {
		return nomLoc;
	}


	public void setNomLoc(String nomLoc) {
		this.nomLoc = nomLoc;
	}


	public int getCapaciteLoc() {
		return capaciteLoc;
	}


	public void setCapaciteLoc(int capaciteLoc) {
		this.capaciteLoc = capaciteLoc;
	}


	public String getVilleLoc() {
		return villeLoc;
	}


	public void setVilleLoc(String villeLoc) {
		this.villeLoc = villeLoc;
	}


	public String getDescLoc() {
		return descLoc;
	}


	public void setDescLoc(String descLoc) {
		this.descLoc = descLoc;
	}


	public String getPaysLoc() {
		return paysLoc;
	}


	public void setPaysLoc(String paysLoc) {
		this.paysLoc = paysLoc;
	}


	public String getAdresseLoc() {
		return adresseLoc;
	}


	public void setAdresseLoc(String adresseLoc) {
		this.adresseLoc = adresseLoc;
	}


	public int getCpLocal() {
		return cpLocal;
	}


	public void setCpLocal(int cpLocal) {
		this.cpLocal = cpLocal;
	}


	public double getPrixLoc() {
		return prixLoc;
	}


	public void setPrixLoc(double prixLoc) {
		this.prixLoc = prixLoc;
	}


	public TypePropriete getIdTp() {
		return idTp;
	}


	public void setIdTp(TypePropriete idTp) {
		this.idTp = idTp;
	}


	public List<Chambre> getChambres() {
		return chambres;
	}


	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}


	public List<Photo> getPhotos() {
		return photos;
	}


	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	
	
	
	
	
}
