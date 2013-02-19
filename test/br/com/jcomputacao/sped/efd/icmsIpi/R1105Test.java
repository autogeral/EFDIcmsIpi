package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 09:45:44
 * @author Thiago Balthazar
 */
public class R1105Test {
    	
    @Test
    public void R1105Test() throws ParseException{
        
        R1105 r = new R1105();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("19022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(R1105.COD_MOD , "55" );
        model.setFieldValue(R1105.SERIE , "254");
        model.setFieldValue(R1105.NUM_DOC ,  123456789);
        model.setFieldValue(R1105.CHV_NFE , "01234567890123456789012345678901234567891234");
        model.setFieldValue(R1105.DT_DOC , data );
        model.setFieldValue(R1105.COD_ITEM , "000546987561479ACV" );        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1105|55|254|123456789|01234567890123456789012345678901234567891234|19022013|000546987561479ACV|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
