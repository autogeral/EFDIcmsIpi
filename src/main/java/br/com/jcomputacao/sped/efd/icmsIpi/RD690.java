package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 14:09:06
 * @author Thiago Balthazar
 */
public class RD690 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "D690"
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
 *  Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação
  CST_ICMS, CFOP, e alíquota do ICMS
 */
public static final String VL_ICMS = "VL_ICMS";
/*
 * Parcela correspondente ao "Valor do ICMS" referente à combinação CST_ICMS, CFOP, e
  alíquota do ICMS
 */
public static final String VL_BC_ICMS_UF = "VL_BC_ICMS_UF";
/*
 * Parcela correspondente ao valor da base de cálculo do ICMS de outras UFs, referente à
combinação de CST_ICMS, CFOP e alíquota do ICMS.
 */
public static final String VL_ICMS_UF = "VL_ICMS_UF";
/*
 * Parcela correspondente ao valor do ICMS de outras UFs, referente à combinação de CST_ICMS,
CFOP, e alíquota do ICMS.
*/
public static final String VL_RED_BC = "VL_RED_BC";
/*
 * Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de
CST_ICMS, CFOP e alíquota do ICMS.
 */
public static final String COD_OBS = "COD_OBS";
/*
 * Código da observação do lançamento fiscal 
 * (campo 02 do Registro 0460)
 */

    public RD690() {
        setName("REGISTRO D690: REGISTRO ANALITICO DOS DOCUMENTOS (CODIGOS 21 e 22)");        
        setDelimiter("|");       
               
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
             
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal2.setFormat(fw);
        
       addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D690"));
        addFieldArchetype(CST_ICMS, new FieldStringFixedLengthArchetype(3));
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
