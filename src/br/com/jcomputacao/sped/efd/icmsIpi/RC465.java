package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RC465 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /**
     * Chave do CF-e
     * Digito verificador (DV) da chave do CF-e.
     */
    public static final String CHV_CFE = "CHV_CFE";
    /**
     * Numero do contador de Cupom Fiscal
     * Campo deve ser maior que 0 (zero)
     */
    public static final String NUM_CCF = "NUM_CCF";

    public RC465() {
        setName("Registro C465 - Complemento do Cupom Fiscal eletronico por ECF - Cf-e - ECF(Codigo 60)");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C465"));
        addFieldArchetype(CHV_CFE, new FieldIntegerMaximumLengthArchetype(44));
        addFieldArchetype(NUM_CCF, new FieldIntegerMaximumLengthArchetype(9));
    }
}
