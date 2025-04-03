package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 29/01/2013 18:50:45
 * @author Murilo
 */
public class R0015Test {

    public R0015Test() {
    }

    @Test
    public void test() {
        R0015 r = new R0015();
        LineModel model = r.createModel();
        model.setFieldValue(R0015.UF_ST, "SP");
        model.setFieldValue(R0015.IE_ST, "SUBSTITUIDO123");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0015|SP|SUBSTITUIDO123|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}