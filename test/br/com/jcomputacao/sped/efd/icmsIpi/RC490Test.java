package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 14:40:28
 * @author Thiago Balthazar
 */
public class RC490Test {

    @Test
    public void RC490Test() {
        
        RC490 r = new RC490();
                       
        LineModel model = r.createModel();

       model.setFieldValue(RC490.CST_ICMS , 123 );
       model.setFieldValue(RC490.CFOP , 1234 );
       model.setFieldValue(RC490.ALIQ_ICMS , 123456.12 );
       model.setFieldValue(RC490.VL_OPR ,120.00 );
       model.setFieldValue(RC490.VL_BC_ICMS , 120.00 );
       model.setFieldValue(RC490.VL_ICMS , 120.00 );
       model.setFieldValue(RC490.COD_OBS ,"123456" );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C490|123|1234|123456,12|120,00|120,00|120,00|123456|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
