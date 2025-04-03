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
 * 19/02/2013 16:57:53
 * @author Thiago Balthazar
 */
public class RC120 extends LineArchetype{
    
    /**
     * Texto fixo contendo "C120"
     */
    public static final String REGISTRO = "REG";
    
    /**
     * Documento de importação: apresentar
     * 0 ? Declaração de Importação;
     * 1 ? Declaração Simplificada de Importação.
     */
    public static final String COD_DOC_IMP = "COD_DOC_IMP";
    
    /**
     * Número do documento de Importação.
     */
    public static final String NUM_DOC__IMP = "NUM_DOC__IMP";
    
    /**
     * Valor pago de PIS na importação
     */
    public static final String PIS_IMP = "PIS_IMP";
    
    /**
    * Valor pago de COFINS na importação
    */
    public static final String COFINS_IMP = "COFINS_IMP";
   
    /**
    * Número do Ato Concessório do regime Drawback
    */
    public static final String NUM_ACDRAW = "NUM_ACDRAW";
    
    public RC120() {
    
        setName("REGISTRO C120: COMPLEMENTO DE DOCUMENTO - OPERACOES DE IMPORTACAO (CODIGOS 01 e 55)");
        setDelimiter("|");
    
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);     
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("C120"));
        addFieldArchetype(COD_DOC_IMP,  new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NUM_DOC__IMP, new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(PIS_IMP,      decimal);
        addFieldArchetype(COFINS_IMP,   decimal);
        addFieldArchetype(NUM_ACDRAW,   new FieldStringMaximumLengthArchetype(20));
    }
    
}
