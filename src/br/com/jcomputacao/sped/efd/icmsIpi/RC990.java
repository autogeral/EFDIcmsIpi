package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 15:36:49
 * @author Thiago Balthazar
 */
public class RC990 extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "C990"
      */
     public static final String QTD_LIN_C = "QTD_LIN_C";
     /*
      * Quantidade total de linhas do Bloco C
      */

    public RC990() {
    
        setName("REGISTRO C990: ENCERRAMENTO DO BLOCO C");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C990"));
        addFieldArchetype(QTD_LIN_C, new FieldIntegerMaximumLengthArchetype(30));
    }
     
     
}
