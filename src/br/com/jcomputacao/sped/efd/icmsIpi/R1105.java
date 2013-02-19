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
     * Código do modelo da NF, conforme tabela 4.1.1
     */
    
    
    public static final String SERIE = "SERIE";
    /*
     * Série da Nota Fiscal
     */
    
    
     public static final String NUM_DOC = "NUM_DOC";
    /*
     * Número de Nota Fiscal de Exportação emitida pelo Exportador
     */
     
     
    public static final String CHV_NFE = "CHV_NFE";
    /*
     * Chave da Nota Fiscal Eletrônica
     */
    
    
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão da NF de exportação
     */
    
        
    
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do item (campo 02 do Registro 0200)
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
