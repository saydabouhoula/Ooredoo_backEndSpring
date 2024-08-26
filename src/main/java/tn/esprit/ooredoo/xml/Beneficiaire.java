package tn.esprit.ooredoo.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class Beneficiaire {

    @XmlElement(name = "IdTaxpayer")
    private IdTaxpayer idTaxpayer;

    @XmlElement(name = "Resident")
    private BigDecimal resident;

    @XmlElement(name = "NometprenonOuRaisonsociale")
    private String nomEtPrenomOuRaisonsociale;

    @XmlElement(name = "Adresse")
    private String adresse;

    @XmlElement(name = "Activite")
    private String activite;

    @XmlElement(name = "InfosContact")
    private InfosContact infosContact;

    // Getters and Setters
    public IdTaxpayer getIdTaxpayer() {
        return idTaxpayer;
    }

    public void setIdTaxpayer(IdTaxpayer idTaxpayer) {
        this.idTaxpayer = idTaxpayer;
    }

    public BigDecimal getResident() {
        return resident;
    }

    public void setResident(BigDecimal resident) {
        this.resident = resident;
    }

    public String getNomEtPrenomOuRaisonsociale() {
        return nomEtPrenomOuRaisonsociale;
    }

    public void setNomEtPrenomOuRaisonsociale(String nomEtPrenomOuRaisonsociale) {
        this.nomEtPrenomOuRaisonsociale = nomEtPrenomOuRaisonsociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public InfosContact getInfosContact() {
        return infosContact;
    }

    public void setInfosContact(InfosContact infosContact) {
        this.infosContact = infosContact;
    }
}

