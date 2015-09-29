package fr.uha.miage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TypeLit {
	
	@Id
	@GeneratedValue
	private int idTlit;
	
	public int getIdTlit() {
		return idTlit;
	}

	public void setIdTlit(int idTlit) {
		this.idTlit = idTlit;
	}

	public String getNomTlit() {
		return nomTlit;
	}

	public void setNomTlit(String nomTlit) {
		this.nomTlit = nomTlit;
	}

	private String nomTlit;
	
}
