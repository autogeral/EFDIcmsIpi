package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 18/02/2013 16:49:58
 * @author Thiago Balthazar
 */
public class RC791Test {

    @Test
    public void RD100Test2() {
    
        RC791 r = new RC791();
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC791.UF ,"SP" );
        model.setFieldValue(RC791.VL_BC_ICMS_ST , 120.00);
        model.setFieldValue(RC791.VL_ICMS_ST, 120.00);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C791|SP|120,00|120,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
