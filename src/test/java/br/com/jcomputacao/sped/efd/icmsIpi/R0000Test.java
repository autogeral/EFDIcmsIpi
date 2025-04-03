package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Murilo
 */
public class R0000Test {
    
    @Test
    public void testSomeMethod() throws ParseException {
        R0000 reg = new R0000();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        
        line.setFieldValue(R0000.COD_VER, 6);
        line.setFieldValue(R0000.COD_FIN, 0);
        
        Date data = sdf.parse("01122012");
        line.setFieldValue(R0000.DT_INI, data);
        
        data = sdf.parse("31122012");
        line.setFieldValue(R0000.DT_FIN, data);
        line.setFieldValue(R0000.NOME, "AUTO GERAL DE ITU LTDA");
        line.setFieldValue(R0000.CNPJ, 5437537000137L);
        line.setFieldValue(R0000.IE, "387034155115");
        line.setFieldValue(R0000.UF, "SP");
        line.setFieldValue(R0000.COD_MUN, 3523909);
        line.setFieldValue(R0000.IM, "12677");
        line.setFieldValue(R0000.IND_PERFIL, "A");
        line.setFieldValue(R0000.IND_ATIV, 1);

        StringBuffer sb = line.getRepresentation();
        String result = sb.toString();
        String expected = "|0000|006|0|01122012|31122012|AUTO GERAL DE ITU LTDA|05437537000137||SP|387034155115|3523909|12677||A|1|";
        assertEquals(expected, result);
        System.out.print(result);
    }
}
