package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 18/02/2013 11:12:41
 * @author Thiago Balthazar
 */
public class RC390Test {

    	
    @Test
    public void RC390Test(){
        
        RC390 r = new RC390();       

        LineModel model = r.createModel();
        
	model.setFieldValue(RC390.CST_ICMS , 123 );
        model.setFieldValue(RC390.CFOP , 1234);
        model.setFieldValue(RC390.ALIQ_ICMS , 123456.12);
        model.setFieldValue(RC390.VL_OPR , 123.00);
        model.setFieldValue(RC390.VL_BC_ICMS , 123.00 );
        model.setFieldValue(RC390.VL_ICMS , 123.00);
        model.setFieldValue(RC390.VL_RED_BC , 123.00 );
        model.setFieldValue(RC390.COD_OBS , "123456" );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C390|123|1234|123456,12|123,00|123,00|123,00|123,00|123456|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
