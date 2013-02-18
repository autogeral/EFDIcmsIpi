package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 16:23:14
 * @author Thiago Balthazar
 */
public class RC800 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C800"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    public static final String COD_SIT = "COD_SIT";
    /*
     * Código da situação do documento fiscal, conforme a Tabela 4.1.2
     */
    public static final String NUM_CFE = "NUM_CFE";
    /*
     * Número do Cupom Fiscal Eletrônico
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão do Cupom Fiscal Eletrônico
     */
    public static final String VL_CFE = "VL_CFE";
    /*
     * Valor total do Cupom Fiscal Eletrônico
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor total do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor total da COFINS
     */
    public static final String CNPJ_CPF = "CNPJ_CPF";
    /*
     * CNPJ ou CPF do destinatário
     */
    public static final String NR_SAT = "NR_SAT";
    /*
     *Número de Série do equipamento SAT 
     */
    public static final String CHV_CFE = "CHV_CFE";
    /*
     * Chave do Cupom Fiscal Eletrônico
     */
    public static final String VL_DESC = "VL_DESC";
    /*
     * Valor total de descontos
     */
    public static final String VL_MERC = "VL_MERC";
    /*
     * Valor total das mercadorias e serviços
     */
    public static final String VL_OUT_DA = "VL_OUT_DA";
    /*
     * Valor total de outras despesas acessórias e acréscimos
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor do ICMS
     */
    public static final String VL_PIS_ST = "VL_PIS_ST"; 
    /*
     * Valor total do PIS retido por subst. trib.
     */
    public static final String VL_COFINS_ST = "VL_COFINS_ST";
    /*
     * Valor total da COFINS retido por subst. trib.
     */

    public RC800() {
    
        setName("REGISTRO C800: CUPOM FISCAL ELETRONICO (CODIGO 59)");
        setDelimiter("|");
       
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C800"));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(NUM_CFE, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_CFE, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(CNPJ_CPF, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(NR_SAT, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(CHV_CFE, new FieldStringMaximumLengthArchetype(44));
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_MERC, decimal);
        addFieldArchetype(VL_OUT_DA, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_PIS_ST, decimal);
        addFieldArchetype(VL_COFINS_ST, decimal);
        
    }

    
}
