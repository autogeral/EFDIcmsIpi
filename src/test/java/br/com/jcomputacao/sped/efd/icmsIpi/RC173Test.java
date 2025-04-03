package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 15/02/2013 11:38:51
 * @author Thiago Balthazar
 */
public class RC173Test {
    
    
    @Test
     public void RC173Test() throws ParseException{
    
        RC173 r = new RC173();
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        Date data1 = sdf.parse("15022013");
        
        model.setFieldValue(RC173.LOTE_MED , "ABCDEFGH");
        model.setFieldValue(RC173.QTD_ITEM, 123.123);
        model.setFieldValue(RC173.DT_FAB, data);
        model.setFieldValue(RC173.DT_VAL, data1);
        model.setFieldValue(RC173.IND_MED, "1");
        model.setFieldValue(RC173.TP_PROD, "0" );
        model.setFieldValue(RC173.VL_TAB_MAX, 12.00);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C173|ABCDEFGH|123,123|29012013|15022013|1|0|12,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
