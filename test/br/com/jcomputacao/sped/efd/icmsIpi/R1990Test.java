package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Murilo
 */
public class R1990Test {
    
    @Test
    public void testSomeMethod() {
        R1990 reg = new R1990();
        LineModel line = reg.createModel();
        line.setFieldValue(R1990.QTD_LIN_1, 87654321);

        StringBuffer sb = line.getRepresentation();
        String result = sb.toString();
        String expected = "|1990|87654321|";
        assertEquals(expected, result);
    }
}
