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
 * 06/02/2013 09:11:19
 * @author Thiago Balthazar
 */
public class RD162Test {
    
    @Test
    public void RD162Test1() throws ParseException{
        
        RD162 r = new RD162();
               
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
               
        model.setFieldValue(r.COD_MOD, "12");
        model.setFieldValue(r.SER, "1234");
        model.setFieldValue(r.NUM_DOC, 123456789);
        model.setFieldValue(r.DT_DOC, data);
        model.setFieldValue(r.VL_DOC,150.00 );
        model.setFieldValue(r.VL_MERC, 150.00);
        model.setFieldValue(r.QTD_VOL, 5);
        model.setFieldValue(r.PESO_BRT, 10.10);
        model.setFieldValue(r.PESO_LIQ, 10.10);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D162|12|1234|123456789|29012013|150,00|150,00|5|10,10|10,10|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
    
     
    @Test
    public void RD162Test2() throws ParseException{
        
        RD162 r = new RD162();
               
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("06022013");
               
        model.setFieldValue(r.COD_MOD, "55");
        model.setFieldValue(r.SER, "1234");
        model.setFieldValue(r.NUM_DOC, 123456789);
        model.setFieldValue(r.DT_DOC, data);
        model.setFieldValue(r.VL_DOC,150.00 );
        model.setFieldValue(r.VL_MERC, 150.00);
        model.setFieldValue(r.QTD_VOL, 5);
        model.setFieldValue(r.PESO_BRT, 100d);
        model.setFieldValue(r.PESO_LIQ, 100d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D162|55|1234|123456789|06022013|150,00|150,00|5|100,00|100,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
}
