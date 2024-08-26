package tn.esprit.ooredoo.xml;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "DeclarationsRS")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationsRS {

    @XmlAttribute(name = "VersionSchema")
    private String versionSchema;

    @XmlElement(name = "Declarant")
    private Declarant declarant;

    @XmlElement(name = "ReferenceDeclaration")
    private ReferenceDeclaration referenceDeclaration;

    @XmlElement(name = "AjouterCertificats")
    private AjouterCertificats ajouterCertificats;

    // Getters and Setters
    public String getVersionSchema() {
        return versionSchema;
    }

    public void setVersionSchema(String versionSchema) {
        this.versionSchema = versionSchema;
    }

    public Declarant getDeclarant() {
        return declarant;
    }

    public void setDeclarant(Declarant declarant) {
        this.declarant = declarant;
    }

    public ReferenceDeclaration getReferenceDeclaration() {
        return referenceDeclaration;
    }

    public void setReferenceDeclaration(ReferenceDeclaration referenceDeclaration) {
        this.referenceDeclaration = referenceDeclaration;
    }

    public AjouterCertificats getAjouterCertificats() {
        return ajouterCertificats;
    }

    public void setAjouterCertificats(AjouterCertificats ajouterCertificats) {
        this.ajouterCertificats = ajouterCertificats;
    }
}
