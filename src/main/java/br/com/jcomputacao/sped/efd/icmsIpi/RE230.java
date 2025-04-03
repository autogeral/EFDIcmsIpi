package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/02/2013 09:01:29
 * @author Vinicius Diana
 */
public class RE230 extends LineArchetype {
    
    /*
      * 1 -  Texto fixo contendo "E230"
      */
    public static final String REGISTRO ="REG";
    
    
     /*
      * 2 -  Nï¿½mero do documento de arrecadaÃ§Ã£o estadual, se houver
      */
        public static final String  NUM_DA = " NUM_DA";
        
     /*
      * 3 -   Nï¿½mero do processo ao qual o ajuste estï¿½ vinculado, se  houver
      */    
      public static final String    NUM_PROC = " NUM_PROC";
     
      
      /*
      * 4 -   Indicador da origem do processo: 0- Sefaz; 1- Justiï¿½a Federal; 2- Justiï¿½a Estadual; 9- Outros

      */ 
      public static final String  IND_PROC = " IND_PROC";
      
      
      
      /*
      * 5 -    DescriÃ§Ã£o resumida do processo que embasou o lanï¿½amento
      */ 
        public static final String PROC  = "PROC";
        
       /*
      * 6 -     DescriÃ§Ã£o complementar
      */  
        public static final String  TXT_COMPL  = " TXT_COMPL ";
        
        public RE230(){
            setName("Registro E230 - INFORMACOES ADICIONAIS DOS AJUSTES DO ICMS SUBSTITUICAO TRIBUTARIA ");
            setDelimiter("|");
             //1
            addFieldArchetype(REGISTRO, new FieldDefaultArchetype ("E230"));
            //2
            addFieldArchetype(NUM_DA , new FieldStringMaximumLengthArchetype(255));
            //3
            addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
            //4
            addFieldArchetype(IND_PROC, new FieldIntegerFixedLengthArchetype(1));
            //5
            addFieldArchetype(PROC, new FieldStringMaximumLengthArchetype(255));
            //6
            addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
        }
        
}
