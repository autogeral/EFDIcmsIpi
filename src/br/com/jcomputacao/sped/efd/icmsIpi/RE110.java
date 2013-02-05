package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/02/2013 12:30:49
 * @author Vinicius Diana
 */
public class RE110 extends LineArchetype {
    
     /*
      * 1 - Texto fixo contendo "E110"
      */
     public static final String REGISTRO = "REG";
     
     
    /*
      * 2 - Valor total dos débitos por "Saídas e prestações com débito do imposto" 

      */ 
     public static final String VL_TOT_DEBITOS = "VL_TOT_DEBITOS";
     
     
     
     /*
      * 3 - Valor total dos ajustes a débito decorrentes do documento fiscal.


      */ 
      public static final String VL_AJ_DEBITOS = "VL_AJ_DEBITOS";
      
      
    /*
      * 4 -  Valor total de "Ajustes a débito" 

      */ 
    public static final String VL_TOT_AJ_DEBITOS = "VL_TOT_AJ_DEBITOS";
    
  
          /*
      *  5 -Valor total de Ajustes ?Estornos de créditos? " 

      */ 
  public static final String VL_ESTORNOS_CRED = "VL_ESTORNOS_CRED";
      
  
  /*
      * 6 - Valor total dos créditos por "Entradas e aquisições com crédito do imposto" 
 

      */ 
  public static final String VL_TOT_CREDITOS = "VL_TOT_CREDITOS";
  
  
  
  /*
      * 7 - Valor total dos ajustes a crédito decorrentes do documento fiscal." 
 

      */ 
  public static final String VL_AJ_CREDITOS = "VL_AJ_CREDITOS";
      
    
   /*
      * 8 -  Valor total de "Ajustes a crédito" " 
 

      */ 
    public static final String VL_TOT_AJ_CREDITOS = "VL_TOT_AJ_CREDITOS";
    
    
    /*
          * 9 -  Valor total de Ajustes ?Estornos de Débitos?  " 

 
      */ 
  public static final String VL_ESTORNOS_DEB = "VL_ESTORNOS_DEB";

  
  
    /*
          * 10 - Valor total de "Saldo credor do período anterior"
?  " 

 
      */
     public static final String  VL_SLD_CREDOR_ANT= "VL_SLD_CREDOR_ANT";
    
     
     
     
       /*
          * 11 - Valor total de "Saldo credor do período anterior
      */
    public static final String VL_SLD_APURADO = "VL_SLD_APURADO";
    
    
    
    /*
     * 12 - Valor total de "Deduções"
    */ 
    public static final String VL_TOT_DED = "VL_TOT_DED";
    
     /*
     * 13 - Valor total de "ICMS a recolher (11-12)
    */ 
     public static final String  VL_ICMS_RECOLHER   = " VL_ICMS_RECOLHER ";
    
    /*
     * 14 - Valor total de "Saldo credor a transportar para o período seguinte

    */ 
    public static final String  VL_SLD_CREDOR_TRANSPORTAR  = " VL_SLD_CREDOR_TRANSPORTAR ";
    
    
     /*
     * 15 - Valores recolhidos ou a recolher, extra- apuração
    */ 
    
      public static final String  DEB_ESP  = " DEB_ESP ";
      
      
       public RE110() {
        setName("Registro E110- Apuracao do icms - operacoes proprias");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("E110"));
        //02
        FieldDecimalMaximumLengthArchetype f02 = new FieldDecimalMaximumLengthArchetype(15,2);
        f02.setFormat(fw);
        addFieldArchetype(VL_TOT_DEBITOS, f02);
        // 03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_AJ_DEBITOS, f03);
        // 04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        addFieldArchetype(VL_TOT_AJ_DEBITOS, f04);
        // 05
         FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        addFieldArchetype(VL_ESTORNOS_CRED, f05);
        // 06
         FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(VL_TOT_CREDITOS, f06);
        // 07
         FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        addFieldArchetype(VL_AJ_CREDITOS, f07);
        // 08
         FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        addFieldArchetype(VL_TOT_AJ_CREDITOS, f08);
         // 09
         FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_ESTORNOS_DEB, f09);
        // 10
         FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_SLD_CREDOR_ANT, f10);
         // 11
         FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_SLD_APURADO, f11);
        // 12
          FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_TOT_DED, f12);
        // 13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        addFieldArchetype(VL_ICMS_RECOLHER, f13);
        // 14 
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        addFieldArchetype(VL_SLD_CREDOR_TRANSPORTAR, f14);
        // 15
         FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        addFieldArchetype(DEB_ESP, f15);
        
        
        
     
//        addFieldArchetype(DESCR_ITEM,   new FieldStringMaximumLengthArchetype(255));
//        addFieldArchetype(COD_BARRA,    new FieldStringMaximumLengthArchetype(128));
//        addFieldArchetype(COD_ANT_ITEM, new FieldStringMaximumLengthArchetype(60));
//        addFieldArchetype(UNID_INV,     new FieldStringMaximumLengthArchetype(6));
//        addFieldArchetype(TIPO_ITEM,    new FieldIntegerFixedLengthArchetype(2));
//        addFieldArchetype(COD_NCM,      new FieldStringFixedLengthArchetype(8));
//        addFieldArchetype(EX_IPI,       new FieldStringMaximumLengthArchetype(3));
//        addFieldArchetype(COD_GEN,      new FieldIntegerFixedLengthArchetype(2));
//        addFieldArchetype(ALIQ_ICMS,    new FieldDecimalMaximumLengthArchetype(6, 2));
    }
 
    

}
