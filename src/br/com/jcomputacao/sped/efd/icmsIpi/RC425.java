package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 12:16:29
 * @author Thiago Balthazar
 */
public class RC425 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C425"
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
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor da COFINS
     */

    public RC425() {
    
        setName("REGISTRO C425: RESUMO DE ITENS DO MOVIMENTO DIARIO (CODIGO 02 e 2D)");
        setDelimiter("|");
        
       FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
       fw3.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,3);
        d.setFormat(fw3);
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C425"));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QTD, d);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
    }

    
}
