package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 11:52:30
 * @author Thiago Balthazar
 */
public class RC410 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C410"
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor total do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor total da COFINS
     */

    public RC410() {
        
        setName("REGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CODIGO 02 e 2D)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C410"));
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
    }
    
}
