package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 10:35:06
 * @author Vinicius Diana
 */
public class RE530 extends LineArchetype {

    /*
      * 1 -  Texto fixo contendo "E530"
      */
    public static final String REGISTRO = "REG";
    
    /*
      * 2 -  Indicador do tipo de ajuste: 0- Ajuste a débito; 1- Ajuste a crédito
      */
    public static final String IND_AJ = "IND_AJ";
  /*
      * 3 -  Valor do Ajuste
      */  
    public static final String VL_AJ = "VL_AJ";
    
    /*
      * 4 -   Código do ajuste da apuração, conforme a Tabela indicada no item 4.5.4.

      */ 
    public static final String COD_AJ = "COD_AJ";
    
    /*
      * 5 -  Indicador da origem do documento vinculado ao ajuste: 0 - Processo Judicial; 1 - Processo Administrativo; 2 - PER/DCOMP; 9 ? Outros.

      */ 
    public static final String  IND_DOC = " IND_DOC";
    
    /*
      * 6 -  Número do documento / processo / declaração ao qual o ajuste está vinculado, se houver


      */ 
    public static final String NUM_DOC = "NUM_DOC";
    
    
    /*
      * 7 -   Descrição detalhada do ajuste, com citação dos documentos fiscais.


      */
    public static final String DESCR_AJ = "DESCR_AJ";

    public RE530() 
    {
        setName("Registro E530 - ajuste da apuracao do ipi");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1 
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("E530"));
        //2
        addFieldArchetype(IND_AJ, new FieldStringFixedLengthArchetype(1));
        //3
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(VL_AJ, f1);
        //4
        addFieldArchetype(COD_AJ, new FieldStringFixedLengthArchetype((3)));
        //5
        addFieldArchetype(IND_DOC, new FieldStringFixedLengthArchetype(1));
        //6
        addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(255));
        //7
        addFieldArchetype(DESCR_AJ, new FieldStringMaximumLengthArchetype(255));
    }
    
    
    
    
}
