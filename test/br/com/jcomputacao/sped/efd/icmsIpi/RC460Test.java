package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 14:01:08
 * @author Thiago Balthazar
 */
public class RC460Test {
    
     @Test
    public void RC460Test() throws ParseException{
        
        RC460 r = new RC460();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("18022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC460.COD_MOD , "12");
        model.setFieldValue(RC460.COD_SIT , 11);
        model.setFieldValue(RC460.NUM_DOC , 123456);
        model.setFieldValue(RC460.DT_DOC ,data);
        model.setFieldValue(RC460.VL_DOC , 123456.12);
        model.setFieldValue(RC460.VL_PIS , 123.00);
        model.setFieldValue(RC460.VL_COFINS ,123.00);
        model.setFieldValue(RC460.CPF_CNPJ , 38462670829L);
        model.setFieldValue(RC460.NOM_ADQ , "Thiago Balthazar de Moura Souza");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C460|12|11|123456|18022013|123456,12|123,00|123,00|38462670829|Thiago Balthazar de Moura Souza|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
