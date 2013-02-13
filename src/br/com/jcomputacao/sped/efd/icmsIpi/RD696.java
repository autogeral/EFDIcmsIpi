package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;

/**
 * 11/02/2013 15:10:42
 * @author Thiago Balthazar
 */
public class RD696 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "D696"
 */
public static final String CST_ICMS = "CST_ICMS";
/*
 * Código da Situação Tributária, conforme a tabela indicada no item 4.3.1
 */
public static final String CFOP = "CFOP";
/*
 * Código Fiscal de Operação e Prestação, conforme a tabela indicada no item 4.2.2
 */
public static final String ALIQ_ICMS = "ALIQ_ICMS";
/*
 * Alíquota do ICMS
 */
public static final String VL_OPR = "VL_OPR";
/*
 * Valor da operação correspondente à combinação de CST_ICMS, CFOP, e alíquota do ICMS, 
 * incluídas as despesas acessórias e acréscimos
 */
public static final String VL_BC_ICMS = "VL_BC_ICMS";
/*
 * Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação
  CST_ICMS, CFOP, e alíquota do ICMS
 */
public static final String VL_ICMS = "VL_ICMS";
/*
 * Parcela correspondente ao "Valor do ICMS" referente à combinação CST_ICMS, CFOP, e
  alíquota do ICMS
 */
public static final String VL_BC_ICMS_UF = "VL_BC_ICMS_UF";
/*
 * Parcela correspondente ao valor da base de cálculo do ICMS de outras UFs, 
 * referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
 */
public static final String VL_ICMS_UF = "VL_ICMS_UF";
/*
 * Parcela correspondente ao valor do ICMS de outras
UFs, referente à combinação de CST_ICMS,CFOP, e alíquota do ICMS
 */
public static final String VL_RED_BC = "VL_RED_BC";
/*
 * Valor não tributado em função da redução da base de cálculo do ICMS, 
 * referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.
*/
public static final String COD_OBS = "COD_OBS";
/*
 * Código da observação do lançamento fiscal 
 * (campo02 do Registro 0460)
 */

    public RD696() {
   
        setName("REGISTRO D696: REGISTRO ANALITICO DOS DOCUMENTOS (CODIGO 21 E 22)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal2.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
          
       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,2);
       d.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype d1 = new FieldDecimalMaximumLengthArchetype(15,2);
       d1.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype d2 = new FieldDecimalMaximumLengthArchetype(15,2);
       d2.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype d3 = new FieldDecimalMaximumLengthArchetype(15,2);
       d3.setFormat(fw);
       
        FieldDecimalMaximumLengthArchetype d4 = new FieldDecimalMaximumLengthArchetype(15,2);
       d4.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype d5 = new FieldDecimalMaximumLengthArchetype(15,2);
       d5.setFormat(fw);
       
       addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D696"));
        addFieldArchetype(CST_ICMS , new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, decimal2);
        addFieldArchetype(VL_OPR, d);
        addFieldArchetype(VL_BC_ICMS, d1);
        addFieldArchetype(VL_ICMS, d2);
        addFieldArchetype(VL_BC_ICMS_UF, d3);
        addFieldArchetype(VL_ICMS_UF, d4);
        addFieldArchetype(VL_RED_BC, d5);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
    
    }


        
}
