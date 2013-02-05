package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/02/2013 23:35:13
 * @author Murilo
 */
public class RC110 extends LineArchetype {
    
    public static final String REGISTRO  = "REG";
    
    /**
     * Codigo da informacao complementar do</br>
     * documento fiscal (campo 02 do Registro 0450)
     */
    public static final String COD_INF   = "COD_INF";
    
    /**
     * Descricao complementar do codigo de referencia.
     */
    public static final String TXT_COMPL = "TXT_COMPL";
    
    public RC110() {
        setName("Registro C110 - Informacao complementar da nota fiscal");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C110"));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
    }
}
