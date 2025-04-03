package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 12:12:04
 * @author Thiago Balthazar
 */
public class R1360Test {

    @Test
    public void R1360Test() throws ParseException{
        
        R1360 r = new R1360();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("19022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(R1360.NUM_LACRE    , "12680001235548322135" );
        model.setFieldValue(R1360.DT_APLICACAO , data);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1360|12680001235548322135|19022013|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
