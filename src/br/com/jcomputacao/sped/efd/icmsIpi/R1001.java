package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 13:56:45
 * @author Vinicius Diana
 */
public class R1001 extends LineArchetype {
  
    /*
     *  1 - Texto fixo contendo "1001"
     */
    public static final String REGISTRO = "REG";
    
    /*
     *  2 - Indicador de movimento: 0- Bloco com dados informados; 1- Bloco sem dados informados

     */
    public static final String IND_MOV = "IND_MOV";

    public R1001() {
        setName(" Regsitro 1001 - Abertura do Bloco1");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1001"));
        //2
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }
    
    
    
}
