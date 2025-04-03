package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 11:12:16
 * @author Thiago Balthazar
 */
public class RC172 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C172"
     */
    public static final String VL_BC_ISSQN = "VL_BC_ISSQN";
    /*
     * Valor da base de cálculo do ISSQN
     */
    public static final String ALIQ_ISSQN = "ALIQ_ISSQN";
    /*
     * Alíquota do ISSQN
     */
    public static final String VL_ISSQN = "VL_ISSQN";
    /*
     * Valor do ISSQN
     */

    public RC172() {
        
       setName("REGISTRO C172: OPERACOES COM ISSQN (CODIGO 01)");
       setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal2.setFormat(fw);
        
       addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C172"));
       addFieldArchetype(VL_BC_ISSQN, decimal);
       addFieldArchetype(ALIQ_ISSQN, decimal2);
       addFieldArchetype(VL_ISSQN, decimal);
               
    }
    
    
}
