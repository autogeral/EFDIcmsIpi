package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 10:19:04
 * @author Thiago Balthazar
 */
public class RC178 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C178"
     */
    public static final String CL_ENQ = "CL_ENQ";
    /*
     * Código da classe de enquadramento do IPI, conforme Tabela 4.5.1.
     */
    public static final String VL_UNID = "VL_UNID";
    /*
     * Valor por unidade padrão de tributação
     */
    public static final String QUANT_PAD = "QUANT_PAD";
    /*
     * Quantidade total de produtos na unidade padrão de tributação
     */

    public RC178() {
        
        setName("REGISTRO C178: OPERACOES COM PRODUTOS SUJEITOS A TRIBUTACAO DE IPI POR UNIDADE OU QUANTIDADE DE PRODUTO");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
       FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
       fw3.setReplaceComa(false);
       
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,3);
       decimal2.setFormat(fw3);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C178"));
        addFieldArchetype(CL_ENQ, new FieldStringMaximumLengthArchetype(5));   
        addFieldArchetype(VL_UNID, decimal);
        addFieldArchetype(QUANT_PAD, decimal2);        
    }
    
    

}
