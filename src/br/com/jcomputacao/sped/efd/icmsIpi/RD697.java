package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;


/**
 * 13/02/2013 08:18:57
 * @author Thiago Balthazar
 */
public class RD697 extends LineArchetype{
    
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D697"
     */
    public static final String UF = "UF";
    /*
     * Sigla da unidade da federação
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor do ICMS
     */

    public RD697() {
    
        setName("REGISTRO D697: REGISTRO DE INFORMACOES DE OUTRAS UFs, RELATIVAMENTE AOS SERVICOS ?NAO-MEDIDOS? DE TELEVISAO POR ASSINATURA VIA SATELITE");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D697"));
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
    
    
    }
    
    
    

}
