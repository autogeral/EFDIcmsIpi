package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA120 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /**
     * Valor total do servi�o, prestado por pessoa f�sica ou juridica
     * domiciliada no exterior
     */
    public static final String VL_TOT_SERV = "VL_TOT_SERV";
    /**
     * Valor da base de calculo da opera��o PIS/PASEP - Importa��o
     */
    public static final String VL_BC_PIS = "VL_BC_PIS";
    /**
     * Valor pago/recolhido de PIS/PASEP - Importa��o
     */
    public static final String VL_PIS_IMP = "VL_PIS_IMP";
    /**
     * data de pagamento do PIS/PASEP - Importa��o
     */    
    public static final String DT_PAG_PIS = "DT_PAG_PIS";
    /**
     * Valor da base de calculo da opera��o - COFINS- Importa��o
     */
    public static final String VL_BC_COFINS = "VL_BC_COFINS";
    /**
     * Valor pago/recolhido de COFINS - Importa��o
     */
    public static final String VL_COFINS_IMP = "VL_COFINS_IMP";
    /**
     * Data de pagamento do COFINS - Importa��o
     */
    public static final String DT_PAG_COFINS = "DT_PAG_COFINS";
    /**
     * Local da execu��o do servi�o
     * 0 - Executado no Pa�s.
     * 1 - Executado no exterior, cujo resultado se verifique no Pa�s.
     */
    public static final String LOC_EXE_SERV = "LOC_EXE_SERV";

    public RA120() {
         
        setName("Registro A120 - Informa��o Complementar - Opera��es de importa��o");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("A120"));
        addFieldArchetype(VL_TOT_SERV, decimal);
        addFieldArchetype(VL_BC_PIS, decimal);
        addFieldArchetype(VL_PIS_IMP, decimal);
        addFieldArchetype(DT_PAG_PIS, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VL_BC_COFINS, decimal);
        addFieldArchetype(VL_COFINS_IMP, decimal);
        addFieldArchetype(DT_PAG_COFINS, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(LOC_EXE_SERV, new FieldStringFixedLengthArchetype(1));        
    }        
}
