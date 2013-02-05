package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 04/02/2013 16:00:52
 * @author Vinicius Diana
 */
public class RE110Test {
@Test
 public void RE110Test(){
     RE110 r = new RE110();
     LineModel model = r.createModel();
     //1
    //model.setFieldValue(RE110.REGISTRO, "E110");
     //2
     model.setFieldValue(RE110.VL_TOT_DEBITOS, 555.25);
     //3
     model.setFieldValue(RE110.VL_AJ_DEBITOS, 55.47);
     //4
     model.setFieldValue(RE110.VL_TOT_AJ_DEBITOS, 778.45);
     //5
     model.setFieldValue(RE110.VL_ESTORNOS_CRED,74.85);
     //6
     model.setFieldValue(RE110.VL_TOT_CREDITOS, 888.58);
     //7
     model.setFieldValue(RE110.VL_AJ_CREDITOS, 58.78);
     //8
     model.setFieldValue(RE110.VL_TOT_AJ_CREDITOS, 87.78);
     //9
     model.setFieldValue(RE110.VL_ESTORNOS_DEB, 87.58);
     //10
     model.setFieldValue(RE110.VL_SLD_CREDOR_ANT, 58.47);
     //11
     model.setFieldValue(RE110.VL_SLD_APURADO, 85.78);
     //12
      model.setFieldValue(RE110.VL_TOT_DED ,75.78);
     //13
     model.setFieldValue(RE110.VL_ICMS_RECOLHER, 78.15);
     //14
     model.setFieldValue(RE110.VL_SLD_CREDOR_TRANSPORTAR, 87.15);
     //15
     model.setFieldValue(RE110.DEB_ESP,58.74);
     
       StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E110|555,25|55,47|778,45|74,85|888,58|58,78|87,78|87,58|58,47|85,78|75,78|78,15|87,15|58,74|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
     
 }
}
