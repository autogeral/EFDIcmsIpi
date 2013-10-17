/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA111 extends LineArchetype{
    
    public static final String REG = "REG";
    /**
     * Identificação do processo ou ato concessório
     */
    public static final String NUM_PROC = "NUM_PROC";
    /**
     * Indicador da origem do processo
     * 1 - Justiça Federal
     * 3 - Secretaria da Receita Federal do Brasil
     * 9 - Outros
     */
    public static final String IND_PROC = "IND_PROC";    
    
    public RA111() {
        setName("Registro A111 - Processo referenciado");
        setDelimiter("|");
        addFieldArchetype(REG, new FieldDefaultArchetype("A111"));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
    }      
}
