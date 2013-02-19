package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 14:48:49
 * @author Vinicius Diana
 */
public class R1700 extends LineArchetype{
 /*
  * 1 - Texto fixo contendo ?1700?.
  */
    public static final String REGISTRO = "REGISTRO";
  
    
    
    
    
     /*
  * 2 -  C�digo dispositivo autorizado: 00 - Formul�rio de Seguran�a ? impressor aut�nomo 01 - FS-DA ? Formul�rio de Seguran�a para Impress�o de DANFE 02 ? Formul�rio de seguran�a - NF-e 03 - Formul�rio Cont�nuo 04 ? Blocos  05 - Jogos Soltos 

  */
    public static final String COD_DISP = "COD_DISP";
    
    
    
     /*
  * 3 - C�digo do modelo do dispositivo autorizado, conforme a Tabela 4.1.1 

  */
    public static final String  COD_MOD = " COD_MOD";
    
    
    
     /*
  * 4 -  S�rie do dispositivo autorizado
  */
    public static final String  SER = " SER";
    
    
    
    
     /*
  * 5 - Subs�rie do dispositivo autorizado 
  */
    public static final String SUB = "SUB";
    
    
    
     /*
  * 6 - N�mero do dispositivo autorizado (utilizado) inicial
  */
    public static final String NUM_DOC_INI = "NUM_DOC_INI";
    
    
    
    
     /*
  * 7 - N�mero do dispositivo autorizado (utilizado) fina
  */
    public static final String NUM_DOC_FIN = "NUM_DOC_FIN";
    
    
    
    
    
    
    
     /*
  * 8 -  N�mero da autoriza��o, conforme dispositivo autorizado
  */
    public static final String NUM_AUT = "NUM_AUT";
    
    
    
    

    public R1700() {
        setName("REGISTRO 1700: DOCUMENTOS FISCAIS UTILIZADOS ");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1700"));
        //2
        addFieldArchetype(COD_DISP, new FieldStringFixedLengthArchetype(2));
        //3
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //4
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        //5
        addFieldArchetype(SUB, new FieldStringMaximumLengthArchetype(3));
        //6
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(12));
        //7
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(12));
        //8
        addFieldArchetype(NUM_AUT, new FieldIntegerMaximumLengthArchetype(60));
        
    }
    
    
    
    
    
     
    
    
    
    
    
    
    
   
    
}
