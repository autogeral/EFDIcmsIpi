package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/02/2013 23:43:55
 * @author Murilo
 */
public class RC112 extends LineArchetype {
    
    public static final String REGISTRO  = "REG";
    public static final String COD_DA    = "COD_DA";
    public static final String UF        = "UF";
    public static final String NUM_DA    = "NUM_DA";
    /**
     * 
     */
    public static final String COD_AUT   = "COD_AUT";
    /**
     * 
     */
    public static final String VL_DA     = "VL_DA";
    /**
     * 
     */
    public static final String DT_VCTO   = "DT_VCTO";
    public static final String DT_PGTO   = "DT_PGTO";
    
    public RC112() {
        setName("Registro C112 - Documento de arrecadacao referenciado");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C112"));
        addFieldArchetype(COD_DA,   new FieldDefaultArchetype("C112"));
        addFieldArchetype(UF,       new FieldDefaultArchetype("C112"));
        addFieldArchetype(NUM_DA,   new FieldDefaultArchetype("C112"));
        addFieldArchetype(COD_AUT,  new FieldDefaultArchetype("C112"));
        addFieldArchetype(VL_DA,    new FieldDefaultArchetype("C112"));
        addFieldArchetype(DT_VCTO,  new FieldDefaultArchetype("C112"));
        addFieldArchetype(DT_PGTO,  new FieldDefaultArchetype("C112"));
    }

}
