package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.Model;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

/**
 * 11/02/2013 11:50:15
 * @author Thiago Balthazar
 */
public class RD600Test {

    @Test
    public void RD600Test() throws ParseException{
        
        RD600 r = new RD600();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("11022013");
        
        LineModel model = r.createModel();

        model.setFieldValue(RD600.COD_MOD, "AD");
        model.setFieldValue(RD600.COD_MUN, 3512345);
        model.setFieldValue(RD600.SER, "ABCD");
        model.setFieldValue(RD600.SUB, 13);
        model.setFieldValue(RD600.COD_CONS, 12);
        model.setFieldValue(RD600.QTD_CONS, 123456789);
        model.setFieldValue(RD600.DT_DOC, data);
        model.setFieldValue(RD600.VL_DOC, 10d);
        model.setFieldValue(RD600.VL_DESC , 10d);
        model.setFieldValue(RD600.VL_SERV, 10d);
        model.setFieldValue(RD600.VL_SERV_NT, 10d);
        model.setFieldValue(RD600.VL_TERC, 10d);
        model.setFieldValue(RD600.VL_DA,10d);
        model.setFieldValue(RD600.VL_BC_ICMS, 10d);
        model.setFieldValue(RD600.VL_ICMS, 10d);
        model.setFieldValue(RD600.VL_PIS, 10d);
        model.setFieldValue(RD600.VL_COFINS, 10d);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D600|AD|3512345|ABCD|13|12|123456789|11022013|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
