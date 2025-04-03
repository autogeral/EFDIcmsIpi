package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 15:56:09
 * @author Thiago Balthazar
 */
public class RC890Test {
    
    @Test
    public void RC890Test() {
        
        RC890 r = new RC890();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RC890.CST_ICMS , 123);
        model.setFieldValue(RC890.CFOP , 1234);
        model.setFieldValue(RC890.ALIQ_ICMS , 123456.12);
        model.setFieldValue(RC890.VL_OPR , 120.00);
        model.setFieldValue(RC890.VL_BC_ICMS ,120.00 );
        model.setFieldValue(RC890.VL_ICMS , 120.00);
        model.setFieldValue(RC890.COD_OBS , "0012AD");        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C890|123|1234|123456,12|120,00|120,00|120,00|0012AD|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
