package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 14:36:36
 * @author Vinicius Diana
 */
public class R1710 extends LineArchetype {
    
    /*
     * 1 -  Texto fixo contendo ?1710?.
     */
   public static final String REGISTRO = "REGISTRO";
   
   
   /*
     * 2 -  Número do dispositivo autorizado (inutilizado) inicial 
     */
   public static final String NUM_DOC_INI = "NUM_DOC_INI";
   
   
   
     /*
     * 3 - Número do dispositivo autorizado (inutilizado) final
     */
   public static final String NUM_DOC_FIN = "NUM_DOC_FIN";
   
   
   
   

    public R1710() {
        setName("REGISTRO 1710: DOCUMENTOS FISCAIS CANCELADOS/INUTILIZADOS ");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1710"));
        //2
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(12));
        //3
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(12));
    }
   
   
   
   
   
   
}
