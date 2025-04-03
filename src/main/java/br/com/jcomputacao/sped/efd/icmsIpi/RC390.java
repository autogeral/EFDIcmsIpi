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
 * 18/02/2013 11:01:23
 * @author Thiago Balthazar
 */
public class RC390 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C390"
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
     * Alíquota do ICMS
     */
    public static final String VL_OPR = "VL_OPR";
    /*
     * Valor total acumulado das operações correspondentes à
       combinação de CST_ICMS, CFOP e alíquota do
       ICMS, incluídas as despesas acessórias e acréscimos
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor acumulado da base de cálculo do ICMS,
       referente à combinação de CST_ICMS, CFOP, e
       alíquota do ICMS.
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor acumulado do ICMS, referente à combinação de
       CST_ICMS, CFOP e alíquota do ICMS.
     */
    public static final String VL_RED_BC = "VL_RED_BC";
    /*
     * Valor não tributado em função da redução da base de
      cálculo do ICMS, referente à combinação de
      CST_ICMS, CFOP, e alíquota do ICMS.
     */
    public static final String COD_OBS = "COD_OBS";
    /*
     * Código da observação do lançamento fiscal (campo 02
       do Registro 0460)
     */

    public RC390() {
        
        setName("REGISTRO C390: REGISTRO ANALITICO DAS NOTAS FISCAIS DE VENDA A CONSUMIDOR (CODIGO 02)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
         
       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(9,2);
       d.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C390"));
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, d);
        addFieldArchetype(VL_OPR, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_RED_BC, decimal);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
    }
    
    
    
     

}
