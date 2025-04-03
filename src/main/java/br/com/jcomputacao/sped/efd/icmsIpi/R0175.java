
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * TODO - Criar teste
 * 30/01/2013 22:58:12
 * @author Murilo
 */
public class R0175 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String DT_ALT   = "DT_ALT";
    /**
     * 03 NOME
     * 04 COD_PAIS
     * 05 CNPJ
     * 06 CPF 
     * 07 IE
     * 08 COD_MUN
     * 09 SUFRAMA
     * 10 END
     * 11 NUM
     * 12 COMPL
     * 13 BAIRRO
     */
    public static final String NR_CAMPO = "NR_CAMPO";
    public static final String CONT_ANT = "CONT_ANT";
    
    public R0175() {
        setName("Registro 0175 - Alteracao dos dados de algum participante no periodo");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0175"));
        addFieldArchetype(DT_ALT, new FieldDateFixedLengthArchetype());
        addFieldArchetype(NR_CAMPO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CONT_ANT, new FieldStringMaximumLengthArchetype(255));        
    }

}
