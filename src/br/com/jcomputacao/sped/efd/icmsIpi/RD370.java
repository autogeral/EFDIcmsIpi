package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/02/2013 09:08:49
 * @author Thiago Balthazar
 */
public class RD370 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D370"
     */
    public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
    /*
     * Código do município de origem do serviço,conforme a tabela IBGE
     */
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor total da prestação de serviço
     */
    public static final String QTD_BILH = "QTD_BILH";
    /*
     * Quantidade de bilhetes emitidos
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor total da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor total do ICMS
     */

    public RD370() {
        
        setName("REGISTRO D370: COMPLEMENTO DOS DOCUMENTOS INFORMADOS (CODIGOS 13,14, 15 e 16 e 2E)");
        setDelimiter("|");
       
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
                
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D370"));
        addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(VL_SERV, decimal);
        addFieldArchetype(QTD_BILH, new FieldIntegerMaximumLengthArchetype(30));
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
           
    }
    
    
}
