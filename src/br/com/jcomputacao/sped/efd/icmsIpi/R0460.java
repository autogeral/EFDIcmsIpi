package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 21:06:19
 *
 * @author Murilo Tuvani
 */
public class R0460 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String COD_OBS = "COD_OBS";
    public static final String TXT = "TXT";

    public R0460() {
        setName("Registro 0460 - Observacoes de lancamento fiscal");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0460"));
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT, new FieldStringMaximumLengthArchetype(255));
    }
}
