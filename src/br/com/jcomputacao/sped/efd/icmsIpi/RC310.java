package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;



/**
 * 14/02/2013 09:52:15
 * @author Thiago Balthazar
 */
public class RC310 extends LineArchetype{
    
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C310"
     */
    public static final String NUM_DOC_CANC = "NUM_DOC_CANC";
    /*
     * Número do documento fiscal cancelado
     */

    public RC310() {
    
        setName("REGISTRO C310: DOCUMENTOS CANCELADOS DE NOTAS FISCAIS DE VENDA A CONSUMIDOR (CODIGO 02)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C310"));
        addFieldArchetype(NUM_DOC_CANC, new FieldIntegerMaximumLengthArchetype(15));
        
    }
        
    
    

}
