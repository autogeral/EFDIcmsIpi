package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;

/**
 * 11/02/2013 11:35:33
 * @author Thiago Balthazar
 */
public class RD600  extends LineArchetype{

    public static final String REGISTRO = "REG";
    public static final String COD_MOD = "COD_MOD";
    public static final String COD_MUN = "COD_MUN";
    public static final String SER = "SER";
    public static final String SUB = "SUB";
    public static final String COD_CONS = "COD_CONS";
    public static final String QTD_CONS = "QTD_CONS";
    public static final String DT_DOC = "DT_DOC";
    public static final String VL_DOC = "VL_DOC";
    public static final String VL_DESC = "VL_DESC";
    public static final String VL_SERV = "VL_SERV";
    public static final String VL_SERV_NT = "VL_SERV_NT";
    public static final String VL_TERC = "VL_TERC";
    public static final String VL_DA = "VL_DA";
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    public static final String VL_ICMS = "VL_ICMS";
    public static final String VL_PIS = "VL_PIS";
    public static final String VL_COFINS = "VL_COFINS";

    public RD600() {
        
        setName("REGISTRO D600: CONSOLIDACAO DA PRESTACAO DE SERVICOS - NOTAS DE SERVICO DE COMUNICACAO (CODIGO 21) E DE SERVICO DE TELECOMUNICACAO (CODIGO 22)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
         
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D600"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_CONS, new FieldIntegerFixedLengthArchetype(2) );
        addFieldArchetype(QTD_CONS, new FieldIntegerMaximumLengthArchetype(30));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_SERV, decimal);
        addFieldArchetype(VL_SERV_NT, decimal);
        addFieldArchetype(VL_TERC, decimal);
        addFieldArchetype(VL_DA, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
    }
    
    
    
}
