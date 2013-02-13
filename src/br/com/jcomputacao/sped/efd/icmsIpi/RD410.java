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
     * C�digo do modelo do documento fiscal , conforme a Tabela 4.1.1
     */
    public static final String SER = "SER";
    /*
     * S�rie do documento fiscal
     */
    public static final String SUB = "SUB";
    /*
     * Subs�rie do documento fiscal
     */
    public static final String NUM_DOC_INI = "NUM_DOC_INI";
    /*
     * N�mero do documento fiscal inicial (mesmo modelo, s�rie e subs�rie)
     */
    public static final String NUM_DOC_FIN = "NUM_DOC_FIN" ;
    /*
     * N�mero do documento fiscal final(mesmo modelo, s�rie e subs�rie)
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emiss�o dos documentos fiscais
     */
    public static final String CST_ICMS = "CST_ICMS";
    /*
     * C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1
     */
    public static final String CFOP = "CFOP";
    /*
     * C�digo Fiscal de Opera��o e Presta��o
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     *Al�quota do ICMS 
     */
    public static final String VL_OPR = "VL_OPR";
    /*
     * Valor total acumulado das opera��es correspondentes � combina��o de CST_ICMS,
      CFOP e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos. 
     */
    public static final String VL_DESC = "VL_DESC";
    /*
     * Valor acumulado dos descontos
     */
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor acumulado da presta��o de servi�o
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor acumulado da base de c�lculo do ICMS
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
