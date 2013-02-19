package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 09:54:42
 * @author Thiago Balthazar
 */
public class R1110 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1110"
     */
    
    public static final String COD_PART = "COD_PART";
    /*
     * Código do participante-Fornecedor da Mercadoria destinada à exportação
     * (campo 02 do Registro 0150)
     */
    
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do documento fiscal, conforme a Tabela 4.1.1
     */
    
    public static final String SER = "SER";
    /*
     * Série do documento fiscal recebido com fins específicos de exportação.
     */
    
    public static final String NUM_DOC = "NUM_DOC";
    /*
     * Número do documento fiscal recebido com fins específicos de exportação.
     */
    
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão do documento fiscal recebido com fins específicos de exportação
     */
    
    public static final String CHV_NFE = "CHV_NFE";
    /*
     * Chave da Nota Fiscal Eletrônica
     */
    
    public static final String NR_MEMO = "NR_MEMO";
    /*
     * Número do Memorando de Exportação
     */
    
    
    public static final String QTD = "QTD";
    /*
     *Quantidade do item efetivamente exportado 
    */
    
    
    public static final String UNID = "UNID";
    /*
     * Unidade do item (Campo 02 do registro 0190)
     */

    
    public R1110() {
    
        setName("REGISTRO 1110: OPERACOES DE EXPORTACAO INDIRETA - MERCADORIAS DE TERCEIROS");
        setDelimiter("|");
               
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1110"));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD,  new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER,      new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NUM_DOC,  new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC,   new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CHV_NFE,  new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(NR_MEMO,  new FieldIntegerMaximumLengthArchetype(32));
        
        FormatWrapper fw = FormatFactory.getDecimalFormatWithPrecision(3);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,3);
        d.setFormat(fw);
        
        addFieldArchetype(QTD, d);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
    }
       

    
}
