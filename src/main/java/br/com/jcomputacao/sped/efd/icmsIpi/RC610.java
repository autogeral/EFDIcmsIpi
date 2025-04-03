package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 14:35:03
 * @author Vinicius Diana
 */
public class RC610 extends LineArchetype {
 /*
  * 1 - Texto fixo contendo "C610"
  */
    public static final String REGISTRO = "REGISTRO";
    
    
    
    
    
  /*
  * 2 - Código de classificação do item de energia elétrica, conforme Tabela 4.4.1

  */  
   public static final String COD_CLASS = "COD_CLASS"; 
   
   
   
   
   
   
   /*
  *  3 - Código do item (campo 02 do Registro 0200)

  */ 
    public static final String  COD_ITEM = "COD_ITEM";
    
    
    
    
    
    
    
   /*
  * 4 - Quantidade acumulada do item

  */  
     public static final String  QTD = "QTD";
     
     
     
     
     
     
     
   /*
  * 5 - Unidade do item  (Campo 02 do registro 0190)

  */ 
      public static final String  UNID = " UNID";
      
      
      
      
      
      
   /*
  * 6 -  Valor acumulado do item 

  */  
       public static final String  VL_ITEM  = " VL_ITEM ";
       
       
       
       
       
       
   /*
  * 7 -  Valor acumulado dos descontos 

  */ 
        public static final String VL_DESC = "VL_DESC";
        
        
        
        
        
        
   /*
  * 8 -  Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1

  */ 
         public static final String CST_ICMS = "CST_ICMS";
         
         
         
         
         
         
         
   
   /*
  * 9 - Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2.


  */  
          public static final String CFOP = "CFOP";
          
          
          
          
          
          
          
   /*
  * 10 -Alíquota do ICMS

  */  
           public static final String  ALIQ_ICMS = " ALIQ_ICMS";
           
           
           
           
           
           
           
   /*
  * 11 -  Valor acumulado da base de cálculo do ICMS

  */  
            public static final String  VL_BC_ICMS = " VL_BC_ICMS";
            
            
            
            
            
            
            
   /*
  * 12 - Valor acumulado do ICMS debitado

  */  
             public static final String  VL_ICMS = " VL_ICMS";
             
             
             
             
             
             
   /*
  * 13 -  Valor da base de cálculo do ICMS substituição tributária


  */  
              public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
              
              
              
              
              
              
              
   /*
  * 14 -  Valor do ICMS retido por substituição tributária

  */  
               public static final String  VL_ICMS_ST  = " VL_ICMS_ST ";
               
               
               
               
               
               
               
   /*
  * 15 - Valor do PIS

  */  
                public static final String  VL_PIS = " VL_PIS";
                
                
                
                
                
                
   /*
  * 16 - Valor da COFINS

  */  
                 public static final String VL_COFINS = "VL_COFINS";
                 
                 
                 
                 
                 
                 
   /*
  * 17 - Código da conta analítica contábil debitada/creditada


  */  
    public static final String COD_CTA = "COD_CTA";
    
    
    
    
    
    

    public RC610() {
        setName("REGISTRO C601: DOCUMENTOS CANCELADOS - CONSOLIDACAO DIARIA DE NOTAS FISCAIS/CONTAS DE ENERGIA ELETRICA (CODIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'AGUA CANALIZADA (CODIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GAS (CODIGO 28) ");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
         FormatWrapper fw2 = FormatFactory.getDecimalFormatWithPrecision(3);        
        fw2.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C610"));
        //2
        addFieldArchetype(COD_CLASS, new FieldIntegerFixedLengthArchetype(4));
        //3
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //4
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,3);
        f1.setFormat(fw2);
        addFieldArchetype(QTD, f1);
        //5
       addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
       //6
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_ITEM, f2);
        //7
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_DESC, f3);
        //8
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        //9
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //10
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(6,2);
        f4.setFormat(fw);
        addFieldArchetype(ALIQ_ICMS, f4);
        //11
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS, f5);
        //12
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_ICMS, f6);
        //13
        FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_ST, f7);
        //14
         FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
        f8.setFormat(fw);
        addFieldArchetype(VL_ICMS_ST, f8);
        //15
          FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_PIS, f9);
        //16
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_COFINS, f10);
        //17
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
    }
    
    
  
   
    
}
