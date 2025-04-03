package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 09:42:25
 * @author Vinicius Diana
 */
public class RE510 extends LineArchetype {

     /*
      *  1 -  Texto fixo contendo "E510"

      */
    public static final String REGISTRO = "REGISTRO";
    
    /*
      *  2 -   Código Fiscal de Operação e Prestação do agrupamento de itens
      */
        public static final String CFOP = "CFOP";
        
     /*
      *  3 -  Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2.
      */ 
        public static final String  CST_IPI = " CST_IPI ";
     
        /*
      *  4 -  Parcela correspondente ao "Valor Contábil" referente ao CFOP e ao Código de Tributação do IPI

      */ 
        public static final String  VL_CONT_IPI  = " VL_CONT_IPI ";
        
        /*
      *  5 -   Parcela correspondente ao "Valor da base de cálculo do IPI" referente ao CFOP e ao Código de Tributação do IPI, para operações tributadas
      */ 
       public static final String  VL_BC_IPI = "VL_BC_IPI";
      
       /*
       6 -  Parcela correspondente ao "Valor do IPI" referente ao CFOP e ao Código de Tributação do IPI, para operações tributadas

      */
       public static final String VL_IPI  = "VL_IPI ";

    public RE510() {
        setName("Registro E510 - Consolidacao dos valores do ipi");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E510"));
        //2
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //3
        addFieldArchetype(CST_IPI, new FieldStringFixedLengthArchetype(2));
        //4
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_CONT_IPI, f1);
        //5
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_BC_IPI, f2);
        //6
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_IPI, f3);
    }
       
       
       
}
