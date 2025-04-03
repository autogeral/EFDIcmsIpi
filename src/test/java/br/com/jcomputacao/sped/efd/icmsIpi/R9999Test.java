package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Murilo
 */
public class R9999Test {

    @Test
    public void testSomeMethod() {
        R9999 reg = new R9999();
        LineModel line = reg.createModel();
        line.setFieldValue(R9999.QTD_LIN, 87654321);

        StringBuffer sb = line.getRepresentation();
        String result = sb.toString();
        String expected = "|9999|87654321|";
        assertEquals(expected, result);
    }
}
