package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 10:07:56
 * @author Vinicius Diana
 */
public class RC510 extends LineArchetype {
    /**
     * 1 -  Texto fixo contendo "C510"
     */
    public static final String REGISTRO = "REGISTRO";
    
    /**
     * 2 -  Número sequencial do item no documento fiscal
     */
    public static final String NUM_ITEM = "NUM_ITEM";
     
    /**
     * 3 -   Código do item (campo 02 do Registro 0200)
     */
    public static final String  COD_ITEM = " COD_ITEM";
     
    /**
     * 4 -   Código de classificação do item de energia elétrica, conforme a Tabela 4.4.1
     */
    public static final String  COD_CLASS  = " COD_CLASS ";
      
    /**
     * 5 -  Quantidade do item 
     */
    public static final String  QTD = " QTD";
       
    /**
     * 6 -   Unidade do item (Campo 02 do registro 0190) 
     */
    public static final String  UNID  = " UNID ";
       
    /**
     * 7 -  Valor do item 
     */
    public static final String  VL_ITEM  = "VL_ITEM "; 
       
    /**
     * 8 -  Valor total do desconto
     */
    public static final String  VL_DESC = " VL_DESC";
         
    /**
     * 9 -  Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1
     */
    public static final String  CST_ICMS  = " CST_ICMS ";
          
    /**
     * 10 -  Código Fiscal de Operação e Prestação 
     */
    public static final String CFOP = "CFOP";
           
    /**
     * 11 -  Valor da base de cálculo do ICMS 
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
            
    /**
     * 12 -  Alíquota do ICMS
     */
    public static final String  ALIQ_ICMS = " ALIQ_ICMS";
             
    /**
     * 13 -  Valor do ICMS creditado/debitado
     */
    public static final String  VL_ICMS = " VL_ICMS";
              
    /**
     * 14 -  Valor da base de cálculo referente à substituição tributária
     */
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
               
    /**
     * 15 -  Alíquota do ICMS da substituição tributária na unidade da federação de destino
     */
    public static final String ALIQ_ST = "ALIQ_ST";
                
    /**
     * 16 -  Valor do ICMS referente à substituição tributária
     */
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
                 
    /**
     * 17 -  Indicador do tipo de receita: 0- Receita própria; 1- Receita de terceiros
     */
    public static final String  IND_REC  = " IND_REC "; 
                  
    /**
     * 18 -  Texto fixo contendo "C510"
     */
    public static final String  COD_PART = " COD_PART";
                   
    /**
     * 19 - Valor do PIS
     */
    public static final String  VL_PIS  = " VL_PIS ";
    
    /*
     * 20 - Valor da COFINS
     */           
    public static final String  VL_COFINS = " VL_COFINS";   
       
     /*
     * 21 - Código da conta analítica contábil debitada/creditada
     */   
    public static final String   COD_CTA  = " COD_CTA ";
    
    public RC510() {
        setName(" REGISTRO C510: ITENS DO DOCUMENTO NOTA FISCAL/CONTA ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS (CÓDIGO 28). ");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FormatWrapper fw1 = FormatFactory.getDecimalFormatWithPrecision(3);        
        fw1.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C510"));
        //2
        addFieldArchetype(NUM_ITEM, new FieldIntegerFixedLengthArchetype(3));
        //3
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //4
        addFieldArchetype(COD_CLASS, new FieldIntegerFixedLengthArchetype(4));
        //5
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,3);
        f1.setFormat(fw1);
        addFieldArchetype(QTD, f1);
        //6
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        //7
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_ITEM, f2);
        //8
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_DESC, f3);
        //9
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        //10
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //11
         FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS, f4);
        //12
          FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(6,2);
        f5.setFormat(fw);
        addFieldArchetype(ALIQ_ICMS, f5);
        //13
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_ICMS, f6);
        //14
         FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_ST, f7);
        //15
         FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(6,2);
        f8.setFormat(fw);
        addFieldArchetype(ALIQ_ST, f8);
        //16
          FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_ICMS_ST, f9);
        //17
        addFieldArchetype(IND_REC, new FieldStringFixedLengthArchetype(1));
        //18
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //19
         FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_PIS, f10);
        //20
         FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_COFINS, f11);
        //21
       addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
    }
}
