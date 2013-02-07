package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 05/02/2013 17:00:01
 * @author Thiago Balthazar
 */
public class RD160 extends LineArchetype {
    
    public static final String REGISTRO      = "REG";
    /*
     * Texto fixo contendo "D160"
     */
    public static final String DESPACHO      = "DESPACHO";
    /*
     * Identificação do número do despacho
     */
    public static final String CNPJ_CPF_REM  = "CNPJ_CPF_REM";
    /*
     * CNPJ ou CPF do remetente das mercadorias que
        constam na nota fiscal.
     */
    public static final String IE_REM        = "IE_REM";
    /*
     * Inscrição Estadual do remetente das mercadorias
       que constam na nota fiscal.
     */
    public static final String COD_MUN_ORI   = "COD_MUN_ORI";
    /*
     * Código do Município de origem, conforme tabela
       IBGE(Preencher com 9999999, se Exterior)
     */
    public static final String CNPJ_CPF_DEST = "CNPJ_CPF_DEST";
    /*
     * CNPJ ou CPF do destinatário das mercadorias que
       constam na nota fiscal.
     */
    public static final String IE_DEST       = "IE_DEST";
    /*
     * Inscrição Estadual do destinatário
       das mercadorias que constam na nota fiscal.
     */
    public static final String COD_MUN_DEST  = "COD_MUN_DEST";
    /*
     Código do Município de destino, conforme tabela IBGE
     (Preencher com 9999999, se Exterior)
    */
    
    public RD160(){
        setName("REGISTRO D160: CARGA TRANSPORTADA (CODIGO 08, 8B, 09, 10, 11, 26 e 27).");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D160"));
        addFieldArchetype(DESPACHO, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(CNPJ_CPF_REM, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(IE_REM, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(COD_MUN_ORI, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(CNPJ_CPF_DEST, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(IE_DEST, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
        
    }
    
}
