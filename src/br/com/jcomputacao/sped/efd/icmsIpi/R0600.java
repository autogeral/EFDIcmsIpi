
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 21:58:06
 * @author Murilo Tuvani
 */
public class R0600 extends LineArchetype {

    public static final String REGISTRO   = "REG";
    public static final String DT_ALT     = "DT_ALT";
    /**
     * Codigo do centro de custos
     */
    public static final String COD_CCUS   = "COD_CCUS";
    /**
     * Nome do centro de custos
     */
    public static final String CCUS       = "CCUS";
    
    public R0600() {
        setName("Registro 0600 - Centros de custos");
        setDelimiter("|");
        addFieldArchetype(REGISTRO,   new FieldDefaultArchetype("0600"));
        addFieldArchetype(DT_ALT,     new FieldDateFixedLengthArchetype());
        addFieldArchetype(COD_CCUS,   new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(CCUS,       new FieldStringMaximumLengthArchetype(60));
        
    }
}
