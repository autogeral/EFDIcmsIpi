package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 13:35:18
 * @author Vinicius Diana
 */
public class RH001 extends LineArchetype{
    
    /*
     * 1 - Texto fixo contendo "H001"
     */
 public static final String REGISTRO = "REG";
 
 /*
     * 2 -  Indicador de movimento: 0- Bloco com dados informados; 1- Bloco sem dados informados

     */
 public static final String  IND_MOV  = " IND_MOV ";

    public RH001() {
        setName("Registro H001 - Abertura do bloco h");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("H001"));
        //2
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }
 
 
 
}
