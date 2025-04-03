package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 16:24:20
 * @author Vinicius Diana
 */
public class RC700 extends LineArchetype {
/*
 * 1 -  Texto fixo contendo "C700" 
 */
    public static final String REGISTRO = "REGISTRO";
    
    
    
    
    
    
    
    
    /*
 * 2 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1 
 */
    public static final String COD_MOD = "COD_MOD";
    
    
    
    
    
    
    
    /*
 * 3 -  Série do documento fiscal
 */
    public static final String SER = "SER";
    
    
    
    
    
    
    
    /*
 * 4 -  Número de ordem inicial 
 */
    public static final String NRO_ORD_INI = "NRO_ORD_INI";
    
    
    
    
    
    
    
    
    
    /*
 * 5 -  Número de ordem final
 */
    public static final String  NRO_ORD_FIN = " NRO_ORD_FIN";
    
    
    
    
    
    
    
    
    /*
 * 6 - Data de emissão inicial dos documentos / Data inicial de vencimento da fatura
 */
    public static final String  DT_DOC_INI = " DT_DOC_INI";
    
    
    
    
    
    
    
    
    /*
 * 7 -  Data de emissão final dos documentos / Data final do vencimento da fatura

 */
    public static final String  DT_DOC_FIN = " DT_DOC_FIN";
    
    
    
    
    
    
    
    
    /*
 * 8 -  Nome do arquivo Mestre de Documento Fiscal 
 */
    public static final String  NOM_MEST  = " NOM_MEST ";
    
    
    
    
    
    
    
    /*
 * 9 - Chave de codificação digital do arquivo Mestre de Documento Fiscal 
 */
    public static final String  CHV_COD_DIG = " CHV_COD_DIG";
    
    
    
    
    
    
    

    public RC700() {
        setName("REGISTRO C700: CONSOLIDACAO DOS DOCUMENTOS NF/CONTA ENERGIA ELÉTRICA (COD 06), EMITIDAS EM VIA UNICA (EMPRESAS OBRIGADAS A ENTREGA DO ARQUIVO PREVISTO NO CONVENIO ICMS 115/03) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GAS CANALIZADO (CODIGO 28) ");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C700"));
        //2
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //3
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        //4
        addFieldArchetype(NRO_ORD_INI, new FieldIntegerMaximumLengthArchetype(9));
        //5
        addFieldArchetype(NRO_ORD_FIN, new FieldIntegerMaximumLengthArchetype(9));
        //6
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //7
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //8
        addFieldArchetype(NOM_MEST, new FieldStringMaximumLengthArchetype(15));
        //9
        addFieldArchetype(CHV_COD_DIG, new FieldStringMaximumLengthArchetype(32));
        
    }
    
    
    
    
    
}
