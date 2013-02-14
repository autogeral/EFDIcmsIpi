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
 * 14/02/2013 08:54:11
 * @author Thiago Balthazar
 */
public class RC197 extends LineArchetype{
    
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C197"
     */
    public static final String COD_AJ = "COD_AJ";
    /*
     * Código do ajustes/benefício/incentivo, 
     * conforme tabela indicada no item 5.3.
     */
    public static final String DESCR_COMPL_AJ = "DESCR_COMPL_AJ";
    /*
     * Descrição complementar do ajuste do documento fiscal
     */
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do item (campo 02 do Registro 0200)
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Base de cálculo do ICMS ou do ICMS ST
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     * Alíquota do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor do ICMS ou do ICMS ST
     */
    public static final String VL_OUTROS = "VL_OUTROS";
    /*
     * Outros valores
    */

    public RC197() {
        
        setName("REGISTRO C197: OUTRAS OBRIGACOES TRIBUTARIAS, AJUSTES E INFORMACOES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype d1 = new FieldDecimalMaximumLengthArchetype(15,2);
       d1.setFormat(fw);
             
       FieldDecimalMaximumLengthArchetype d2 = new FieldDecimalMaximumLengthArchetype(9,2);
       d2.setFormat(fw);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C197"));
        addFieldArchetype(COD_AJ, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(DESCR_COMPL_AJ, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VL_BC_ICMS, d1);
        addFieldArchetype(ALIQ_ICMS, d2);
        addFieldArchetype(VL_ICMS, d1);
        addFieldArchetype(VL_OUTROS, d1);
        
    }
    
    
    
}
