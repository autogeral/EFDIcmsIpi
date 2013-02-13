package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 13/02/2013 08:27:40
 * @author Thiago Balthazar
 */
public class RD990 extends LineArchetype{

    
     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "D990"
     */
     public static final String QTD_LIN_D = "QTD_LIN_D";
     /*
      * Quantidade total de linhas do Bloco D
      */

    public RD990() {
    
    setName("REGISTRO D990: ENCERRAMENTO DO BLOCO D");
    setDelimiter("|");
    
    addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D990"));
    addFieldArchetype(QTD_LIN_D, new FieldIntegerMaximumLengthArchetype(30));
    
     }
     
     
}
