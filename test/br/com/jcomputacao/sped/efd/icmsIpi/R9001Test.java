package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Murilo
 */
public class R9001Test {
    
    public R9001Test() {
    }
    
    @Test
    public void testSomeMethod() {
        R9001 reg = new R9001();
        LineModel line = reg.createModel();
        line.setFieldValue(R9001.IND_MOV, 0);
        
        StringBuffer sb = line.getRepresentation();
        String result   = sb.toString();
        String expected = "|9001|0|";
        assertEquals(expected, result);
        
        line.setFieldValue(R0001.IND_MOV, 1);
        
        sb = line.getRepresentation();
        result   = sb.toString();
        expected = "|9001|1|";
        assertEquals(expected, result);
    }
}
