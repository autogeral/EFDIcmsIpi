package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 18/02/2013 17:07:41
 * @author Thiago Balthazar
 */
public class R1100 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo ?1100?
     */
    
    
    public static final String IND_DOC = "IND_DOC";
    /*
     * Informe o tipo de documento:
     0 ? Declaração de Exportação;
     1 - Declaração Simplificada de Exportação.
     */
    
    
    public static final String NRO_DE = "NRO_DE";
    /*
     * Número da declaração
     */
    
    
    public static final String DT_DE = "DT_DE";
    /*
     * Data da declaração (DDMMAAAA)
     */
    
    
    public static final String NAT_EXP = "NAT_EXP";
    /*
     * Preencher com:
      0 - Exportação Direta
      1 - Exportação Indireta 
     */
    
    
    public static final String NRO_RE = "NRO_RE";
    /*
     * Nº do registro de Exportação
     */
    
    
    
    public static final String DT_RE = "DT_RE";
    /*
     * Data do Registro de Exportação (DDMMAAAA)
     */
    
    
    
    public static final String CHC_EMB = "CHC_EMB";
    /*
     * Nº do conhecimento de embarque
     */
    
    
    
    public static final String DT_CHC = "DT_CHC";
    /*
     * Data do conhecimento de embarque (DDMMAAAA)
     */
    
    
    
    public static final String DT_AVB = "DT_AVB";
    /*
     * Data da averbação da Declaração de exportação (ddmmaaaa)
     */
    
    
    
    public static final String TP_CHC = "TP_CHC";
    /*
     * Informação do tipo de conhecimento de embarque:
    01 ? AWB;
    02 ? MAWB;
    03 ? HAWB;
    04 ? COMAT;
    06 ? R. EXPRESSAS;
    07 ? ETIQ. REXPRESSAS;
    08 ? HR. EXPRESSAS;
    09 ? AV7;
    10 ? BL;
    11 ? MBL;
    12 ? HBL;
    13 ? CRT;
    14 ? DSIC;
    16 ? COMAT BL;
    17 ? RWB;
    18 ? HRWB;
    19 ? TIF/DTA;
    20 ? CP2;
    91 ? NÂO IATA;
    92 ? MNAO IATA;
    93 ? HNAO IATA;
    99 ? OUTROS.
     */
    public static final String PAIS = "PAIS";
    /*
     * Código do país de destino da mercadoria 
     * (Preencher conforme tabela do SISCOMEX)
     */
    
    

    public R1100() {
   
        setName("REGISTRO 1100: REGISTRO DE INFORMACOES SOBRE EXPORTACAO");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1100"));
        addFieldArchetype(IND_DOC,  new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NRO_DE,   new FieldIntegerMaximumLengthArchetype(11));
        addFieldArchetype(DT_DE,    new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(NAT_EXP,  new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NRO_RE,   new FieldIntegerMaximumLengthArchetype(12));
        addFieldArchetype(DT_RE,    new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CHC_EMB,  new FieldStringMaximumLengthArchetype(18));
        addFieldArchetype(DT_CHC,   new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_AVB,   new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(TP_CHC,   new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(PAIS,     new FieldIntegerMaximumLengthArchetype(3));
    }
       
}
