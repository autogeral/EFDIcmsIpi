package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 18/02/2013 11:48:40
 * @author Thiago Balthazar
 */
public class RC405Test {
    	
    @Test
    public void RC405Test() throws ParseException{
        
        RC405 r = new RC405();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("18022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC405.DT_DOC , data );
        model.setFieldValue(RC405.CRO , 123);
        model.setFieldValue(RC405.CRZ , 123456);
        model.setFieldValue(RC405.NUM_COO_FIN , 123456);
        model.setFieldValue(RC405.GT_FIN ,12.11 );
        model.setFieldValue(RC405.VL_BRT , 12.12);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C405|18022013|123|123456|123456|12,11|12,12|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
