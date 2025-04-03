package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 18:17:35
 *
 * @author Murilo Tuvani
 */
public class R0206 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String COD_COMB = "COD_COMB";
    
    public R0206() {
        setName("Registro 0206 - Codigo do produto conforme a ANP");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0206"));
        addFieldArchetype(COD_COMB, new FieldStringMaximumLengthArchetype(255));
    }
}
