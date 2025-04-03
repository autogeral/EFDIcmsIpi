package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;

/**
 * 07/02/2013 10:47:20
 * @author Thiago Balthazar
 */
public class RD301 extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "D301"
      */
     public static final String NUM_DOC_CANC = "NUM_DOC_CANC";    
     /*
      * Número do documento fiscal cancelado
      */

    public RD301() {
        
        setName("REGISTRO D301: DOCUMENTOS CANCELADOS DOS BILHETES DE PASSAGEM RODOVIARIO (COD 13), DE PASSAGEM AQUAVIAIO (COD 14), DE PASSAGEM E NOTA DE BAGAGEM (COD 15) E DE PASSAGEM FERROVIÁRIO (COD 16)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D301"));
        addFieldArchetype(NUM_DOC_CANC, new FieldIntegerMaximumLengthArchetype(30));
        
    }
     
     
    
    
}
