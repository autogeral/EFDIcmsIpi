package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 16:29:19
 * @author Vinicius Diana
 */
public class RC141 extends LineArchetype {

    /*
     * 1 - Texto fixo contendo "C141"
     */
    public static final String REGISTRO = "REGISTRO";
    
    
    
     /*
     * 2 - Número da parcela a receber/pagar
     */
    public static final String NUM_PARC = "NUM_PARC";
    
    
    
     /*
     * 3 -  Data de vencimento da parcela
     */
    public static final String DT_VCTO  = "DT_VCTO";
    
    
    
    
     /*
     * 4 - Valor da parcela a receber/pagar
     */
    public static final String VL_PARC = "VL_PARC";
    
    
    
    

    public RC141() {
        
        setName("REGISTRO C141: VENCIMENTO DA FATURA (CODIGO 01).");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C141"));
        //2
        addFieldArchetype(NUM_PARC, new FieldIntegerMaximumLengthArchetype(2));
        //3
        addFieldArchetype(DT_VCTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //4
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_PARC, f1);
    }
    
    
    
    
    
}
