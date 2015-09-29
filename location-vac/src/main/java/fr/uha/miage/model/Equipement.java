package fr.uha.miage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipement {

	@Id
	@GeneratedValue
	private int idEquip;
	
	private String nomEquip;
}
