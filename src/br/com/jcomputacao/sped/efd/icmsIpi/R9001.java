
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 27/01/2013 18:36:24
 * @author Murilo
 */
public class R9001 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    
    /**
      * IND_MOV
      * 0 Bloco com dados informados
      * 1 Bloco sem dados informados
      */
     public static final String IND_MOV = "IND_MOV";
    
    public R9001() {
        setName("Registro 9001 - Aberturado do bloco 9");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("9001"));
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }

}
