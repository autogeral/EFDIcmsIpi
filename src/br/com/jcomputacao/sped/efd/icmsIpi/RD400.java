/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/02/2013 10:53:41
 * @author Thiago Balthazar
 */
public class RD400 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D400"
     */
    
    public static final String COD_PART = "COD_PART";
    /*
     * Código do participante (campo 02 do Registro 0150):
     - agência, filial ou posto
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    public static final String COD_SIT = "COD_SIT";
    /*
     * Código da situação do documento fiscal, conforme a Tabela 4.1.2
     */
    public static final String SER = "SER";
    /*
     * Série do documento fiscal
     */
    public static final String SUB = "SUB";
    /*
     * Subsérie do documento fiscal
     */
    public static final String NUM_DOC = "NUM_DOC";
    /*
     * Número do documento fiscal resumo.
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão do documento fiscal
     */
    public static final String VL_DOC = "VL_DOC";
    /*
     * Valor total do documento fiscal
     */
    public static final String VL_DESC = "VL_DESC";
    /*
     * Valor acumulado dos descontos
     */
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor acumulado da prestação de serviço
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor total da base de cálculo do ICMS
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor total do ICMS
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor da COFINS
     */
    
    public static final String COD_CTA = "COD_CTA";
    /*
     * Código da conta analítica contábil debitada/creditada
     */

    public RD400() {
    
       setName("REGISTRO D400: RESUMO DE MOVIMENTO DIARIO - RMD (CODIGO 18)");
       setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
 
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D400"));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_SERV, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(COD_CTA,new FieldStringMaximumLengthArchetype(255));
           
    }
                         
    
    
}
