package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 14:04:47
 * @author Vinicius Diana
 */
public class R1800 extends LineArchetype {
    
    /*
     * 1 -  Texto fixo contendo ?1800? 
     */
    public static final String REGISTRO = "REGISTRO";
    
    
    
    
     /*
     * 2 - Valor das prestações cargas (Tributado)
     */
    public static final String VL_CARGA = "VL_CARGA";
    
    
    
    
    
     /*
     * 3 - Valor das prestações passageiros/cargas (Não Tributado) 
     */
    public static final String VL_PASS = "VL_PASS";
    
    
    
    
    
     /*
     * 4 -  Valor total do faturamento (2+3) 
     */
    public static final String VL_FAT = "VL_FAT";
    
    
    
     /*
     * 5 -  Índice para rateio(2 / 4) 
     */
    public static final String  IND_RAT= "IND_RAT";
    
    
    
    
    
     /*
     * 6 - Valor total dos créditos do ICMS 
     */
    public static final String  VL_ICMS_ANT = " VL_ICMS_ANT";
    
    
    
    
     /*
     * 7 -  Valor da base de cálculo do ICMS 
     */
    public static final String  VL_BC_ICMS = " VL_BC_ICMS";
    
    
    
    
    
    
     /*
     * 8 - Valor do ICMS apurado no cálculo (5 x 6) 
     */
    public static final String VL_ICMS_APUR = "VL_ICMS_APUR";
    
    
    
    
    
     /*
     * 9 - Valor da base de cálculo do ICMS apurada (5 x 7)
     */
    public static final String VL_BC_ICMS_APUR = "VL_BC_ICMS_APUR";
    
    
    
    
    
     /*
     * 10 - Valor da diferença a ser levada a estorno de crédito na apuração (6 - 8) 
     */
    public static final String VL_DIF = "VL_DIF";
    
    
    
    
    

    public R1800() {
        setName("REGISTRO 1800: DCTA ? DEMONSTRATIVO DE CRÉDITO DO ICMS SOBRE TRANSPORTE AÉREO ");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FormatWrapper fw1 = FormatFactory.getDecimalFormatWithPrecision(6);        
        fw1.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1800"));
        //2
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_CARGA, f1);
        //3
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_PASS, f2);
        //4
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_FAT, f3);
        //5
         FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(9,6);
        f4.setFormat(fw1);
        addFieldArchetype(IND_RAT, f4);
        //6
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_ICMS_ANT, f5);
        //7
          FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS, f6);
        //8
          FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_ICMS_APUR, f7);
        //9
       FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
        f8.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_APUR, f8);
        //10
        FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_DIF, f9);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
}
