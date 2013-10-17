/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA010 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /**
     * Numero de inscricao do estabelecimento no CNPJ
     */
    public static final String CNPJ = "CNPJ";
    
    public RA010 () {
        setName("Registro A010 - Identificacao do estabelecimento");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("A010"));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
    }
    
}
