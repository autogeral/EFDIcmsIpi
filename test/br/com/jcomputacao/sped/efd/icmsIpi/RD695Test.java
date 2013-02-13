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
 * 11/02/2013 14:56:22
 * @author Thiago Balthazar
 */
public class RD695Test {

    @Test
    public void RD695Test1() throws ParseException{
        
     RD695 r = new RD695();
       
     LineModel model = r.createModel();
                        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("11022013");
        
        model.setFieldValue(RD695.COD_MOD, "12");
        model.setFieldValue(RD695.SER, "1234");
        model.setFieldValue(RD695.NRO_ORD_INI,123456789);
        model.setFieldValue(RD695.NRO_ORD_FIN,123456789);
        model.setFieldValue(RD695.DT_DOC_INI,data);
        model.setFieldValue(RD695.DT_DOC_FIN,data);
        model.setFieldValue(RD695.NOM_MEST, "AD5401");
        model.setFieldValue(RD695.CHV_COD_DIG,"AGHIYQ5123");
               
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D695|12|1234|123456789|123456789|11022013|11022013|AD5401|AGHIYQ5123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

    
}
