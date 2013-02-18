package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 10:51:50
 * @author Thiago Balthazar
 */
public class RC370Test {
    	
    @Test
    public void RC370Test() {
        
        RC370 r = new RC370();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RC370.NUM_ITEM ,123 );
        model.setFieldValue(RC370.COD_ITEM ,"1239898456217896541541");
        model.setFieldValue(RC370.QTD,100.000);
        model.setFieldValue(RC370.UNID, "123456");
        model.setFieldValue(RC370.VL_ITEM, 10.00);
        model.setFieldValue(RC370.VL_DESC, 123456.00);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C370|123|1239898456217896541541|100,000|123456|10,00|123456,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
