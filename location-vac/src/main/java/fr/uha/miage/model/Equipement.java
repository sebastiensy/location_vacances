package fr.uha.miage.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Equipement {

	@Id
	@GeneratedValue
	private int idEquip;
	
	private String nomEquip;

	public int getIdEquip() {
		return idEquip;
	}

	public void setIdEquip(int idEquip) {
		this.idEquip = idEquip;
	}

	public String getNomEquip() {
		return nomEquip;
	}

	public void setNomEquip(String nomEquip) {
		this.nomEquip = nomEquip;
	}
	
	// pour indiquer qu'on trouve les equipements de la classe location
	@ManyToMany(mappedBy = "equipements")
	Set<Location> location;
	public Set<Location> getLocation() {
	        return location;
	}
	
}
