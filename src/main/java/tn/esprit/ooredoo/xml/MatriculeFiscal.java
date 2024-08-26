package tn.esprit.ooredoo.xml;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
public class MatriculeFiscal {

    @XmlElement(name = "TypeIdentifiant")
    private String typeIdentifiant;

    @XmlElement(name = "Identifiant")
    private String identifiant;

    @XmlElement(name = "CategorieContribuable")
    private String categorieContribuable;

    // Getters and Setters
    public String getTypeIdentifiant() {
        return typeIdentifiant;
    }

    public void setTypeIdentifiant(String typeIdentifiant) {
        this.typeIdentifiant = typeIdentifiant;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getCategorieContribuable() {
        return categorieContribuable;
    }

    public void setCategorieContribuable(String categorieContribuable) {
        this.categorieContribuable = categorieContribuable;
    }
}
