package fr.uha.miage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EtreDisponible {

     @Id
     EtreDispoId datePK;
     public EtreDispoId getDatePK() {
		return datePK;
	}

	public void setDatePK(EtreDispoId datePK) {
 		this.datePK = datePK;
 	}

     @Column(name="DateDDebutLoc")
     private Date dateDebutLoc;  
     public Date getDateDebutLoc() {
		return dateDebutLoc;
	}

	public void setDateDebutLoc(Date dateDebutLoc) {
		this.dateDebutLoc = dateDebutLoc;
	}

	
    @Column(name="DateDDebutLoc")
    private Date dateFinLoc;
	public Date getDateFinLoc() {
		return dateFinLoc;
	}

	public void setDateFinLoc(Date dateFinLoc) {
		this.dateFinLoc = dateFinLoc;
	}  
	
}