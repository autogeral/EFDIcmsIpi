package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 12:17:49
 * @author Vinicius Diana
 */
public class R1920Test {
@Test
    public void R1920Test() {
    R1920 r = new R1920();  
    LineModel model = r.createModel();
    //2
    model.setFieldValue(R1920.VL_TOT_TRANSF_DEBITOS_OA, 55.12);
    //3
     model.setFieldValue(R1920.VL_TOT_AJ_DEBITOS_OA, 55.12);
    //4
     model.setFieldValue(R1920.VL_ESTORNOS_CRED_OA, 55.12);
    //5
     model.setFieldValue(R1920.VL_TOT_TRANSF_CREDITOS_OA, 55.12);
    //6
     model.setFieldValue(R1920.VL_TOT_AJ_CREDITOS_OA, 55.12);
    //7
     model.setFieldValue(R1920.VL_ESTORNOS_DEB_OA, 55.12);
    //8
     model.setFieldValue(R1920.VL_SLD_CREDOR_ANT_OA, 55.12);
    //9
      model.setFieldValue(R1920.VL_SLD_APURADO_OA, 55.12);
    //10
      model.setFieldValue(R1920.VL_TOT_DED, 55.12);  
    //11
      model.setFieldValue(R1920.VL_ICMS_RECOLHER_OA, 55.12);
    //12
      model.setFieldValue(R1920.VL_SLD_CREDOR_TRANSP_OA, 55.12);
    //13
     model.setFieldValue(R1920.DEB_ESP_OA, 55.12);
      StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1920|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
}
}
