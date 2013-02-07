package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 05/02/2013 15:56:36
 * @author Thiago Balthazar
 */


public class RD150Test {

    @Test
     public void test1() {
        RD150 r = new RD150();
        LineModel model = r.createModel();
                   
        model.setFieldValue(r.COD_MUN_ORIG, 3540606);
        model.setFieldValue(r.COD_MUN_DEST, 3540705);
        model.setFieldValue(r.VEIC_ID,"");
        model.setFieldValue(r.VIAGEM, 12 );
        model.setFieldValue(r.IND_TFA, "0");
        model.setFieldValue(r.VL_PESO_TX, 100.00);
        model.setFieldValue(r.VL_TX_TERR, 100.00);
        model.setFieldValue(r.VL_TX_RED, 100.00);
        model.setFieldValue(r.VL_OUT, 100.00);
        model.setFieldValue(r.VL_TX_ADV, 100.00);
           
               
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D150|3540606|3540705||12|0|100,00|100,00|100,00|100,00|100,00|";
        
       System.out.println("Excecting ....  : " + expected);    
       System.out.println("Result    ....  : " + result);
       assertEquals(expected, result);
    }
    
    @Test
     public void test2() {
        RD150 r = new RD150();
        LineModel model = r.createModel();
                   
        model.setFieldValue(r.COD_MUN_ORIG, 3540606);
        model.setFieldValue(r.COD_MUN_DEST, 3540705);
        model.setFieldValue(r.VEIC_ID,"");
        model.setFieldValue(r.VIAGEM, 12 );
        model.setFieldValue(r.IND_TFA, "1");
        model.setFieldValue(r.VL_PESO_TX, 0d);
        model.setFieldValue(r.VL_TX_TERR,0d);
        model.setFieldValue(r.VL_TX_RED, 0d);
        model.setFieldValue(r.VL_OUT, 0d);
        model.setFieldValue(r.VL_TX_ADV, 0d);
           
               
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D150|3540606|3540705||12|1|0,00|0,00|0,00|0,00|0,00|";
        
       System.out.println("Excecting ....  : " + expected);    
       System.out.println("Result    ....  : " + result);
       assertEquals(expected, result);
    }
}
