package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 15/02/2013 08:22:08
 * @author Thiago Balthazar
 */
public class RC350Test {

    @Test
    public void RC350Test1() throws ParseException{ // COm CNPJ
        
        RC350 r = new RC350();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("15022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC350.SER , "ABC");
        model.setFieldValue(RC350.SUB_SER , "ABC");
        model.setFieldValue(RC350.NUM_DOC ,123456);
        model.setFieldValue(RC350.DT_DOC ,data);
        model.setFieldValue(RC350.CNPJ_CPF , 12345678901234L );
        model.setFieldValue(RC350.VL_MERC , 0d);
        model.setFieldValue(RC350.VL_DOC ,0d);
        model.setFieldValue(RC350.VL_DESC ,0d);
        model.setFieldValue(RC350.VL_PIS ,0d);
        model.setFieldValue(RC350.VL_COFINS ,0d);
        model.setFieldValue(RC350.COD_CTA ,"ABC123456789");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C350|ABC|ABC|123456|15022013|12345678901234|0,00|0,00|0,00|0,00|0,00|ABC123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void RC350Test2() throws ParseException{ // COm CPF
        
        RC350 r = new RC350();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("15022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC350.SER , "ABC");
        model.setFieldValue(RC350.SUB_SER , "ABC");
        model.setFieldValue(RC350.NUM_DOC ,123);
        model.setFieldValue(RC350.DT_DOC ,data);
        model.setFieldValue(RC350.CNPJ_CPF , 38462670829L );
        model.setFieldValue(RC350.VL_MERC , 0d);
        model.setFieldValue(RC350.VL_DOC ,0d);
        model.setFieldValue(RC350.VL_DESC ,0d);
        model.setFieldValue(RC350.VL_PIS ,0d);
        model.setFieldValue(RC350.VL_COFINS ,0d);
        model.setFieldValue(RC350.COD_CTA ,"ABC123456789");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C350|ABC|ABC|123|15022013|38462670829|0,00|0,00|0,00|0,00|0,00|ABC123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
