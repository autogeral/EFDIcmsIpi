package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 09:47:34
 * @author Thiago Balthazar
 */
public class RC175Test {

    @Test
    public void RC175Test1(){
        
        RC175 r = new RC175();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(RC175.IND_VEIC_OPER, "0");
        model.setFieldValue(RC175.CNPJ, 12345678901234L);
        model.setFieldValue(RC175.UF, "SP");
        model.setFieldValue(RC175.CHASSI_VEIC, "12345678901234567");
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C175|0|12345678901234|SP|12345678901234567|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
