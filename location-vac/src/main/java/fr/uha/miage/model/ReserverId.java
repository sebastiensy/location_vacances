package fr.uha.miage.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ReserverId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "idLoc")
    private Location loc;
    public Location getLoc() {
        return loc;
    }
    
    public void setIdLoc(Location loc) {
    	this.loc = loc;
    }
    
    @ManyToOne
    @JoinColumn(name = "idUser")
    private Utilisateur user;
    public Utilisateur getUser() {
    	return user;
    }
    
    public void setIdUser(Utilisateur user) {
    	this.user = user;
    }
}
