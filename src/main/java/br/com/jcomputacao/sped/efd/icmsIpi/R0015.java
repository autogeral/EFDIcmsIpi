package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/01/2013 18:47:41
 *
 * @author Murilo
 */
public class R0015 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    public static final String UF_ST = "UF_ST";
    public static final String IE_ST = "IE_ST";
    
    public R0015() {
        setName("Registro 0015 - Dados contrubuinte substituto");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0015"));
        addFieldArchetype(UF_ST, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IE_ST, new FieldStringMaximumLengthArchetype(14));
    }
}
