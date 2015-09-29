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
	
	private String nomTlit;
	
}
