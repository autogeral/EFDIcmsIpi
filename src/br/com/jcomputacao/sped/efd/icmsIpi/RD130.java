package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 05/02/2013 10:26:37
 * @author Thiago Balthazar
 */
public class RD130 extends LineArchetype  {

    
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D130"
     */
    public static final String COD_PART_CONSG = "COD_PART_CONSG";
    /**
      <ul>
       <li>  C�digo de identifica��o do participante no arquivo. </li>
      <li>   (campo 02 do Registro 0150):</li>
       <li>  - consignat�rio, se houver</li>
       </ul>
    */
    
    public static final String COD_PART_RED = "COD_PART_RED";
  /*
     * C�digo de identifica��o do participante no arquivo.
     * (campo 02 do Registro 0150):
     * - consignat�rio, se houver
  */
    
    public static final String IND_FRT_RED = "IND_FRT_RED";
    /*
     * Indicador do tipo do frete da opera��o de
        redespacho:
        0 ? Sem redespacho;
        1 - Por conta do emitente;
        2 - Por conta do destinat�rio;
        9 ? Outros.
     */
    
    public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
    /*
        C�digo do munic�pio de origem do servi�o,
        conforme a tabela IBGE(Preencher com 9999999,
        se Exterior)
        Tabela disponivel em http://www.rais.gov.br/mun_sp.asp
     */
    
    public static final String COD_MUN_DEST     = "COD_MUN_DEST";
      /*
       C�digo do munic�pio de destino, conforme a
       tabela IBGE(Preencher com 9999999, se Exterior)
       Tabela disponivel em http://www.rais.gov.br/mun_sp.asp 
     */
    
    public static final String VEIC_ID = "VEIC_ID";
    /*
     Placa de identifica��o do ve�culo      
     */
    
    public static final String VL_LIQ_FRT = "VL_LIQ_FRT";
    /*
      Valor l�quido do frete
     */
        
    public static final String VL_SEC_CAT = "VL_SEC_CAT";
    /*
     Soma de valores de Sec/Cat (servi�os de coleta/custo adicional de transporte) 
     */
    
    public static final String VL_DESP = "VL_DESP";
    /*
      Soma de valores de despacho
     */
    
    public static final String VL_PEDG = "VL_PEDG";
    /*
      Soma dos valores de ped�gio
     */
    
    public static final String VL_OUT = "VL_OUT";
    /*
     Outros valores
     */
    
    public static final String VL_FRT = "VL_FRT";
    /*
     Valor total do frete
    */
    
    public static final String UF_ID = "UF_ID";
    /*
     Sigla da UF da placa do ve�culo
     */

    public RD130() {
    
        setName("REGISTRO D130: COMPLEMENTO DO CONHECIMENTO RODOVIARIO DE CARGAS (CODIGO 08) E DO CONHECIMENTO RODOVIARIO DE CARGAS AVULSO (CODIGO 8B).");
        setDelimiter("|");
         
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D130"));
        addFieldArchetype(COD_PART_CONSG, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_PART_RED, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(IND_FRT_RED, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(7));
        addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(7));
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype casasDecimais = new FieldDecimalMaximumLengthArchetype(15,2);
        casasDecimais.setFormat(fw);//Usando variavel casasDecimais para Para Valores em R$ 
        
        addFieldArchetype(VL_LIQ_FRT, casasDecimais);
        addFieldArchetype(VL_SEC_CAT, casasDecimais);
        addFieldArchetype(VL_DESP, casasDecimais);
        addFieldArchetype(VL_PEDG, casasDecimais);
        addFieldArchetype(VL_OUT, casasDecimais);
        addFieldArchetype(VL_FRT, casasDecimais);
        
        addFieldArchetype(UF_ID, new FieldStringMaximumLengthArchetype(2));
        
    }
    
    
    
}
