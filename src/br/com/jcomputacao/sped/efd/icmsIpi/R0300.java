
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 31/01/2013 20:15:06
 * @author Murilo Tuvani
 */
public class R0300  extends LineArchetype {

    public static final String REGISTRO    = "REG";
    
    /**
     * Codigo individualizado do bem ou componente adotado no controle patrimonial do estabelecimento informante
     */
    public static final String COD_IND_BEM = "COD_IND_BEM";
    
    /**
     * Identificacao do tipo de mercadoria
     * 1 = bem;
     * 2 = componente.
     */
    public static final String IDENT_MERC  = "IDENT_MERC";
    
    /**
     * Descricao do bem ou componente (modelo, marca e outras caracteristicas necessarias a sua individualizacao)
     */
    public static final String DESCR_ITEM  = "DESCR_ITEM";
    
    /**
     * Codigo de cadastro do bem principal nos casos em que o bem ou componente ( campo 02) esteja vinculado a um bem principal.
     */
    public static final String COD_PRNC    = "COD_PRNC";
    
    /**
     * Codigo da conta analitica de contabilizacao do bem
     * ou componente (campo 06 do Registro 0500)
     */
    public static final String COD_CTA     = "COD_CTA";
    
    /**
     * Numero total de parcelas a serem apropriadas, segundo a legislacao de cada unidade federada
     */
    public static final String NR_PARC     = "NR_PARC";
    
    public R0300() {
        setName("Registro 0300 - Bens ou componentes do ativo imobilizado");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0300"));
        addFieldArchetype(COD_IND_BEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(IDENT_MERC, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DESCR_ITEM, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(COD_PRNC, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(NR_PARC, new FieldIntegerMaximumLengthArchetype(3));
    }

}
