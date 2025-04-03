package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 09:33:58
 * @author Thiago Balthazar
 */
public class RC174Test {

     @Test
    public void RC174Test1(){
        
        RC174 r = new RC174();
               
        LineModel model = r.createModel();
        
	model.setFieldValue(RC174.IND_ARM, "0");
        model.setFieldValue(RC174.NUM_ARM, "123546789");
        model.setFieldValue(RC174.DESCR_COMPL, "Calibre 12, 5 Cartuchos, Automática, Cano duplo");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C174|0|123546789|Calibre 12, 5 Cartuchos, Automática, Cano duplo|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
