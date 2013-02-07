package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;


/**
 * 06/02/2013 08:51:03
 * @author Thiago Balthazar
 */
public class RD162 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D162"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    public static final String SER     = "SER";
    /*
     * Série do documento fiscal
     */
    public static final String NUM_DOC = "NUM_DOC";
    /*
     * Número do documento fiscal
     */
    public static final String DT_DOC  = "DT_DOC";
    /*
     * Data da emissão do documento fiscal 
     */
    public static final String VL_DOC  = "VL_DOC";
    /*
     * Valor total do documento fiscal
     */
    public static final String VL_MERC   = "VL_MERC";
    /*
     * Valor das mercadorias constantes no documento fiscal
     */
    public static final String QTD_VOL   = "QTD_VOL";
    /*
     * Quantidade de volumes transportados
     */
    public static final String PESO_BRT  = "PESO_BRT";
    /*
     * Peso bruto dos volumes transportados (em Kg)
     */
     public static final String PESO_LIQ = "PESO_LIQ";
     /*
      * Peso líquido dos volumes transportados (em Kg)
      */

    public RD162() {
   
        setName("REGISTRO D162: IDENTIFICACAO DOS DOCUMENTOS FISCAIS (CODIGOS 08, 8B, 09, 10, 11, 26 E 27)");
        setDelimiter("|"); 
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D162"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC,decimal); 
        addFieldArchetype(VL_MERC, decimal); 
        addFieldArchetype(QTD_VOL, new FieldIntegerMaximumLengthArchetype(10));
        addFieldArchetype(PESO_BRT, decimal);
        addFieldArchetype(PESO_LIQ, decimal);
    }
    
     
     
}
