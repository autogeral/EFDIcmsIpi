package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 21:05:40
 *
 * @author Murilo Tuvani
 */
public class R0450 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /**
     * Codigo da informacao complementar do documento fiscal.
     */
    public static final String COD_INF = "COD_INF";
    public static final String TXT = "TXT";

    public R0450() {
        setName("Registro 0450 - Inforamacao complementar do documento fiscal");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0450"));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT, new FieldStringMaximumLengthArchetype(255));
    }
}
