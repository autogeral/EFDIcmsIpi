package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 13:51:04
 * @author Vinicius Diana
 */
public class R1900 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "1900"
     */
    public static final String REGISTRO = "REGISTRO";
    
    
    /*
     * 2 - Texto fixo contendo "1900"
     */
    public static final String IND_APUR_ICMS = "IND_APUR_ICMS";
    
     
    /*
     * 3 - Descrição complementar de Outra Apuração do ICMS

     */
    public static final String DESCR_COMPL_OUT_APUR = "DESCR_COMPL_OUT_APUR";
    
    
    
    

    public R1900() {
        
        setName("REGISTRO 1900: INDICADOR DE SUB-APURACAO DO ICMS ");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1900"));
        //2
        addFieldArchetype(IND_APUR_ICMS, new FieldStringFixedLengthArchetype(1));
        //3
        addFieldArchetype(DESCR_COMPL_OUT_APUR, new FieldStringMaximumLengthArchetype(255));
    }
    
    
    
    
    
    
    
}
