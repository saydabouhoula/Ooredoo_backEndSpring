package tn.esprit.ooredoo.xml;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
public class IdTaxpayer {

    @XmlElement(name = "MatriculeFiscal")
    private MatriculeFiscal matriculeFiscal;

    // Getter and Setter
    public MatriculeFiscal getMatriculeFiscal() {
        return matriculeFiscal;
    }

    public void setMatriculeFiscal(MatriculeFiscal matriculeFiscal) {
        this.matriculeFiscal = matriculeFiscal;
    }
}
