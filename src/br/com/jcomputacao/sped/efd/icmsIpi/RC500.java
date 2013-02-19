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
  * 2 -  Indicador do tipo de operação: 0- Entrada; 1- Saída
  */
 public static final String IND_OPER = "IND_OPER";
 
 
 
 
 
 /*
  * 3 -  Indicador do emitente do documento fiscal: 0- Emissão própria; 1- Terceiros

  */
 public static  final String  IND_EMIT = " IND_EMIT";
 
 
 
 
 
 /*
  * 4 -   Código do participante (campo 02 do Registro 0150): - do adquirente, no caso das saídas; - do fornecedor no caso de entradas 

  */
 public  static final  String COD_PART = " COD_PART";
 
 
 
 
 
 
  /*
  * 5 -   Código do modelo do documento fiscal, conforme a Tabela 4.1.1

  */
 public static final String  COD_MOD = " COD_MOD";
 
 
 
 
 
 /*
  * 6 -  Código da situação do documento fiscal, conforme a Tabela 4.1.2 


  */
  public static final String  COD_SIT = " COD_SIT";
  
  
  
  
  
  /*
  * 7 -  Série do documento fiscal 

  */
  public static final String SER = "SER";
  
  
  
  
  
  
  /*
  * 8 -  Subsérie do documento fiscal

  */
 public static final String SUB = "SUB";
 
 
 
 
 
 
 /*
  * 9 -   - Código de classe de consumo de energia elétrica ou gás: 01 - Comercial 02 - Consumo Próprio 03 - Iluminação Pública 04 - Industrial 05 - Poder Público 06 - Residencial 07 - Rural 08 -Serviço Público. - Código de classe de consumo de Fornecimento D´água ? Tabela 4.4.2.


  */
 public static final String COD_CONS  = "COD_CONS ";
 
 
 
 
 
 
 /*
  * 10 -  Número do documento fiscal
  */
 public static final String  NUM_DOC = " NUM_DOC";
 
 
 
 
 
 
 /*
  * 11 -   Data da emissão do documento fiscal 
  */
 public static final String  DT_DOC = "DT_DOC";
 
 
 
 
 
 
 /*
  * 12 -   Data da entrada ou da saída  
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
  * 16 -   Valor total dos serviços não-tributados pelo ICMS
 
  */
 public static final String  VL_SERV_NT  = " VL_SERV_NT ";
 
 
 
 
 
 
 
 
 /*
  * 17 -    Valor total cobrado em nome de terceiros 
 
  */
 public static final String VL_TERC = "VL_TERC";
 
 
 
 
 
 
 
 /*
  * 18 -  Valor total de despesas acessórias indicadas no documento fiscal 
 
  */
 public static final String  VL_DA = " VL_DA";
 
 
 
 
 
 
 
  /*
  * 19 -  Valor acumulado da base de cálculo do ICMS 
 
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
  * 22 -  Valor acumulado do ICMS retido por substituição tributária

  */
 public static final String  VL_ICMS_ST = " VL_ICMS_ST";
 
 
 
 
 
 
 
 /*
  * 23 - Código da informação complementar do documento fiscal (campo 02 do Registro 0450)


  */
 public static final String COD_INF  = "COD_INF ";
 
 
 
 
 
 
 
 
 
  /*
  * 24 - Código da informação complementar do documento fiscal (campo 02 do Registro 0450)


  */
 public static final String VL_PIS = "VL_PIS";
 
 
 
 
 
 
 
 /*
  * 25 - Valor da COFINS
  */
 public static final String  VL_COFINS = " VL_COFINS";
 
 
 
 
 
 
 
 
 
 /*
  * 26 -  Código de tipo de Ligação 1 - Monofásico 2 - Bifásico 3 - Trifásico

  */
 public static final String TP_LIGACAO = "TP_LIGACAO";
 
 
 
 
 
 
 
 
 
  /*
  * 27 -  Código de grupo de tensão: 01 - A1 - Alta Tensão (230kV ou mais) 02 - A2 - Alta Tensão (88 a 138kV) 03 - A3 - Alta Tensão (69kV) 04 - A3a - Alta Tensão (30kV a 44kV) 05 - A4 - Alta Tensão (2,3kV a 25kV) 06 - AS - Alta Tensão Subterrâneo 06 07 - B1 - Residencial 07 08 - B1 - Residencial Baixa Renda 08 09 - B2 - Rural 09 10 - B2 - Cooperativa de Eletrificação Rural 11 - B2 - Serviço Público de Irrigação 12 - B3 - Demais Classes 13 - B4a - Iluminação Pública - rede de distribuição 14 - B4b - Iluminação Pública - bulbo de lâmpada


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
