package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.lang.reflect.Field;
import javax.sound.sampled.spi.FormatConversionProvider;
/**
 * 08/02/2013 08:09:37
 * @author Thiago Balthazar
 */
public class RD355 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D355"
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data do movimento a que se refere a Redução Z
     */
    public static final String CRO = "CRO";
    /*
     * Posição do Contador de Reinício de Operação
     */
    public static final String CRZ = "CRZ";
    /*
     * Posição do Contador de Redução Z
     */
    public static final String NUM_COO_FIN = "NUM_COO_FIN";
    /*
     * Número do Contador de Ordem de Operação do
        último documento emitido no dia. (Número do
        COO na Redução Z)
     */
    public static final String GT_FIN = "GT_FIN";
    /*
     * Valor do Grande Total final
     */
    public static final String VL_BRT = "VL_BRT";
    /*
     * Valor da venda bruta
     */

    public RD355() {
    
        setName("REGISTRO D355: REDUCAO Z (CODIGOS 2E, 13, 14, 15 e 16)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D355"));     
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CRO, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(CRZ, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(GT_FIN, decimal);
        addFieldArchetype(VL_BRT, decimal);
    }
    
    
    
}
