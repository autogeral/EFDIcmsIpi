package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 12:08:17
 * @author Thiago Balthazar
 */
public class R1360  extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "1360"
      */
     
     
     
     
     public static final String NUM_LACRE = "NUM_LACRE";
     /*
      * Texto fixo contendo "1360"
      */
     
      
     
     
     public static final String DT_APLICACAO = "DT_APLICACAO";
     /*
      * Data de aplicação do Lacre
      */

     
     
     
    public R1360() {
    
        setName("REGISTRO 1360: LACRES DA BOMBA");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1360"));
        addFieldArchetype(NUM_LACRE,    new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(DT_APLICACAO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        
    }
         
}
