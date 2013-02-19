package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 11:05:17
 * @author Thiago Balthazar
 */
public class R1300Test {

    @Test
    public void R1300Test() throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("19022013");
        
        R1300 r = new R1300();
                      
        LineModel model = r.createModel();
        
	model.setFieldValue(R1300.COD_ITEM     , "0001235785655" );
        model.setFieldValue(R1300.DT_FECH      , data);
        model.setFieldValue(R1300.ESTQ_ABERT   , 123.123);
        model.setFieldValue(R1300.VOL_ENTR     , 123.123);
        model.setFieldValue(R1300.VOL_DISP     , 123.123);
        model.setFieldValue(R1300.VOL_SAIDAS   , 123.123);
        model.setFieldValue(R1300.ESTQ_ESCR    , 123.123);
        model.setFieldValue(R1300.VAL_AJ_PERDA , 123.123);
        model.setFieldValue(R1300.VAL_AJ_GANHO , 123.123);
        model.setFieldValue(R1300.FECH_FISICO  , 123.123);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1300|0001235785655|19022013|123,123|123,123|123,123|123,123|123,123|123,123|123,123|123,123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
