package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 16:40:17
 * @author Thiago Balthazar
 */
public class RC115Test {

     @Test
    public void RC115Test() {
        
        RC115 r = new RC115();
               
        LineModel model = r.createModel();
        
	model.setFieldValue(RC115.IND_CARGA    , 1 );
        model.setFieldValue(RC115.CNPJ_COL     ,  12345678901234L);
        model.setFieldValue(RC115.IE_COL       , "12345678901234");
        model.setFieldValue(RC115.CPF_COL      , 38462670829L);
        model.setFieldValue(RC115.COD_MUN_COL  , 3564987);
        model.setFieldValue(RC115.CNPJ_ENTG    , 12345678901234L );
        model.setFieldValue(RC115.IE_ENTG      , "12345678901234" );
        model.setFieldValue(RC115.CPF_ENTG     , 12345678901L );
        model.setFieldValue(RC115.COD_MUN_ENTG , 3597645 );
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C115|1|12345678901234|12345678901234|38462670829|3564987|12345678901234|12345678901234|12345678901|3597645|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
