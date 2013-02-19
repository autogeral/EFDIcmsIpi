package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 10:39:19
 * @author Thiago Balthazar
 */
public class R1210 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1210"
     */    
    
    
    
    public static final String TIPO_UTIL = "TIPO_UTIL";
    /*
     * Tipo de utiliza��o do cr�dito, conforme tabela indicada no item 5.5.
     */
    
    
    
    public static final String NR_DOC = "NR_DOC";
    /*
     * N�mero do documento utilizado na baixa de cr�ditos
     */
    
    
    
    public static final String VL_CRED_UTIL = "VL_CRED_UTIL";
    /*
     * Total de cr�dito utilizado
     */

    
    
    
    public R1210() {
        
        setName("REGISTRO 1210: UTILIZACAO DE CREDITOS FISCAIS ? ICMS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1210"));
        addFieldArchetype(TIPO_UTIL,    new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(NR_DOC,       new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(VL_CRED_UTIL, decimal);
    }
    
    
    

}
