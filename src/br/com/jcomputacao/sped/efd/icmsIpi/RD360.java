package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.lang.reflect.Field;


/**
 * 08/02/2013 08:39:41
 * @author Thiago Balthazar
 */
public class RD360 extends  LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D360"
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor total do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor total da COFINS
     */

    public RD360() {
    
        setName("REGISTRO D360: PIS E COFINS TOTALIZADOS NO DIA (CODIGOS 2E, 13, 14, 15 e 16)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D360"));
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
    
    }
    
    
}
