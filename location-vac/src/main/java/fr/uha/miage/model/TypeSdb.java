package fr.uha.miage.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TypeSdb {
	
	public int getIdTsdb() {
		return idTsdb;
	}

	public void setIdTsdb(int idTsdb) {
		this.idTsdb = idTsdb;
	}

	public String getNomTsdb() {
		return nomTsdb;
	}

	public void setNomTsdb(String nomTsdb) {
		this.nomTsdb = nomTsdb;
	}

	@Id
	@GeneratedValue
	private int idTsdb;
	
	private String nomTsdb;
	
	
	
	// pour indiquer qu'on trouve les sdb  de la classe location
	@ManyToMany(mappedBy = "typeSdb")
	Set<Location> location;
	public Set<Location> getLocation() {
	        return location;
	}
}
