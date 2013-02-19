package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 11:58:30
 * @author Vinicius Diana
 */
public class R1920 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "1920"
    */
    public static final String REGISTRO = "REGISTRO";
    
    
    
     /*
     * 2 - Valor total dos d�bitos por "Sa�das e presta��es com d�bito do imposto" 
    */
    public static final String  VL_TOT_TRANSF_DEBITOS_OA = " VL_TOT_TRANSF_DEBITOS_OA";
    
    
    
    
     /*
     * 3 - Valor total de "Ajustes a d�bito"
    */
    public static final String  VL_TOT_AJ_DEBITOS_OA  = " VL_TOT_AJ_DEBITOS_OA";
    
    
    
    
     /*
     * 4 - Valor total de Ajustes ?Estornos de cr�ditos?

    */
    public static final String VL_ESTORNOS_CRED_OA = "VL_ESTORNOS_CRED_OA";
    
    
    
    
    
    
     /*
     * 5 - Valor total dos cr�ditos por "Entradas e aquisi��es com cr�dito do imposto" 
    */
    public static final String VL_TOT_TRANSF_CREDITOS_OA = "VL_TOT_TRANSF_CREDITOS_OA";
    
    
    
    
    
     /*
     * 6 -  Valor total de "Ajustes a cr�dito"
    */
    public static final String  VL_TOT_AJ_CREDITOS_OA = " VL_TOT_AJ_CREDITOS_OA";
    
    
    
    
    
     /*
     * 7 - Valor total de Ajustes ?Estornos de D�bitos?

    */
    public static final String VL_ESTORNOS_DEB_OA = "VL_ESTORNOS_DEB_OA";
    
    
    
    
    
     /*
     * 8 -  Valor total de "Saldo credor do per�odo anterior"

    */
    public static final String VL_SLD_CREDOR_ANT_OA = "VL_SLD_CREDOR_ANT_OA";
    
    
    
    
    
    
    
     /*
     * 9 - Valor do saldo devedor apurado
    */
    public static final String VL_SLD_APURADO_OA  = "VL_SLD_APURADO_OA";
    
    
    
    
    
     /*
     * 10 - Valor total de "Dedu��es"
    */
    public static final String VL_TOT_DED = "VL_TOT_DED";
    
    
    
    
    
     /*
     * 11 - Valor total de "ICMS a recolher (09-10)
    */
    public static final String VL_ICMS_RECOLHER_OA = "VL_ICMS_RECOLHER_OA";
    
    
    
    
     /*
     * 12 - Valor total de "Saldo credor a transportar para o per�odo seguinte? 

    */
    public static final String VL_SLD_CREDOR_TRANSP_OA = "VL_SLD_CREDOR_TRANSP_OA";
    
    
    
    
    
     /*
     * 13 -  Valores recolhidos ou a recolher, extra- apura��o
    */
    public static final String  DEB_ESP_OA = " DEB_ESP_OA";

    public R1920() {
        
        setName("REGISTRO 1920: SUB-APURA��O DO ICMS ");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1920"));
        //2
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_TOT_TRANSF_DEBITOS_OA, f1);
        //3
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_TOT_AJ_DEBITOS_OA, f2);
        //4
         FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype( VL_ESTORNOS_CRED_OA, f3);
        //5
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_TOT_TRANSF_CREDITOS_OA, f4);
        //6
          FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype( VL_TOT_AJ_CREDITOS_OA , f5);
        //7
         FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype( VL_ESTORNOS_DEB_OA , f6);
        //8
         FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_SLD_CREDOR_ANT_OA  , f7);
        //9
          FieldDecimalMaximumLengthArchetype f8 = new FieldDecimalMaximumLengthArchetype(15,2);
        f8.setFormat(fw);
        addFieldArchetype( VL_SLD_APURADO_OA   , f8);
        //10
           FieldDecimalMaximumLengthArchetype f9 = new FieldDecimalMaximumLengthArchetype(15,2);
        f9.setFormat(fw);
        addFieldArchetype(VL_TOT_DED  , f9);
        //11
          FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_ICMS_RECOLHER_OA , f10);
        //12
         FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype( VL_SLD_CREDOR_TRANSP_OA , f11);
        //13
         FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(DEB_ESP_OA  , f12);
    }
    
    
    
    
    
    
    
    
    

}
