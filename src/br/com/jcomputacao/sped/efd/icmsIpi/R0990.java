package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 28/01/2013 13:42:28
 * @author Murilo
 */
public class R0990 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /**
     * Quantidade total de linhas do arquivo digital.
     */
    public static final String QTD_LIN = "QTD_LIN";

    public R0990() {
        setName("Registro 0990 - Encerramento do blocl 0");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0990"));
        addFieldArchetype(QTD_LIN, new FieldIntegerMaximumLengthArchetype(20));
    }    
}
