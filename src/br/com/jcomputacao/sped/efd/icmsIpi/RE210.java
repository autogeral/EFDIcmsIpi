package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/02/2013 10:55:17
 * @author Vinicius Diana
 */
public class RE210 extends LineArchetype {

    /*
      * 1 -  Texto fixo contendo "E210" 
      */
    public static final String REGISTRO = "REG";
    
    /*
      * 2 -   Indicador de movimento: 0 ? Sem opera��es com ST 1 ? Com opera��es de ST
      */
    public static final String IND_MOV_ST = "IND_MOV_ST";
    
   /*
      * 3 - Valor do "Saldo credor de per�odo anterior ? Substitui��o Tribut�ria
      */ 
    public static final String VL_SLD_CRED_ANT_ST = "VL_SLD_CRED_ANT_ST";
    
     /*
      * 4 -  Valor total do ICMS ST de devolu��o de mercadorias
      */ 
    public static final String VL_DEVOL_ST = "VL_DEVOL_ST";
    
    
     /*
      * 5 - Valor total do ICMS ST de ressarcimentos 
      */ 
    public static final String  VL_RESSARC_ST = " VL_RESSARC_ST";
    
    /*
      * 6 - Valor total de Ajustes "Outros cr�ditos ST" e ?Estorno de d�bitos ST?
      */ 
    public static final String  VL_OUT_CRED_ST  = " VL_OUT_CRED_ST ";
    
     /*
      * 7 -  Valor total dos ajustes a cr�dito de ICMS ST, provenientes de ajustes do documento fiscal.
      */ 
    public static final String  VL_AJ_CREDITOS_ST  = " VL_AJ_CREDITOS_ST ";
    
    
    /*
      * 8 -  Valor Total do ICMS retido por Substitui��o Tribut�rio
      */ 
    public static final String  VL_RETENCAO_ST = "VL_RETENCAO_ST";
    
    
    /*
      * 9 -  Valor Total dos ajustes "Outros d�bitos ST" " e ?Estorno de cr�ditos ST?
      */ 
    public static final String  VL_OUT_DEB_ST  = " VL_OUT_DEB_ST";
    
    
    /*
      * 10 -  Valor total dos ajustes a d�bito de ICMS ST, provenientes de ajustes do documento fiscal.
      */ 
    public static final String VL_AJ_DEBITOS_ST = "VL_AJ_DEBITOS_ST";
    
    
     /*
      * 11 -  Valor total de Saldo devedor antes das dedu��es
      */ 
    public static final String VL_SLD_DEV_ANT_ST = "VL_SLD_DEV_ANT_ST";
    
    /*
      * 12 -   Valor total dos ajustes "Dedu��es ST
      */ 
    public static final String  VL_DEDUCOES_ST  = " VL_DEDUCOES_ST ";
    
    /*
      * 13 -  Imposto a recolher ST (11-12)
      */ 
    public static final String VL_ICMS_RECOL_ST  = "VL_ICMS_RECOL_ST ";
    
    /*
      * 14 -  Saldo credor de ST a transportar para o per�odo seguinte [(03+04+05+06+07)? (08+09+10)]  
      */ 
    public static final String VL_SLD_CRED_ST_TRAN_SPORTAR = "VL_SLD_CRED_ST_TRAN_SPORTAR";
    
     /*
      * 15 -  Valores recolhidos ou a recolher, extra- apura��o.

      */ 
     public static final String DEB_ESP_ST = "DEB_ESP_ST ";
     
     
     public RE210(){
         setName("Registro E210 - apuracao do icms - substituicao tributaria");
         setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
         fw.setReplaceComa(false);
        
         //1
         addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E210"));
         //2
         addFieldArchetype(IND_MOV_ST, new FieldStringFixedLengthArchetype(1));
         //3
        FieldDecimalMaximumLengthArchetype f = new FieldDecimalMaximumLengthArchetype(15,2);
        f.setFormat(fw);
        addFieldArchetype(VL_SLD_CRED_ANT_ST, f);
        //4
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_DEVOL_ST, f2);
        //5
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_RESSARC_ST, f3);
        //6
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_OUT_CRED_ST, f4);
        //7
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_AJ_CREDITOS_ST, f5);
        //8
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_RETENCAO_ST, f6);
        //9
        FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_OUT_DEB_ST, f7);
        //10
        FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
        f8.setFormat(fw);
        addFieldArchetype(VL_AJ_DEBITOS_ST, f8);
        //11
        FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_SLD_DEV_ANT_ST, f9);
        //12
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_DEDUCOES_ST, f10);
        //13
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_ICMS_RECOL_ST, f11);
        //14
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_SLD_CRED_ST_TRAN_SPORTAR, f12);
        //15 
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        addFieldArchetype(DEB_ESP_ST, f13);
        
        
        
     }
    
}
