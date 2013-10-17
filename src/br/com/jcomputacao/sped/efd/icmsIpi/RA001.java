package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA001 extends LineArchetype {
    
    public static final String REGISTRO = "REG";     
     /**
      * IND_MOV
      * 0 Bloco com dados informados
      * 1 Bloco sem dados informados
      */
     public static final String IND_MOV = "IND_MOV";
    
    public RA001() {
        setName("Registro A001 - Abertura bloco A");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("A001"));
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }
    
}
