package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;



/**
 * 19/02/2013 16:31:20
 * @author Thiago Balthazar
 */
public class RC115 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C115"
     */
    
    
    
    public static final String IND_CARGA = "IND_CARGA";
    /*
     * Indicador do tipo de transporte:
    0 ? Rodoviário;
    1 ? Ferroviário;
    2 ? Rodo-Ferroviário;
    3 ? Aquaviário;
    4 ? Dutoviário;
    5 ? Aéreo;
    9 ? Outros.
     */
    
    
    
    public static final String CNPJ_COL = "CNPJ_COL";
    /*
     * Número do CNPJ do contribuinte do local de coleta
     */
    
    
    
    public static final String IE_COL = "IE_COL";
    /*
     * Inscrição Estadual do contribuinte do local de coleta
     */
    
    
    
    public static final String CPF_COL = "CPF_COL";
    /*
     * CPF do contribuinte do local de coleta das mercadorias.
     */
    
    
    
    public static final String COD_MUN_COL = "COD_MUN_COL";
    /*
     * Código do Município do local de coleta
     */
    
    
    
    public static final String CNPJ_ENTG = "CNPJ_ENTG";
    /*
     * Número do CNPJ do contribuinte do local de entrega
     */
    
    
    
    public static final String IE_ENTG = "IE_ENTG";
    /*
     * Inscrição Estadual do contribuinte do local de entrega
     */
    
    
    
    public static final String CPF_ENTG = "CPF_ENTG";
    /*
     * Cpf do contribuinte do local de entrega
     */
    
    
    
    public static final String COD_MUN_ENTG = "COD_MUN_ENTG";
    /*
     * Código do Município do local de entrega
     */

    
    
    public RC115() {
    
        setName("");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("C115"));
        addFieldArchetype(IND_CARGA,    new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CNPJ_COL,     new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(IE_COL,       new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(CPF_COL,      new FieldIntegerFixedLengthArchetype(11));
        addFieldArchetype(COD_MUN_COL,  new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(CNPJ_ENTG,    new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(IE_ENTG,      new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(CPF_ENTG,     new FieldIntegerFixedLengthArchetype(11));
        addFieldArchetype(COD_MUN_ENTG, new FieldIntegerFixedLengthArchetype(7));
        
    }
}
