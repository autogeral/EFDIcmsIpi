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
 * @author murilodemoraestuvani
 */
public class R9900Test {
    
    public R9900Test() {
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
        R9900 reg = new R9900();
        LineModel line = reg.createModel();
        line.setFieldValue(R9900.REG_BLC, "9900");
        line.setFieldValue(R9900.QTD_REG_BLC, 24);
        
        StringBuffer sb = line.getRepresentation();
        String result = sb.toString();
        String expected = "|9900|9900|24|";
        assertEquals(expected, result);
    }
}
