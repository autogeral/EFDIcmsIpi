
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 05/02/2013 13:05:26
 * @author Murilo Tuvani
 */
public class RC113 extends LineArchetype {
    
    public static final String REGISTRO  = "REG";
    /**
     * 0- Entrada/aquisicao;
     * 1- Saida/prestacao
     */
    public static final String IND_OPER  = "IND_OPER";
    /**
     * 0- Emissao propria;
     * 1- Terceiros
     */
    public static final String IND_EMIT  = "IND_EMIT";
    /**
     * Codigo do participante emitente (campo 02 do Registro 0150) do documento referenciado.
     */
    public static final String COD_PART  = "COD_PART";
    /**
     * Codigo do documento fiscal, conforme a Tabela 4.1.1
     */
    public static final String COD_MOD   = "COD_MOD";
    /**
     * Serie do documento fiscal
     */
    public static final String SER       = "SER";
    /**
     * Subserie do documento fiscal
     */
    public static final String SUB       = "SUB";
    /**
     * Numero do documento fiscal
     */
    public static final String NUM_DOC   = "NUM_DOC";
    /**
     * Data da emissão do documento fiscal.
     */
    public static final String DT_DOC    = "DT_DOC";
    
    
    public RC113() {
        setName("Registro C113 - Documento fiscal referenciado");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C113"));
        addFieldArchetype(IND_OPER, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD,  new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER,      new FieldStringMaximumLengthArchetype(5));
        addFieldArchetype(SUB,      new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC,  new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC,   new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }

}
