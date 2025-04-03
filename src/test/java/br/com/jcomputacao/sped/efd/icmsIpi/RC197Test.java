package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.Model;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

/**
 * 14/02/2013 09:05:28
 * @author Thiago Balthazar
 */
public class RC197Test {
	
    @Test
    public void RC197Test1() {
        
        RC197 r = new RC197();
               
        LineModel model = r.createModel();
        
	model.setFieldValue(RC197.COD_AJ, "0123456789" );
        model.setFieldValue(RC197.DESCR_COMPL_AJ, "Documento XYZ123456789123456789");
        model.setFieldValue(RC197.COD_ITEM, "012345678901234567890123456789012345678901234567890123456789");
        model.setFieldValue(RC197.VL_BC_ICMS, 12345.00);
        model.setFieldValue(RC197.ALIQ_ICMS,123456.12);
        model.setFieldValue(RC197.VL_ICMS,10.00);
        model.setFieldValue(RC197.VL_OUTROS, 0d);      
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C197|0123456789|Documento XYZ123456789123456789|012345678901234567890123456789012345678901234567890123456789|12345,00|123456,12|10,00|0,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
