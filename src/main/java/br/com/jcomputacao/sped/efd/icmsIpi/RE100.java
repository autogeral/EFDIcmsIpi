package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 05/02/2013 09:27:30
 * @author Vinicius Diana
 */
public class RE100 extends LineArchetype {

    /*
      * 1 -  Texto fixo contendo "E100" 
      */
     public static final String REGISTRO = "REG";
     
     
     
      /*
      * 2 - Data inicial a que a apuração se refere

      */ 
     public static final String DT_INI = "DT_INI";
     
   
     /*
      * 3 - Data final a que a apuração se refere

      */ 
     
        public static final String  DT_FIN  = "DT_FIN ";      
        
        
        public RE100(){
            setName("Registro E100- Periodo da apuracao do icms");
            setDelimiter("|");
            //1
             addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("E100"));
             //2
             addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
             //3
             addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        }

             
}
