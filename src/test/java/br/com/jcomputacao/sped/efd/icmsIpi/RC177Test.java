package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 18/02/2013 10:15:32
 * @author Thiago Balthazar
 */
public class RC177Test {
   
      @Test
    public void RC177Test2(){
        
        RC177 r = new RC177();
                   
        LineModel model = r.createModel();
        
	model.setFieldValue(RC177.COD_SELO_IPI , "123456");
        model.setFieldValue(RC177.QT_SELO_IPI , 123456789012L);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C177|123456|123456789012|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
