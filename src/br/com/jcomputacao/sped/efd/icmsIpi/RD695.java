package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 14:33:43
 * @author Thiago Balthazar
 */
public class RD695 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D695"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1.
     */
    public static final String SER = "SER";
    /*
     * Série do documento fiscal
     */
    public static final String NRO_ORD_INI = "NRO_ORD_INI";
    /*
     * Número de ordem inicial
     */
    public static final String NRO_ORD_FIN = "NRO_ORD_FIN";
    /*
     * Número de ordem final
     */
    public static final String DT_DOC_INI = "DT_DOC_INI";
    /*
     * Data de emissão inicial dos documentos / Data inicial de vencimento da fatura
     */
    public static final String DT_DOC_FIN = "DT_DOC_FIN";
    /*
     * Data de emissão final dos documentos / Data final do vencimento da fatura
     */
    public static final String NOM_MEST = "NOM_MEST";
    /*
     * Nome do arquivo Mestre de Documento Fiscal
     */
    public static final String CHV_COD_DIG = "CHV_COD_DIG";
    /*
     * Chave de codificação digital do arquivo Mestre de Documento Fiscal
     */

    public RD695() {
        
        setName("REGISTRO D695: CONSOLIDACAO DA PRESTACAO DE SERVICOS - NOTAS DE "+
"SERVICO DE COMUNICACAO (CODIGO 21) E DE SERVIÇO DE "+
"TELECOMUNICACAO (CODIGO 22) (EMPRESAS OBRIGADAS A ENTREGA DOS "+
"ARQUIVOS PREVISTOS NO CONVENIO ICMS 115/03).");
        
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D695"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NRO_ORD_INI, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(NRO_ORD_FIN, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(NOM_MEST, new FieldStringMaximumLengthArchetype(15));
        addFieldArchetype(CHV_COD_DIG, new FieldStringMaximumLengthArchetype(32));
    
    }
    
    
}
