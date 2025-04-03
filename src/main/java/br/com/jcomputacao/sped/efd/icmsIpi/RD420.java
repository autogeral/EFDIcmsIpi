package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;
/**
 * 11/02/2013 09:05:55
 * @author Thiago Balthazar
 */
public class RD420 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D420"
     */
    public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
    /*
     * Código do município de origem do serviço, conforme a tabela IBGE
     */
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor total da prestação de serviço
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor total da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor total do ICMS
     */

    public RD420() {
    
       setName("REGISTRO D420: COMPLEMENTO DOS DOCUMENTOS INFORMADOS (CODIGO 13,14, 15 e 16)");
       setDelimiter("|");
            
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
      addFieldArchetype(REGISTRO, new FieldDefaultArchetype("R420"));
      addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
      addFieldArchetype(VL_SERV, decimal);
      addFieldArchetype(VL_BC_ICMS, decimal);
      addFieldArchetype(VL_ICMS, decimal);
    
    }
    
    
}
