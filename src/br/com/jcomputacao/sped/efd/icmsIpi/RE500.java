package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 09:24:30
 * @author Vinicius Diana
 */
public class RE500 extends LineArchetype {
     
    
    /*
      * 1 -  Texto fixo contendo "E250
      */
    
    public static final String REGISTRO = "REGISTRO";
    
    /*
      * 2 -   Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial
      */
    public static final String  IND_APUR  = " IND_APUR";
    
    
     /*
      *     /*
      * 3 -   Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial
      */
      public static final String DT_INI = "DT_INI";
      
       /*
      * 4 -    Data final a que a apuração se refere 
      */
      public static final String DT_FIN = "DT_FIN";

    public RE500() {
        setName("REGISTRO E500: Periodo de apuracao do ipi");
        setDelimiter("|");
        
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E500"));
        //2
        addFieldArchetype(IND_APUR, new FieldStringFixedLengthArchetype(1));
        //3
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //4
        addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }
      
      
      
    
    

}
