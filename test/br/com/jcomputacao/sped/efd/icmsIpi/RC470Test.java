package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 14:22:14
 * @author Thiago Balthazar
 */
public class RC470Test {

    @Test
    public void RC470Test() {
        
        RC470 r = new RC470();
                      
        LineModel model = r.createModel();
        
       model.setFieldValue(RC470.COD_ITEM ,"123456789ABCDEFG");
       model.setFieldValue(RC470.QTD , 123.123 );
       model.setFieldValue(RC470.QTD_CANC , 123.123);
       model.setFieldValue(RC470.UNID , "123456");
       model.setFieldValue(RC470.VL_ITEM , 120.00);
       model.setFieldValue(RC470.CST_ICMS , 123);
       model.setFieldValue(RC470.CFOP , 1234);
       model.setFieldValue(RC470.ALIQ_ICMS , 123456.12);
       model.setFieldValue(RC470.VL_PIS ,120.00 );
       model.setFieldValue(RC470.VL_COFINS ,120.00 );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C470|123456789ABCDEFG|123,123|123,123|123456|120,00|123|1234|123456,12|120,00|120,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
