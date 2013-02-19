package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 12:04:20
 * @author Vinicius Diana
 */
public class RC600 extends LineArchetype {
     /*
      * 1 -  Texto fixo contendo "C600"
      */
    public static final String REGISTRO = "REGISTRO";
    
    
    
    
    
    
    
    /*
      *  2 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1   
      */
    public static final String COD_MOD = "COD_MOD";
    
    
    
    
    
    
    
    /*
      * 3 -  Código do município dos pontos de consumo, conforme a tabela IBGE
   
      */
    public static final String  COD_MUN = " COD_MUN";
    
    
    
    
    
    
    
    /*
      * 4 -  Série do documento fiscal
      */
    public static final String  SER = " SER";
    
    
    
    
    
    /*
      * 5 -  Subsérie do documento fiscal 
      */
    public static final String SUB = "SUB";
    
    
    
    
    
    
    /*
      * 6 -  Código de classe de consumo de energia elétrica ou gás: 01 - Comercial 02 - Consumo Próprio 03 - Iluminação Pública 04 - Industrial 05 - Poder Público 06 - Residencial 07 - Rural 08 -Serviço Público. - Código de classe de consumo de Fornecimento D´água ? Tabela 4.4.2.

      */
    public static final String  COD_CONS = " COD_CONS";
    
    
    
    
    
    
    
    
    
    /*
      * 7 -  Quantidade de documentos consolidados neste registro

      */
    public static final String QTD_CONS = "QTD_CONS";
    
    
    
    
    
    
    
    /*
      * 8 -  Quantidade de documentos cancelados
      */
    public static final String QTD_CANC = "QTD_CANC";
    
    
    
    
    
    
    
    /*
      * 9 -  Data dos documentos consolidados
      */
    public static final String DT_DOC  = "DT_DOC";
    
    
    
    
    
    
    /*
      * 10 -  Valor total dos documentos 
      */
    public static final String VL_DOC = "VL_DOC";
    
    
    
    
    
    
    /*
      * 11 - Valor acumulado dos descontos 
      */
    public static final String VL_DESC = "VL_DESC";
    
    
    
    
    
    
    
    /*
      * 12 -   Consumo total acumulado, em kWh (Código 06)
      */
    public static final String  CONS = " CONS";
    
    
    
    
    
    
    
    /*
      * 13 -  Valor acumulado do fornecimento
      */
    public static final String  VL_FORN = " VL_FORN";
    
    
    
    
    
    /*
      * 14 -  Valor acumulado dos serviços não-tributados pelo ICMS

      */
    public static final String  VL_SERV_NT = " VL_SERV_NT";
    
    
    
    
    
    /*
      * 15 -  Valores cobrados em nome de terceiros
      */
    public static final String  VL_TERC = " VL_TERC";
    
    
    
    
    
    /*
      * 16 -   Valor acumulado das despesas acessórias 
      */
    public static final String VL_DA = "VL_DA";
    
    
    
    
    /*
      * 17 -  Valor acumulado da base de cálculo do ICMS
      */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    
    
    
    
    
    /*
      * 18 -   Valor acumulado do ICMS
      */
    public static final String VL_ICMS  = "VL_ICMS";
    
    
    
    
    
    /*
      * 19 -  Valor acumulado da base de cálculo do ICMS substituição tributária

      */
    public static final String  VL_BC_ICMS_ST  = " VL_BC_ICMS_ST ";
    
    
    
    
    /*
      * 20 -   Valor acumulado do ICMS retido por substituição tributária

      */
    public static final String  VL_ICMS_ST  = " VL_ICMS_ST ";
    
    
    
    
    
    
    
    /*
     * 21 -  Valor acumulado do PIS
     */
   public static final String VL_PIS = "VL_PIS";
   
   
   
   
    
    /*
     * 22 -   Valor acumulado COFINS 
     */
 public static final String  VL_COFINS = " VL_COFINS";
 
 
 
 
 
 

    public RC600() {
        setName("REGISTRO C600: CONSOLIDAÇÃO DIARIA DE NOTAS FISCAIS/CONTAS DE ENERGIA ELETRICA (CODIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'AGUA CANALIZADA (CODIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GAS (CODIGO 28) (EMPRESAS NAO OBRIGADAS AO CONVENIO ICMS 115/03). ");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C600"));
        //2
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //3
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        //4
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        //5
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        //6
        addFieldArchetype(COD_CONS, new FieldStringFixedLengthArchetype(2));
        //7
        addFieldArchetype(QTD_CONS, new FieldIntegerMaximumLengthArchetype(255));
        //8
        addFieldArchetype(QTD_CANC, new FieldIntegerMaximumLengthArchetype(255));
        //9
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //10
          FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_DOC, f1);
        //11
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_DESC, f2);
        //12
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(CONS, f3);
        //13
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_FORN, f4);
        //14
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_SERV_NT, f5);
        //15
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_TERC, f6);
        //16
        FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_DA, f7);
        //17
        FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
        f8.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS, f8);
        //18
        FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_ICMS, f9);
        //19
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_ST, f10);
        //20
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_ICMS_ST, f11);
        //21
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_PIS, f12);
        //22
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        addFieldArchetype(VL_COFINS, f13);
    }
 
}
