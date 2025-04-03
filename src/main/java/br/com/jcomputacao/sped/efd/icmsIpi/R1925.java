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
 * 19/02/2013 10:30:47
 * @author Vinicius Diana
 */
public class R1925 extends LineArchetype {
    
    /*
     * 1 -  Texto fixo contendo "1925"
     */
 public static final String REGISTRO = "REGISTRO";
 
 
 
 
 
 
 
    /*
     * 2 -   Código da informação adicional conforme tabela a ser definida pelas SEFAZ, conforme tabela definida no item 5.2.
     */
 public static final String  COD_INF_ADIC  = " COD_INF_ADIC";
 
 
 
 
 
 
    /*
     * 3 - Valor referente à informação adiciona
     */
 public static final String VL_INF_ADIC   = "VL_INF_ADIC ";
 
 
 
 
 
 
 
    /*
     * 4 - Descrição complementar do ajuste 
     */
 

 
 public static final String DESCR_COMPL_AJ = "DESCR_COMPL_AJ";
 
 
 

    public R1925() {
        setName("Texto fixo contendo 1925");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //1
        addFieldArchetype(REGISTRO,  new FieldDefaultArchetype("1925"));
        //2
        addFieldArchetype(COD_INF_ADIC, new FieldStringFixedLengthArchetype(8));
        //3
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_INF_ADIC, f1);
        //4
        addFieldArchetype(DESCR_COMPL_AJ, new FieldStringMaximumLengthArchetype(255));
        
        
        
        
    }
 
 
 
 
 
 
 
 
 
}
