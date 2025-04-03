package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 14/02/2013 10:48:59
 * @author Thiago Balthazar
 */
public class RC321Test {

     @Test
    public void RC321Test1() {
        
        RC321 r = new RC321();
        LineModel model = r.createModel();
        
	model.setFieldValue(RC321.COD_ITEM, "ABC0132456789" );
        model.setFieldValue(RC321.QTD,0.123);
        model.setFieldValue(RC321.UNID, "123456");
        model.setFieldValue(RC321.VL_ITEM, 0d);
        model.setFieldValue(RC321.VL_DESC, 0d);
        model.setFieldValue(RC321.VL_BC_ICMS, 0d);
        model.setFieldValue(RC321.VL_ICMS, 0d);
        model.setFieldValue(RC321.VL_PIS, 0d);
        model.setFieldValue(RC321.VL_COFINS, 0d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C321|ABC0132456789|0,123|123456|0,00|0,00|0,00|0,00|0,00|0,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
