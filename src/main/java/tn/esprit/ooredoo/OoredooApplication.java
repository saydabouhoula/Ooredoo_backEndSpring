package tn.esprit.ooredoo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.ooredoo.Services.RSLoadDataService;
import tn.esprit.ooredoo.xml.Certificat;
import tn.esprit.ooredoo.xml.Operation;
import tn.esprit.ooredoo.xml.OperationXML; // Assurez-vous d'importer OperationXML si ce n'est pas déjà fait

import java.math.BigDecimal;
import java.text.DecimalFormat;

@SpringBootApplication
public class OoredooApplication {

    public static void main(String[] args) {
        SpringApplication.run(OoredooApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(RSLoadDataService rsLoadDataService) {
        return args -> {
            // Créez ou récupérez votre instance de Certificat
            Certificat certificat = new Certificat();

            // Ajoutez des opérations au certificat pour les tester
            Operation operation1 = new Operation();
            operation1.setAnneeFacturation(BigDecimal.valueOf(2024));
            operation1.setMontantHT(BigDecimal.valueOf(1000.00));

            Operation operation2 = new Operation();
            operation2.setAnneeFacturation(BigDecimal.valueOf(2024));
            operation2.setMontantHT(BigDecimal.valueOf(2000.00));

            // Convertissez les opérations en OperationXML
            OperationXML operationXML1 = convertToOperationXML(operation1);
            OperationXML operationXML2 = convertToOperationXML(operation2);

            // Ajoutez les objets OperationXML au certificat
            if (operationXML1 != null) {
                certificat.addOperation(operationXML1);
            }
            if (operationXML2 != null) {
                certificat.addOperation(operationXML2);
            }

            // Utilisez le service pour générer l'XML
            String xml = rsLoadDataService.generateXML(certificat);
            System.out.println(xml);
        };
    }

    // Méthode pour convertir Operation en OperationXML
    private OperationXML convertToOperationXML(Operation operation) {
        if (operation == null) {
            return null;
        }

        OperationXML operationXML = new OperationXML();

        // Conversion de BigDecimal en String
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Format à deux décimales
        String anneeFacturation = decimalFormat.format(operation.getAnneeFacturation());
        String montantHT = decimalFormat.format(operation.getMontantHT());

        operationXML.setType(anneeFacturation); // Assurez-vous que 'Type' est un String dans OperationXML
        operationXML.setMontant(montantHT); // Assurez-vous que 'Montant' est un String dans OperationXML

        // Ajoutez d'autres propriétés si nécessaire

        return operationXML;
    }
}
