package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 05/02/2013 13:44:21
 * @author Vinicius Diana
 */
public class RE112 extends LineArchetype {

    /*
      * 1 -  Texto fixo contendo "E112"" ;
      */
    public static final String REGISTRO = "REG";
    
    
    
      /*
      * 2 - N�mero do documento de arrecada��o estadual, se houver
      */
    public static final String NUM_DA = "NUM_DA";
    
    
    
     /*
      *   
      * 3 - N�mero do documento de arrecada��o estadual, se houver
      */
      public static final String NUM_PROC = "NUM_PROC";
      
      
      
       /*
      *   
      * 4 -  Indicador da origem do processo: 
      * 0- Sefaz; 1- Justi�a Federal; 2- Justi�a Estadual; 9- Outros 
      */
      public static final String IND_PROC = "IND_PROC";
      
      
      
       /*
      *   
      * 5 -  Descri��o resumida do processo que embasou o lan�amento
      */
      public static final String PROC = "PROC";
      
      
      
        /*
      *   
      * 6 -  Descri��o complementar
      */
      public static final String TXT_COMPl = "TXT_COMPl";
      
      
      
      public RE112(){
          setName("informacoes adicionais dos ajustes da apuracao do icms");
          setDelimiter("|");
          //1
          addFieldArchetype(REGISTRO,  new FieldDefaultArchetype("E112"));
          //2
          addFieldArchetype(NUM_DA, new FieldStringMaximumLengthArchetype(255));
          // 3 
          addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
          //4
          addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
          //5
          addFieldArchetype(PROC, new FieldStringMaximumLengthArchetype(255));
          //6
          addFieldArchetype(TXT_COMPl, new FieldStringMaximumLengthArchetype(255));
          
      }
      
      
      
    
    
    
    
}
