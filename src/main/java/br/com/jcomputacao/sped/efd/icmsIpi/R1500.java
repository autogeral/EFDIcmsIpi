package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 14:25:07
 * @author Thiago Balthazar
 */
public class R1500 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "1500"
 */



public static final String IND_OPER = "IND_OPER";
/*
 * Indicador do tipo de operaÃ§Ã£o:
    1- Saï¿½da
 */




public static final String IND_EMIT = "IND_EMIT";
/*
 * Indicador do emitente do documento fiscal:
    0- EmissÃ£o prÃ³pria
 */




public static final String COD_PART = "COD_PART";
/*
 * CÃ³digo do participante (campo 02 do Registro 0150):
   - do adquirente, no caso das saï¿½das.
 */




public static final String COD_MOD = "COD_MOD";
/*
 * CÃ³digo do modelo do documento fiscal, conforme a Tabela 4.1.1
 */




public static final String COD_SIT = "COD_SIT";
/*
 * CÃ³digo da situaÃ§Ã£o do documento fiscal, conforme a Tabela 4.1.2
 */




public static final String SER = "SER";
/*
 * Sï¿½rie do documento fiscal
 */




public static final String SUB = "SUB";
/*
 * Subsï¿½rie do documento fiscal
 */




public static final String COD_CONS = "COD_CONS";
/*
 * CÃ³digo de classe de consumo de energia elÃ©trica:
01 - Comercial
02 - Consumo Prï¿½prio
03 - IluminaÃ§Ã£o Pï¿½blica
04 - Industrial
05 - Poder Pï¿½blico
06 - Residencial
07 - Rural
08 -Serviï¿½o Pï¿½blico
 */





public static final String NUM_DOC = "NUM_DOC"; 
/*
 * Nï¿½mero do documento fiscal
 */




public static final String DT_DOC = "DT_DOC";
/*
 * Data da emissÃ£o do documento fiscal
 */




public static final String DT_E_S = "DT_E_S";
/*
 * Data da entrada ou da saï¿½da
 */




public static final String VL_DOC = "VL_DOC";
/*
 * Valor total do documento fiscal
 */




public static final String VL_DESC = "VL_DESC";
/*
 * Valor total do desconto
 */




public static final String VL_FORN = "VL_FORN";
/*
 * Valor total fornecido/consumido
 */




public static final String VL_SERV_NT = "VL_SERV_NT";
/*
 * Valor total dos serviï¿½os nï¿½o-tributados pelo ICMS
 */




public static final String VL_TERC = "VL_TERC";
/*
 * Valor total cobrado em nome de terceiros
 */




public static final String VL_DA = "VL_DA";
/*
 * Valor total de despesas acessï¿½rias indicadas no documento fiscal
 */




public static final String VL_BC_ICMS = "VL_BC_ICMS";
/*
 * Valor acumulado da base de cï¿½lculo do ICMS
 */




public static final String VL_ICMS = "VL_ICMS";
/*
 * Valor acumulado do ICMS
 */




public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
/*
 *Valor acumulado da base de cï¿½lculo do ICMS substituiÃ§Ã£o tributï¿½ria 
 */




public static final String VL_ICMS_ST = "VL_ICMS_ST";
/*
 * Valor acumulado do ICMS retido por substituiÃ§Ã£o tributï¿½ria
 */




public static final String COD_INF = "COD_INF";
/*
 * CÃ³digo da informaÃ§Ã£o complementar do documento fiscal (campo 02 do Registro 0450)
 */




public static final String VL_PIS = "VL_PIS";
/*
 * Valor do PIS
 */




public static final String VL_COFINS = "VL_COFINS";
/*
 * Valor da COFINS
 */




public static final String TP_LIGACAO = "TP_LIGACAO";
/*
 * CÃ³digo de tipo de LigaÃ§Ã£o
    1 - Monofï¿½sico
    2 - Bifï¿½sico
    3 - Trifï¿½sico
 */




public static final String COD_GRUPO_TENSAO = "COD_GRUPO_TENSAO";
/*
 * CÃ³digo de grupo de tensï¿½o:
    01 - A1 - Alta Tensï¿½o (230kV ou mais)
    02 - A2 - Alta Tensï¿½o (88 a 138kV)
    03 - A3 - Alta Tensï¿½o (69kV)
    04 - A3a - Alta Tensï¿½o (30kV a 44kV)
    05 - A4 - Alta Tensï¿½o (2,3kV a 25kV)
    06 - AS - Alta Tensï¿½o Subterrï¿½neo 06
    07 - B1 - Residencial 07
    08 - B1 - Residencial Baixa Renda 08
    09 - B2 - Rural 09
    10 - B2 - Cooperativa de EletrificaÃ§Ã£o Rural
    11 - B2 - Serviï¿½o Pï¿½blico de IrrigaÃ§Ã£o
    12 - B3 - Demais Classes
    13 - B4a - IluminaÃ§Ã£o Pï¿½blica - rede de distribuiÃ§Ã£o
    14 - B4b - IluminaÃ§Ã£o Pï¿½blica - bulbo de lï¿½mpada
 */



    public R1500() {
        
        setName("REGISTRO 1500: NOTA FISCAL/CONTA DE ENERGIA ELETRICA (CODIGO 06) ? OPERACOES INTERESTADUAIS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO,         new FieldDefaultArchetype("1500"));
        addFieldArchetype(IND_OPER,         new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT,         new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART,         new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD,          new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT,          new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER,              new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB,              new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_CONS,         new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUM_DOC,          new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC,           new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_E_S,           new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC,           decimal);
        addFieldArchetype(VL_DESC,          decimal);
        addFieldArchetype(VL_FORN,          decimal);
        addFieldArchetype(VL_SERV_NT,       decimal);
        addFieldArchetype(VL_TERC,          decimal);
        addFieldArchetype(VL_DA,            decimal);
        addFieldArchetype(VL_BC_ICMS,       decimal);
        addFieldArchetype(VL_ICMS,          decimal);
        addFieldArchetype(VL_BC_ICMS_ST,    decimal);
        addFieldArchetype(VL_ICMS_ST,       decimal);
        addFieldArchetype(COD_INF,          new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_PIS,           decimal);
        addFieldArchetype(VL_COFINS,        decimal);
        addFieldArchetype(TP_LIGACAO,       new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(COD_GRUPO_TENSAO, new FieldStringFixedLengthArchetype(2));
    
    }

}
