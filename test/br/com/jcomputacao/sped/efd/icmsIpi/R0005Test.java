package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 29/01/2013 18:29:29
 * @author Murilo
 */
public class R0005Test {

    @Test
    public void testSomeMethod() {
        R0005 r = new R0005();
        LineModel model = r.createModel();
        model.setFieldValue(R0005.FATANSIA, "AUTO GERAL");
        model.setFieldValue(R0005.CEP, 13301909);
        model.setFieldValue(R0005.END, "AV.DR.OCTAVIANO PEREIRA MENDES");
        model.setFieldValue(R0005.END_NUM, 1333);
        //model.setFieldValue(R0005.END_COMP, null);
        model.setFieldValue(R0005.BAIRRO, "CENTRO");
        model.setFieldValue(R0005.FONE, "1140137777");
        model.setFieldValue(R0005.FAX, "1140137777");
        model.setFieldValue(R0005.EMAIL, "autogeral@autogeral.com.br");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0005|AUTO GERAL|13301909|AV.DR.OCTAVIANO PEREIRA MENDES|1333||CENTRO|1140137777|1140137777|autogeral@autogeral.com.br|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}