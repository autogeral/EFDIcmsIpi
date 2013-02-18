package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 12:10:01
 * @author Thiago Balthazar
 */
public class RC420Test {

    @Test
    public void RC420Test() {
        
        RC420 r = new RC420();
                   
        LineModel model = r.createModel();
        
	model.setFieldValue(RC420.COD_TOT_PAR , "1234567" );
        model.setFieldValue(RC420.VLR_ACUM_TOT , 564.23);
        model.setFieldValue(RC420.NR_TOT ,12 );
        model.setFieldValue(RC420.DESCR_NR_TOT , "descricao do campo nr_TOT" );
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C420|1234567|564,23|12|descricao do campo nr_TOT|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
