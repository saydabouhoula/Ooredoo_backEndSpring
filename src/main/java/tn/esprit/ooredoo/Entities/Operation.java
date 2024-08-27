package tn.esprit.ooredoo.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class Operation {
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

    // Constructeur par défaut
    public Operation() {
    }

    // Constructeur avec tous les paramètres
    public Operation(String idTypeOperation, BigDecimal anneeFacturation, BigDecimal cNPC, BigDecimal pCharge,
                     BigDecimal montantHT, BigDecimal tauxRS, BigDecimal tauxTVA, BigDecimal montantTVA,
                     BigDecimal montantTTC, BigDecimal montantRS, BigDecimal montantNetServi) {
        this.idTypeOperation = idTypeOperation;
        this.anneeFacturation = anneeFacturation;
        this.cNPC = cNPC;
        this.pCharge = pCharge;
        this.montantHT = montantHT;
        this.tauxRS = tauxRS;
        this.tauxTVA = tauxTVA;
        this.montantTVA = montantTVA;
        this.montantTTC = montantTTC;
        this.montantRS = montantRS;
        this.montantNetServi = montantNetServi;
    }

    // Getters et setters
    public String getIdTypeOperation() {
        return idTypeOperation;
    }

    public void setIdTypeOperation(String idTypeOperation) {
        this.idTypeOperation = idTypeOperation;
    }

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

    @Override
    public String toString() {
        return "Operation{" +
                "idTypeOperation='" + idTypeOperation + '\'' +
                ", anneeFacturation=" + anneeFacturation +
                ", cNPC=" + cNPC +
                ", pCharge=" + pCharge +
                ", montantHT=" + montantHT +
                ", tauxRS=" + tauxRS +
                ", tauxTVA=" + tauxTVA +
                ", montantTVA=" + montantTVA +
                ", montantTTC=" + montantTTC +
                ", montantRS=" + montantRS +
                ", montantNetServi=" + montantNetServi +
                '}';
    }
}

