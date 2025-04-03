package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;

/**
 * 19/02/2013 11:42:26
 * @author Vinicius Diana
 */
public class R1921 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "1921"
     */
    public static final String REGISTRO = "REGISTRO";
    
    
      /*
     * 2 - Código do ajuste da SUB-APURAÇÃO e dedução, conforme a Tabela indicada no item 5.1.1.

     */
    public static final String  COD_AJ_APUR = " COD_AJ_APUR";
    
    
    
      /*
     * 3 -  Descrição complementar do ajuste da apuração.
     */
    public static final String DESCR_COMPL_AJ = "DESCR_COMPL_AJ";
    
    
    
      /*
     * 4 - Valor do ajuste da apuração
     */
    public static final String  VL_AJ_APUR = " VL_AJ_APUR";
    
    
    
    
    

    public R1921() {
        setName("REGISTRO 1921: AJUSTE/BENEFICIO/INCENTIVO DA SUB-APURACAO DO ICMS ");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
       
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1921"));
        //2
        addFieldArchetype(COD_AJ_APUR, new FieldStringFixedLengthArchetype(8));
        //3
        addFieldArchetype(DESCR_COMPL_AJ, new FieldStringMaximumLengthArchetype(255));
        //4
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_AJ_APUR, f1);
        
        
        
    }

    
    
    
    
    
    
}
