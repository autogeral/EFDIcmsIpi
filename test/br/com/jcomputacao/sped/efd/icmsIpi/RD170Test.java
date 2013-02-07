package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.Model;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Test;

/**
 * 06/02/2013 10:21:47
 * @author Thiago Balthazar
 */
public class RD170Test {

    @Test
    public void RD170Test1(){
        
        RD170 r = new RD170();
        LineModel model = r.createModel();
        
        model.setFieldValue(r.COD_PART_CONSG, "00026876582868");
        model.setFieldValue(r.COD_PART_RED, "01910513000100");
        model.setFieldValue(r.COD_MUN_ORIG, 3589746);
        model.setFieldValue(r.COD_MUN_DEST, 3598651);
        model.setFieldValue(r.OTM, "05698456");
        model.setFieldValue(r.IND_NAT_FRT, "1");
        model.setFieldValue(r.VL_LIQ_FRT, 200.00);
        model.setFieldValue(r.VL_GRIS, 100.00);
        model.setFieldValue(r.VL_PDG, 50.00);
        model.setFieldValue(r.VL_OUT, 10.00);
        model.setFieldValue(r.VL_FRT, 360.00);
        model.setFieldValue(r.VEIC_ID, "cxg8090");
        model.setFieldValue(r.UF_ID, "SP");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D170|00026876582868|01910513000100|3589746|3598651|05698456|1|200,00|100,00|50,00|10,00|360,00|cxg8090|SP|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
