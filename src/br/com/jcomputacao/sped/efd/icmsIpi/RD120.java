package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 07/02/2013 11:04:25
 * @author Thiago Balthazar
 */
public class RD120 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
    public static final String COD_MUN_DEST = "COD_MUN_DEST";
    public static final String VEIC_ID = "VEIC_ID";
    public static final String UF_ID = "UF_ID";

    public RD120() {
    
        setName("REGISTRO D120: COMPLEMENTO DA NOTA FISCAL DE SERVICOS DE TRANSPORTE (CODIGO 07)");
        setDelimiter("|");
        
       addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D120"));
       addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
       addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
       addFieldArchetype(VEIC_ID, new FieldStringMaximumLengthArchetype(7));
       addFieldArchetype(UF_ID, new FieldStringMaximumLengthArchetype(2));
            
    }
    
    

}
