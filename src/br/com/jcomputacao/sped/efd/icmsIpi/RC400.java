package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 11:19:08
 * @author Thiago Balthazar
 */
public class RC400  extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C400"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal,
     * conforme a Tabela 4.1.1
     */
    public static final String ECF_MOD = "ECF_MOD";
    /*
     * Modelo do equipamento
     */
    public static final String ECF_FAB = "ECF_FAB";
    /*
     * Número de série de fabricação do ECF
     */
    public static final String ECF_CX = "ECF_CX";
    /*
     * Número do caixa atribuído ao ECF
     */

    public RC400() {
    
        setName("REGISTRO C400: EQUIPAMENTO ECF (CODIGO 02 e 2D)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C400"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ECF_MOD, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_CX, new FieldIntegerMaximumLengthArchetype(3));
    }
    
    

}
