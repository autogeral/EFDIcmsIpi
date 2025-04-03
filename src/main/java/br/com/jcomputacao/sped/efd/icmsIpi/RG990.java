package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 13/02/2013 09:24:14
 * @author Thiago Balthazar
 */
public class RG990 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "G990"
     */
    
    public static final String QTD_LIN_G = "QTD_LIN_G";
    /*
     * Quantidade total de linhas do Bloco G
     */

    public RG990() {
    
        setName("REGISTRO G990: ENCERRAMENTO DO BLOCO G");
        setDelimiter("|");
    
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("G990"));
        addFieldArchetype(QTD_LIN_G, new FieldIntegerMaximumLengthArchetype(10));
    
    }
    
    
}