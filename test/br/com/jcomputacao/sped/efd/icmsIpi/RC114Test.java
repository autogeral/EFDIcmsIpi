package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * 19/02/2013 16:26:29
 * @author Thiago Balthazar
 */
public class RC114Test {
    	
    @Test
    public void R114Test() throws ParseException{
        
        RC114 r = new RC114();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC114.COD_MOD , "02" );
        model.setFieldValue(RC114.ECF_FAB , "0001245" );
        model.setFieldValue(RC114.ECF_CX  , 123);
        model.setFieldValue(RC114.NUM_DOC , 123456 );
        model.setFieldValue(RC114.DT_DOC  , data );        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C114|02|0001245|123|123456|29012013|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
