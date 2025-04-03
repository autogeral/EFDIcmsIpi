package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 11:10:17
 * @author Thiago Balthazar
 */
public class RD590 extends LineArchetype{

public static final String REGISTRO = "REG";
public static final String CST_ICMS = "CST_ICMS";
public static final String CFOP = "CFOP";
public static final String ALIQ_ICMS = "ALIQ_ICMS";
public static final String VL_OPR = "VL_OPR";
public static final String VL_BC_ICMS = "VL_BC_ICMS";
public static final String VL_ICMS = "VL_ICMS";
public static final String VL_BC_ICMS_UF = "VL_BC_ICMS_UF";
public static final String VL_ICMS_UF = "VL_ICMS_UF";
public static final String VL_RED_BC = "VL_RED_BC";
public static final String COD_OBS = "COD_OBS";

    public RD590() {
        
        setName("REGISTRO D590: REGISTRO ANALITICO DO DOCUMENTO (CODIGO 21 E 22)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal2.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D590"));
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, decimal2);
        addFieldArchetype(VL_OPR, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_BC_ICMS_UF, decimal);
        addFieldArchetype(VL_ICMS_UF, decimal);
        addFieldArchetype(VL_RED_BC, decimal);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
    }
    


}
