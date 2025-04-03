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
 * 11/02/2013 10:57:06
 * @author Thiago Balthazar
 */
public class RD530Test {

    
    @Test
    public void RD520Test1() throws ParseException{
        
        RD530 r = new RD530();
                   
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        Date data2 = sdf.parse("11022013");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMyyyy");
        Date data3 = sdf2.parse("012013");
        
        LineModel model = r.createModel();
     
        model.setFieldValue(RD530.IND_SERV, "1");
        model.setFieldValue(RD530.DT_INI_SERV, data);
        model.setFieldValue(RD530.DT_FIN_SERV, data2);
        model.setFieldValue(RD530.PER_FISCAL, data3 );
        model.setFieldValue(RD530.COD_AREA, "A123");
        model.setFieldValue(RD530.TERMINAL, 1234567891011L);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D530|1|29012013|11022013|012013|A123|1234567891011|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
