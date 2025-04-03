package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 10:24:07
 * @author Thiago Balthazar
 */
public class RC178Test {

     @Test
    public void RD178Test1(){        
         
        RC178 r = new RC178();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RC178.CL_ENQ, "12345");
        model.setFieldValue(RC178.VL_UNID, 10.10);
        model.setFieldValue(RC178.QUANT_PAD, 10.123);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C178|12345|10,10|10,123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
