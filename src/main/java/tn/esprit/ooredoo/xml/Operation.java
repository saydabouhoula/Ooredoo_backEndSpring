package tn.esprit.ooredoo.xml;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {

    @XmlElement(name = "AnneeFacturation")
    private BigDecimal anneeFacturation;

    @XmlElement(name = "CNPC")
    private BigDecimal cNPC;

    @XmlElement(name = "P_Charge")
    private BigDecimal pCharge;

    @XmlElement(name = "MontantHT")
    private BigDecimal montantHT;

    @XmlElement(name = "TauxRS")
    private BigDecimal tauxRS;

    @XmlElement(name = "TauxTVA")
    private BigDecimal tauxTVA;

    @XmlElement(name = "MontantTVA")
    private BigDecimal montantTVA;

    @XmlElement(name = "MontantTTC")
    private BigDecimal montantTTC;

    @XmlElement(name = "MontantRS")
    private BigDecimal montantRS;

    @XmlElement(name = "MontantNetServi")
    private BigDecimal montantNetServi;

    // Getter and Setter methods
    public BigDecimal getAnneeFacturation() {
        return anneeFacturation;
    }

    public void setAnneeFacturation(BigDecimal anneeFacturation) {
        this.anneeFacturation = anneeFacturation;
    }

    public BigDecimal getcNPC() {
        return cNPC;
    }

    public void setcNPC(BigDecimal cNPC) {
        this.cNPC = cNPC;
    }

    public BigDecimal getpCharge() {
        return pCharge;
    }

    public void setpCharge(BigDecimal pCharge) {
        this.pCharge = pCharge;
    }

    public BigDecimal getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(BigDecimal montantHT) {
        this.montantHT = montantHT;
    }

    public BigDecimal getTauxRS() {
        return tauxRS;
    }

    public void setTauxRS(BigDecimal tauxRS) {
        this.tauxRS = tauxRS;
    }

    public BigDecimal getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(BigDecimal tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public BigDecimal getMontantTVA() {
        return montantTVA;
    }

    public void setMontantTVA(BigDecimal montantTVA) {
        this.montantTVA = montantTVA;
    }

    public BigDecimal getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(BigDecimal montantTTC) {
        this.montantTTC = montantTTC;
    }

    public BigDecimal getMontantRS() {
        return montantRS;
    }

    public void setMontantRS(BigDecimal montantRS) {
        this.montantRS = montantRS;
    }

    public BigDecimal getMontantNetServi() {
        return montantNetServi;
    }

    public void setMontantNetServi(BigDecimal montantNetServi) {
        this.montantNetServi = montantNetServi;
    }
}
