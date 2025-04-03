package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 11:28:29
 * @author Thiago Balthazar
 */
public class RC173 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C173"
     */
    public static final String LOTE_MED = "LOTE_MED";
    /*
     * Número do lote de fabricação do medicamento
     */
    public static final String QTD_ITEM = "QTD_ITEM";
    /*
     * Quantidade de item por lote
     */
    public static final String DT_FAB = "DT_FAB";
    /*
     * Data de fabricação do medicamento
     */
    public static final String DT_VAL = "DT_VAL";
    /*
     * Data de expiração da validade do medicamento
     */
    public static final String IND_MED = "IND_MED";
    /*
     * Indicador de tipo de referência da base de cálculo
    do ICMS (ST) do produto farmacêutico:
    0- Base de cálculo referente ao preço tabelado ou
    preço máximo sugerido;
    1- Base cálculo ? Margem de valor agregado;
    2- Base de cálculo referente à Lista Negativa;
    3- Base de cálculo referente à Lista Positiva;
    4- Base de cálculo referente à Lista Neutra
     */
    public static final String TP_PROD = "TP_PROD";
    /*
     * Tipo de produto:
    0- Similar;
    1- Genérico;
    2- Ético ou de marca;
     */
    public static final String VL_TAB_MAX = "VL_TAB_MAX";
    /*
     * Valor do preço tabelado ou valor do preço máximo
     */

    public RC173() {
    
        setName("REGISTRO C173: OPERACOES COM MEDICAMENTOS (CODIGO 01 e 55).");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,3);
        decimal2.setFormat(fw3);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C173"));
        addFieldArchetype(LOTE_MED, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(QTD_ITEM, decimal2);
        addFieldArchetype(DT_FAB, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_VAL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(IND_MED, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(TP_PROD, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_TAB_MAX, decimal);
    }
    
    
}
