package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/05/2017 13:35:18
 * @author Alexandre Scavacini
 */
public class RK001 extends LineArchetype{
    
    /*
     * 1 - Texto fixo contendo "K001"
     */
 public static final String REGISTRO = "REG";
 
 /*
     * 2 -  Indicador de movimento: 0- Bloco com dados informados; 1- Bloco sem dados informados

     */
 public static final String  IND_MOV  = " IND_MOV ";

    public RK001() {
        setName("Registro K001 - Abertura do bloco k");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("K001"));
        //2
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }
 
 
 
}
