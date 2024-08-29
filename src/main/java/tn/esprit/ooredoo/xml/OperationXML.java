package tn.esprit.ooredoo.xml;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(propOrder = {
        "idTypeOperation", "anneeFacturation", "cNPC", "pCharge",
        "montantHT", "tauxRS", "tauxTVA", "montantTVA",
        "montantTTC", "montantRS", "montantNetServi"
})
public class OperationXML {

    private String idTypeOperation;
    private BigDecimal anneeFacturation;
    private BigDecimal cNPC;
    private BigDecimal pCharge;
    private BigDecimal montantHT;
    private BigDecimal tauxRS;
    private BigDecimal tauxTVA;
    private BigDecimal montantTVA;
    private BigDecimal montantTTC;
    private BigDecimal montantRS;
    private BigDecimal montantNetServi;

    @XmlAttribute(name = "IdTypeOperation")
    public String getIdTypeOperation() {
        return idTypeOperation;
    }

    public void setIdTypeOperation(String idTypeOperation) {
        this.idTypeOperation = idTypeOperation;
    }

    @XmlElement(name = "AnneeFacturation")
    public BigDecimal getAnneeFacturation() {
        return anneeFacturation;
    }

    public void setAnneeFacturation(BigDecimal anneeFacturation) {
        this.anneeFacturation = anneeFacturation;
    }

    @XmlElement(name = "CNPC")
    public BigDecimal getcNPC() {
        return cNPC;
    }

    public void setcNPC(BigDecimal cNPC) {
        this.cNPC = cNPC;
    }

    @XmlElement(name = "PCharge")
    public BigDecimal getpCharge() {
        return pCharge;
    }

    public void setpCharge(BigDecimal pCharge) {
        this.pCharge = pCharge;
    }

    @XmlElement(name = "MontantHT")
    public BigDecimal getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(BigDecimal montantHT) {
        this.montantHT = montantHT;
    }

    @XmlElement(name = "TauxRS")
    public BigDecimal getTauxRS() {
        return tauxRS;
    }

    public void setTauxRS(BigDecimal tauxRS) {
        this.tauxRS = tauxRS;
    }

    @XmlElement(name = "TauxTVA")
    public BigDecimal getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(BigDecimal tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    @XmlElement(name = "MontantTVA")
    public BigDecimal getMontantTVA() {
        return montantTVA;
    }

    public void setMontantTVA(BigDecimal montantTVA) {
        this.montantTVA = montantTVA;
    }

    @XmlElement(name = "MontantTTC")
    public BigDecimal getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(BigDecimal montantTTC) {
        this.montantTTC = montantTTC;
    }

    @XmlElement(name = "MontantRS")
    public BigDecimal getMontantRS() {
        return montantRS;
    }

    public void setMontantRS(BigDecimal montantRS) {
        this.montantRS = montantRS;
    }

    @XmlElement(name = "MontantNetServi")
    public BigDecimal getMontantNetServi() {
        return montantNetServi;
    }

    public void setMontantNetServi(BigDecimal montantNetServi) {
        this.montantNetServi = montantNetServi;
    }
}
