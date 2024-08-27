    package tn.esprit.ooredoo.Services;
    
    import org.springframework.core.io.Resource;
    import org.springframework.http.ResponseEntity;
    import tn.esprit.ooredoo.DTO.RSLoadDataDTO;
    import tn.esprit.ooredoo.Entities.RSLoadData;
    import tn.esprit.ooredoo.xml.Certificat;
    import tn.esprit.ooredoo.xml.*;

    import java.util.List;
    
    public interface RSLoadDataService {
        void uploadData(List<RSLoadDataDTO> data);
    
        List<RSLoadData> getAllData();
    

        ResponseEntity<Resource> getXMLData();

        String generateXML(Certificat certificat);


       // List<Operation> getOperationsForCertificat(String idDeclarant);

       // public List<RSLoadData> getOperationsByCertificat(String idOperation);

        List<Operation> getOperationsByCertificat(String idOperation);

    }
