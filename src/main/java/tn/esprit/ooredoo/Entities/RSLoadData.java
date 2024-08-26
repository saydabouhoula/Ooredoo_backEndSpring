package tn.esprit.ooredoo.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "RS_LOAD_DATA")
public class RSLoadData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TYPEIDDECLARANT", precision = 10, scale = 4)
    private BigDecimal typeIdDeclarant;

    @Column(name = "IDDECLARANT")
    private String idDeclarant;

    @Column(name = "CATDECLARANT")
    private String catDeclarant;

    @Column(name = "ACTEDEPOT", precision = 10, scale = 4)
    private BigDecimal acteDepot;

    @Column(name = "ANNEEDEPOT", precision = 10, scale = 4)
    private BigDecimal anneeDepot;

    @Column(name = "MOISDEPOT", precision = 10, scale = 4)
    private BigDecimal moisDepot;

    @Column(name = "MFTYPEIDBENIF", precision = 10, scale = 4)
    private BigDecimal mfTypeIdBenif;

    @Column(name = "MFIDBENIF")
    private String mfIdBenif;

    @Column(name = "MFCATBENIF")
    private String mfCatBenif;

    @Column(name = "CINTYPEIDBENIF", precision = 10, scale = 4)
    private BigDecimal cinTypeIdBenif;

    @Column(name = "CINIDBENIF")
    private String cinIdBenif;

    @Column(name = "CINDATENAISS")
    private LocalDate cinDateNaiss;

    @Column(name = "CINCATBENIF")
    private String cinCatBenif;

    @Column(name = "PASSEPORTTYPEIDBENI", precision = 10, scale = 4)
    private BigDecimal passeportTypeIdBeni;

    @Column(name = "PASSEPORTIDBENI")
    private String passeportIdBeni;

    @Column(name = "PASSEPORTDATENAISS")
    private LocalDate passeportDateNaiss;

    @Column(name = "PASSEPORTPAYS")
    private String passeportPays;

    @Column(name = "PASSEPORTCATBENIF")
    private String passeportCatBenif;


    @Column(name = "CARTESEJOURTYPEIDBENI")
    private String carteSejourTypeIdBeni;

    @Column(name = "CARTESEJOURIDBENI")
    private String carteSejourIdBeni;

    @Column(name = "CARTESEJOURDATENAISS")
    private LocalDate carteSejourDateNaiss;

    @Column(name = "CARTESEJOURPAYS")
    private String carteSejourPays;

    @Column(name = "CARTESEJOURCATBENI")
    private String carteSejourCatBeni;

    @Column(name = "AUTREIDTYPEIDBENI")
    private String autreIdTypeIdBeni;

    @Column(name = "AUTREIDIDBENIF")
    private String autreIdIdBenif;

    @Column(name = "AUTREIDPAYS")
    private String autreIdPays;

    @Column(name = "AUTREIDCATBENIF")
    private String autreIdCatBenif;

    @Column(name = "RESIDENT", precision = 10, scale = 4)
    private BigDecimal resident;

    @Column(name = "NOMOURS")
    private String nomOuRs;

    @Column(name = "ADRESSEBENIF")
    private String adresseBenif;

    @Column(name = "ACTIVITE")
    private String activite;

    @Column(name = "ADRESSEMAIL")
    private String adresseMail;

    @Column(name = "NUMTEL")
    private String numTel;

    @Column(name = "DATEPAIEMENT")
    private LocalDate datePaiement;

    @Column(name = "REFCERTIFDECL")
    private String refCertifDecl;

    @Column(name = "IDOPERATION")
    private String idOperation;

    @Column(name = "ANNEEFACTURE", precision = 10, scale = 4)
    private BigDecimal anneeFacture;

    @Column(name = "CNPC", precision = 10, scale = 4)
    private BigDecimal cNPC;

    @Column(name = "PRISEENCHARGE", precision = 10, scale = 4)
    private BigDecimal priseEnCharge;

    @Column(name = "MONTANTHT", precision = 15, scale = 4)
    private BigDecimal montantHT;

    @Column(name = "TAUXRS", precision = 10, scale = 4)
    private BigDecimal tauxRS;

    @Column(name = "TAUXTVA", precision = 10, scale = 4)
    private BigDecimal tauxTVA;

    @Column(name = "MONTANTTVA", precision = 15, scale = 4)
    private BigDecimal montantTVA;

    @Column(name = "MONTANTTTC", precision = 15, scale = 4)
    private BigDecimal montantTTC;

    @Column(name = "MONTANTRS", precision = 15, scale = 4)
    private BigDecimal montantRS;

    @Column(name = "MONTANTNETSERVI", precision = 15, scale = 4)
    private BigDecimal montantNetServi;

    @Column(name = "MONTANTTOTALHT", precision = 15, scale = 4)
    private BigDecimal montantTotalHT;

    @Column(name = "MONTANTTOTALTVA", precision = 15, scale = 4)
    private BigDecimal montantTotalTVA;

    @Column(name = "MONTANTTOTALTTC", precision = 15, scale = 4)
    private BigDecimal montantTotalTTC;

    @Column(name = "MONTANTTOTALRS", precision = 15, scale = 4)
    private BigDecimal montantTotalRS;

    @Column(name = "TAXEADDCODE")
    private String taxeAddCode;

    @Column(name = "TAXEADDMONTANT", precision = 15, scale = 4)
    private BigDecimal taxeAddMontant;

    @Column(name = "MONNETSERVI", precision = 15, scale = 4)
    private BigDecimal monNetServi;

    @Column(name = "DEVISECODE")
    private String deviseCode;

    @Column(name = "DEVISETOTALRS", precision = 15, scale = 4)
    private BigDecimal deviseTotalRS;

    @Column(name = "DEVISETOTALTTC", precision = 15, scale = 4)
    private BigDecimal deviseTotalTTC;

    @Column(name = "DEVISETOTALNETSERVI", precision = 15, scale = 4)
    private BigDecimal deviseTotalNetServi;

    @Column(name = "FLAGS")
    private String flags;
}
