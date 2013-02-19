package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 14:15:40
 * @author Thiago Balthazar
 */
public class R1400  extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1400"
     */
    
    
    
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do item (campo 02 do Registro 0200)
     */
    
    
    
    public static final String MUN = "MUN";
    /*
     * Código do Município de origem
     */
    
    
    
    public static final String VALOR = "VALOR";
    /*
     * Valor mensal correspondente ao município
     */
    
    
    

    public R1400() {
    
        setName("REGISTRO 1400: INFORMACAO SOBRE VALORES AGREGADOS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1400"));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(MUN,      new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(VALOR,    decimal);
    }
    
}
