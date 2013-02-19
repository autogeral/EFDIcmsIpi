package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 11:31:09
 * @author Vinicius Diana
 */
public class RC500 extends LineArchetype {
    /*
     * 1 -  Texto fixo contendo "C500" 
     */
 public static  final String REGISTRO = "REGISTRO";
 
 
 
 
 
 /*
  * 2 -  Indicador do tipo de opera��o: 0- Entrada; 1- Sa�da
  */
 public static final String IND_OPER = "IND_OPER";
 
 
 
 
 
 /*
  * 3 -  Indicador do emitente do documento fiscal: 0- Emiss�o pr�pria; 1- Terceiros

  */
 public static  final String  IND_EMIT = " IND_EMIT";
 
 
 
 
 
 /*
  * 4 -   C�digo do participante (campo 02 do Registro 0150): - do adquirente, no caso das sa�das; - do fornecedor no caso de entradas 

  */
 public  static final  String COD_PART = " COD_PART";
 
 
 
 
 
 
  /*
  * 5 -   C�digo do modelo do documento fiscal, conforme a Tabela 4.1.1

  */
 public static final String  COD_MOD = " COD_MOD";
 
 
 
 
 
 /*
  * 6 -  C�digo da situa��o do documento fiscal, conforme a Tabela 4.1.2 


  */
  public static final String  COD_SIT = " COD_SIT";
  
  
  
  
  
  /*
  * 7 -  S�rie do documento fiscal 

  */
  public static final String SER = "SER";
  
  
  
  
  
  
  /*
  * 8 -  Subs�rie do documento fiscal

  */
 public static final String SUB = "SUB";
 
 
 
 
 
 
 /*
  * 9 -   - C�digo de classe de consumo de energia el�trica ou g�s: 01 - Comercial 02 - Consumo Pr�prio 03 - Ilumina��o P�blica 04 - Industrial 05 - Poder P�blico 06 - Residencial 07 - Rural 08 -Servi�o P�blico. - C�digo de classe de consumo de Fornecimento D��gua ? Tabela 4.4.2.


  */
 public static final String COD_CONS  = "COD_CONS ";
 
 
 
 
 
 
 /*
  * 10 -  N�mero do documento fiscal
  */
 public static final String  NUM_DOC = " NUM_DOC";
 
 
 
 
 
 
 /*
  * 11 -   Data da emiss�o do documento fiscal 
  */
 public static final String  DT_DOC = "DT_DOC";
 
 
 
 
 
 
 /*
  * 12 -   Data da entrada ou da sa�da  
  */
 public static final String  DT_E_S = " DT_E_S";
 
 
 
 
 
 
 /*
  * 13 -   Valor total do documento fiscal  
  */
 public static final String  VL_DOC = " VL_DOC";
 
 
 
 
 
 
 
 /*
  * 14 -    Valor total do desconto  
  */
 public static final String  VL_DESC = " VL_DESC";
 
 
 
 
 
 
 
 /*
  * 15 -  Valor total fornecido/consumido  
  */
 public static final String VL_FORN = "VL_FORN";
 
 
 
 
 
 
 
 /*
  * 16 -   Valor total dos servi�os n�o-tributados pelo ICMS
 
  */
 public static final String  VL_SERV_NT  = " VL_SERV_NT ";
 
 
 
 
 
 
 
 
 /*
  * 17 -    Valor total cobrado em nome de terceiros 
 
  */
 public static final String VL_TERC = "VL_TERC";
 
 
 
 
 
 
 
 /*
  * 18 -  Valor total de despesas acess�rias indicadas no documento fiscal 
 
  */
 public static final String  VL_DA = " VL_DA";
 
 
 
 
 
 
 
  /*
  * 19 -  Valor acumulado da base de c�lculo do ICMS 
 
  */
 public static final String VL_BC_ICMS = "VL_BC_ICMS";
 
 
 
 
 
 
 
 
 /*
  * 20 -   Valor acumulado do ICMS 
 
  */
 public static final String VL_ICMS = "VL_ICMS";
 
 
 
 
 
 
 
 /*
  *   /*
  *  21 -   Valor acumulado do ICMS 
 
 
  */
 public static final String  VL_BC_ICMS_ST = " VL_BC_ICMS_ST";
 
 
 
 
 
 
 /*
  * 22 -  Valor acumulado do ICMS retido por substitui��o tribut�ria

  */
 public static final String  VL_ICMS_ST = " VL_ICMS_ST";
 
 
 
 
 
 
 
 /*
  * 23 - C�digo da informa��o complementar do documento fiscal (campo 02 do Registro 0450)


  */
 public static final String COD_INF  = "COD_INF ";
 
 
 
 
 
 
 
 
 
  /*
  * 24 - C�digo da informa��o complementar do documento fiscal (campo 02 do Registro 0450)


  */
 public static final String VL_PIS = "VL_PIS";
 
 
 
 
 
 
 
 /*
  * 25 - Valor da COFINS
  */
 public static final String  VL_COFINS = " VL_COFINS";
 
 
 
 
 
 
 
 
 
 /*
  * 26 -  C�digo de tipo de Liga��o 1 - Monof�sico 2 - Bif�sico 3 - Trif�sico

  */
 public static final String TP_LIGACAO = "TP_LIGACAO";
 
 
 
 
 
 
 
 
 
  /*
  * 27 -  C�digo de grupo de tens�o: 01 - A1 - Alta Tens�o (230kV ou mais) 02 - A2 - Alta Tens�o (88 a 138kV) 03 - A3 - Alta Tens�o (69kV) 04 - A3a - Alta Tens�o (30kV a 44kV) 05 - A4 - Alta Tens�o (2,3kV a 25kV) 06 - AS - Alta Tens�o Subterr�neo 06 07 - B1 - Residencial 07 08 - B1 - Residencial Baixa Renda 08 09 - B2 - Rural 09 10 - B2 - Cooperativa de Eletrifica��o Rural 11 - B2 - Servi�o P�blico de Irriga��o 12 - B3 - Demais Classes 13 - B4a - Ilumina��o P�blica - rede de distribui��o 14 - B4b - Ilumina��o P�blica - bulbo de l�mpada


  */
 public static final String  COD_GRUPO_TENSAO = " COD_GRUPO_TENSAO";

 
 
 
 
 
    public RC500() {
        setName(" NOTA FISCAL / CONTA DE ENERGIA ELETRICA (CODIGO 06), NOTA FISCAL / CONTA DE FORNECIMENTO DE AGUA CANALIZADA (CODIGO 29) E NOTA FISCAL CONSUMO FORNECIMENTO DE GSA(CODIGO 28)");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
       
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C500"));
        //2
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        //3
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        //4
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //5
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //6
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        //7
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype((4)));
        //8
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        //9
        addFieldArchetype(COD_CONS, new FieldStringFixedLengthArchetype(2));
        //10
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
         //11
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //12
        addFieldArchetype(DT_E_S, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //13
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_DOC, f1);
        //14
         FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_DESC, f2);
        //15
         FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_FORN, f3);
        //16
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_SERV_NT, f4);
        //17
         FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_TERC, f5);
        //18
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_DA, f6);
        //19
         FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS, f7);
        //20
        FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
        f8.setFormat(fw);
        addFieldArchetype(VL_ICMS, f8);
        //21
       FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_ST, f9); 
        //22
         FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_ICMS_ST, f10);
        //23
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        //24
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_PIS, f11);
        //25
         FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_COFINS, f12);
        //26
        addFieldArchetype(TP_LIGACAO, new FieldIntegerFixedLengthArchetype(1));
        //27
        addFieldArchetype(COD_GRUPO_TENSAO, new FieldStringFixedLengthArchetype(2));
        
        
        
    }
 
 
}
