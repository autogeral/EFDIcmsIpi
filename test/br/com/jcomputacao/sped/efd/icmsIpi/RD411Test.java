package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 09:02:28
 * @author Thiago Balthazar
 */
public class RD411Test {

     @Test
    public void RD411Test1(){
             
        RD411 r = new RD411();
                   
        LineModel model = r.createModel();
        
        
	model.setFieldValue(RD411.NUM_DOC_CANC, 123456789);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D411|123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
