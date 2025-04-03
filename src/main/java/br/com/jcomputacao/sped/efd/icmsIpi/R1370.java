package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 12:15:09
 * @author Thiago Balthazar
 */
public class R1370  extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "1370"
      */
     
     
     
     public static final String NUM_BICO = "NUM_BICO";
     /*
      * Número sequencial do bico ligado a bomba
      */
     
     
     
     public static final String COD_ITEM = "COD_ITEM";
     /*
      * Código do Produto, constante do registro 0200
      */
     
     
     
     public static final String NUM_TANQUE = "NUM_TANQUE";
     /*
      * Tanque que armazena o combustível.
      */

    
     
     
    public R1370() {
        
        setName("REGISTRO 1370: BICOS DA BOMBA");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO,   new FieldDefaultArchetype("1370"));
        addFieldArchetype(NUM_BICO,   new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_ITEM,   new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(NUM_TANQUE, new FieldStringMaximumLengthArchetype(3));
    }
    
}
