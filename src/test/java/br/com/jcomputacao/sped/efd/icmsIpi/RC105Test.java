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
 * 15/02/2013 08:41:37
 * @author Thiago Balthazar
 */
public class RC105Test {

    	
    @Test
    public void RC105Test() {
        
        RC105 r = new RC105();
             
        LineModel model = r.createModel();
        
	model.setFieldValue(RC105.OPER , 1 );
        model.setFieldValue(RC105.UF , "SP");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C105|1|SP|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
