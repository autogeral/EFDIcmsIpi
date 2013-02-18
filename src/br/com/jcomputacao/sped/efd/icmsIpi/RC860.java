package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 18/02/2013 16:00:56
 * @author Thiago Balthazar
 */
public class RC860 extends LineArchetype{

    public static final String REGISTRO = "REG"; 
    /*
     * Texto fixo contendo "C860"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    public static final String NR_SAT = "NR_SAT";
    /*
     * Número de Série do equipamento SAT
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data de emissão dos documentos fiscais
     */
    public static final String DOC_INI = "DOC_INI";
    /*
     * Número do documento inicial
     */
    public static final String DOC_FIM = "DOC_FIM";
    /*
     * Número do documento final
     */

    public RC860() {
        
        setName("REGISTRO C860: IDENTIFICACAO DO EQUIPAMENTO SAT-CF-E");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C860"));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(NR_SAT, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DOC_INI, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DOC_FIM, new FieldIntegerMaximumLengthArchetype(6));
    }

    
}
