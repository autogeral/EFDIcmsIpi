package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 10:39:07
 * @author Thiago Balthazar
 */
public class RC179Test {

    	
    @Test
    public void RC179Test1(){
        
        RC179 r= new RC179();
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC179.BC_ST_ORIG_DEST, 12.12 );
        model.setFieldValue(RC179.ICMS_ST_REP, 12.12);
        model.setFieldValue(RC179.ICMS_ST_COMPL , 12.12);
        model.setFieldValue(RC179.BC_RET , 12.12);
        model.setFieldValue(RC179.ICMS_RET , 12.12);

        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C179|12,12|12,12|12,12|12,12|12,12|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
