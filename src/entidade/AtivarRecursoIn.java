package entidade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author anderson.d.santos
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtivarRecursoIn", propOrder = { "codNumber" })
public class AtivarRecursoIn {

	@XmlElement(required = true, nillable = false)
    private Integer codNumber;
 
    public Integer getCodNumber() {
        return codNumber;
    }
 
    public void setcodNumber(Integer codNumber) {
        this.codNumber = codNumber;
    }
    
}