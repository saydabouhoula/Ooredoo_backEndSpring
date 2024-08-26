package tn.esprit.ooredoo.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ReferenceDeclaration {

    @XmlElement(name = "ActeDepot")
    private int acteDepot;

    @XmlElement(name = "AnneeDepot")
    private int anneeDepot;

    @XmlElement(name = "MoisDepot")
    private int moisDepot;

    // Getters and Setters
    public int getActeDepot() {
        return acteDepot;
    }

    public void setActeDepot(int acteDepot) {
        this.acteDepot = acteDepot;
    }

    public int getAnneeDepot() {
        return anneeDepot;
    }

    public void setAnneeDepot(int anneeDepot) {
        this.anneeDepot = anneeDepot;
    }

    public int getMoisDepot() {
        return moisDepot;
    }

    public void setMoisDepot(int moisDepot) {
        this.moisDepot = moisDepot;
    }
}
