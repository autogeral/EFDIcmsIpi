package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 16:06:07
 * @author Thiago Balthazar
 */
public class RC860Test {

    @Test
    public void RC860Test1() throws ParseException{
        
        RC860 r = new RC860();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("18022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC860.COD_MOD , "12");
        model.setFieldValue(RC860.NR_SAT, 123456789);
        model.setFieldValue(RC860.DT_DOC, data);
        model.setFieldValue(RC860.DOC_INI, 123456);
        model.setFieldValue(RC860.DOC_FIM, 654321);        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C860|12|123456789|18022013|123456|654321|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
