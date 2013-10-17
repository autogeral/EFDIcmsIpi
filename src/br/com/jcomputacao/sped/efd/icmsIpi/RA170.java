package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class RA170 extends LineArchetype{
    
    public static final String REGISTRO = "REG";
    /**
     * Numero sequencial do item no documento fiscal
     */    
    public static final String NUM_ITEM = "NUM_ITEM";
    /**
     * Codigo do item (campo 02 do registro 0200)
     */    
    public static final String COD_ITEM = "COD_ITEM";
    /**
     * Descrição complementardo item como adotado no documento fiscal
     */
    public static final String DESCR_COMPL = "DESCR_COMPL";
    /**
     * Valor total do item(mercadorias ou serviços)
     */
    public static final String VL_ITEM = "VL_ITEM";
    /**
     * Valor do desconto do item
     */
    public static final String VL_DESC = "VL_DESC";
    /**
     * Codigo da Base de Calculo do credito, conforme a tabela indicada no item
     * 4.3.7, caso seja informado codigo representativo de credito no campo 09
     * (CST_PIS) ou no campo 13 (CST_COFINS). Campo especifico para documentos
     * de serviços tomados, que geram direito a credito de PIS/COFINS. Para
     * serviços prestados gerar vazio.
     */
    public static final String NAT_BC_CRED = "NAT_BC_CRED";
    /**
     * Indicador da origem do credito
     * 0 - Operação no mercado interno.
     * 1 - Operação de importação.
     * 
     * Campo especifico para documentos de serviços tomados, que geram direito
     * a credito de PIS/COFINS. Para serviços prestados gerar vazio.
     */
    public static final String IND_ORIG_CRED = "IND_ORIG_CRED";
    /**
     * Codigo da situação tributaria referente ao PIS/PASEP - Tabela 4.3.3
     */
    public static final String CST_PIS = "CST_PIS";

    public RA170() {
         
        setName("Registro A170 - Complemento do documento - Itens do documento");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("A170"));
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESCR_COMPL, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
    }
}
