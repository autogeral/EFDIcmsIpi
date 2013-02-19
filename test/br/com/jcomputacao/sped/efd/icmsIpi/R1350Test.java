package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 19/02/2013 12:04:51
 * @author Thiago Balthazar
 */
public class R1350Test {

     @Test
    public void R1350Test() throws ParseException{
        
        R1350 r = new R1350();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(R1350.SERIE        , "00021235856542");
        model.setFieldValue(R1350.FABRICANTE   , "1235481235498");
        model.setFieldValue(R1350.MODELO       , "12358565231");
        model.setFieldValue(R1350.TIPO_MEDICAO , "1");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1350|00021235856542|1235481235498|12358565231|1|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
