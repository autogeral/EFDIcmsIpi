package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 11:26:10
 * @author Thiago Balthazar
 */
public class RC400Test {
    
     @Test
    public void RC400Test() {
        
        RC400 r = new RC400();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(RC400.COD_MOD , "2D" );
        model.setFieldValue(RC400.ECF_MOD , "3658AA45896542ADFGQW");
        model.setFieldValue(RC400.ECF_FAB , "123456789A123456789A");
        model.setFieldValue(RC400.ECF_CX , 123 );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C400|2D|3658AA45896542ADFGQW|123456789A123456789A|123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
