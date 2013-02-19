package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 16:17:53
 * @author Thiago Balthazar
 */
public class RC114 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C114"
     */
    
    
    
    public static final String COD_MOD = "COD_MOD";
    /*
     * C�digo do modelo do documento fiscal, conforme a tabela indicada no item 4.1.1
     */
    
    
    
    public static final String ECF_FAB = "ECF_FAB";
    /*
     * N�mero de s�rie de fabrica��o do ECF
     */
    
    
    
    public static final String ECF_CX = "ECF_CX";
    /*
     * N�mero do caixa atribu�do ao ECF
     */
    
    
    
    public static final String NUM_DOC = "NUM_DOC";
    /*
     * N�mero do documento fiscal
     */
    
    
    
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emiss�o do documento fiscal
     */

    
    
    public RC114() {
    
        setName("REGISTRO C114: CUPOM FISCAL REFERENCIADO");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO,new FieldDefaultArchetype("C114"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_CX,  new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC,  new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }
    
}
