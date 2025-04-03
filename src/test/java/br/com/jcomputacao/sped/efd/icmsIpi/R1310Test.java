package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 19/02/2013 11:20:44
 * @author Thiago Balthazar
 */
public class R1310Test {

    @Test
    public void R1310Test() {
                 
        R1310 r = new R1310();
                      
        LineModel model = r.createModel();
        
	model.setFieldValue(R1310.NUM_TANQUE   , "159" );
        model.setFieldValue(R1310.ESTQ_ABERT   , 123.123);
        model.setFieldValue(R1310.VOL_ENTR     , 123.123);
        model.setFieldValue(R1310.VOL_DISP     , 123.123);
        model.setFieldValue(R1310.VOL_SAIDAS   , 123.123);
        model.setFieldValue(R1310.ESTQ_ESCR    , 123.123);
        model.setFieldValue(R1310.VAL_AJ_PERDA , 123.123);
        model.setFieldValue(R1310.VAL_AJ_GANHO , 123.123);
        model.setFieldValue(R1310.FECH_FISICO  , 123.123);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1310|159|123,123|123,123|123,123|123,123|123,123|123,123|123,123|123,123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
