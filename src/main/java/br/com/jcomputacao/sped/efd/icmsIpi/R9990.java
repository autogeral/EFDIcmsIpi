
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 27/01/2013 18:24:36
 * @author Murilo
 */
public class R9990 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    public static final String QTD_LIN_9 = "QTD_LIN_9";
    
    public R9990() {
        setName("Registro 9990 - Encerramento do bloco e identifica a quantidade de numero linhas");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("9990"));
        addFieldArchetype(QTD_LIN_9, new FieldIntegerMaximumLengthArchetype(20));
    }

}
