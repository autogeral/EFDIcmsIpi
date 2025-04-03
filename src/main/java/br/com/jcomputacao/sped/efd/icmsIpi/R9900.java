
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 27/01/2013 18:26:21
 * @author Murilo
 */
public class R9900 extends LineArchetype {

    public static final String REGISTRO = "REG";
    
    /**
     * Registro que sera totalizado no proximo bloco
     */
    public static final String REG_BLC = "REG_BLC";
    
    /**
     * Total de registros do tipo informado no campo anterior
     */
    public static final String QTD_REG_BLC = "QTD_REG_BLC";
    
    public R9900() {
        setName("Registro 9900 - Aberturado do bloco e identificaca as informacoes do bloco");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("9900"));
        addFieldArchetype(REG_BLC, new FieldStringFixedLengthArchetype(4));
        FieldIntegerMaximumLengthArchetype fa = new FieldIntegerMaximumLengthArchetype(10);
        addFieldArchetype(QTD_REG_BLC, fa);
    }
}
