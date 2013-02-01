package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 20:15:20
 *
 * @author Murilo Tuvani
 */
public class R0305 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /**
     * Codigo do centro de custo onde o bem esta sendo ou sera utilizado (campo
     * 03 do Registro 0600)
     */
    private static final String COD_CCUS = "COD_CCUS";
    /**
     * Descrição sucinta da função do bem na atividade do estabelecimento
     */
    private static final String FUNC = "FUNC";
    /**
     * Vida util estimada do bem, em numero de meses
     */
    private static final String VIDA_UTIL = "VIDA_UTIL";

    public R0305() {
        setName("Registro 0305 - Inforamacao sobre utilizacao do bem");
        setDelimiter("|");
        addFieldArchetype(REGISTRO,  new FieldDefaultArchetype("0305"));
        addFieldArchetype(COD_CCUS,  new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(FUNC,      new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(VIDA_UTIL, new FieldIntegerMaximumLengthArchetype(3));
    }
}
