package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/02/2013 23:39:26
 * @author Murilo
 */
public class RC111 extends LineArchetype {
    
    public static final String REGISTRO  = "REG";
    /**
     * Identificacao do processo ou ato concessorio
     */
    public static final String NUM_PROC  = "NUM_PROC";
    /**
     * 0 - SEFAZ;
     * 1 - Justica Federal;
     * 2 - Justica Estadual;
     * 3 - SECEX/SRF
     * 9 - Outros.
     */
    public static final String IND_PROC  = "IND_PROC";
    
    public RC111() {
        setName("Registro C111 - Processo referenciado");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C111"));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
        addFieldArchetype(IND_PROC, new FieldIntegerMaximumLengthArchetype(1));
    }

}
