package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 11:19:45
 * @author Vinicius Diana
 */
public class RG001 extends LineArchetype {
    
    /*
     *  1 - Texto fixo contendo "G001"
     */
  public static final String REGISTRO = "REGISTRO";
  
   /*
     *  2 - Indicador de movimento: 0- Bloco com dados informados; 1- Bloco sem dados informados 

     */
  public static final String IND_MOV = "IND_MOV";

    public RG001() {
        setName("Registro G001 - Abertura do bloco G");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("G001"));
        //2
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));
        
    }
  
  
}
