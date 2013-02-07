package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/02/2013 08:15:01
 * @author Thiago Balthazar
 */
public class RD161 extends LineArchetype {

    public static final String REGISTRO      = "REG";
    /*
     * Texto fixo contendo "D161"
     */
    public static final String IND_CARGA     = "IND_CARGA";
    /*
      Indicador do tipo de transporte da carga
        coletada:
        0-Rodoviário
        1-Ferroviário
        2-Rodo-Ferroviário
        3-Aquaviário
        4-Dutoviário
        5-Aéreo
        9-Outros
     */
    
    public static final String CNPJ_CPF_COL  = "CNPJ_CPF_COL";
    /*
     * Número do CNPJ ou CPF do local da coleta
     */
    public static final String IE_COL        = "IE_COL";
    /*
     *Inscrição Estadual do contribuinte do local de coleta 
     */
    public static final String COD_MUN_COL   = "COD_MUN_COL";        
    /*
     * Código do Município do local de coleta,conforme tabela IBGE
     * (Preencher com 9999999, se Exterior)
     */
    public static final String CNPJ_CPF_ENTG = "CNPJ_CPF_ENTG"; 
    /*
     * Número do CNPJ ou CPF do local da entrega
     */
    public static final String IE_ENTG       = "IE_ENTG";
    /*
     * Inscrição Estadual do contribuinte do local de entrega
     */
    public static final String COD_MUN_ENTG  = "COD_MUN_ENTG";
    /*
      Código do Município do local de entrega,conforme tabela IBGE
      (Preencher com 9999999, se Exterior)
     */

    public RD161() {
        setName("REGISTRO D161: LOCAL DA COLETA E ENTREGA (CODIGO 08, 8B, 09, 10, 11 e 26).");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D161"));
        addFieldArchetype(IND_CARGA, new FieldIntegerMaximumLengthArchetype(1));
        addFieldArchetype(CNPJ_CPF_COL, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(IE_COL , new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(COD_MUN_COL, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(CNPJ_CPF_ENTG, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(IE_ENTG, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(COD_MUN_ENTG, new FieldIntegerFixedLengthArchetype(7));
                
    }
    
}
