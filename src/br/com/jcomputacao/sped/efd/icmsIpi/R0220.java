package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 18:19:15
 *
 * @author Murilo Tuvani
 */
public class R0220 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /**
     * Unidade comercial a ser convertida na unidade de estoque, referida no
     * registro 0200.
     */
    public static final String UNID_CONV = "UNID_CONV";
    /**
     * Fator de conversão: fator utilizado para converter (multiplicar) a
     * unidade a ser convertida na unidade adotada no inventario.
     */
    public static final String FAT_CONV = "FAT_CONV";

    public R0220() {
        setName("Registro 0220 - Fator de conversao de unidades");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0220"));
        addFieldArchetype(UNID_CONV, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(FAT_CONV, new FieldDecimalMaximumLengthArchetype(20, 6));

    }
}
