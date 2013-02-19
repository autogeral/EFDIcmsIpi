package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 19/02/2013 10:46:10
 * @author Thiago Balthazar
 */
public class R1210Test {
    
    @Test
    public void RTest() {
        
        R1210 r = new R1210();
            
        
        LineModel model = r.createModel();
        
	model.setFieldValue(R1210.TIPO_UTIL , "4562" );
        model.setFieldValue(R1210.NR_DOC , "00002354897961233");
        model.setFieldValue(R1210.VL_CRED_UTIL , 987545.99);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1210|4562|00002354897961233|987545,99|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
