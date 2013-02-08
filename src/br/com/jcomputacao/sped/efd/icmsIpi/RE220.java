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
 * 08/02/2013 08:43:18
 * @author Vinicius Diana
 */
public class RE220 extends LineArchetype {

    /*
      * 1 -   Texto fixo contendo "E220"
      */
    
    public static final String REGISTRO = "REG";
    
     /*
      * 2 -  Código do ajuste da apuração e dedução, conforme a Tabela indicada no item 5.1.1

      */
    public static final String  COD_AJ_APUR = " COD_AJ_APUR";
    
    
    
     /*
      * 3 - Descrição complementar do ajuste da apuração

      */
    public static final String  DESCR_COMPL_AJ = " DESCR_COMPL_AJ";
    
    
    /*
      * 4 -  Valor do ajuste da apuração

      */
    public static final String  VL_AJ_APUR = " VL_AJ_APUR";
    
    
    
    
    public RE220(){
        setName("Registro E220 - Ajuste/beneficios da apuracao do icms sustituicao tributaria");
        setDelimiter("|");
        
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E220"));
        //2
        addFieldArchetype(COD_AJ_APUR, new FieldStringFixedLengthArchetype(8));
        //3
        addFieldArchetype(DESCR_COMPL_AJ, new FieldStringMaximumLengthArchetype(255));
        //4
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
         fw.setReplaceComa(false);
          FieldDecimalMaximumLengthArchetype f = new FieldDecimalMaximumLengthArchetype(15,2);
         f.setFormat(fw);
         addFieldArchetype(VL_AJ_APUR, f);
    }
    
}
