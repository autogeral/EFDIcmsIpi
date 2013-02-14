package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 14/02/2013 10:34:19
 * @author Vinicius Diana
 */
public class RG126 extends LineArchetype {
    /*
     * 1 - Texto fixo contendo "G126" 
     */
    public static final String REGISTRO = "REGISTRO";
    
    /*
     * 2 -  Data inicial do per�odo de apura��o 
     */
   public static final String  DT_INI  = " DT_INI ";
   
   /*
    * 3 - Data final do per�odo de apura��o
    */
   public static final String  DT_FIM = " DT_FIM";
   
   /*
    * 4 - N�mero da parcela do ICMS 
    */
   public static final String  NUM_PARC = " NUM_PARC";
   
   /*
    * 5 -  Valor da parcela de ICMS pass�vel de apropria��o  - antes da aplica��o da participa��o percentual do valor das sa�das tributadas/exporta��o sobre as sa�das totais 

    */
   public static final String  VL_PARC_PASS = " VL_PARC_PASS";
   
   /*
    * 6 - Valor do somat�rio das sa�das tributadas e sa�das para exporta��o no per�odo indicado neste registro

    */
   public static final String  VL_TRIB_OC = " VL_TRIB_OC";
   
   /*
    *  7 -  Valor total de sa�das no per�odo indicado neste registro 
    */
   public static final String VL_TOTAL = "VL_TOTAL";
   
   /*
    *  8 -  �ndice de participa��o do valor do somat�rio das sa�das tributadas e sa�das para exporta��o no valor total de sa�das (Campo 06 dividido pelo campo 07)

    */
   public static final String IND_PER_SAI  = "IND_PER_SAI ";
   
    /*
    *  9 - Valor de outros cr�ditos de ICMS a ser apropriado na apura��o (campo 05 vezes o campo 08) 

    */
   public static final String  VL_PARC_APROP = " VL_PARC_APROP";

    public RG126() {
        setName("REGISTRO 126 - OUTRO CREDITOS CIAP");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FormatWrapper fw1 = FormatFactory.getDecimalFormatWithPrecision(8);        
        fw1.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("G126") );
        //2
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //3
        addFieldArchetype(DT_FIM, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //4
        addFieldArchetype(NUM_PARC, new FieldIntegerMaximumLengthArchetype(3));
        //5
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_PARC_PASS, f1);
        //6
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_TRIB_OC, f2);
        //7
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_TOTAL, f3);
        //8
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw1);
        addFieldArchetype(IND_PER_SAI, f4);
        //9
         FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_PARC_APROP, f5);
        
    }
   
   
  
}
