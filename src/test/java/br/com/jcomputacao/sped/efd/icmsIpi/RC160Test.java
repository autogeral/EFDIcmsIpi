package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 15/02/2013 09:38:13
 * @author Thiago Balthazar
 */
public class RC160Test {

    @Test
    public void RC160Test1(){
    
        RC160 r = new RC160();
        LineModel model = r.createModel();
        
        model.setFieldValue(RC160.COD_PART, "05519239000196");
        model.setFieldValue(RC160.VEIC_ID, "cxz8090");
        model.setFieldValue(RC160.QTD_VOL, 50);
        model.setFieldValue(RC160.PESO_BRT, 12.54);
        model.setFieldValue(RC160.PESO_LIQ, 40.12);
        model.setFieldValue(RC160.UF_ID, "SP");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C160|05519239000196|cxz8090|50|12,54|40,12|SP|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
}
