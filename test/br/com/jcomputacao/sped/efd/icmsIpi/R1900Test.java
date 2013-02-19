package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * 19/02/2013 13:58:24
 * @author Vinicius Diana
 */
public class R1900Test {
@Test
    public void R1900Test() {
    R1900 r = new R1900();

    LineModel model = r.createModel();
    //2
    model.setFieldValue(R1900.IND_APUR_ICMS, "1");
    //3
    model.setFieldValue(R1900.DESCR_COMPL_OUT_APUR, "R1900Test");
    
      StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1900|1|R1900Test|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
    

}
}