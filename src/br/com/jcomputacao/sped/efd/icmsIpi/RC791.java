package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 18/02/2013 16:45:04
 * @author Thiago Balthazar
 */
public class RC791 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C791"
     */
    public static final String UF = "UF";
    /*
     * Sigla da unidade da federação a que se refere a retenção ST
     */
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    /*
     * Valor da base de cálculo do ICMS substituição tributária
     */
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    /*
     * Valor do ICMS retido por substituição tributária
     */

    public RC791() {
    
        setName("REGISTRO C791: REGISTRO DE INFORMACOES DE ST POR UF (COD 06)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C791"));
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_ICMS_ST, decimal);
        addFieldArchetype(VL_ICMS_ST, decimal);
    }

    
}
