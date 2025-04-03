package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 11/02/2013 08:16:07
 * @author Thiago Balthazar
 */
public class RD410 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D410"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal , conforme a Tabela 4.1.1
     */
    public static final String SER = "SER";
    /*
     * Série do documento fiscal
     */
    public static final String SUB = "SUB";
    /*
     * Subsérie do documento fiscal
     */
    public static final String NUM_DOC_INI = "NUM_DOC_INI";
    /*
     * Número do documento fiscal inicial (mesmo modelo, série e subsérie)
     */
    public static final String NUM_DOC_FIN = "NUM_DOC_FIN" ;
    /*
     * Número do documento fiscal final(mesmo modelo, série e subsérie)
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão dos documentos fiscais
     */
    public static final String CST_ICMS = "CST_ICMS";
    /*
     * Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1
     */
    public static final String CFOP = "CFOP";
    /*
     * Código Fiscal de Operação e Prestação
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     *Alíquota do ICMS 
     */
    public static final String VL_OPR = "VL_OPR";
    /*
     * Valor total acumulado das operações correspondentes à combinação de CST_ICMS,
      CFOP e alíquota do ICMS, incluídas as despesas acessórias e acréscimos. 
     */
    public static final String VL_DESC = "VL_DESC";
    /*
     * Valor acumulado dos descontos
     */
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor acumulado da prestação de serviço
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor acumulado da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor acumulado do ICMS
     */

    public RD410() {
    
    setName("REGISTRO D410: DOCUMENTOS INFORMADOS (CODIGOS 13, 14, 15 E 16)");
    setDelimiter("|");
    
      FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
      fw.setReplaceComa(false);
     
      FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(9,2);
      decimal.setFormat(fw);
      
      FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,2);
      decimal2.setFormat(fw);
    
    
    addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D410"));
    addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
    addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
    addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(6));
    addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(6));
    addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(6));
    addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
    addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
    addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
    addFieldArchetype(ALIQ_ICMS, decimal);
    addFieldArchetype(VL_OPR, decimal2);
    addFieldArchetype(VL_DESC, decimal2);
    addFieldArchetype(VL_SERV, decimal2);
    addFieldArchetype(VL_BC_ICMS, decimal2);
    addFieldArchetype(VL_ICMS, decimal2);
    
    }
    
    
     
}
