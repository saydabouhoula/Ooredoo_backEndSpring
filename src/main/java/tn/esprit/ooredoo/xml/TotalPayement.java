package tn.esprit.ooredoo.xml;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class TotalPayement {

    @XmlElement(name = "TotalMontantHT")
    private BigDecimal totalMontantHT;

    @XmlElement(name = "TotalMontantTVA")
    private BigDecimal totalMontantTVA;

    @XmlElement(name = "TotalMontantTTC")
    private BigDecimal totalMontantTTC;

    @XmlElement(name = "TotalMontantRS")
    private BigDecimal totalMontantRS;

    @XmlElement(name = "TotalMontantNetServi")
    private BigDecimal totalMontantNetServi;

    // Getter and Setter methods
    public BigDecimal getTotalMontantHT() {
        return totalMontantHT;
    }

    public void setTotalMontantHT(BigDecimal totalMontantHT) {
        this.totalMontantHT = totalMontantHT;
    }

    public BigDecimal getTotalMontantTVA() {
        return totalMontantTVA;
    }

    public void setTotalMontantTVA(BigDecimal totalMontantTVA) {
        this.totalMontantTVA = totalMontantTVA;
    }

    public BigDecimal getTotalMontantTTC() {
        return totalMontantTTC;
    }

    public void setTotalMontantTTC(BigDecimal totalMontantTTC) {
        this.totalMontantTTC = totalMontantTTC;
    }

    public BigDecimal getTotalMontantRS() {
        return totalMontantRS;
    }

    public void setTotalMontantRS(BigDecimal totalMontantRS) {
        this.totalMontantRS = totalMontantRS;
    }

    public BigDecimal getTotalMontantNetServi() {
        return totalMontantNetServi;
    }

    public void setTotalMontantNetServi(BigDecimal totalMontantNetServi) {
        this.totalMontantNetServi = totalMontantNetServi;
    }
}
