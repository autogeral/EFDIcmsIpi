package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 15:04:29
 * @author Thiago Balthazar
 */
public class RC495Test {
        
    @Test
    public void RC495Test() {
        
        RC495 r = new RC495();
               
        LineModel model = r.createModel();
        
       model.setFieldValue(RC495.ALIQ_ICMS , 123456.12);
       model.setFieldValue(RC495.COD_ITEM , "0005498566AB");
       model.setFieldValue(RC495.QTD , 123.123);
       model.setFieldValue(RC495.QTD_CANC , 123.123);
       model.setFieldValue(RC495.UNID , "123456");
       model.setFieldValue(RC495.VL_ITEM , 120.00);
       model.setFieldValue(RC495.VL_DESC , 120.00);
       model.setFieldValue(RC495.VL_CANC , 120.00);
       model.setFieldValue(RC495.VL_ACMO , 120.00);
       model.setFieldValue(RC495.VL_BC_ICMS , 120.00);
       model.setFieldValue(RC495.VL_ICMS , 120.00);
       model.setFieldValue(RC495.VL_ISEN , 120.00);
       model.setFieldValue(RC495.VL_NT , 120.00);
       model.setFieldValue(RC495.VL_ICMS_ST , 120.00);
             
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C495|123456,12|0005498566AB|123,123|123,123|123456|120,00|120,00|120,00|120,00|120,00|120,00|120,00|120,00|120,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
