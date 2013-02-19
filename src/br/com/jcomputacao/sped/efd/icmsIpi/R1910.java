package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 13:35:04
 * @author Vinicius Diana
 */
public class R1910 extends LineArchetype {
    /*
     * 1 - Texto fixo contendo "1910"
     */
    public static final String REGISTRO = "REGISTRO";
    
    
    
    
    
    /*
     * 2 -  Data inicial da sub-apuração
     */
    public static final String DT_INI = "DT_INI";
    

    
    
    
    
    
    /*
     * 3 - Data final da sub-apuração
     */
    public static final String  DT_FIN = " DT_FIN";
    
    
    
    
    

    public R1910() {
        setName("REGISTRO 1910: PERÍODO DA SUB-APURAÇÃO DO ICMS ");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1910"));
        //2
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //3
        addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        
        
    }
    
    
    
    
    
    

}
