package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 13/02/2013 09:39:43
 * @author Vinicius Diana
 */
public class RC190 extends LineArchetype {

    /*
     * 1 - Texto fixo contendo "C190"
     */
    public static final String REGISTRO = "REG";
    
    /*
     * 2 -  C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1

     */
    public static final String CST_ICMS = "CST_ICMS";
    
    /*
     * 3 -   C�digo Fiscal de Opera��o e Presta��o do agrupamento de itens
     */
    public static final String  CFOP = " CFOP";
    
     /*
     * 4 -   Al�quota do ICMS
     */
    public static final String  ALIQ_ICMS = " ALIQ_ICMS";
    
    /*
     * 5 -   Valor da opera��o na combina��o de CST_ICMS, CFOP e al�quota do ICMS, correspondente ao somat�rio do valor das mercadorias, despesas acess�rias (frete, seguros e outras despesas acess�rias), ICMS_ST  e IPI.

     */
    public static final String  VL_OPR  = " VL_OPR";
    
     /*
     * 6 -  Parcela correspondente ao "Valor da base de c�lculo do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS.
   

     */
    public static final String  VL_BC_ICMS = "VL_BC_ICMS";
    
    /*
     * 7 -   Parcela correspondente ao "Valor do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS.

     */
    public static final String VL_ICMS = "VL_ICMS";
    
    /*
     * 8 -   Parcela correspondente ao "Valor da base de c�lculo do ICMS" da substitui��o tribut�ria referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. 

     */
    public static final String  VL_BC_ICMS_ST = " VL_BC_ICMS_ST";
    
    /*
     * 9 -    Parcela correspondente ao valor creditado/debitado do ICMS da substitui��o tribut�ria, referente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS.

     */
    public static final String  VL_ICMS_ST = " VL_ICMS_ST";
    
    /*
     * 10 -    Valor n�o tributado em fun��o da redu��o da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. 

     */
    public static final String  VL_RED_BC = " VL_RED_BC";
    
    
     /*
     * 11 -    Parcela correspondente ao "Valor do IPI" referente � combina��o CST_ICMS, CFOP e al�quota do ICMS.
 

     */
    public static final String  VL_IPI = " VL_IPI";
    
    /*
     * 12 -   C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460)
  
     */
    public static final String  COD_OBS = " COD_OBS";
    
   public RC190() {
    setName("Registro C190 - Registro Analitico do documento ( Codigo 01,1B,04 e 55)");
    setDelimiter("|");
     FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
      fw.setReplaceComa(false);
    //1
    addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C190"));
    //2
    addFieldArchetype(CST_ICMS,new  FieldIntegerFixedLengthArchetype(3));
    //3
    addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
    //4
     FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(6,2);
     f1.setFormat(fw);
     addFieldArchetype(ALIQ_ICMS, f1);
     //5
     FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
     f2.setFormat(fw);
     addFieldArchetype(VL_OPR, f2);
     //6
     FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
     f3.setFormat(fw);
     addFieldArchetype(VL_BC_ICMS, f3);
     //7
     FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
     f4.setFormat(fw);
     addFieldArchetype(VL_ICMS, f4);
     //8
      FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
     f5.setFormat(fw);
     addFieldArchetype(VL_BC_ICMS_ST, f5);
     //9
      FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
     f6.setFormat(fw);
     addFieldArchetype(VL_ICMS_ST, f6);
     //10
     FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
     f7.setFormat(fw);
     addFieldArchetype(VL_RED_BC, f7);
     //11
     FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
     f8.setFormat(fw);
     addFieldArchetype(VL_IPI, f8);
     //12
     addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
    }
    
    
    
}
