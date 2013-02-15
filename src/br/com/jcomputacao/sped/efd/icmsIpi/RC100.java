
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
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
 * 01/02/2013 16:37:25
 * @author Murilo Tuvani
 */
public class RC100 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /**
     * Indicador do tipo de operacao:
     * 0- Entrada;
     * 1- Saida
     */
    public static final String IND_OPER = "IND_OPER";
    /**
     * Indicador do emitente do documento fiscal:
     * 0- Emissao propria;
     * 1- Terceiros
     */
    public static final String IND_EMIT = "IND_EMIT";
    /**
     * Codigo do participante (campo 02 do Registro 0150):
     * - do emitente do documento ou do remetente das mercadorias, no caso de entradas;
     * - do adquirente, no caso de saidas
     */
    public static final String COD_PART = "COD_PART";
    /**
     * Tabela 4.1.1
     * <table>
     * <tr><th colspan="2">4.1.2- Tabela Situacao do Documento</th></tr>
     * <tr><th>Codigo</th><th>Descricao</th></tr>
     * <tr><td>1</td><td>Nota Fiscal</td></tr>
     * <tr><td>1B</td><td>Nota Fiscal Avulsa</td></tr>
     * <tr><td>2</td><td>Nota Fiscal de Venda a Consumidor</td></tr>
     * <tr><td>2D</td><td>Cupom Fiscal</td></tr>
     * <tr><td>2E</td><td>Cupom Fiscal Bilhete de Passagem</td></tr>
     * <tr><td>4</td><td>Nota Fiscal de Produtor</td></tr>
     * <tr><td>6</td><td>Nota Fiscal/Conta de Energia Eletrica</td></tr>
     * <tr><td>7</td><td>Nota Fiscal de Servico de Transporte</td></tr>
     * <tr><td>8</td><td>Conhecimento de Transporte Rodoviario de Cargas</td></tr>
     * <tr><td>8B</td><td>Conhecimento de Transporte de Cargas Avulso</td></tr>
     * <tr><td>9</td><td>Conhecimento de Transporte Aquaviario de Cargas</td></tr>
     * <tr><td>10</td><td>Conhecimento Aereo</td></tr>
     * <tr><td>11</td><td>Conhecimento de Transporte Ferroviario de Cargas</td></tr>
     * <tr><td>13</td><td>Bilhete de Passagem Rodoviario</td></tr>
     * <tr><td>14</td><td>Bilhete de Passagem Aquaviario</td></tr>
     * <tr><td>15</td><td>Bilhete de Passagem e Nota de Bagagem</td></tr>
     * <tr><td>17</td><td>Despacho de Transporte</td></tr>
     * <tr><td>16</td><td>Bilhete de Passagem Ferroviario</td></tr>
     * <tr><td>18</td><td>Resumo de Movimento Diario</td></tr>
     * <tr><td>20</td><td>Ordem de Coleta de Cargas</td></tr>
     * <tr><td>21</td><td>Nota Fiscal de Servico de Comunicacao</td></tr>
     * <tr><td>22</td><td>Nota Fiscal de Servico de Telecomunicacao</td></tr>
     * <tr><td>23</td><td>GNRE</td></tr>
     * <tr><td>24</td><td>Autorizacao de Carregamento e Transporte</td></tr>
     * <tr><td>25</td><td>Manifesto de Carga</td></tr>
     * <tr><td>26</td><td>Conhecimento de Transporte Multimodal de Cargas</td></tr>
     * <tr><td>27</td><td>Nota Fiscal De Transporte Ferroviario De Carga</td></tr>
     * <tr><td>28</td><td>Nota Fiscal/Conta de Fornecimento de Gas Canalizado</td></tr>
     * <tr><td>29</td><td>Nota Fiscal/Conta De Fornecimento D'agua Canalizada</td></tr>
     * <tr><td>55</td><td>Nota Fiscal Eletronica</td></tr>
     * <tr><td>57</td><td>Conhecimento de Transporte Eletronico - CT-e</td></tr>
     * <tr><td>59</td><td>Cupom Fiscal Eletronico - CF-e</td></tr>
     * </table>
     */
    public static final String COD_MOD = "COD_MOD";
    /**
     * Tabela 4.1.2
     * <table>
     * <tr><th colspan="2">4.1.2- Tabela Situacao do Documento</th></tr>
     * <tr><th>Codigo</th><th>Descricao</th></tr>
     * <tr><td>00</td><td>Documento regular</td></tr>
     * <tr><td>01</td><td>Documento regular extemporaneo</td></tr>
     * <tr><td>02</td><td>Documento cancelado</td></tr>
     * <tr><td>03</td><td>Documento cancelado extemporaneo</td></tr>
     * <tr><td>04</td><td>NFe denegada</td></tr>
     * <tr><td>05</td><td>Nfe Numeracao inutilizada</td></tr
     * <tr><td>06</td><td>Documento Fiscal Complementar</td></tr>
     * <tr><td>07</td><td>Documento Fiscal Complementar extemporaneo.</td></tr>
     * <tr><td>08</td><td>Documento Fiscal emitido com base em Regime Especial ou Norma Especifica</td></tr>
     * </table>
     */
    public static final String COD_SIT = "COD_SIT";
    /**
     * Serie do documento fiscal
     */
    public static final String SER = "SER";
    /**
     * Numero do documento fiscal
     */
    public static final String NUM_DOC = "NUM_DOC";
    /**
     * Chave da Nota Fiscal Eletronica
     */
    public static final String CHV_NFE = "CHV_NFE";
    /**
     * Data da emissao do documento fiscal
     */
    public static final String DT_DOC = "DT_DOC";
    /**
     * Data da entrada ou da saida
     */
    public static final String DT_E_S = "DT_E_S";
    /**
     * Valor total do documento fiscal
     */
    public static final String VL_DOC = "VL_DOC";
    /**
     * 0- A vista;
     * 1- A prazo;
     * 2 - Outros
     */
    public static final String IND_PGTO = "IND_PGTO";
    /**
     * Valor total do desconto
     */
    public static final String VL_DESC = "VL_DESC";
    /**
     * Abatimento nao tributado e nao comercial 
     * Ex. desconto ICMS nas remessas para ZFM.
     */
    public static final String VL_ABAT_NT = "VL_ABAT_NT";
    /**
     * Valor total das mercadorias e servicos
     */
    public static final String VL_MERC = "VL_MERC";
    /**
     * 0- Por conta do emitente;
     * 1- Por conta do destinatario/remetente;
     * 2- Por conta de terceiros; 
     * 9- Sem cobranca de frete.
     */
    public static final String IND_FRT = "IND_FRT";
    /**
     * Valor do frete indicado no documento fiscal
     */
    public static final String VL_FRT = "VL_FRT";
    /**
     * Valor do seguro indicado no documento fiscal
     */
    public static final String VL_SEG = "VL_SEG";
    /**
     * Valor de outras despesas acessorias
     */
    public static final String VL_OUT_DA = "VL_OUT_DA";
    /**
     * Valor da base de calculo do ICMS
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /**
     * Valor do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /**
     * Valor da base de calculo do ICMS substituicao tributaria
     */
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    /**
     * Valor do ICMS retido por substituicao tributaria
     */
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    /**
     * Valor total do IPI
     */
    public static final String VL_IPI = "VL_IPI";
    /**
     * Valor total do PIS
     */
    public static final String VL_PIS = "VL_PIS";
    /**
     * Valor total da COFINS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /**
     * Valor total do PIS retido por substituicao tributaria
     */
    public static final String VL_PIS_ST = "VL_PIS_ST";
    /**
     * Valor total da COFINS retido por substituicao tributaria
     */
    public static final String VL_COFINS_ST = "VL_COFINS_ST";

    public RC100() {
        setName("Registro C100 - Nota fiscal 01, Nota fiscal avulsta 1B, Nota fiscal de produtor 4 e NF-e 55");
        setDelimiter("|");
        
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
        addFieldArchetype(REGISTRO,   new FieldDefaultArchetype("C100"));//1
        addFieldArchetype(IND_OPER,   new FieldStringFixedLengthArchetype(1));//2
        addFieldArchetype(IND_EMIT,   new FieldStringFixedLengthArchetype(1));//3
        addFieldArchetype(COD_PART,   new FieldStringMaximumLengthArchetype(60));//4
        addFieldArchetype(COD_MOD,    new FieldStringFixedLengthArchetype(2));//5
        addFieldArchetype(COD_SIT,    new FieldIntegerFixedLengthArchetype(2));//6
        addFieldArchetype(SER,        new FieldStringMaximumLengthArchetype(3));//7
        addFieldArchetype(NUM_DOC,    new FieldIntegerMaximumLengthArchetype(9));//8
        addFieldArchetype(CHV_NFE,    new FieldStringFixedLengthArchetype(44));//9
        addFieldArchetype(DT_DOC,     new FieldDateFixedLengthArchetype("ddMMyyyy"));//10
        addFieldArchetype(DT_E_S,     new FieldDateFixedLengthArchetype("ddMMyyyy"));//11
        addFieldArchetype(VL_DOC,     decimal);//12
        addFieldArchetype(IND_PGTO,   new FieldStringFixedLengthArchetype(1));//13
        addFieldArchetype(VL_DESC,    decimal);//14
        addFieldArchetype(VL_ABAT_NT, decimal);//15
        addFieldArchetype(VL_MERC,    decimal);//16
        addFieldArchetype(IND_EMIT,   new FieldStringFixedLengthArchetype(1));//17
        addFieldArchetype(VL_FRT,     decimal);//18
        addFieldArchetype(VL_SEG,     decimal);//19
        addFieldArchetype(VL_OUT_DA,  decimal);//20
        addFieldArchetype(VL_BC_ICMS, decimal);//21
        addFieldArchetype(VL_ICMS,    decimal);//22
        addFieldArchetype(VL_BC_ICMS_ST, decimal);//23
        addFieldArchetype(VL_ICMS_ST, decimal);//24
        addFieldArchetype(VL_IPI,     decimal);//25
        addFieldArchetype(VL_PIS,     decimal);//26
        addFieldArchetype(VL_COFINS,  decimal);//27
        addFieldArchetype(VL_PIS_ST,  decimal);//28
        addFieldArchetype(VL_COFINS_ST, decimal);//29
    }

}
