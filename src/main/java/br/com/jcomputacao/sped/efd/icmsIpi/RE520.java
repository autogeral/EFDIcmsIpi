package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 10:05:33
 * @author Vinicius Diana
 */
public class RE520 extends LineArchetype {

    
     /*
      * 1 -    Texto fixo contendo "E520"  
      */
    public static final String REGISTRO = "REGISTRO";
    
     /*
      * 2 -   Saldo credor do IPI transferido do período anterior    
      */
    public static final String   VL_SD_ANT_IPI = " VL_SD_ANT_IPI";
    
    /*
      * 3 -  Valor total dos débitos por "Saídas com débito do imposto"     
      */
    public static final String  VL_DEB_IPI = " VL_DEB_IPI";
     /*
      * 4 -   Valor total dos créditos por "Entradas e aquisições com crédito do imposto"
    
      */
public static final String  VL_CRED_IPI = " VL_CRED_IPI";
/*
      * 5 -    Valor de "Outros débitos" do IPI (inclusive estornos de crédito)
    
      */
public static final String VL_OD_IPI = "VL_OD_IPI";

/*
      * 6 -    Valor de "Outros créditos" do IPI (inclusive estornos de débitos)

    
      */
public static final String VL_OC_IPI  = "VL_OC_IPI ";

/*
      * 7 -    Valor do saldo credor do IPI a transportar para o período seguinte  
      */
public static final String  VL_SC_IPI  = " VL_SC_IPI ";


/*
      * 8 -   Valor do saldo devedor do IPI a recolher
      */
public static final String VL_SD_IPI = "VL_SD_IPI";

    public RE520() {
        setName("Apuracao do IPI");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E520"));
        //2
         FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_SD_ANT_IPI, f1);
        //3
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_DEB_IPI, f2);
        //4
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_CRED_IPI, f3);
        //5
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_OD_IPI, f4);
        //6
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_OC_IPI, f5);
        //7
        FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_SC_IPI, f6);
        //8
        FieldDecimalMaximumLengthArchetype f7 = new FieldDecimalMaximumLengthArchetype(15,2);
        f7.setFormat(fw);
        addFieldArchetype(VL_SD_IPI, f7);
        
    }



    
}
