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
 * 07/02/2013 09:39:45
 * @author Thiago Balthazar
 */
public class RD197 extends LineArchetype{
    
    public static final String REGISTRO = "REG"; 
    /*
     * Texto fixo contendo "D197"
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

    public RD197() {
   
        setName("REGISTRO D197: OUTRAS OBRIGAÇOES TRIBUTARIAS, AJUSTES E INFORMAÇOES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL");
        setDelimiter("|");
        
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
         fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
         FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(6,2);
         f7.setFormat(fw);
                
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D197"));
        addFieldArchetype(COD_AJ, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(DESCR_COMPL_AJ, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(ALIQ_ICMS, f7);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_OUTROS, decimal);
        
    }
    
    
    
}
