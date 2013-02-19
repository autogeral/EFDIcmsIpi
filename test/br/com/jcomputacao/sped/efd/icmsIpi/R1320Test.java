package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 11:50:24
 * @author Thiago Balthazar
 */
public class R1320Test {

    @Test
    public void R1320Test() {
        
       R1320 r = new R1320();
       
       LineModel model = r.createModel();
        
       model.setFieldValue(R1320.NUM_BICO    , 5123462145L);
       model.setFieldValue(R1320.NR_INTERV   , 5123556445L);
       model.setFieldValue(R1320.MOT_INTERV  , "00012348AC");
       model.setFieldValue(R1320.NOM_INTERV  , "0001235AW");
       model.setFieldValue(R1320.CNPJ_INTERV , 53845698756213L);
       model.setFieldValue(R1320.CPF_INTERV  , 38462670829L);
       model.setFieldValue(R1320.VAL_FECHA   , 123.123);
       model.setFieldValue(R1320.VAL_ABERT   , 123.123);
       model.setFieldValue(R1320.VOL_AFERI   , 123.123);
       model.setFieldValue(R1320.VOL_VENDAS  , 123.123);
       
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1320|5123462145|5123556445|00012348AC|0001235AW|53845698756213|38462670829|123,123|123,123|123,123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
