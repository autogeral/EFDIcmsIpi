package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA990 extends LineArchetype{
    public static final String REGISTRO = "REG";     
     /**
      * Quantidade total de linhas do Bloco A
      */
     public static final String QTD_LIN_A = "QTD_LIN_A";
    
    public RA990() {
        setName("Registro A990 - Encerramento do bloco A");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("A990"));
        addFieldArchetype(QTD_LIN_A, new FieldStringMaximumLengthArchetype(255));
    }
    
}
