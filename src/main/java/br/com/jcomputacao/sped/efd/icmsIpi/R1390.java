package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 12:22:27
 * @author Thiago Balthazar
 */
public class R1390  extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "1390"
      */
     
     
     
     public static final String COD_PROD = "COD_PROD";
     /*
      * Código do produto:
        01 ? Álcool Etílico Hidratado Carburante
        02 - Álcool Etílico Anidro Carburante
        03 ? Açúcar
      */

   
     
    public R1390() {
    
        setName("REGISTRO 1390: CONTROLE DE PRODUCAO DE USINA");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1390"));
        addFieldArchetype(COD_PROD, new FieldIntegerFixedLengthArchetype(2));
    }
     
     
}
