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
  * 2 -  Código dispositivo autorizado: 00 - Formulário de Segurança ? impressor autônomo 01 - FS-DA ? Formulário de Segurança para Impressão de DANFE 02 ? Formulário de segurança - NF-e 03 - Formulário Contínuo 04 ? Blocos  05 - Jogos Soltos 

  */
    public static final String COD_DISP = "COD_DISP";
    
    
    
     /*
  * 3 - Código do modelo do dispositivo autorizado, conforme a Tabela 4.1.1 

  */
    public static final String  COD_MOD = " COD_MOD";
    
    
    
     /*
  * 4 -  Série do dispositivo autorizado
  */
    public static final String  SER = " SER";
    
    
    
    
     /*
  * 5 - Subsérie do dispositivo autorizado 
  */
    public static final String SUB = "SUB";
    
    
    
     /*
  * 6 - Número do dispositivo autorizado (utilizado) inicial
  */
    public static final String NUM_DOC_INI = "NUM_DOC_INI";
    
    
    
    
     /*
  * 7 - Número do dispositivo autorizado (utilizado) fina
  */
    public static final String NUM_DOC_FIN = "NUM_DOC_FIN";
    
    
    
    
    
    
    
     /*
  * 8 -  Número da autorização, conforme dispositivo autorizado
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
