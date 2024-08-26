package tn.esprit.ooredoo.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RSLoadDataDTO {

    private BigDecimal typeIdDeclarant;
    private String idDeclarant;
    private String catDeclarant;
    private BigDecimal acteDepot;
    private BigDecimal anneeDepot;
    private BigDecimal moisDepot;
    private BigDecimal mfTypeIdBenif;
    private String mfIdBenif;
    private String mfCatBenif;
    private BigDecimal cinTypeIdBenif;
    private String cinIdBenif;
    private String cinCatBenif;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate cinDateNaiss;
    private BigDecimal passeportTypeIdBeni;
    private String passeportIdBeni;
    private String passeportPays;
    private String passeportCatBenif;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate passeportDateNaiss;
    private String carteSejourTypeIdBeni;
    private String carteSejourIdBeni;
    private String carteSejourPays;
    private String carteSejourCatBeni;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate carteSejourDateNaiss;
    private String autreIdTypeIdBeni;
    private String autreIdIdBenif;
    private String autreIdPays;
    private String autreIdCatBenif;
    private BigDecimal resident;
    private String nomOuRs;
    private String adresseBenif;
    private String activite;
    private String adresseMail;
    private String numTel;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate datePaiement;
    private String refCertifDecl;
    private String idOperation;
    private BigDecimal anneeFacture;
    private BigDecimal cNPC;
    private BigDecimal priseEnCharge;
    private BigDecimal montantHT;
    private BigDecimal tauxRS;
    private BigDecimal tauxTVA;
    private BigDecimal montantTVA;
    private BigDecimal montantTTC;
    private BigDecimal montantRS;
    private BigDecimal montantNetServi;
    private BigDecimal montantTotalHT;
    private BigDecimal montantTotalTVA;
    private BigDecimal montantTotalTTC;
    private BigDecimal montantTotalRS;
    private String taxeAddCode;
    private BigDecimal taxeAddMontant;
    private BigDecimal monNetServi;
    private String deviseCode;
    private BigDecimal deviseTotalRS;
    private BigDecimal deviseTotalTTC;
    private BigDecimal deviseTotalNetServi;
    private String flags;

    // Getters and Setters

    public BigDecimal getTypeIdDeclarant() {
        return typeIdDeclarant;
    }

    public void setTypeIdDeclarant(BigDecimal typeIdDeclarant) {
        this.typeIdDeclarant = typeIdDeclarant;
    }

    public String getIdDeclarant() {
        return idDeclarant;
    }

    public void setIdDeclarant(String idDeclarant) {
        this.idDeclarant = idDeclarant;
    }

    public String getCatDeclarant() {
        return catDeclarant;
    }

    public void setCatDeclarant(String catDeclarant) {
        this.catDeclarant = catDeclarant;
    }

    public BigDecimal getActeDepot() {
        return acteDepot;
    }

    public void setActeDepot(BigDecimal acteDepot) {
        this.acteDepot = acteDepot;
    }

    public BigDecimal getAnneeDepot() {
        return anneeDepot;
    }

    public void setAnneeDepot(BigDecimal anneeDepot) {
        this.anneeDepot = anneeDepot;
    }

    public BigDecimal getMoisDepot() {
        return moisDepot;
    }

    public void setMoisDepot(BigDecimal moisDepot) {
        this.moisDepot = moisDepot;
    }

    public BigDecimal getMfTypeIdBenif() {
        return mfTypeIdBenif;
    }

    public void setMfTypeIdBenif(BigDecimal mfTypeIdBenif) {
        this.mfTypeIdBenif = mfTypeIdBenif;
    }

    public String getMfIdBenif() {
        return mfIdBenif;
    }

    public void setMfIdBenif(String mfIdBenif) {
        this.mfIdBenif = mfIdBenif;
    }

    public String getMfCatBenif() {
        return mfCatBenif;
    }

    public void setMfCatBenif(String mfCatBenif) {
        this.mfCatBenif = mfCatBenif;
    }

    public BigDecimal getCinTypeIdBenif() {
        return cinTypeIdBenif;
    }

    public void setCinTypeIdBenif(BigDecimal cinTypeIdBenif) {
        this.cinTypeIdBenif = cinTypeIdBenif;
    }

    public String getCinIdBenif() {
        return cinIdBenif;
    }

    public void setCinIdBenif(String cinIdBenif) {
        this.cinIdBenif = cinIdBenif;
    }

    public String getCinCatBenif() {
        return cinCatBenif;
    }

    public void setCinCatBenif(String cinCatBenif) {
        this.cinCatBenif = cinCatBenif;
    }

    public LocalDate getCinDateNaiss() {
        return cinDateNaiss;
    }

    public void setCinDateNaiss(LocalDate cinDateNaiss) {
        this.cinDateNaiss = cinDateNaiss;
    }

    public BigDecimal getPasseportTypeIdBeni() {
        return passeportTypeIdBeni;
    }

    public void setPasseportTypeIdBeni(BigDecimal passeportTypeIdBeni) {
        this.passeportTypeIdBeni = passeportTypeIdBeni;
    }

    public String getPasseportIdBeni() {
        return passeportIdBeni;
    }

    public void setPasseportIdBeni(String passeportIdBeni) {
        this.passeportIdBeni = passeportIdBeni;
    }

    public String getPasseportPays() {
        return passeportPays;
    }

    public void setPasseportPays(String passeportPays) {
        this.passeportPays = passeportPays;
    }

    public String getPasseportCatBenif() {
        return passeportCatBenif;
    }

    public void setPasseportCatBenif(String passeportCatBenif) {
        this.passeportCatBenif = passeportCatBenif;
    }

    public LocalDate getPasseportDateNaiss() {
        return passeportDateNaiss;
    }

    public void setPasseportDateNaiss(LocalDate passeportDateNaiss) {
        this.passeportDateNaiss = passeportDateNaiss;
    }

    public String getCarteSejourTypeIdBeni() {
        return carteSejourTypeIdBeni;
    }

    public void setCarteSejourTypeIdBeni(String carteSejourTypeIdBeni) {
        this.carteSejourTypeIdBeni = carteSejourTypeIdBeni;
    }

    public String getCarteSejourIdBeni() {
        return carteSejourIdBeni;
    }

    public void setCarteSejourIdBeni(String carteSejourIdBeni) {
        this.carteSejourIdBeni = carteSejourIdBeni;
    }

    public String getCarteSejourPays() {
        return carteSejourPays;
    }

    public void setCarteSejourPays(String carteSejourPays) {
        this.carteSejourPays = carteSejourPays;
    }

    public String getCarteSejourCatBeni() {
        return carteSejourCatBeni;
    }

    public void setCarteSejourCatBeni(String carteSejourCatBeni) {
        this.carteSejourCatBeni = carteSejourCatBeni;
    }

    public LocalDate getCarteSejourDateNaiss() {
        return carteSejourDateNaiss;
    }

    public void setCarteSejourDateNaiss(LocalDate carteSejourDateNaiss) {
        this.carteSejourDateNaiss = carteSejourDateNaiss;
    }

    public String getAutreIdTypeIdBeni() {
        return autreIdTypeIdBeni;
    }

    public void setAutreIdTypeIdBeni(String autreIdTypeIdBeni) {
        this.autreIdTypeIdBeni = autreIdTypeIdBeni;
    }

    public String getAutreIdIdBenif() {
        return autreIdIdBenif;
    }

    public void setAutreIdIdBenif(String autreIdIdBenif) {
        this.autreIdIdBenif = autreIdIdBenif;
    }

    public String getAutreIdPays() {
        return autreIdPays;
    }

    public void setAutreIdPays(String autreIdPays) {
        this.autreIdPays = autreIdPays;
    }

    public String getAutreIdCatBenif() {
        return autreIdCatBenif;
    }

    public void setAutreIdCatBenif(String autreIdCatBenif) {
        this.autreIdCatBenif = autreIdCatBenif;
    }

    public BigDecimal getResident() {
        return resident;
    }

    public void setResident(BigDecimal resident) {
        this.resident = resident;
    }

    public String getNomOuRs() {
        return nomOuRs;
    }

    public void setNomOuRs(String nomOuRs) {
        this.nomOuRs = nomOuRs;
    }

    public String getAdresseBenif() {
        return adresseBenif;
    }

    public void setAdresseBenif(String adresseBenif) {
        this.adresseBenif = adresseBenif;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getRefCertifDecl() {
        return refCertifDecl;
    }

    public void setRefCertifDecl(String refCertifDecl) {
        this.refCertifDecl = refCertifDecl;
    }

    public String getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(String idOperation) {
        this.idOperation = idOperation;
    }

    public BigDecimal getAnneeFacture() {
        return anneeFacture;
    }

    public void setAnneeFacture(BigDecimal anneeFacture) {
        this.anneeFacture = anneeFacture;
    }

    public BigDecimal getcNPC() {
        return cNPC;
    }

    public void setcNPC(BigDecimal cNPC) {
        this.cNPC = cNPC;
    }

    public BigDecimal getPriseEnCharge() {
        return priseEnCharge;
    }

    public void setPriseEnCharge(BigDecimal priseEnCharge) {
        this.priseEnCharge = priseEnCharge;
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

    public BigDecimal getMontantTotalHT() {
        return montantTotalHT;
    }

    public void setMontantTotalHT(BigDecimal montantTotalHT) {
        this.montantTotalHT = montantTotalHT;
    }

    public BigDecimal getMontantTotalTVA() {
        return montantTotalTVA;
    }

    public void setMontantTotalTVA(BigDecimal montantTotalTVA) {
        this.montantTotalTVA = montantTotalTVA;
    }

    public BigDecimal getMontantTotalTTC() {
        return montantTotalTTC;
    }

    public void setMontantTotalTTC(BigDecimal montantTotalTTC) {
        this.montantTotalTTC = montantTotalTTC;
    }

    public BigDecimal getMontantTotalRS() {
        return montantTotalRS;
    }

    public void setMontantTotalRS(BigDecimal montantTotalRS) {
        this.montantTotalRS = montantTotalRS;
    }

    public String getTaxeAddCode() {
        return taxeAddCode;
    }

    public void setTaxeAddCode(String taxeAddCode) {
        this.taxeAddCode = taxeAddCode;
    }

    public BigDecimal getTaxeAddMontant() {
        return taxeAddMontant;
    }

    public void setTaxeAddMontant(BigDecimal taxeAddMontant) {
        this.taxeAddMontant = taxeAddMontant;
    }

    public BigDecimal getMonNetServi() {
        return monNetServi;
    }

    public void setMonNetServi(BigDecimal monNetServi) {
        this.monNetServi = monNetServi;
    }

    public String getDeviseCode() {
        return deviseCode;
    }

    public void setDeviseCode(String deviseCode) {
        this.deviseCode = deviseCode;
    }

    public BigDecimal getDeviseTotalRS() {
        return deviseTotalRS;
    }

    public void setDeviseTotalRS(BigDecimal deviseTotalRS) {
        this.deviseTotalRS = deviseTotalRS;
    }

    public BigDecimal getDeviseTotalTTC() {
        return deviseTotalTTC;
    }

    public void setDeviseTotalTTC(BigDecimal deviseTotalTTC) {
        this.deviseTotalTTC = deviseTotalTTC;
    }

    public BigDecimal getDeviseTotalNetServi() {
        return deviseTotalNetServi;
    }

    public void setDeviseTotalNetServi(BigDecimal deviseTotalNetServi) {
        this.deviseTotalNetServi = deviseTotalNetServi;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }
}
