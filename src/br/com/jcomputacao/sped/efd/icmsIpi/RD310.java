package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 07/02/2013 11:24:17
 * @author Thiago Balthazar
 */
public class RD310 extends LineArchetype{

     public static final String REGISTRO = "REG";
     /*
      * Texto fixo contendo "D310"
      */
     public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
     /*
      * Código do município de origem do serviço,
        conforme a tabela IBGE
      */
     public static final String VL_SERV = "VL_SERV";
     /*
      * Valor total da prestação de serviço
      */
     public static final String VL_BC_ICMS = "VL_BC_ICMS";
     /*
      *Valor total da base de cálculo do ICMS 
      */
     public static final String VL_ICMS = "VL_ICMS";
     /*
      * Valor total do ICMS
      */

    public RD310() {
    
        setName("REGISTRO D310: COMPLEMENTO DOS BILHETES (CODIGO 13, 14, 15 E 16)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
               
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D310"));
        addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(VL_SERV, f5);
        addFieldArchetype(VL_BC_ICMS, f5);
        addFieldArchetype(VL_ICMS, f5);
    
    }
    
     
}
