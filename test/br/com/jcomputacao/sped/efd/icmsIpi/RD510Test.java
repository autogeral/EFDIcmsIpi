package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 10:20:32
 * @author Thiago Balthazar
 */
public class RD510Test {

     @Test
    public void RD510Test2() {// Somente itens obrigatórios
        
        RD510 r = new RD510();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(RD510.NUM_ITEM, 123 );
        model.setFieldValue(RD510.COD_ITEM, "0000306106S30A");
        model.setFieldValue(RD510.COD_CLASS, 1234);
        model.setFieldValue(RD510.QTD, 99.111);
        model.setFieldValue(RD510.UNID, "123456");
        model.setFieldValue(RD510.VL_ITEM, 10d );
        model.setFieldValue(RD510.VL_DESC, 10d);
        model.setFieldValue(RD510.CST_ICMS, 123);
        model.setFieldValue(RD510.CFOP, 1234);
        model.setFieldValue(RD510.VL_BC_ICMS, 10d);
        model.setFieldValue(RD510.ALIQ_ICMS, 123.00);
        model.setFieldValue(RD510.VL_ICMS, 10d);
        model.setFieldValue(RD510.VL_BC_ICMS_UF, 10d);
        model.setFieldValue(RD510.VL_ICMS_UF, 10d);
        model.setFieldValue(RD510.IND_REC,"0" );
        model.setFieldValue(RD510.COD_PART, "0000306106S30A");
        model.setFieldValue(RD510.VL_PIS, 10d );
        model.setFieldValue(RD510.VL_COFINS, 10d);
        model.setFieldValue(RD510.COD_CTA, "0000306106S30A" );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D510|123|0000306106S30A|1234|99,111|123456|10,00|10,00|123|1234|10,00|123,00|10,00|10,00|10,00|0|0000306106S30A|10,00|10,00|0000306106S30A|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
