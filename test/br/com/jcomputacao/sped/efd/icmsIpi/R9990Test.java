package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Murilo
 */
public class R9990Test {

    @Test
    public void testSomeMethod() {
        R9990 reg = new R9990();
        LineModel line = reg.createModel();
        line.setFieldValue(R9990.QTD_LIN_9, 87654321);

        StringBuffer sb = line.getRepresentation();
        String result = sb.toString();
        String expected = "|9990|87654321|";
        assertEquals(expected, result);
    }
}
