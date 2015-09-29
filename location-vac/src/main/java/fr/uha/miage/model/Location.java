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
	
	
	
	
	
}
