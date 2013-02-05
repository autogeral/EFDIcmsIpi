package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * 04/02/2013 09:54:33
 * @author Thiago Balthazar
 */
public class R0200Test {

    @Test
    public void testSemCodigoBarras() {
        R0200 r = new R0200();
        LineModel model = r.createModel();
        model.setFieldValue(R0200.COD_ITEM, "000647B");
        model.setFieldValue(R0200.DESCR_ITEM, "TAMBOR TRAS.");
        model.setFieldValue(R0200.UNID_INV, "PC");
        model.setFieldValue(R0200.TIPO_ITEM, 0);
        model.setFieldValue(R0200.COD_NCM, "87083090");
        model.setFieldValue(R0200.COD_GEN, 87);
        model.setFieldValue(R0200.ALIQ_ICMS, 0d);

        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0200|000647B|TAMBOR TRAS.|||PC|00|87083090||87|0000|0,00|";
                           
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testComCodigoBarras() {
        R0200 r = new R0200();
        LineModel model = r.createModel();
        model.setFieldValue(R0200.COD_ITEM, "001209-0");
        model.setFieldValue(R0200.DESCR_ITEM, "BIELETA DIANT VERSAILLES/SANTANA");
        model.setFieldValue(R0200.COD_BARRA, "7898476660193");
        model.setFieldValue(R0200.UNID_INV, "PC");
        model.setFieldValue(R0200.TIPO_ITEM, 0);
        model.setFieldValue(R0200.COD_NCM, "87089990");
        model.setFieldValue(R0200.COD_GEN, 87);
        model.setFieldValue(R0200.ALIQ_ICMS, 0d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0200|001209-0|BIELETA DIANT VERSAILLES/SANTANA|7898476660193||PC|00|87089990||87|0000|0,00|";

        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}