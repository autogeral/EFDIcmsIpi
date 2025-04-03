package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.lang.reflect.Field;
import javax.sound.sampled.spi.FormatConversionProvider;

/**
 * 11/02/2013 10:05:18
 * @author Thiago Balthazar
 */
public class RD510 extends LineArchetype{

    public static final String REGISTRO = "REG";
    public static final String NUM_ITEM = "NUM_ITEM";
    public static final String COD_ITEM = "COD_ITEM";
    public static final String COD_CLASS = "COD_CLASS";
    public static final String QTD = "QTD";
    public static final String UNID = "UNID";
    public static final String VL_ITEM = "VL_ITEM";
    public static final String VL_DESC = "VL_DESC";
    public static final String CST_ICMS = "CST_ICMS";
    public static final String CFOP = "CFOP";
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    public static final String VL_ICMS = "VL_ICMS";
    public static final String VL_BC_ICMS_UF= "VL_BC_ICMS_UF";
    public static final String VL_ICMS_UF = "VL_ICMS_UF";
    public static final String IND_REC = "IND_REC";
    public static final String COD_PART = "COD_PART";
    public static final String VL_PIS = "VL_PIS";
    public static final String VL_COFINS = "VL_COFINS";
    public static final String COD_CTA = "COD_CTA";

    public RD510() {
    
        setName("REGISTRO D510: ITENS DO DOCUMENTO ? NOTA FISCAL DE SERVICO DE COMUNICACAO (CODIGO 21) E SERVICO DE TELECOMUNICACAO (CODIGO22)");
        setDelimiter("|");
        
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
       fw3.setReplaceComa(false);
       
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,3);
       decimal2.setFormat(fw3);
           
       FieldDecimalMaximumLengthArchetype decimal3 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal3.setFormat(fw);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D510"));
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CLASS, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(QTD, decimal2);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(ALIQ_ICMS, decimal3);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_BC_ICMS_UF, decimal);
        addFieldArchetype(VL_ICMS_UF, decimal);
        addFieldArchetype(IND_REC, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
    }
    
    
                    
    
    
}
