package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 09:29:19
 * @author Thiago Balthazar
 */
public class RC160 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C160"
     */
    public static final String COD_PART = "COD_PART";
    /*
     * Código do participante (campo 02 do Registro 0150):
    - transportador, se houver
     */
    public static final String VEIC_ID = "VEIC_ID";
    /*
     * Placa de identificação do veículo automotor
     */
    public static final String QTD_VOL = "QTD_VOL";
    /*
     * Quantidade de volumes transportados
     */
    public static final String PESO_BRT = "PESO_BRT";
    /*
     * Peso bruto dos volumes transportados (em Kg)
     */
    public static final String PESO_LIQ = "PESO_LIQ";
    /*
     * Peso líquido dos volumes transportados (em Kg)
     */
    public static final String UF_ID = "UF_ID";
    /*
     * Sigla da UF da placa do veículo
     */

    public RC160() {
    
        setName("REGISTRO C160: VOLUMES TRANSPORTADOS (CODIGO 01 E 04) - EXCETO COMBUSTIVEIS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C160"));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(7));
        addFieldArchetype(QTD_VOL, new FieldIntegerMaximumLengthArchetype(20));
        addFieldArchetype(PESO_BRT, decimal);
        addFieldArchetype(PESO_LIQ, decimal);
        addFieldArchetype(UF_ID, new FieldStringMaximumLengthArchetype(2));
    }
    
    

}
