package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 12:27:15
 * @author Thiago Balthazar
 */
public class R1391  extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1391"
     */
    
    
    
    public static final String DT_REGISTRO = "DT_REGISTRO";
    /*
     * Data de produção (DDMMAAAA)
     */
    
    
    
    public static final String QTD_MOID = "QTD_MOID";
    /*
     * Quantidade de cana esmagada (toneladas)
     */
    
    
    
    public static final String ESTQ_INI = "ESTQ_INI";
    /*
     * Estoque inicial (litros / Kg)
     */
    
    
    
    public static final String QTD_PRODUZ = "QTD_PRODUZ";
    /*
     * Quantidade produzida (litros / Kg)
     */
    
    
    
    public static final String ENT_ANID_HID = "ENT_ANID_HID"; 
    /*
     * Entrada de álcool anidro decorrente da transformação do
        álcool hidratado ou
        Entrada de álcool hidratado decorrente da transformação do
        álcool anidro (litros)
     */
    
    
    
    public static final String OUTR_ENTR = "OUTR_ENTR";
    /*
     * Outras entradas (litros / Kg)
     */
    
    
    
    public static final String PERDA = "PERDA";
    /*
     * Evaporação (litros) ou Quebra de peso (Kg)
     */
    
    
    
    public static final String CONS = "CONS";
    /*
     * Consumo (litros)
     */
    
    
    
    public static final String SAI_ANI_HID = "SAI_ANI_HID";
    /*
     * Saída para transformação (litros).
     */
    
    
    
    public static final String SAIDAS = "SAIDAS";
    /*
     * SAIDAS (litros / Kg)
     */
    
    
    
    public static final String ESTQ_FIN = "ESTQ_FIN";
    /*
     * Estoque final (litros / Kg)
     */
    
    
    
    public static final String ESTQ_INI_MEL = "ESTQ_INI_MEL";
    /*
     * Estoque inicial de mel residual (Kg)
     */
    
    
    
    public static final String PROD_DIA_MEL = "PROD_DIA_MEL";
    /*
     * Produção de mel residual (Kg) e entradas de mel (Kg)
     */
    
    
    
    public static final String UTIL_MEL = "UTIL_MEL";
    /*
     * Mel residual utilizado (Kg) e SAIDAS de mel (Kg)
     */
    
    
    
    public static final String PROD_ALC_MEL = "PROD_ALC_MEL";
    /*
     * Produção de álcool (litros) ou açúcar (Kg) 
     * proveniente do mel residual.
     */
    
    
    
    public static final String OBS = "OBS";
    /*
     * Observações
     */
    
               
    
    public R1391() {
    
        setName("REGISTRO 1391: PRODUCAO DIARIA DA USINA");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1391"));
        addFieldArchetype(DT_REGISTRO,  new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(QTD_MOID,     decimal);
        addFieldArchetype(ESTQ_INI,     decimal);
        addFieldArchetype(QTD_PRODUZ,   decimal);
        addFieldArchetype(ENT_ANID_HID, decimal);
        addFieldArchetype(OUTR_ENTR,    decimal);
        addFieldArchetype(PERDA,        decimal);
        addFieldArchetype(CONS,         decimal);
        addFieldArchetype(SAI_ANI_HID,  decimal);
        addFieldArchetype(SAIDAS,       decimal);
        addFieldArchetype(ESTQ_FIN,     decimal);
        addFieldArchetype(ESTQ_INI_MEL, decimal);
        addFieldArchetype(PROD_DIA_MEL, decimal);
        addFieldArchetype(UTIL_MEL,     decimal);
        addFieldArchetype(PROD_ALC_MEL, decimal);
        addFieldArchetype(OBS,          new FieldStringMaximumLengthArchetype(255));
    }
    

}
