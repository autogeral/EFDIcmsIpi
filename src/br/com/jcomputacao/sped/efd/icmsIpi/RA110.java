/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA110 extends LineArchetype{
    
    public static final String REG = "REG";
    /**
     * Codigo da informação complementar do documento fiscal (Campo 02 do Registro 0450)
     */
    public static final String COD_INF = "COD_INF";
    /**
     * Informação Complementar do Documento Fiscal
     */
    public static final String TXT_COMPL = "TXT_COMPL";    
    
    public RA110() {
        setName("Registro A110 - Complemento do documento - Informação Complementarda NF1");
        setDelimiter("|");
        addFieldArchetype(REG, new FieldDefaultArchetype("A110"));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
    }      
        
}
