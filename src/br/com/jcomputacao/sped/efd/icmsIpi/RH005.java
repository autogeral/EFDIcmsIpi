package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 09:40:26
 * @author Vinicius Diana
 */
public class RH005 extends LineArchetype {
    
     /*
     * 1 - Texto fixo contendo "H005" 
     */
   public static final String REGISTRO  = "REGISTRO ";
   /*
     * 2 -  Data do inventário" 
     */
   public static final String DT_INV  = " DT_INV ";
   /*
     * 3 - Valor total do estoque 
     */
   public static final String VL_INV  = "VL_INV";
   /*
     * 4 -  Informe o motivo do Inventário: 01 ? No final no período; 02 ? Na mudança de forma de tributação da mercadoria (ICMS); 03 ? Na solicitação da baixa cadastral, paralisação temporária e outras situações; 04 ? Na alteração de regime de pagamento ? condição do contribuinte; 05 ? Por determinação dos fiscos.
 
     */
   public static final String  MOT_INV   = " MOT_INV  ";

    public RH005() {
        setName("H005 = Totais do inventario");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("H005"));
        //2
        addFieldArchetype(DT_INV, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //3
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_INV, f1);
        //4
        addFieldArchetype(MOT_INV, new FieldStringFixedLengthArchetype(2));
        
    }
   
   

   
   

}
