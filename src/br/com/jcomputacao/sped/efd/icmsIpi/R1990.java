
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 27/01/2013 22:54:12
 * @author Murilo
 */
public class R1990 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    public static final String QTD_LIN_1 = "QTD_LIN_1";
    
    public R1990() {
        setName("Registro 1990 - Encerramento do bloco e identifica a quantidade de linhas");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1990"));
        addFieldArchetype(QTD_LIN_1, new FieldIntegerMaximumLengthArchetype(20));
    }

}
