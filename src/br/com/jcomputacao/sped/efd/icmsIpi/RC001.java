
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 01/02/2013 16:36:19
 * @author Murilo Tuvani
 */
public class RC001 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
     
     /**
      * IND_MOV
      * 0 Bloco com dados informados
      * 1 Bloco sem dados informados
      */
     public static final String IND_MOV = "IND_MOV";
    
    public RC001() {
        setName("Registro C001 - Aberturado do bloco e identificaca as informacoes do bloco");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C001"));
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }

}
