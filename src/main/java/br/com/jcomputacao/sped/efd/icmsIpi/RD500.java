package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;


/**
 * 11/02/2013 09:21:11
 * @author Thiago Balthazar
 */
public class RD500 extends LineArchetype{

public static final String REGISTRO = "REG";
public static final String IND_OPER = "IND_OPER";
public static final String IND_EMIT = "IND_EMIT";
public static final String COD_PART = "COD_PART";
public static final String COD_MOD = "COD_MOD";
public static final String COD_SIT = "COD_SIT";
public static final String SER = "SER";
public static final String SUB = "SUB";
public static final String NUM_DOC = "NUM_DOC";
public static final String DT_DOC = "DT_DOC";
public static final String DT_A_P = "DT_A_P";
public static final String VL_DOC = "VL_DOC";
public static final String VL_DESC = "VL_DESC";
public static final String VL_SERV = "VL_SERV";
public static final String VL_SERV_NT = "VL_SERV_NT";
public static final String VL_TERC = "VL_TERC";
public static final String VL_DA = "VL_DA";
public static final String VL_BC_ICMS = "VL_BC_ICMS";
public static final String VL_ICMS = "VL_ICMS";
public static final String COD_INF = "COD_INF";
public static final String VL_PIS = "VL_PIS";
public static final String VL_COFINS = "VL_COFINS";
public static final String COD_CTA = "COD_CTA";
public static final String TP_ASSINANTE = "TP_ASSINANTE";

    public RD500() {

        setName("REGISTRO D500: NOTA FISCAL DE SERVICO DE COMUNICACAO (CODIGO 21) E NOTA FISCAL DE SERVICO DE TELECOMUNICACAO (CODIGO 22)");
        setDelimiter("|");


        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D500"));//1
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));//2
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));//3
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));//4
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));//5
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));//6
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));//7
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));//8
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));//9
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));//10
        addFieldArchetype(DT_A_P, new FieldDateFixedLengthArchetype("ddMMyyyy"));//11
        addFieldArchetype(VL_DOC, decimal);//12
        addFieldArchetype(VL_DESC, decimal);//13
        addFieldArchetype(VL_SERV, decimal);//14
        addFieldArchetype(VL_SERV_NT, decimal);//15
        addFieldArchetype(VL_TERC, decimal);//16
        addFieldArchetype(VL_DA, decimal);//17
        addFieldArchetype(VL_BC_ICMS, decimal);//18
        addFieldArchetype(VL_ICMS, decimal);//19
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));//20
        addFieldArchetype(VL_PIS, decimal);//21
        addFieldArchetype(VL_COFINS, decimal);//22
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));//23
        addFieldArchetype(TP_ASSINANTE, new FieldIntegerFixedLengthArchetype(1));//24
    }



}
