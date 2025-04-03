package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 08:58:43
 * @author Thiago Balthazar
 */
public class RD411 extends LineArchetype{

     public static final String REGISTRO = "REG";
     public static final String NUM_DOC_CANC = "NUM_DOC_CANC";

    public RD411() {
    
        setName("REGISTRO D411: DOCUMENTOS CANCELADOS DOS DOCUMENTOS INFORMADOS (CODIGO 13, 14, 15 e 16)");
        setDelimiter("|");
    
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D411"));
        addFieldArchetype(NUM_DOC_CANC, new FieldIntegerMaximumLengthArchetype(35));
        
    }
     
     
}
