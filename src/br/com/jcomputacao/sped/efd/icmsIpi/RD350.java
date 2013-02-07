package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;

/**
 * 07/02/2013 11:40:08
 * @author Thiago Balthazar
 */
public class RD350 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D350"
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

    public RD350() {
   
        setName("REGISTRO D355: REDUÇÃO Z (CODIGOS 2E, 13, 14, 15 e 16)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D350"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ECF_MOD, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_CX, new FieldIntegerMaximumLengthArchetype(3));
    
    }
                    
}
