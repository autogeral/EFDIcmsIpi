/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class RA100 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /**
     * Indicador do tipo de operação:
     * 0 - Serviço Contratado pelo estabelecimento.
     * 1 - Serviço Prestado pelo estabelecimento.
     */
    public static final String IND_OPER = "IND_OPER";
    /**
     * Indicador do emitente do documento fiscal:
     * 0 - Emissão propria.
     * 1 - Emissão de terceiros.
     */
    public static final String IND_EMIT = "IND_EMIT";
    /**
     * Codigo do participante (campo 02 do Registro 0150):
     * - do emitente do documento, no caso de emissão de terceiros.
     * - do adquirente, no caso de serviços prestados.
     */
    public static final String COD_PART = "COD_PART";
    /**
     * Codigo da situação do documento fiscal:
     * 00 - Documento Regular.
     * 02 - Documento cancelado.
     */
    public static final String COD_SIT = "COD_SIT";
    /**
     * Serie do documento fiscal
     */
    public static final String SER = "SER";
    /**
     * Subserie do documento fiscal
     */
    public static final String SUB = "SUB";
    /**
     * Numero do documento fiscal ou documento internacional equivalente
     */
    public static final String NUM_DOC = "NUM_DOC";
    /**
     * Chave/Codigo de verificação da nota fiscal de serviço eletronica
     */
    public static final String CHV_NFSE = "CHV_NFSE";
    /**
     * Data de emissao do documento fiscal
     */
    public static final String DT_DOC = "DT_DOC";
    /**
     * Data de Execução/Conclusão do serviço.
     */
    public static final String DT_EXE_SERV = "DT_EXE_SERV";
    /**
     * Valor total do documento.
     */
    public static final String VL_DOC = "VL_DOC";
    /**
     * Indicador do tipo de pagamento:
     * 0 - A vista.
     * 1 - A prazo.
     * 9 - Sem pagamento
     */
    public static final String IND_PGTO = "IND_PGTO";
    /**
     * Valor total do desconto
     */
    public static final String VL_DESC = "VL_DESC";
    /**
     * Valor da base de calculo do PIS/PASEp
     */
    public static final String VL_BC_PIS = "VL_BC_PIS";
    /**
     * Valor total do PIS
     */
    public static final String VL_PIS = "VL_PIS";
    /**
     * Valor da base de calculo da COFINS
     */
    public static final String VL_BC_COFINS = "VL_BC_COFINS";
    /**
     * Valor total da COFINS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /**
     * Valor total do PIS retido na fonte
     */
    public static final String VL_PIS_RET = "VL_PIS_RET";
    /**
     * Valor total do PIS retido na fonte
     */
    public static final String VL_COFINS_RET = "VL_COFINS_RET";
    /**
     * Valor do ISS
     */
    public static final String VL_ISS = "VL_ISS";

    public RA100() {
        setName("Registro A100 - Documento - Nota Fiscal de Servico");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("A100"));
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(SUB, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(CHV_NFSE, new FieldIntegerMaximumLengthArchetype(60));
        addFieldArchetype(DT_DOC, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(DT_EXE_SERV, new FieldIntegerFixedLengthArchetype(8));        
        addFieldArchetype(VL_DOC, decimal);
        addFieldArchetype(IND_PGTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_BC_PIS, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_BC_COFINS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(VL_PIS_RET, decimal);
        addFieldArchetype(VL_COFINS_RET, decimal);
        addFieldArchetype(VL_ISS, decimal);
    }
}
