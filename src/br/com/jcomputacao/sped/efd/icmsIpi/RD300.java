package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 07/02/2013 10:09:49
 * @author Thiago Balthazar
 */
public class RD300 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D300"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal, 
     * conforme a Tabela 4.1.1
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
     * Número do primeiro documento fiscal emitido
      (mesmo modelo, série e subsérie)
     */
    public static final String NUM_DOC_FIN = "NUM_DOC_FIN"; 
    /*
     * Número do último documento fiscal emitido
     (mesmo modelo, série e subsérie)
     */
    public static final String CST_ICMS = "CST_ICMS";
    /*
     * Código da Situação Tributária, conforme a Tabela
       indicada no item 4.3.1
     */
    public static final String CFOP = "CFOP";
    /*
     * Código Fiscal de Operação e Prestação conforme
       tabela indicada no item 4.2.2
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     * Alíquota do ICMS
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão dos documentos fiscais
     */
    public static final String VL_OPR = "VL_OPR";
    /*
     * Valor total acumulado das operações
        correspondentes à combinação de CST_ICMS,
        CFOP e alíquota do ICMS, incluídas as despesas
        acessórias e acréscimos.
     */
    public static final String VL_DESC = "VL_DESC";
    /*
     * Valor total dos descontos
     */
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor total da prestação de serviço
     */
    public static final String VL_SEG = "VL_SEG";
    /*
     * Valor de seguro
     */
    public static final String VL_OUT_DESP = "VL_OUT DESP";
    /*
     * Valor de outras despesas
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor total da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor total do ICMS
     */
    public static final String VL_RED_BC = "VL_RED_BC";
    /*
     * Valor não tributado em função da redução da base
       de cálculo do ICMS, referente à combinação de
       CST_ICMS, CFOP e alíquota do ICMS.
     */
    public static final String COD_OBS = "COD_OBS";
    /*
     * Código da observação do lançamento fiscal
       (campo 02 do Registro 0460)
     */
    public static final String COD_CTA = "COD_CTA";
    /*
     * Código da conta analítica contábil
       debitada/creditada
     */

    public RD300() {
    
        setName("REGISTRO D300: REGISTRO ANALITICO DOS BILHETES CONSOLIDADOS DE PASSAGEM RODOVIARIO (CODIGO 13), DE PASSAGEM AQUAVIARIO (CODIGO14), DE PASSAGEM E NOTA DE BAGAGEM (CODIGO 15) E DE PASSAGEMFERROVIARIO (CÓDIGO 16)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(6,2);
        f9.setFormat(fw);
   
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
           
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D300"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(15));
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, f9);
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_OPR, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_SERV, decimal);
        addFieldArchetype(VL_SEG, decimal);
        addFieldArchetype(VL_OUT_DESP, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_RED_BC, decimal);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
        
    }
    
    
    
            
       
    
}
