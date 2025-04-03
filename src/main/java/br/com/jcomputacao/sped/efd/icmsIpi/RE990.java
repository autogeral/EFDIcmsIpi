package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 10:56:04
 * @author Vinicius Diana
 */
public class RE990 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "E990"
     */
  public static final String REGISTRO = "REG";
  
  /*
     * 2 -  Quantidade total de linhas do Bloco E 
     */
  public static final String QTD_LIN_E = "QTD_LIN_E";

    public RE990() {
        setName("Regsitro E990 - Encerramento do bloco e");
        setDelimiter("|");
        
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E990"));
        //2
        addFieldArchetype(QTD_LIN_E, new FieldIntegerMaximumLengthArchetype(30));
    }
  
  
  
}
