package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 15/02/2013 11:05:07
 * @author Thiago Balthazar
 */
public class RC171 extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "C171"
      */
     public static final String NUM_TANQUE = "NUM_TANQUE";
     /*
      * Tanque onde foi armazenado o combustível
      */
     public static final String QTDE = "QTDE";
     /*
      * Quantidade ou volume armazenado
      */

    public RC171() {
    
        setName("REGISTRO C171: ARMAZENAMENTO DE COMBUSTIVEIS (codigo 01, 55)");
        setDelimiter("|");
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,3);
        decimal.setFormat(fw3);
                
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C171"));
        addFieldArchetype(NUM_TANQUE, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(QTDE, decimal);
    }
     
     
}
