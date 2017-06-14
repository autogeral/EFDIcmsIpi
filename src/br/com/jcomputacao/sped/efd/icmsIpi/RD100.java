package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/02/2013 11:11:54
 * @author Thiago Balthazar
 */
public class RD100 extends LineArchetype {
    
    //1
     public static final String REGISTRO = "REG";
     
     /**
      * IND_OPER
      * 0 Aquisicao
      * 1 Prestacao
      */
     
     //2
     public static final String IND_OPER = "IND_OPER";
     
     /**
      * Indicador do emitente do documento fiscal:
      * 0 Emiss�o propria;
      * 1 Terceiros
      */
     
     //3
     public static final String IND_EMIT = "IND_EMIT";
     /**
      * @see br.com.jcomputacao.sped.efd.icmsIpi.R0150
      */
     
     //4
     public static final String COD_PART = "COD_PART";
      /**
         C�digo do participante (campo 02 do Registro 0150):
        - do prestador de servi�o, no caso de aquisi��o de servi�o;
        - do tomador do servi�o, no caso de presta��o de servi�os.
      */
     
     //5
     public static final String COD_MOD = "COD_MOD";
      /**
      * C�digo do modelo do documento fiscal, conforme a Tabela 4.1.1
      */
     
     //6
     public static  final String COD_SIT = "COD_SIT";
       /**
        * C�digo da situa��o do documento fiscal, conforme a Tabela 4.1.2
        */
     
     //7
     public static  final String SER = "SER";
     /**
      * S�rie do documento fiscal
      */
     
     //8
     public static final String SUB= "SUB";
     /**
      * Subs�rie do documento fiscal
      */
     
     //9
     public static final String NUM_DOC="NUM_DOC";
     /**
      * N�mero do documento fiscal
      */
     
     //10
     public static final String CHV_CTE = "CHV_CTE";
     /**
      * Chave do Conhecimento de Transporte Eletr�nico 
      */
     
     //11
     public static final String DT_DOC = "DT_DOC";
     /**
      * Data da emiss�o do documento fiscal
      */
     
     //12
     public static final String DT_A_P = "DT_A_P";
     /*
      * Data da aquisi��o ou da presta��o do servi�o
      */
     
     //13
     public static final String TP_CT_e = "TP_CT_e";
     /*
      * Tipo de Conhecimento de Transporte Eletr�nico conforme
        definido no Manual de Integra��o do CT-e
      */
     
     //14
     public static final String CHV_CTE_REF = "CHV_CTE_REF";
     /*
      * Chave do CT-e de refer�ncia cujos valores foram
        complementados (op��o ?1? do campo anterior) ou cujo
        d�bito foi anulado(op��o ?2? do campo anterior).
      */
     
     //15
       public static final String VL_DOC = "VL_DOC";
     /*
      * Valor total do documento fiscal
      */
       
       //16
       public static final String VL_DESC = "VL_DESC";
     /*
      * Valor total do desconto
      */
       
       //17
       public static final String IND_FRT = "IND_FRT";
       /*
        * Indicador do tipo do frete:
            0- Por conta de terceiros;
            1- Por conta do emitente;
            2- Por conta do destinat�rio;
            9- Sem cobran�a de frete.
            Obs.: A partir de 01/07/2012 passar� a ser:
        
         Indicador do tipo do frete:
            0- Por conta do emitente;
            1- Por conta do destinat�rio/remetente;
            2- Por conta de terceiros;
            9- Sem cobran�a de frete.
       */
       
       //18
       public static final String VL_SERV = "VL_SERV";
       /*
        * Valor total da presta��o de servi�o
        */
       
       //19
       public static final String VL_BC_ICMS = "VL_BC_ICMS"; 
       /*
        * Valor da base de c�lculo do ICMS
        */
       
       //20
       public static final String VL_ICMS = "VL_ICMS";
       /*
        * Valor do ICMS
        */
       
       //21
       public static final String VL_NT = "VL_NT";
       /*
        * Valor n�o-tributado
        */
       
       //22
        public static final String COD_INF= "COD_INF";
        /*
         * C�digo da informa��o complementar do documento fiscal
            (campo 02 do Registro 0450)
         */
       
        //23
         public static final String COD_CTA = "COD_CTA";
         /*
          * C�digo da conta anal�tica cont�bil debitada/creditada
          */
         
    public RD100(){
        setName("Registro D100 - Nota fiscal de servico de transporte 07, Conhecimento de tranporte..");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D100"));
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER,  new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(CHV_CTE, new FieldStringMaximumLengthArchetype(44));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_A_P, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(TP_CT_e, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CHV_CTE_REF, new FieldStringMaximumLengthArchetype(44));
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        addFieldArchetype(VL_DOC, f15);
        
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        addFieldArchetype(VL_DESC, f16);
        
        addFieldArchetype(IND_FRT, new FieldStringFixedLengthArchetype(1));
        
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        addFieldArchetype(VL_SERV, f18);
        
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalMaximumLengthArchetype(255));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(255));
        addFieldArchetype(VL_NT, new FieldDecimalMaximumLengthArchetype(255));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
    }
        

}
