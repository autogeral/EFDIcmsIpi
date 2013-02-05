package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 05/02/2013 13:45:50
 *
 * @author Thiago Balthazar
 */
public class RD140 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D140"
     */
    public static final String COD_PART_CONSG = "COD_PART_CONSG";
    /*
     * @see br.com.jcomputacao.sped.efd.icmsIpi.R0150
     */
    public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
    /*
     * Código do município de origem do serviço,conforme a tabela IBGE
     * (Preencher com9999999, se Exterior)
     */
    public static final String COD_MUN_DEST = "COD_MUN_DEST";
    /*
     * Código do município de origem do serviço,conforme a tabela IBGE
     * (Preencher com9999999, se Exterior)
     */
    public static final String IND_VEIC = "IND_VEIC";
    /*
     * Indicador do tipo do veículo transportador: 0- Embarcação; 1-
     * Empurrador/rebocador
     */
    public static final String VEIC_ID = "VEIC_ID";
    /*
     * Identificação da embarcação (IRIM ou Registro CPP)
     */
    public static final String IND_NAV = "IND_NAV";
    /*
     * Indicador do tipo da navegação: 0- Interior; 1- Cabotagem
     */
    public static final String VIAGEM = "VIAGEM";
    /*
     * Número da viagem
     */
    public static final String VL_FRT_LIQ = "VL_FRT_LIQ";
    /*
     * Valor líquido do frete
     */
    public static final String VL_DESP_PORT = "VL_DESP_PORT";
    /*
     * Valor das despesas portuárias
     */
    public static final String VL_DESP_CAR_DESC = "VL_DESP_CAR_DESC";
    /*
     * Valor das despesas com carga e descarga
     */
    public static final String VL_OUT = "VL_OUT";
    /*
     * Outros Valores
     */
    public static final String VL_FRT_BRT = "VL_FRT_BRT";
    /*
     * Valor bruto do frete
     */
    public static final String VL_FRT_MM = "VL_FRT_MM";
    /*
     * Valor adicional do frete para renovação da Marinha Mercante
     */
    
    public RD140() {
        
        setName("REGISTRO D140: COMPLEMENTO DO CONHECIMENTO AQUAVIARIO DE CARGAS (CODIGO 09).");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype num = new FieldDecimalMaximumLengthArchetype(15,2);
        num.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D140"));
        addFieldArchetype(COD_PART_CONSG , new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MUN_ORIG ,new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(IND_VEIC, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VEIC_ID , new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(IND_NAV, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(VIAGEM, new FieldIntegerMaximumLengthArchetype(20));
        addFieldArchetype(VL_FRT_LIQ, num);
        addFieldArchetype(VL_DESP_PORT, num);
        addFieldArchetype(VL_DESP_CAR_DESC, num);
        addFieldArchetype(VL_OUT, num);
        addFieldArchetype(VL_FRT_BRT, num);
        addFieldArchetype(VL_FRT_MM, num);
    
    }
    
}
