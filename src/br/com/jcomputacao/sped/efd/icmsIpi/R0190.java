
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/01/2013 22:59:54
 * @author Murilo
 */
public class R0190 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String UNID     = "UNID";
    public static final String DESCR    = "DESCR";
    
    public R0190() {
        setName("Registro 0190 - Identifcacao das unidades de medidas");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0190"));
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(DESCR, new FieldStringMaximumLengthArchetype(255));
    }

}
