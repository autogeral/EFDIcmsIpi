package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RC509 extends LineArchetype{
    
    public static final String REGISTRO = "REG";
    /**
     * Identificação do processo o ato concessório
     */
    public static final String NUM_PROC = "NUM_PROC";
    /**
     * Identificador da origem do processo?
     * 1 - Justiça Federal.
     * 3 - Secretaria da receita federal do Brasil.
     * 9 - Outros.
     */
    public static final String IND_PROC = "IND_PROC";

    public RC509() {
        setName("REGISTRO C509: Processo Referenciado");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C509"));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));        
    }
}
