package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 10:10:45
 * @author Thiago Balthazar
 */
public class R1110Test {

     @Test
    public void R1110Test() throws ParseException{
        
        R1110 r = new R1110();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(R1110.COD_PART , "00002356548796311");
        model.setFieldValue(R1110.COD_MOD , "1B");
        model.setFieldValue(R1110.SER, "1234");
        model.setFieldValue(R1110.NUM_DOC, 123456789);
        model.setFieldValue(R1110.DT_DOC, data);
        model.setFieldValue(R1110.CHV_NFE, "01324567890123456789012345678901234567891234");
        model.setFieldValue(R1110.NR_MEMO, 5897);
        model.setFieldValue(R1110.QTD, 100.000);
        model.setFieldValue(R1110.UNID, "123456");
                
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1110|00002356548796311|1B|1234|123456789|29012013|01324567890123456789012345678901234567891234|5897|100,000|123456|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
