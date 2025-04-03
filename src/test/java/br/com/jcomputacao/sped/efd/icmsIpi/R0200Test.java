package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * 04/02/2013 09:54:33
 * @author Thiago Balthazar
 */
public class R0200Test {
    
    @BeforeClass
    public static void configure() {
        System.setProperty("fileGenerator.debug", "true");
    }

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
    
        
    @Test
    public void testR200Picanha() throws ParseException {
        String linha = "|0200|0000371|MALZBIER BRAHMA LONG NECK 355ML SIX-PACK BANDEJA C|7891149040360||CX|00|22030000||22|0000|0,00|";
        R0200 r = new R0200();
        LineModel model = r.createModel();
        model.setRepresentation(linha);
        
        String a = model.getFieldValueString(R0200.DESCR_ITEM);
        assertEquals("MALZBIER BRAHMA LONG NECK 355ML SIX-PACK BANDEJA C", a);
        a = model.getFieldValueString(R0200.COD_BARRA);
        assertEquals("7891149040360", a);
        a = model.getFieldValueString(R0200.COD_NCM);
        assertEquals("22030000", a);
        a = model.getFieldValueNumber(R0200.COD_GEN).toString();
        assertEquals("22", a);
        Object o = model.getFieldValue(R0200.COD_LST);
        assertEquals(null, o);
        o = model.getFieldValue(R0200.ALIQ_ICMS);
        assertEquals(null, o);
        
        assertEquals(linha, model.getRepresentation().toString());
    }

}