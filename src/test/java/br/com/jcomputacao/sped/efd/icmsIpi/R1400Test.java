package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 19/02/2013 14:20:28
 * @author Thiago Balthazar
 */
public class R1400Test {

    @Test
    public void RTest() {
        
        R1400 r = new R1400();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(R1400.COD_ITEM , "000012254ad" );
        model.setFieldValue(R1400.MUN      , 3564789 );
        model.setFieldValue(R1400.VALOR    , 1546.59 );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1400|000012254ad|3564789|1546,59|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
