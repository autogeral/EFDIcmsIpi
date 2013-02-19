package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 10:32:58
 * @author Thiago Balthazar
 */
public class R1200Test {

     @Test
    public void RTest() {
        
        R1200 r = new R1200();
                      
        LineModel model = r.createModel();
        
	model.setFieldValue(R1200.COD_AJ_APUR , "12345678" );
        model.setFieldValue(R1200.SLD_CRED , 15.13 );
        model.setFieldValue(R1200.CRED_APR , 15.13 );
        model.setFieldValue(R1200.CRED_RECEB , 15.13 );
        model.setFieldValue(R1200.CRED_UTIL , 15.13 );
        model.setFieldValue(R1200.SLD_CRED_FIM , 15.13 );
       
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1200|12345678|15,13|15,13|15,13|15,13|15,13|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
