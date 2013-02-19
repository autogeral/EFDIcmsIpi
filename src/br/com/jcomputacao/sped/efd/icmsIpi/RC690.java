package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 15:55:47
 * @author Vinicius Diana
 */
public class RC690 extends LineArchetype {
 /*
  * 1 - Texto fixo contendo "C690"
  */
    public static final String REGISTRO = "REGISTRO";
    
    
    
    
    
    
  /*
  * 2 - C�digo Fiscal de Opera��o e Presta��o, conforme a tabela indicada no item 4.2.2

  */
    public static final String CST_ICMS = "CST_ICMS";
    
    
    
    
    
    
    /*
  * 3 -  C�digo Fiscal de Opera��o e Presta��o, conforme a tabela indicada no item 4.2.2

  */
    public static final String CFOP  = "CFOP "; 
    
    
    
    
    
    
    /*
  * 4 -  Al�quota do ICMS
  */
   public static final String  ALIQ_ICMS  = " ALIQ_ICMS "; 
   
   
   
   
   
   
    /*
  * 5 - Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS.
  */
   public static final String  VL_OPR   = " VL_OPR  "; 
   
   
   
   
   
   
    /*
  * 6 - Parcela correspondente ao "Valor da base de c�lculo do ICMS" referente � combina��o CST_ICMS, CFOP  e al�quota do ICMS

  */
   public static final String  VL_BC_ICMS = "VL_BC_ICMS "; 
   
   
   
   
   
   
    /*
  * 7 -  Parcela correspondente ao "Valor do ICMS" referente � combina��o CST_ICMS, CFOP e al�quota do ICMS

  */
   public static final String   VL_ICMS  = " VL_ICMS"; 
   
   
   
   
   
   
    /*
  * 8 -  Valor n�o tributado em fun��o da redu��o da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS.
  */
   public static final String VL_RED_BC   = "VL_RED_BC"; 
   
   
   
   
   
   
    /*
  * 9 -  Valor da base de c�lculo do ICMS substitui��o tribut�ria

  */
   public static final String VL_BC_ICMS_ST   = "VL_BC_ICMS_ST"; 
   
   
   
   
   
   
    /*
  * 10 - Valor do ICMS retido por substitui��o tribut�ria
  */
   public static final String   VL_ICMS_ST   = " VL_ICMS_ST  "; 
   
   
   
   
   
   
   
    /*
  * 11 - C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460)

  */
     public static final String  COD_OBS = "COD_OBS" ;
     
     
     
     
     
     

    public RC690() {
        setName("REGISTRO C690: REGISTRO ANALITICO DOS DOCUMENTOS (NOTAS FISCAIS/CONTAS DE ENERGIA ELETRICA (CODIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D?AGUA CANALIZADA (CODIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE G�S (CODIGO 28) ");
        setDelimiter("|");
          FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C690"));
        //2
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        //3
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //4
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
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
        addFieldArchetype(VL_RED_BC, f5);
        //9
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_ST, f6);
        //10
        FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_BC_ICMS_ST, f7);
        //11
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
    }
     
     
    
}
