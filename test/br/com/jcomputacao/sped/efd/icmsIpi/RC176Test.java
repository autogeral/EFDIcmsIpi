package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 10:05:10
 * @author Thiago Balthazar
 */
public class RC176Test  {

    @Test
    public void RC176Test1() throws ParseException{
        
        RC176 r = new RC176();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("18022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC176.COD_MOD_ULT_E ,"AB");
        model.setFieldValue(RC176.NUM_DOC_ULT_E , 123456789L);
        model.setFieldValue(RC176.SER_ULT_E , "ABC");
        model.setFieldValue(RC176.DT_ULT_E , data);
        model.setFieldValue(RC176.COD_PART_ULT_E , "1584698751236447896321");
        model.setFieldValue(RC176.QUANT_ULT_E , 123);
        model.setFieldValue(RC176.VL_UNIT_ULT_E , 123);
        model.setFieldValue(RC176.VL_UNIT_BC_ST , 123);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C176|AB|123456789|ABC|18022013|1584698751236447896321|123|123|123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
