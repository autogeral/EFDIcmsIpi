package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 16:53:35
 * @author Thiago Balthazar
 */
public class RC116Test {

      @Test
    public void R116Test() throws ParseException{
        
        RC116 r = new RC116();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        
        LineModel model = r.createModel();
        
       model.setFieldValue(RC116.COD_MOD , "12" );
       model.setFieldValue(RC116.NR_SAT  , 123456789 );
       model.setFieldValue(RC116.CHV_CFE , "01234567890123456789012345678901234567891234" );
       model.setFieldValue(RC116.NUM_CFE , 123456 );
       model.setFieldValue(RC116.DT_DOC  , data );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C116|12|123456789|01234567890123456789012345678901234567891234|123456|29012013|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
