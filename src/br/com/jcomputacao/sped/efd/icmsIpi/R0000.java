
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/01/2013 17:14:28
 * @author murilodemoraestuvani
 */
public class R0000 extends LineArchetype {
    
    public final static String REGISTRO = "REGISTRO";
    public final static String COD_VER = "COD_VER";
    public final static String COD_FIN = "COD_FIN";
    public final static String DT_INI = "DT_INI";
    public final static String DT_FIN = "DT_FIN";
    public final static String NOME = "NOME";
    public final static String CNPJ = "CNPJ";
    public final static String CPF = "CPF";
    public final static String UF = "UF";
    public final static String IE = "IE";
    public final static String COD_MUN = "COD_MUN";
    public final static String IM = "IM";
    public final static String SUFRAMA = "SUFRAMA";
    public final static String IND_PERFIL = "IND_PERFIL";
    public final static String IND_ATIV = "IND_ATIV";
    
    public R0000() {
        setName("Registro 0000 - Aberturado do arquivo e identificacao da entidade");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0000"));
        addFieldArchetype(COD_VER, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(COD_FIN, new FieldIntegerFixedLengthArchetype(1));
        FieldArchetype fa = new FieldDateTimeFixedLengthArchetype("ddMMyyyy");
        addFieldArchetype(DT_INI, fa);
        addFieldArchetype(DT_FIN, fa);
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        fa = new FieldIntegerFixedLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(CNPJ, fa);
        fa = new FieldIntegerFixedLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(CPF, fa);
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IE, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(COD_MUN, new FieldIntegerMaximumLengthArchetype(7));
        addFieldArchetype(IM, new FieldStringMaximumLengthArchetype(30));
        fa = new FieldStringMaximumLengthArchetype(9);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(SUFRAMA, fa);
        addFieldArchetype(IND_PERFIL, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(IND_ATIV, new FieldIntegerFixedLengthArchetype(1));
    }

}
