package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 13/02/2013 09:34:41
 * @author Thiago Balthazar
 */
public class RC170 extends LineArchetype{

public static final String REGISTRO = "REG"; //1
/*
 * Texto fixo contendo "C170"
 */
public static final String NUM_ITEM = "NUM_ITEM"; //2
/*
 * Número sequencial do item no documento fiscal
 */
public static final String COD_ITEM = "COD_ITEM"; //3
/*
 * Código do item (campo 02 do Registro 0200)
 */
public static final String DESCR_COMPL = "DESCR_COMPL"; //4
/*
 * Descrição complementar do item como adotado no documento fiscal
 */
public static final String QTD = "QTD";//5
/*
 * Quantidade do item
 */
public static final String UNID = "UNID"; //6
/*
 * Unidade do item (Campo 02 do registro 0190)
 */
public static final String VL_ITEM = "VL_ITEM";//7
/*
 * Valor total do item (mercadorias ou serviços)
 */
public static final String VL_DESC = "VL_DESC";//8
/*
 * Valor do desconto comercial
 */
public static final String IND_MOV = "IND_MOV";//9
/*
 * Movimentação física do ITEM/PRODUTO:
    0. SIM
    1. NÃO
 */
public static final String CST_ICMS = "CST_ICMS";//10
/*
 * Código da Situação Tributária referente ao ICMS, 
 * conforme a Tabela indicada no item 4.3.1
 */
public static final String CFOP = "CFOP";//11
/*
 * Código Fiscal de Operação e Prestação
 */
public static final String COD_NAT = "COD_NAT";//12
/*
 * Código da natureza da operação (campo 02 do Registro 0400)
 */
public static final String VL_BC_ICMS = "VL_BC_ICMS";//13
/*
 * Valor da base de cálculo do ICMS
 */
public static final String ALIQ_ICMS = "ALIQ_ICMS";//14
/*
 * Alíquota do ICMS
 */
public static final String VL_ICMS = "VL_ICMS";//15
/*
 * Valor do ICMS creditado/debitado
 */
public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";//16
/*
 * Valor da base de cálculo referente à substituição tributária
 */
public static final String ALIQ_ST = "ALIQ_ST";//17
/*
 * Alíquota do ICMS da substituição tributária na unidade da federação de destino
 */
public static final String VL_ICMS_ST = "VL_ICMS_ST";//18
/*
 * Valor do ICMS referente à substituição tributária
 */
public static final String IND_APUR = "IND_APUR";//19
/*
 * Indicador de período de apuração do IPI:
    0 - Mensal;
    1 - Decendial
 */
public static final String CST_IPI = "CST_IPI";//20
/*
 * Código da Situação Tributária referente ao IPI,
conforme a Tabela indicada no item 4.3.2.
 */
public static final String COD_ENQ = "COD_ENQ";//21
/*
 * Código de enquadramento legal do IPI, 
 * conforme tabela indicada no item 4.5.3.
 */

public static final String VL_BC_IPI = "VL_BC_IPI";//22
/*
 * Valor da base de cálculo do IPI
 */
public static final String ALIQ_IPI = "ALIQ_IPI";//23
/*
 * Alíquota do IPI
 */
public static final String VL_IPI = "VL_IPI";//24
/*
 * Valor do IPI creditado/debitado
 */
public static final String CST_PIS = "CST_PIS";//25
/*
 * Código da Situação Tributária referente ao PIS
 */
public static final String VL_BC_PIS = "VL_BC_PIS";//26
/*
 * Valor da base de cálculo do PIS
 */
public static final String ALIQ_PIS_PORC = "ALIQ_PIS_PORC";//27
/*
 * Alíquota do PIS (em percentual)
 */
public static final String QUANT_BC_PIS = "QUANT_BC_PIS";//28
/*
 * QUANT_BC_PIS
 */
public static final String ALIQ_PIS_REAIS = "ALIQ_PIS_REAIS"; //29
/*
 * Alíquota do PIS (em reais)
 */
public static final String VL_PIS = "VL_PIS";//30
/*
 * Valor do PIS
 */
public static final String CST_COFINS = "CST_COFINS";//31
/*
 * Código da Situação Tributária referente ao COFINS.
 */
public static final String VL_BC_COFINS = "VL_BC_COFINS";//32
/*
 * Valor da base de cálculo da COFINS
 */
public static final String ALIQ_COFINS_PORC = "ALIQ_COFINS_PORC";//33
/*
 * Alíquota do COFINS (em percentual)
 */
public static final String QUANT_BC_COFINS = "QUANT_BC_COFINS";//34
/*
 * Quantidade ? Base de cálculo COFINS
 */
public static final String ALIQ_COFINS_REAIS = "ALIQ_COFINSS_REAIS";//35
/*
 * Alíquota da COFINS (em reais)
 */
public static final String VL_COFINS = "VL_COFINS";//36
/*
 * Valor da COFINS
 */
public static final String COD_CTA = "COD_CTA";//37
/*
 * Código da conta analítica contábil debitada/creditada
 */

    public RC170() {
    
        setName("REGISTRO C170: ITENS DO DOCUMENTO (CODIGO 01, 1B, 04 e 55)");
        setDelimiter("|");
        
        FormatWrapper fw5 = FormatFactory.getDecimalFormatWithPrecision(5);
        fw5.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d5 = new FieldDecimalMaximumLengthArchetype(15,5);
        d5.setFormat(fw5);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d4 = new FieldDecimalMaximumLengthArchetype(15,4);
        d4.setFormat(fw4);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d3 = new FieldDecimalMaximumLengthArchetype(15,3);
        d3.setFormat(fw3);
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype d2 = new FieldDecimalMaximumLengthArchetype(15,2);
       d2.setFormat(fw);
       
       
       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(9,2);
       d.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C170"));//1
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));//2
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));//3
        addFieldArchetype(DESCR_COMPL, new FieldStringMaximumLengthArchetype(255));//4
        addFieldArchetype(QTD, d5);//5
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));//6
        addFieldArchetype(VL_ITEM, d2);//7
        addFieldArchetype(VL_DESC, d2);//8
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));//9
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));//10
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));//11
        addFieldArchetype(COD_NAT, new FieldStringMaximumLengthArchetype(10));//12
        addFieldArchetype(VL_BC_ICMS, d2);//13
        addFieldArchetype(ALIQ_ICMS, d); //14
        addFieldArchetype(VL_ICMS, d2);//15
        addFieldArchetype(VL_BC_ICMS_ST, d);//16
        addFieldArchetype(ALIQ_ST, d2);//17
        addFieldArchetype(VL_ICMS_ST, d2);//18
        addFieldArchetype(IND_APUR, new FieldStringFixedLengthArchetype(1));//19
        addFieldArchetype(CST_IPI,new FieldStringFixedLengthArchetype(2));//20
        addFieldArchetype(COD_ENQ, new FieldStringFixedLengthArchetype(3));//21
        addFieldArchetype(VL_BC_IPI, d2);//22
        addFieldArchetype(ALIQ_IPI, d);//23
        addFieldArchetype(VL_IPI, d2);//24
        addFieldArchetype(CST_PIS,new FieldIntegerFixedLengthArchetype(2));//25
        addFieldArchetype(VL_BC_PIS, d2);//26
        addFieldArchetype(ALIQ_PIS_PORC, d4);//27
        addFieldArchetype(QUANT_BC_PIS, d3);//28
        addFieldArchetype(ALIQ_PIS_REAIS, d4);//29
        addFieldArchetype(VL_PIS, d2);//30
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));//31
        addFieldArchetype(VL_BC_COFINS, d2);//32
        addFieldArchetype(ALIQ_COFINS_PORC, d4);//33
        addFieldArchetype(QUANT_BC_COFINS, d3);//34
        addFieldArchetype(ALIQ_COFINS_REAIS, d4);//35
        addFieldArchetype(VL_COFINS, d2);//36
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));//37
        
    }

 
}
