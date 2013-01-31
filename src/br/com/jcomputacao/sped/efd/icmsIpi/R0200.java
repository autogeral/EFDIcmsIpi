
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/01/2013 23:01:36
 * @author Murilo
 */
public class R0200 extends LineArchetype {

    public static final String REGISTRO     = "REG";
    public static final String COD_ITEM     = "COD_ITEM";
    public static final String DESCR_ITEM   = "DESCR_ITEM";
    public static final String COD_BARRA    = "COD_BARRA";
    public static final String COD_ANT_ITEM = "COD_ANT_ITEM";
    public static final String UNID_INV     = "UNID_INV";
    public static final String TIPO_ITEM    = "TIPO_ITEM";
    public static final String COD_NCM      = "COD_NCM";
    public static final String EX_IPI       = "EX_IPI";
    public static final String COD_GEN      = "COD_GEN";;
    public static final String ALIQ_ICMS    = "ALIQ_ICMS";
    
    public R0200() {
        setName("Registro 0200 - Identificacao dos itens");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0200"));
    }

}
