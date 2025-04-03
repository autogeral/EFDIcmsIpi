package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 10:10:54
 * @author Thiago Balthazar
 */
public class RC177 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C177"
     */
    public static final String COD_SELO_IPI = "COD_SELO_IPI";
    /*
     * Código do selo de controle do IPI, conforme Tabela 4.5.2
     */
    public static final String QT_SELO_IPI = "QT_SELO_IPI";
    /*
     * Quantidade de selo de controle do IPI aplicada
     */

    public RC177() {
    
        setName("REGISTRO C177: OPERACOES COM PRODUTOS SUJEITOS A SELO DE CONTROLE IPI");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C177"));
        addFieldArchetype(COD_SELO_IPI, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(QT_SELO_IPI, new FieldIntegerMaximumLengthArchetype(12));
    }

    
    
}
