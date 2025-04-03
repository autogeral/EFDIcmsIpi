package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;


/**
 * 06/02/2013 09:53:24
 * @author Thiago Balthazar
 */
public class RD170 extends LineArchetype {

    public static final String REGISTRO  = "REG";
    /*
     * Texto fixo contendo "D170"
     */
    public static final String COD_PART_CONSG = "COD_PART_CONSG"; 
    /*
     * Código do participante (campo 02 do Registro0150):
        - consignatário, se houver
     */
    public static final String COD_PART_RED   = "COD_PART_RED";
    /*
     * Código do participante (campo 02 do Registro 0150):
        - redespachante, se houver
     */
    public static final String COD_MUN_ORIG   = "COD_MUN_ORIG";
    /*
     * Código do município de origem do serviço,conforme a tabela IBGE
     * (Preencher com 9999999,se Exterior)
     */
    public static final String COD_MUN_DEST  = "COD_MUN_DEST";
    /*
     * Código do município de destino, conforme a tabela IBGE
     (Preencher com 9999999, se Exterior)
     */
    public static final String OTM = "OTM";
    /*
     * Registro do operador de transporte multimodal
     */
    public static final String IND_NAT_FRT  = "IND_NAT_FRT";
    /*
     * Indicador da natureza do frete:
        0- Negociável;
        1- Não negociável
     */
    public static final String VL_LIQ_FRT  = "VL_LIQ_FRT";
    /*
     * Valor líquido do frete
     */
    public static final String VL_GRIS  = "VL_GRIS";
    /*
     * Valor do gris (gerenciamento de risco)
     */
    public static final String VL_PDG  = "VL_PDG";
    /*
     * Somatório dos valores de pedágio
     */
    public static final String VL_OUT = "VL_OUT";
    /*
     * Outros valores
     */
    public static final String VL_FRT  = "VL_FRT";
    /*
     * Valor total do frete
     */
    public static final String VEIC_ID = "VEIC_ID";     
    /*
     * Placa de identificação do veículo
     */
    public static final String UF_ID = "UF_ID";
    /*
     * Sigla da UF da placa do veículo
    */

    public RD170() {
    setName("REGISTRO D170: COMPLEMENTO DO CONHECIMENTO MULTIMODAL DE CARGAS (CODIGO 26).");
    setDelimiter("|");
    
    FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
    fw.setReplaceComa(false);
    
    FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
    decimal.setFormat(fw);
    
    addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D170"));
    addFieldArchetype(COD_PART_CONSG, new FieldStringMaximumLengthArchetype(60));
    addFieldArchetype(COD_PART_RED, new FieldStringMaximumLengthArchetype(60));
    addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
    addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
    addFieldArchetype(OTM, new FieldStringMaximumLengthArchetype(255));
    addFieldArchetype(IND_NAT_FRT, new FieldStringFixedLengthArchetype(1));
    addFieldArchetype(VL_LIQ_FRT, decimal);
    addFieldArchetype(VL_GRIS, decimal);
    addFieldArchetype(VL_PDG, decimal);
    addFieldArchetype(VL_OUT, decimal);
    addFieldArchetype(VL_FRT, decimal);
    addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(7));
    addFieldArchetype(UF_ID, new FieldStringMaximumLengthArchetype(02));
    
    }
     
    
                            
                            
    
}
