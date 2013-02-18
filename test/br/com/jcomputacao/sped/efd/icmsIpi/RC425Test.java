package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 13:48:49
 * @author Thiago Balthazar
 */
public class RC425Test {

    @Test
    public void RC425Test() {
        
        RC425 r = new RC425();
               
        LineModel model = r.createModel();
        
	model.setFieldValue(RC425.COD_ITEM , "123548AC" );
        model.setFieldValue(RC425.QTD , 123.123);
        model.setFieldValue(RC425.UNID , "123456");
        model.setFieldValue(RC425.VL_ITEM , 120.00);
        model.setFieldValue(RC425.VL_PIS ,123.00 );
        model.setFieldValue(RC425.VL_COFINS , 1235.12);
           
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C425|123548AC|123,123|123456|120,00|123,00|1235,12|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
