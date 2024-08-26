package tn.esprit.ooredoo.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Certificat")
@XmlType(propOrder = { "beneficiaire", "datePayement", "refCertifChezDeclarant", "listeOperations", "totalPayement", "idTaxpayer", "infosContact" })
public class Certificat {

    private Beneficiaire beneficiaire;
    private LocalDate datePayement; // Use LocalDate for date fields
    private String refCertifChezDeclarant;
    private List<OperationXML> listeOperations = new ArrayList<>();
    private TotalPayement totalPayement;
    private IdTaxpayer idTaxpayer;
    private InfosContact infosContact;

    @XmlElement(name = "Beneficiaire")
    public Beneficiaire getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(Beneficiaire beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    @XmlElement(name = "DatePayement")
    public LocalDate getDatePayement() {
        return datePayement;
    }

    public void setDatePayement(LocalDate datePayement) {
        this.datePayement = datePayement;
    }

    @XmlElement(name = "Ref_certif_chez_declarant")
    public String getRefCertifChezDeclarant() {
        return refCertifChezDeclarant;
    }

    public void setRefCertifChezDeclarant(String refCertifChezDeclarant) {
        this.refCertifChezDeclarant = refCertifChezDeclarant;
    }

    @XmlElement(name = "ListeOperations")
    public List<OperationXML> getListeOperations() {
        return listeOperations;
    }

    public void setListeOperations(List<OperationXML> listeOperations) {
        this.listeOperations = listeOperations;
    }

    @XmlElement(name = "TotalPayement")
    public TotalPayement getTotalPayement() {
        return totalPayement;
    }

    public void setTotalPayement(TotalPayement totalPayement) {
        this.totalPayement = totalPayement;
    }

    @XmlElement(name = "IdTaxpayer")
    public IdTaxpayer getIdTaxpayer() {
        return idTaxpayer;
    }

    public void setIdTaxpayer(IdTaxpayer idTaxpayer) {
        this.idTaxpayer = idTaxpayer;
    }

    @XmlElement(name = "InfosContact")
    public InfosContact getInfosContact() {
        return infosContact;
    }

    public void setInfosContact(InfosContact infosContact) {
        this.infosContact = infosContact;
    }

    // Method to add an OperationXML to the list
    public void addOperation(OperationXML operation) {
        if (this.listeOperations == null) {
            this.listeOperations = new ArrayList<>();
        }
        this.listeOperations.add(operation);
    }
}
