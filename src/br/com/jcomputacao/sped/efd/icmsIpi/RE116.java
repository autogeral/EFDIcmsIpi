package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
/**
 * 06/02/2013 09:03:34
 * @author Vinicius Diana
 */
public class RE116 extends LineArchetype {
    
   /*
      * 1 -  Texto fixo contendo "E116"
      */
     public static final String REGISTRO = "REG";   
     
     
      /*
      * 2 -  C�digo da obriga��o a recolher, conforme a Tabela 5.4
      */
      public static final String   COD_OR = "COD_OR";
  
  /*
      * 3 -   Valor da obriga��o a recolhe
      */
     public static final String  VL_OR = "VL_OR";
     
      /*
      * 4 -  Data de vencimento da obriga��o
      */
     public static final String DT_VCTO = "DT_VCTO";
     
     /*
      * 5 -  C�digo de receita referente � obriga��o, pr�prio da unidade da federa��o, conforme legisla��o estadual,
      */
     
     public static final String   COD_REC  = " COD_REC ";
     
     
      /*
      * 6 -   N�mero do processo ou auto de infra��o ao qual a obriga��o est� vinculada, se houver.

      */
     public static final String  NUM_PROC = " NUM_PROC";
     
     
     /*
      * 7 -   Indicador da origem do processo: 0- SEFAZ;
      * 1- Justi�a Federal;
      * 2- Justi�a Estadual;
      * 9- Outros
      */
     public static final String  IND_PROC = " IND_PROC";
     
     
     /*
      * 8 -  Descri��o resumida do processo que embasou o lan�amento

      */
     
     public static final String  PROC = " PROC";
     
     
     /*
      * 9 -  Descri��o complementar das obriga��es a recolher. 

      */
     
    public static final String TXT_COMPL = "TXT_COMPL";
    
    /*
      * 10 -   Informe o m�s de refer�ncia no formato ?mmaaaa? 

      */
    public static final String  MES_REF = " MES_REF";
    
    
    public RE116(){
        setName(" Registro 116 - Obrigacoes do icms recolhido o a recolher operacoes proprias");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO,  new FieldDefaultArchetype("E116"));
        //2
        addFieldArchetype(COD_OR, new FieldStringFixedLengthArchetype(3));
        //3
        FieldDecimalMaximumLengthArchetype f = new FieldDecimalMaximumLengthArchetype(15,2);
        f.setFormat(fw);
        addFieldArchetype(VL_OR, f);
        //4
        addFieldArchetype(DT_VCTO, new FieldDateFixedLengthArchetype("ddMMyyyy") );
        //5
        addFieldArchetype(COD_REC, new FieldStringMaximumLengthArchetype(255));
        //6
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
        //7
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
        //8
        addFieldArchetype(PROC, new FieldStringMaximumLengthArchetype(255));
        //9
        addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
        //10
        addFieldArchetype(MES_REF, new FieldDateFixedLengthArchetype("MMyyyy"));
        
    }
    
    
    
}
