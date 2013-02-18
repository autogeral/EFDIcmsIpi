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
 * 18/02/2013 14:06:44
 * @author Thiago Balthazar
 */
public class RC470 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C470"
     */
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do item (campo 02 do Registro 0200)
     */
    public static final String QTD = "QTD";
    /*
     * Quantidade do item
     */
    public static final String QTD_CANC = "QTD_CANC";
    /*
     * Quantidade cancelada, no caso de cancelamento
        parcial de item
     */
    public static final String UNID = "UNID";
    /*
     * Unidade do item (Campo 02 do registro 0190)
     */
    public static final String VL_ITEM = "VL_ITEM";
    /*
     * Valor total do item
     */
    public static final String CST_ICMS = "CST_ICMS";
    /*
     * Código da Situação Tributária, conforme a
       Tabela indicada no item 4.3.1
     */
    public static final String CFOP = "CFOP";
    /*
     * Código Fiscal de Operação e Prestação
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     * Alíquota do ICMS ? Carga tributária efetiva em percentual
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor da COFINS
     */

    public RC470() {
    
       setName("REGISTRO C470: ITENS DO DOCUMENTO FISCAL EMITIDO POR ECF (CODIGO 02 e 2D)");
       setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
      
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal2.setFormat(fw);
       
       FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
       fw3.setReplaceComa(false);

       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,3);
       d.setFormat(fw3);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C470"));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QTD, d);
        addFieldArchetype(QTD_CANC, d);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, decimal2);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
     
    }
    
    
}
