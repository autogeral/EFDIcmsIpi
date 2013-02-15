package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 14/02/2013 10:31:21
 * @author Thiago Balthazar
 */
public class RC321 extends LineArchetype{

    public static final String REGISTRO = "REG"; 
    /*
     * Texto fixo contendo "C321"
     */
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do item (campo 02 do Registro 0200)
     */
    public static final String QTD = "QTD";
    /*
     * Quantidade acumulada do item
     */
    public static final String UNID = "UNID";
    /*
     * Unidade do item (Campo 02 do registro 0190)
     */
    public static final String VL_ITEM = "VL_ITEM";
    /*
     * Valor acumulado do item
     */
    public static final String VL_DESC = "VL_DESC";
    /*
     * Valor do desconto acumulado
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor acumulado da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS"; 
    /*
     * Valor acumulado do ICMS debitado
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor acumulado do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     *Valor acumulado da COFINS 
     */

    public RC321() {
        
       setName("REGISTRO C321: ITENS DO RESUMO DIARIO DOS DOCUMENTOS (CODIGO 02)");
       setDelimiter("|");
       
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
      FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
      fw3.setReplaceComa(false);

      FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,3);
      decimal2.setFormat(fw3);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C321"));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QTD, decimal2);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
    
    }
    
    

}
