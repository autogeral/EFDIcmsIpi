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
 * 13/02/2013 08:31:39
 * @author Thiago Balthazar
 */
public class RD990Test {

     @Test
    public void RD990Test1() {
        
        RD990 r = new RD990();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RD990.QTD_LIN_D, 123456789);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D990|123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
