package fr.uha.miage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypePropriete {
	
	@Id
	@GeneratedValue
	private int idTp;
	
	private String nomTp;
	
	@OneToMany
	private List<Location> locs;

	public int getIdTp() {
		return idTp;
	}

	public void setIdTp(int idTp) {
		this.idTp = idTp;
	}

	public String getNomTp() {
		return nomTp;
	}

	public void setNomTp(String nomTp) {
		this.nomTp = nomTp;
	}
	
	
}
