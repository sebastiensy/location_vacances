package fr.uha.miage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Embeddable
public class EtreDispoId implements java.io.Serializable {
	

	
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "idLoc")
    private Location loc;
    public Location getLoc() {
            return loc;
    }

    public void setLoc(Location loc) {
            this.loc = loc;
    }

    @ManyToOne
    @JoinColumn(name = "idDateDispo")
    private DateDispo dateDis;
    public DateDispo getDateDispo() {
            return dateDis;
    }

    public void setDateDispo(DateDispo dateDis) {
            this.dateDis = dateDis;
    }

}
