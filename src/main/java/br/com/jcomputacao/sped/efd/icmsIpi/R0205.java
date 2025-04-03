package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 18:09:36
 *
 * @author Murilo Tuvani
 */
public class R0205 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String DESCR_ANT_ITEM = "DESCR_ANT_ITEM";
    public static final String DT_INI = "DT_INI";
    public static final String DT_FIM = "DT_FIM";
    public static final String COD_ANT_ITEM = "COD_ANT_ITEM";

    public R0205() {
        setName("Registro 0205 - Alteracao do item");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0205"));
        addFieldArchetype(DESCR_ANT_ITEM, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype());
        addFieldArchetype(DT_FIM, new FieldDateFixedLengthArchetype());
        addFieldArchetype(COD_ANT_ITEM, new FieldStringMaximumLengthArchetype(60));
    }
}
