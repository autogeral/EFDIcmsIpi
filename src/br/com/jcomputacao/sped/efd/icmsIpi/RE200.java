package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/02/2013 10:34:03
 * @author Vinicius Diana
 */
public class RE200 extends LineArchetype {
 /*
      * 1 -  Texto fixo contendo "E200" 
      */
    public static final String  REGISTRO = "REG";
    
 /*
      * 2 - Sigla da unidade da federação a que se refere a apuração do ICMS ST
   
      */ 
    public static final String UF = "UF";
    
 
    /*
      * 3 - Data inicial a que a apuração se refere
   
      */ 
    public static final String DT_INI = "DT_INI";
    
    
     /*
      * 4 - Data final a que a apuração se refere
   
      */ 
    public static final String DT_FIN = "DT_FIN";
    
    
    public RE200(){
        setName("Registro E200 - Periodo da apuracao do icms - sustitucao tributaria");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E200"));
        //2
        addFieldArchetype(UF,new FieldStringMaximumLengthArchetype(2));
        //3
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //4
        addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        
        
    }
    
}
