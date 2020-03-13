package entidade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author anderson.d.santos
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtivarRecursoOut", propOrder = { "defaultOut" })
public class AtivarRecursoOut {
 
    private DefaultOut defaultOut;
 
    public DefaultOut getDefaultOut() {
        return defaultOut;
    }
 
    public void setDefaultOut(DefaultOut defaultOut) {
        this.defaultOut = defaultOut;
    }
}
