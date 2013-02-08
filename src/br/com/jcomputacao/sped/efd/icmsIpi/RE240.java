package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/02/2013 09:27:14
 * @author Vinicius Diana
 */
public class RE240 extends LineArchetype {
    
     /*
      * 1 -  Texto fixo contendo "E240"
      */
    public static final String REGISTRO = "REG";
    
    /*
      * 2 -   Código do participante (campo 02 do Registro 0150):
      * - do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas
      */
  public static final String  COD_PART = " COD_PART";
  
  
    /*
      * 3 -   Código do participante (campo 02 do Registro 0150): - 
      * do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas

      */
  public static final String COD_MOD = "COD_MOD";
  
  
   /*
      * 4 -   Série do documento fiscal  

      */
  public static final String SER = "SER";
  
  
  /*
      * 5 -    Subsérie do documento fiscal 

      */
  public static  final String SUB = "SUB";
  
  /*
      * 6 - Número do documento fiscal 

      */
  public static final String  NUM_DOC  = " NUM_DOC ";
  
  
  /*
      * 7 -  Data da emissão do documento fiscal 

      */
  public static final String  DT_DOC = " DT_DOC";
  
   /*
      * 8 -   Código do item (campo 02 do Registro 0200)

      */
  public static final String  COD_ITEM = "COD_ITEM";
  
  /*
      * 9 -  Valor do ajuste para a operação/item

      */
  public static final String  VL_AJ_ITEM = "VL_AJ_ITEM";
  
  public RE240(){
      setName("Informacoes adicionais dos ajustes da apuracao do icms substituicao tributaria - identificacao dos documentos fiscais");
      setDelimiter("|");
      //1
      addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E240"));
      //2
      addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
      //3
      addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
      //4
      addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
      //5
      addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
      //6
      addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
      //7
      addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
      //8
      addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
      //9
      FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
         FieldDecimalMaximumLengthArchetype f02 = new FieldDecimalMaximumLengthArchetype(15,2);
        f02.setFormat(fw);
        addFieldArchetype(VL_AJ_ITEM, f02);
      
      
  }
  
  
  
  
  
}
