package fr.uha.miage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypePropriete {
	
	@Id
	@GeneratedValue
	private int idTp;
	
	private String nomTp;

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
