package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 13:58:14
 * @author Thiago Balthazar
 */
public class RD610Test {

      @Test
    public void RD610Test1() {
        
        RD610 r = new RD610();
    
        LineModel model = r.createModel();
 
        model.setFieldValue(RD610.COD_CLASS , 1234);
        model.setFieldValue(RD610.COD_ITEM, "A123456");
        model.setFieldValue(RD610.QTD, 10.123);
        model.setFieldValue(RD610.UNID, "As45");
        model.setFieldValue(RD610.VL_ITEM,10.00);
        model.setFieldValue(RD610.VL_DESC, 10.00);
        model.setFieldValue(RD610.CST_ICMS, 123);
        model.setFieldValue(RD610.CFOP, 1234);
        model.setFieldValue(RD610.ALIQ_ICMS, 123.45);
        model.setFieldValue(RD610.VL_BC_ICMS, 10.00);
        model.setFieldValue(RD610.VL_ICMS, 10.00);
        model.setFieldValue(RD610.VL_BC_ICMS_UF, 10.00);
        model.setFieldValue(RD610.VL_ICMS_UF, 10.00);
        model.setFieldValue(RD610.VL_RED_BC, 10.00);
        model.setFieldValue(RD610.VL_PIS, 10.00);
        model.setFieldValue(RD610.VL_COFINS, 10.00);
        model.setFieldValue(RD610.COD_CTA,"AB123456789");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D610|1234|A123456|10,123|As45|10,00|10,00|123|1234|123,45|10,00|10,00|10,00|10,00|10,00|10,00|10,00|AB123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
