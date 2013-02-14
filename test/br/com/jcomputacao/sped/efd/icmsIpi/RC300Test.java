package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 14/02/2013 09:44:59
 * @author Thiago Balthazar
 */
public class RC300Test {

     @Test
    public void RD100Test2() throws ParseException{
        
        RC300 r = new RC300();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("14022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC300.COD_MOD, "AB");
        model.setFieldValue(RC300.SER, "1234");
        model.setFieldValue(RC300.SUB, "123");
        model.setFieldValue(RC300.NUM_DOC_INI, 123456);
        model.setFieldValue(RC300.NUM_DOC_FIN, 123456);
        model.setFieldValue(RC300.DT_DOC, data);
        model.setFieldValue(RC300.VL_DOC, 120d);
        model.setFieldValue(RC300.VL_PIS,120d);
        model.setFieldValue(RC300.VL_COFINS, 120d);
        model.setFieldValue(RC300.COD_CTA, "123456789012345678901234567890123456789012345678901234567890");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C300|AB|1234|123|123456|123456|14022013|120,00|120,00|120,00|123456789012345678901234567890123456789012345678901234567890|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
