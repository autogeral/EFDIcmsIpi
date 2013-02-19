package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 16:44:27
 * @author Vinicius Diana
 */
public class RC140 extends LineArchetype {
 
    /*
     * 1 - Texto fixo contendo "C140"
     */
    public static final String REGISTRO = "REGISTRO";
    
    
    
     /*
     * 2 - Indicador do emitente do título: 0- Emissão própria; 1- Terceiros

     */
    public static final String  IND_EMIT = " IND_EMIT";
    
    
    
    
    
    
     /*
     * 3 - Indicador do tipo de título de crédito: 00- Duplicata; 01- Cheque; 02- Promissória; 03- Recibo; 99- Outros (descrever)

     */
    public static final String IND_TIT = "IND_TIT";
    
    
    
    
     /*
     * 4 -  Descrição complementar do título de crédito
     */
    public static final String  DESC_TIT = " DESC_TIT";
    
    
    
    
    
     /*
     * 5 -  Número ou código identificador do título de crédito

     */
    public static final String NUM_TIT = "NUM_TIT";
    
    
    
     /*
     * 6 -  Quantidade de parcelas a receber/pagar
     */
    public static final String  QTD_PARC = " QTD_PARC";
    
    
    
    
     /*
     * 7 - Valor total dos títulos de créditos
     */
    public static final String VL_TIT = "VL_TIT";
    
    
    

    public RC140() {
        setName("REGISTRO C140: FATURA (CODIGO 01) ");
        setDelimiter("|");
          FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C140"));
        //2
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        //3
        addFieldArchetype(IND_TIT, new FieldStringFixedLengthArchetype(2));
        //4
        addFieldArchetype(DESC_TIT, new FieldStringMaximumLengthArchetype(255));
        //5
        addFieldArchetype(NUM_TIT, new FieldStringMaximumLengthArchetype(255));
        //6
        addFieldArchetype(QTD_PARC, new FieldIntegerMaximumLengthArchetype(2));
        //7
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_TIT, f1);
        
        
        
    }
    
    
    
    
    
    
    
    
}
