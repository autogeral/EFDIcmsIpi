package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 10:54:24
 * @author Vinicius Diana
 */
public class RH020 extends LineArchetype {
    
    /*
  *  1 - Texto fixo contendo "H020" 
  */
 public static final String REGISTRO = "REGISTRO";
   /*
  *  2 -  Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1
 
  */
 public static final String CST_ICMS = "CST_ICMS";
   /*
  *  3 - Informe a base de cálculo do ICMS 
  */
 public static final String BC_ICMS = "BC_ICMS";
   /*
  *  4 -  Informe o valor do ICMS a ser debitado ou creditado 
  */
 public static final String VL_ICMS = "VL_ICMS";

    public RH020() {
        setName("Regsitro H020 - Informacoes complementares");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("H020"));
        //2
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        //3
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(BC_ICMS, f1);
        //4
         FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_ICMS, f2);
        
    }
 
 
 

}
