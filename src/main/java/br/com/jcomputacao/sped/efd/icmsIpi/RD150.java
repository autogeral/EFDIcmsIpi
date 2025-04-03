package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 05/02/2013 14:59:54
 * @author Thiago Balthazar
 */
public class RD150 extends LineArchetype {
    
     public static final String REGISTRO     = "REG";
     /*
      * Texto fixo contendo "D150"
      */
     public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
     /*
      Código do município de origem do serviço,conforme a tabela IBGE
      * (Preencher com 9999999, se Exterior)
      */
     public static final String COD_MUN_DEST = "COD_MUN_DEST";
     /*
      Código do município de origem do serviço,conforme a tabela IBGE
      * (Preencher com 9999999, se Exterior)
      */
     public static final String VEIC_ID      = "VEIC_ID";
     /*
      * Identificação da aeronave (DAC)
      */
     public static final String VIAGEM       = "VIAGEM";
     /*
      * Número do vôo.
      */
     public static final String IND_TFA      = "IND_TFA";
     /*
      *Indicador do tipo de tarifa aplicada:
        0- Exp.;
        1- Enc.;
        2- C.I.;
        9- Outra 
      */
     public static final String VL_PESO_TX   = "VL_PESO_TX";
     /*
      * Peso taxado
      */
     public static final String VL_TX_TERR   = "VL_TX_TERR";
     /*
      * Valor da taxa terrestre
      */
     public static final String VL_TX_RED    = "VL_TX_RED";
     /*
      * Valor da taxa de redespacho
      */
     public static final String VL_OUT       = "VL_OUT";
     /*
      * Outros valores
      */
     public static final String VL_TX_ADV    = "VL_TX_ADV";    
     /*
      * Valor da taxa "ad valorem"
      */

    public RD150() {
    setName("REGISTRO D150: COMPLEMENTO DO CONHECIMENTO AEREO (CODIGO 10).");
    setDelimiter("|");
    
     FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
     fw.setReplaceComa(false);
    
     FieldDecimalMaximumLengthArchetype cod = new FieldDecimalMaximumLengthArchetype(15,2);
     cod.setFormat(fw);
    
    addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D150"));
    addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
    addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
    addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(255));
    addFieldArchetype(VIAGEM, new FieldIntegerMaximumLengthArchetype(14));
    addFieldArchetype(IND_TFA, new FieldStringFixedLengthArchetype(1));
    addFieldArchetype(VL_PESO_TX, cod);
    addFieldArchetype(VL_TX_TERR, cod);
    addFieldArchetype(VL_TX_RED, cod);
    addFieldArchetype(VL_OUT, cod);
    addFieldArchetype(VL_TX_ADV, cod);
        
    }
}
