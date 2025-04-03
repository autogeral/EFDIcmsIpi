package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 09:50:14
 * @author Thiago Balthazar
 */
public class RC165 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C165?
     */
    public static final String COD_PART = "COD_PART";
    /*
     * COdigo do participante (campo 02 do Registro 0150):
    - transportador, se houver
     */
    public static final String VEIC_ID = "VEIC_ID";
    /*
     * Placa de identificação do veOculo
     */
    public static final String COD_AUT = "COD_AUT";
    /*
     * COdigo da autorização fornecido pela SEFAZ (combustOveis)
     */
    public static final String NR_PASSE = "NR_PASSE";
    /*
     * Número do Passe Fiscal
     */
    public static final String HORA = "HORA";
    /*
     * Hora da saOda das mercadorias
     */
    public static final String TEMPER = "TEMPER";
    /*
     * Temperatura em graus Celsius utilizada para quantificação do volume de combustOvel
     */
    public static final String QTD_VOL = "QTD_VOL";
    /*
     * Quantidade de volumes transportados
     */
    public static final String PESO_BRT = "PESO_BRT";
    /*
     * Peso bruto dos volumes transportados (em Kg)
     */
    public static final String PESO_LIQ = "PESO_LIQ";
    /*
     * Peso lOquido dos volumes transportados (em Kg)
     */
    public static final String NOM_MOT = "NOM_MOT";
    /*
     * Nome do motorista
     */
    public static final String CPF = "CPF";
    /*
     * CPF do motorista
     */
    public static final String UF_ID = "UF_ID";
    /*
     * Sigla da UF da placa do veOculo
     */

    public RC165() {
    
        setName("REGISTRO C165: OPERAÇOES COM COMBUSTOVEIS (CODIGO 01).");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
              
       FormatWrapper fw1 = FormatFactory.getDecimalFormatWithPrecision(1);
       fw1.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal1 = new FieldDecimalMaximumLengthArchetype(15,1);
       decimal1.setFormat(fw1);       
           
      
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C165"));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(7));
        addFieldArchetype(COD_AUT, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(NR_PASSE, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(HORA , new FieldDateTimeFixedLengthArchetype("HHmmss"));
        addFieldArchetype(TEMPER, decimal1); 
        addFieldArchetype(QTD_VOL, new FieldIntegerMaximumLengthArchetype(30));
        addFieldArchetype(PESO_BRT, decimal);
        addFieldArchetype(PESO_LIQ, decimal);
        addFieldArchetype(NOM_MOT, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(CPF, new FieldIntegerFixedLengthArchetype(11));
        addFieldArchetype(UF_ID, new FieldStringMaximumLengthArchetype(2));
    }
 
}


