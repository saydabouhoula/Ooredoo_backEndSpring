package tn.esprit.ooredoo.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "AjouterCertificats")
@XmlType(propOrder = { "certificats" })
public class AjouterCertificats {

    private List<Certificat> certificats = new ArrayList<>();

    @XmlElement(name = "Certificat")
    public List<Certificat> getCertificats() {
        return certificats;
    }

    public void setCertificats(List<Certificat> certificats) {
        this.certificats = certificats;
    }

    // Method to add a Certificat to the list
    public void addCertificat(Certificat certificat) {
        if (this.certificats == null) {
            this.certificats = new ArrayList<>();
        }
        this.certificats.add(certificat);
    }
}
