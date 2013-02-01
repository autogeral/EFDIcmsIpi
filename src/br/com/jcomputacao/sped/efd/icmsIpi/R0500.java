package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 21:06:29
 *
 * @author Murilo Tuvani
 */
public class R0500 extends LineArchetype {

    public static final String REGISTRO   = "REG";
    public static final String DT_ALT     = "DT_ALT";
    /**
     * <ul>
     * <li>01 - Contas de ativo;</li>
     * <li>02 - Contas de passivo;</li>
     * <li>03 - Patrimônio liquido;</li>
     * <li>04 - Contas de resultado;</li>
     * <li>05 - Contas de compensacao; 09 - Outras.</li>
     * </ul>
     */
    public static final String COD_NAT_CC = "COD_NAT_CC";
    /**
     * S - Sintetica (grupo de contas);
     * A - Analitica (conta).
     */
    public static final String IND_CTA    = "IND_CTA";
    /**
     * Nivel da conta analitica/grupo de contas.
     */
    public static final String NIVEL      = "NIVEL";
    /**
     * Codigo da conta analitica/grupo de contas.
     */
    public static final String COD_CTA    = "COD_CTA";
    /**
     * Nome da conta analitica/grupo de contas.
     */
    public static final String NOME_CTA   = "NOME_CTA";

    public R0500() {
        setName("Registro 0500 - Plano de contas contabeis");
        setDelimiter("|");
        addFieldArchetype(REGISTRO,   new FieldDefaultArchetype("0500"));
        addFieldArchetype(DT_ALT,     new FieldDateFixedLengthArchetype());
        addFieldArchetype(COD_NAT_CC, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IND_CTA,    new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NIVEL,      new FieldIntegerMaximumLengthArchetype(5));
        addFieldArchetype(COD_CTA,    new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(NOME_CTA,   new FieldStringMaximumLengthArchetype(60));
    }
}
