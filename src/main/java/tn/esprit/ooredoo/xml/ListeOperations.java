package tn.esprit.ooredoo.xml;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListeOperations {

    @XmlElement(name = "Operation")
    private List<Operation> operations;

    // Getter and Setter methods
    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
