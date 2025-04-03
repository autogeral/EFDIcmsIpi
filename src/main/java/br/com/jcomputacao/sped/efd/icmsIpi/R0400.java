package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 21:05:06
 *
 * @author Murilo Tuvani
 */
public class R0400 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String COD_NAT = "COD_NAT";
    public static final String TXT = "TXT";

    public R0400() {
        setName("Registro 0400 - Tabela de natura da operacao/prestacao");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0400"));
        addFieldArchetype(COD_NAT, new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(TXT, new FieldStringMaximumLengthArchetype(255));
    }
}
