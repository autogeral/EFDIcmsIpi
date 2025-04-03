package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 17:06:08
 * @author Vinicius Diana
 */
public class RC130 extends LineArchetype {
    
    /*
     *  1 - Texto fixo contendo "C130"
     */
  public static final String REGISTRO = "REGISTRO";
  
  
  
  /*
     *  1 -  Valor dos serviços sob não-incidência ou não- tributados pelo ICMS
     */
  public static final String VL_SERV_NT = "VL_SERV_NT";
  
  
  
  /*
     *  3 -  Valor da base de cálculo do ISSQN
     */
  public static final String VL_BC_ISSQN = "VL_BC_ISSQN";
  
  
  
  /*
     *  4 - Valor do ISSQN
     */
  public static final String VL_ISSQN = "VL_ISSQN";
  
  
  
  
  /*
     *  5 - Valor da base de cálculo do Imposto de Renda Retido na Fonte

     */
  public static final String  VL_BC_IRRF = " VL_BC_IRRF";
  
  
  
  /*
     *  6 - Valor do Imposto de Renda - Retido na Fonte
     */
  public static final String VL_IRRF = "VL_ IRRF";
  
  
  
  
  
  /*
     *  7 - Valor da base de cálculo de retenção da Previdência Social

     */
  public static final String VL_BC_PREV = "VL_BC_PREV";
  
  
  
  /*
     *  8 - Valor destacado para retenção da Previdência Social

     */
  public static final String VL_PREV = "VL_ PREV";
  
  

    public RC130() {
        setName("|");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C130"));
        //2
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_SERV_NT, f1);
        //3
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_BC_ISSQN, f2);
        //5
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_BC_IRRF, f3);
        //6
         FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_IRRF, f4);
        //7
         FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_BC_PREV, f5);
        //8
         FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_PREV, f6);
        
    }
  
  
  
  
  
  
}
