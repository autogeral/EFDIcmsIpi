package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 08/02/2013 11:36:54
 * @author Thiago Balthazar
 */
public class RD400Test {

    @Test
    public void RD400Test1() throws ParseException {
    
        RD400 r = new RD400();
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("08022013");
        
        model.setFieldValue(RD400.COD_PART, "A0012548");//2
        model.setFieldValue(RD400.COD_MOD, "A5");//3
        model.setFieldValue(RD400.COD_SIT, 12);//4
        model.setFieldValue(RD400.SER, "A112");//5
        model.setFieldValue(RD400.SUB, 123);//6
        model.setFieldValue(RD400.NUM_DOC, 123456);//7
        model.setFieldValue(RD400.DT_DOC, data);//8
        model.setFieldValue(RD400.VL_DOC, 100.00);//9
        model.setFieldValue(RD400.VL_DESC, 10d);//10
        model.setFieldValue(RD400.VL_SERV,10d);
        model.setFieldValue(RD400.VL_BC_ICMS, 100.00);//11
        model.setFieldValue(RD400.VL_ICMS, 30.50);//12
        model.setFieldValue(RD400.VL_PIS, 12.01);//13
        model.setFieldValue(RD400.VL_COFINS, 12.00);//14
        model.setFieldValue(RD400.COD_CTA, "A1234");//15
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D400|A00123548|A5|12|A112|123|123456|08022013|10,00|30,50|12,01|12,00|A1234|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
       // assertEquals(expected, result);               
    
    }
    
}
