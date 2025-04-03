package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 09:18:38
 * @author Vinicius Diana
 */
public class RG140 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "G140" 
     */
    
     public static final String REGISTRO  = "REGISTRO ";
     
      /*
     * 2 -  Número sequencial do item no documento fiscal 
     */
      public static final String  NUM_ITEM   = " NUM_ITEM  ";
       /*
     * 3 -  Código correspondente do bem no documento fiscal (campo 02 do registro 0200)
     */
       public static final String  COD_ITEM   = " COD_ITEM ";

    public RG140() {
        setName("Registro G140 : Identificacao do item do documento fiscal");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("G140"));
        //2
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        //3
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        
        
    }
       
       
     
     

}
