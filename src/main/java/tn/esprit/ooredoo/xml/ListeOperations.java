package tn.esprit.ooredoo.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListeOperations {

    @XmlElement(name = "Operation")
    private List<OperationXML> operations = new ArrayList<>();

    public List<OperationXML> getOperations() {
        return operations;
    }

    public void setOperations(List<OperationXML> operations) {
        this.operations = operations;
    }

    public void addOperation(OperationXML operation) {
        this.operations.add(operation);
    }
}
