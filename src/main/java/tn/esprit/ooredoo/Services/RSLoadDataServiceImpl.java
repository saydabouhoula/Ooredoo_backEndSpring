package tn.esprit.ooredoo.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tn.esprit.ooredoo.DTO.RSLoadDataDTO;
import tn.esprit.ooredoo.Entities.RSLoadData;
import tn.esprit.ooredoo.Repositories.RSLoadDataRepository;
import tn.esprit.ooredoo.utils.XMLUtil;
import tn.esprit.ooredoo.xml.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class RSLoadDataServiceImpl implements RSLoadDataService {

    @Autowired
    private RSLoadDataRepository rsLoadDataRepository;

    @Override
    public void uploadData(List<RSLoadDataDTO> data) {
        if (data == null || data.isEmpty()) {
            log.warn("No data to upload.");
            return;
        }

        try {
            for (RSLoadDataDTO dto : data) {
                RSLoadData entity = convertToEntity(dto);
                entity.setFlags("N");
                rsLoadDataRepository.save(entity);
            }
            log.info("Data uploaded successfully.");
        } catch (Exception e) {
            log.error("Error uploading data: ", e);
            throw new RuntimeException("Error uploading data", e);
        }
    }

    @Override
    public List<RSLoadData> getAllData() {
        List<RSLoadData> data = rsLoadDataRepository.findAll();
        if (data.isEmpty()) {
            log.warn("No data found in the repository.");
        }
        return data;
    }

    @Override
    public ResponseEntity<Resource> getXMLData() {
        List<RSLoadData> data = rsLoadDataRepository.findByFlags("N");

        // List<RSLoadData> data = getAllData();
        if (data == null || data.isEmpty()) {
            log.warn("No data available to generate XML.");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        String xmlData = convertToXML(data);
        if (xmlData == null || xmlData.isEmpty()) {
            log.error("Failed to convert data to XML.");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        // Update the flag to 'Y' after generating XML
        data.forEach(entity -> {
            entity.setFlags("Y");
            rsLoadDataRepository.save(entity);
        });

        ByteArrayResource resource = new ByteArrayResource(xmlData.getBytes());

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=data.xml");
        headers.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(resource.contentLength())
                .body(resource);
    }

    @Override
    public String generateXML(Certificat certificat) {

        return XMLUtil.convertToXML(certificat);
    }

//    private String convertToXML(List<RSLoadData> data) {
//        if (data == null || data.isEmpty()) {
//            log.warn("Data list is empty while converting to XML.");
//            return null;
//        }
//
//        DeclarationsRS declarationsRS = new DeclarationsRS();
//        declarationsRS.setVersionSchema("1.0");  // Set the VersionSchema attribute
//
//        Declarant declarant = new Declarant();
//        declarant.setTypeIdentifiant("1");
//        declarant.setIdentifiant("0789012H");
//        declarant.setCategorieContribuable("PM");
//        declarationsRS.setDeclarant(declarant);
//
//        ReferenceDeclaration referenceDeclaration = new ReferenceDeclaration();
//        referenceDeclaration.setActeDepot(0);
//        referenceDeclaration.setAnneeDepot(2024);
//        referenceDeclaration.setMoisDepot(6);
//
//        declarationsRS.setReferenceDeclaration(referenceDeclaration);
//
//        AjouterCertificats ajouterCertificats = new AjouterCertificats();
//
//        for (RSLoadData entity : data) {
//            Certificat certificat = new Certificat();
//
//            InfosContact infosContact = new InfosContact();
//            infosContact.setAdresseMail(entity.getAdresseMail());
//            infosContact.setNumTel(entity.getNumTel());
//            certificat.setInfosContact(infosContact);
//
//            IdTaxpayer idTaxpayer = new IdTaxpayer();
//            MatriculeFiscal matriculeFiscal = new MatriculeFiscal();
//            matriculeFiscal.setTypeIdentifiant(entity.getTypeIdDeclarant().toString());
//            matriculeFiscal.setIdentifiant(entity.getIdDeclarant());
//            matriculeFiscal.setCategorieContribuable(entity.getCatDeclarant());
//            idTaxpayer.setMatriculeFiscal(matriculeFiscal);
//            certificat.setIdTaxpayer(idTaxpayer);
//
//            Beneficiaire beneficiaire = new Beneficiaire();
//            beneficiaire.setIdTaxpayer(idTaxpayer);
//            beneficiaire.setResident(entity.getResident());
//            beneficiaire.setNomEtPrenomOuRaisonsociale(entity.getNomOuRs());
//            beneficiaire.setAdresse(entity.getAdresseBenif());
//            beneficiaire.setActivite(entity.getActivite());
//            beneficiaire.setInfosContact(infosContact);
//            certificat.setBeneficiaire(beneficiaire);
//
//            // Traitement des opérations associées à chaque certificat
//            List<Operation> operations = getOperationsForCertificat(entity.getIdDeclarant());
//            if (operations != null) {
//                for (Operation operation : operations) {
//                    OperationXML operationXML = new OperationXML();
//
//                    // Conversion de BigDecimal en String
//                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
//                    String anneeFacturation = decimalFormat.format(operation.getAnneeFacturation());
//                    String montantHT = decimalFormat.format(operation.getMontantHT());
//
//                    operationXML.setType(anneeFacturation); // Assurez-vous que 'Type' est un String dans OperationXML
//                    operationXML.setMontant(montantHT); // Assurez-vous que 'Montant' est un String dans OperationXML
//
//                    // Add other properties from Operation to OperationXML as needed
//
//                    certificat.addOperation(operationXML);
//                }
//            }
//
//            // Populate TotalPayement
//            TotalPayement totalPayement = new TotalPayement();
//            totalPayement.setTotalMontantHT(entity.getMontantTotalHT());
//            totalPayement.setTotalMontantTVA(entity.getMontantTotalTVA());
//            totalPayement.setTotalMontantTTC(entity.getMontantTotalTTC());
//            totalPayement.setTotalMontantRS(entity.getMontantTotalRS());
//            totalPayement.setTotalMontantNetServi(entity.getMontantNetServi());
//            certificat.setTotalPayement(totalPayement);
//
//            ajouterCertificats.addCertificat(certificat);
//        }
//
//        declarationsRS.setAjouterCertificats(ajouterCertificats);
//
//        return XMLUtil.convertToXML(declarationsRS);
//    }


    private String convertToXML(List<RSLoadData> data) {
        if (data == null || data.isEmpty()) {
            log.warn("Data list is empty while converting to XML.");
            return null;
        }

        DeclarationsRS declarationsRS = new DeclarationsRS();
        declarationsRS.setVersionSchema("1.0");

        Declarant declarant = new Declarant();
        declarant.setTypeIdentifiant("1");
        declarant.setIdentifiant("0789012H");
        declarant.setCategorieContribuable("PM");
        declarationsRS.setDeclarant(declarant);

        ReferenceDeclaration referenceDeclaration = new ReferenceDeclaration();
        referenceDeclaration.setActeDepot(0);
        referenceDeclaration.setAnneeDepot(2024);
        referenceDeclaration.setMoisDepot(6);
        declarationsRS.setReferenceDeclaration(referenceDeclaration);

        AjouterCertificats ajouterCertificats = new AjouterCertificats();

        for (RSLoadData entity : data) {
            Certificat certificat = new Certificat();

            Beneficiaire beneficiaire = new Beneficiaire();
            IdTaxpayer idTaxpayer = new IdTaxpayer();
            MatriculeFiscal matriculeFiscal = new MatriculeFiscal();
            matriculeFiscal.setTypeIdentifiant(entity.getTypeIdDeclarant().toString());
            matriculeFiscal.setIdentifiant(entity.getIdDeclarant());
            matriculeFiscal.setCategorieContribuable(entity.getCatDeclarant());
            idTaxpayer.setMatriculeFiscal(matriculeFiscal);
            beneficiaire.setIdTaxpayer(idTaxpayer);
            beneficiaire.setResident(entity.getResident());
            beneficiaire.setNomEtPrenomOuRaisonsociale(entity.getNomOuRs());
            beneficiaire.setAdresse(entity.getAdresseBenif());
            beneficiaire.setActivite(entity.getActivite());

            InfosContact infosContact = new InfosContact();
            infosContact.setAdresseMail(entity.getAdresseMail());
            infosContact.setNumTel(entity.getNumTel());
            beneficiaire.setInfosContact(infosContact);

            certificat.setBeneficiaire(beneficiaire);
            certificat.setDatePayement(entity.getDatePaiement());
            certificat.setRefCertifChezDeclarant(entity.getRefCertifDecl());

            // Récupérer les opérations sous forme de List<Operation>
            List<Operation> operationsData = getOperationsByCertificat(entity.getIdOperation());

            // Convertir les opérations en List<OperationXML>
            ListeOperations listeOperations = new ListeOperations();
            List<OperationXML> operations = new ArrayList<>();
            if (operationsData != null) {
                for (Operation operation : operationsData) {
                    OperationXML operationXML = new OperationXML();
                    operationXML.setIdTypeOperation(operation.getIdTypeOperation());
                    operationXML.setAnneeFacturation(operation.getAnneeFacturation());
                    operationXML.setcNPC(operation.getcNPC());
                    operationXML.setpCharge(operation.getpCharge());
                    operationXML.setMontantHT(operation.getMontantHT());
                    operationXML.setTauxRS(operation.getTauxRS());
                    operationXML.setTauxTVA(operation.getTauxTVA());
                    operationXML.setMontantTVA(operation.getMontantTVA());
                    operationXML.setMontantTTC(operation.getMontantTTC());
                    operationXML.setMontantRS(operation.getMontantRS());
                    operationXML.setMontantNetServi(operation.getMontantNetServi());
                    operations.add(operationXML);
                }
            }
            listeOperations.setOperations(operations);
           // certificat.setListeOperations(listeOperations.getOperations());

            // Assignez l'objet ListeOperations au certificat
            certificat.setListeOperations(listeOperations);

            TotalPayement totalPayement = new TotalPayement();
            totalPayement.setTotalMontantHT(entity.getMontantTotalHT());
            totalPayement.setTotalMontantTVA(entity.getMontantTotalTVA());
            totalPayement.setTotalMontantTTC(entity.getMontantTotalTTC());
            totalPayement.setTotalMontantRS(entity.getMontantTotalRS());
            totalPayement.setTotalMontantNetServi(entity.getMonNetServi());
            certificat.setTotalPayement(totalPayement);

            ajouterCertificats.addCertificat(certificat);
        }

        declarationsRS.setAjouterCertificats(ajouterCertificats);

        return XMLUtil.convertToXML(declarationsRS);
    }
    public Operation convertToOperation(RSLoadData rsLoadData) {
        Operation operation = new Operation();
        operation.setIdTypeOperation(rsLoadData.getIdOperation());
        operation.setAnneeFacturation(rsLoadData.getAnneeFacture());
        operation.setcNPC(rsLoadData.getCNPC());
        operation.setpCharge(rsLoadData.getPriseEnCharge());
        operation.setMontantHT(rsLoadData.getMontantHT());
        operation.setTauxRS(rsLoadData.getTauxRS());
        operation.setTauxTVA(rsLoadData.getTauxTVA());
        operation.setMontantTVA(rsLoadData.getMontantTVA());
        operation.setMontantTTC(rsLoadData.getMontantTTC());
        operation.setMontantRS(rsLoadData.getMontantRS());
        operation.setMontantNetServi(rsLoadData.getMontantNetServi());
        return operation;
    }
    @Override
    public List<Operation> getOperationsByCertificat(String idOperation) {
        List<RSLoadData> rsLoadDataList = rsLoadDataRepository.findByIdOperation(idOperation);
        return rsLoadDataList.stream()
                .filter(data -> "N".equals(data.getFlags()))
                .map(this::convertToOperation)
                .collect(Collectors.toList());
    }

//    public List<Operation> getOperationsForCertificat(String idDeclarant) {
//        // Implémentez cette méthode pour récupérer les opérations associées à un déclarant spécifique
//        return null; // Remplacez par la logique réelle
//    }
//    public List<RSLoadData> getOperationsByCertificat(String idOperation) {
//        return rsLoadDataRepository.findByIdOperation(idOperation);
//    }

    private RSLoadData convertToEntity(RSLoadDataDTO dto) {
        if (dto == null) {
            log.warn("Encountered null DTO while converting.");
            return null;
        }

        RSLoadData entity = new RSLoadData();

        entity.setTypeIdDeclarant(dto.getTypeIdDeclarant());
        entity.setIdDeclarant(dto.getIdDeclarant());
        entity.setCatDeclarant(dto.getCatDeclarant());
        entity.setActeDepot(dto.getActeDepot());
        entity.setAnneeDepot(dto.getAnneeDepot());
        entity.setMoisDepot(dto.getMoisDepot());
        entity.setMfTypeIdBenif(dto.getMfTypeIdBenif());
        entity.setMfIdBenif(dto.getMfIdBenif());
        entity.setMfCatBenif(dto.getMfCatBenif());
        entity.setCinTypeIdBenif(dto.getCinTypeIdBenif());
        entity.setCinIdBenif(dto.getCinIdBenif());
        entity.setCinDateNaiss(dto.getCinDateNaiss());
        entity.setCinCatBenif(dto.getCinCatBenif());
        entity.setPasseportTypeIdBeni(dto.getPasseportTypeIdBeni());
        entity.setPasseportIdBeni(dto.getPasseportIdBeni());
        entity.setPasseportDateNaiss(dto.getPasseportDateNaiss());
        entity.setPasseportPays(dto.getPasseportPays());
        entity.setPasseportCatBenif(dto.getPasseportCatBenif());
        entity.setCarteSejourTypeIdBeni(dto.getCarteSejourTypeIdBeni());
        entity.setCarteSejourIdBeni(dto.getCarteSejourIdBeni());
        entity.setCarteSejourDateNaiss(dto.getCarteSejourDateNaiss());
        entity.setCarteSejourPays(dto.getCarteSejourPays());
        entity.setCarteSejourCatBeni(dto.getCarteSejourCatBeni());
        entity.setAutreIdTypeIdBeni(dto.getAutreIdTypeIdBeni());
        entity.setAutreIdIdBenif(dto.getAutreIdIdBenif());
        entity.setAutreIdPays(dto.getAutreIdPays());
        entity.setAutreIdCatBenif(dto.getAutreIdCatBenif());
        entity.setResident(dto.getResident());
        entity.setNomOuRs(dto.getNomOuRs());
        entity.setAdresseBenif(dto.getAdresseBenif());
        entity.setActivite(dto.getActivite());
        entity.setAdresseMail(dto.getAdresseMail());
        entity.setNumTel(dto.getNumTel());
        entity.setDatePaiement(dto.getDatePaiement());
        entity.setRefCertifDecl(dto.getRefCertifDecl());
        entity.setIdOperation(dto.getIdOperation());
        entity.setAnneeFacture(dto.getAnneeFacture());
        entity.setCNPC(dto.getcNPC());
        entity.setPriseEnCharge(dto.getPriseEnCharge());
        entity.setMontantHT(dto.getMontantHT());
        entity.setTauxRS(dto.getTauxRS());
        entity.setTauxTVA(dto.getTauxTVA());
        entity.setMontantTVA(dto.getMontantTVA());
        entity.setMontantTTC(dto.getMontantTTC());
        entity.setMontantRS(dto.getMontantRS());
        entity.setMontantNetServi(dto.getMontantNetServi());
        entity.setMontantTotalHT(dto.getMontantTotalHT());
        entity.setMontantTotalTVA(dto.getMontantTotalTVA());
        entity.setMontantTotalTTC(dto.getMontantTotalTTC());
        entity.setMontantTotalRS(dto.getMontantTotalRS());
        entity.setTaxeAddCode(dto.getTaxeAddCode());
        entity.setTaxeAddMontant(dto.getTaxeAddMontant());
        entity.setMonNetServi(dto.getMonNetServi());
        entity.setDeviseCode(dto.getDeviseCode());
        entity.setDeviseTotalRS(dto.getDeviseTotalRS());
        entity.setDeviseTotalTTC(dto.getDeviseTotalTTC());
        entity.setDeviseTotalNetServi(dto.getDeviseTotalNetServi());
        entity.setTotalTaxeAddCode(dto.getTotalTaxeAddCode());
        entity.setTotalTaxeAddMontant(dto.getTotalTaxeAddMontant());
        return entity;
    }
}
