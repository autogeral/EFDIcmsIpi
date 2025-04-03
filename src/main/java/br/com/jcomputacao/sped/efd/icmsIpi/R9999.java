package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 27/01/2013 18:24:19
 *
 * @author Murilo
 */
public class R9999 extends LineArchetype {

    public static final String REGISTRO = "REG";
    
    /**
     * Quantidade total de linhas do arquivo digital.
     */
    public static final String QTD_LIN = "QTD_LIN";

    public R9999() {
        setName("Registro 9999 - Encerramento do arquivo digital");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("9999"));
        addFieldArchetype(QTD_LIN, new FieldIntegerMaximumLengthArchetype(20));
    }
}
