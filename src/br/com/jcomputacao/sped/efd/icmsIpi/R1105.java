package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 17:26:22
 * @author Thiago Balthazar
 */
public class R1105 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1105"
     */
    
    
    public static final String COD_MOD = "COD_MOD";
    /*
     * C�digo do modelo da NF, conforme tabela 4.1.1
     */
    
    
    public static final String SERIE = "SERIE";
    /*
     * S�rie da Nota Fiscal
     */
    
    
     public static final String NUM_DOC = "NUM_DOC";
    /*
     * N�mero de Nota Fiscal de Exporta��o emitida pelo Exportador
     */
     
     
    public static final String CHV_NFE = "CHV_NFE";
    /*
     * Chave da Nota Fiscal Eletr�nica
     */
    
    
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emiss�o da NF de exporta��o
     */
    
        
    
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * C�digo do item (campo 02 do Registro 0200)
     */
    

    public R1105() {
    
        setName("REGISTRO 1105: DOCUMENTOS FISCAIS DE EXPORTACAO");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1105"));       
        addFieldArchetype(COD_MOD,  new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SERIE,    new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC,  new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(CHV_NFE,  new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(DT_DOC,   new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
    }
             
    
}
