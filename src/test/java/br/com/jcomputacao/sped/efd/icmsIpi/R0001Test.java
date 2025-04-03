package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Murilo
 */
public class R0001Test {
    
    public R0001Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        R0001 reg = new R0001();
        LineModel line = reg.createModel();
        line.setFieldValue(R0001.IND_MOV, 0);
        
        StringBuffer sb = line.getRepresentation();
        String result   = sb.toString();
        String expected = "|0001|0|";
        assertEquals(expected, result);
        
        line.setFieldValue(R0001.IND_MOV, 1);
        
        sb = line.getRepresentation();
        result   = sb.toString();
        expected = "|0001|1|";
        assertEquals(expected, result);
    }
}
