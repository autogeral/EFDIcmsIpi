package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 14/02/2013 08:56:10
 * @author Vinicius Diana
 */
public class RG110 extends LineArchetype {
 /*
  *  1 - Texto fixo contendo "G110" 
  */
 public static final String REGISTRO = "REGISTRO";
 
 
 /*
  *  2 -  Data inicial a que a apuração se refere  
  */
 public static final String  DT_INI = " DT_INI ";
 
 /*
  *  3 -  Data final a que a apuração se refere   
  */
 public static final String  DT_FIN = " DT_FIN";
 
 /*
  *  4 -  Saldo inicial de ICMS do CIAP, composto por ICMS de bens que entraram anteriormente ao período de apuração (somatório dos campos 05 a 08 dos registros G125) 
    
  */
 public static final String  SALDO_IN_ICMS = " SALDO_IN_ICMS";
 
 
 /*
  *  5 -  Somatório das parcelas de ICMS passível de apropriação de cada bem (campo 10 do G125)   
    
  */
 public static final String  SOM_PARC = " SOM_PARC";
 
 /*
  *  6 -  Valor do somatório das saídas tributadas e saídas para exportação
  
  */
 public static final String  VL_TRIB_EXP = " VL_TRIB_EXP";
 
  /*
  *  7 -  Valor total de saídas
  
  */
 public static final String  VL_TOTAL  = " VL_TOTAL ";
 
 /*
  *  8 - Índice de participação do valor do somatório das saídas tributadas e saídas para exportação no valor total de saídas (Campo 06 dividido pelo campo 07)
 
  
  */
 public static final String IND_PER_SAI = "IND_PER_SAI";
 
 /*
  *  9 - Valor de ICMS a ser apropriado na apuração do ICMS, correspondente á multiplicação do campo 05 pelo campo 08. 

  */
 public static final String  ICMS_APROP = " ICMS_APROP";
 
 /*
  *  10 -  Valor de outros créditos a ser apropriado na Apuração do ICMS, correspondente ao somatório do campo 09 do registro G126.


  */
 public static final String SOM_ICMS_OC  = "SOM_ICMS_OC ";

    public RG110() {
        setName("REGISTRO G110 ICMS - ATIVO PERMANENTE - CIAP");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FormatWrapper fw1 = FormatFactory.getDecimalFormatWithPrecision(8);        
        fw1.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO,  new FieldDefaultArchetype("G110"));
        //2
        addFieldArchetype(DT_INI, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        //3
        addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //4
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(SALDO_IN_ICMS, f1);
        //5
         FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(SOM_PARC, f2);
        //6
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_TRIB_EXP, f3);
        //7
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_TOTAL, f4);
        //8
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(20,8);
        f5.setFormat(fw1);
        addFieldArchetype(IND_PER_SAI, f5);
        //9
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(ICMS_APROP, f6);
        //10
         FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(SOM_ICMS_OC, f7);
    }
 
 
 
}
