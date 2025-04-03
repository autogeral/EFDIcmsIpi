package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 11:12:15
 * @author Vinicius Diana
 */
public class R1922 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "1922"
     */
   public static final String REGISTRO = "REGISTRO";
   
   
   
   /*
     * 2 - Número do documento de arrecadação estadual, se houver
     */
   public static final String NUM_DA = "NUM_DA";
   
   
   
   
   /*
     * 3 - Número do processo ao qual o ajuste está vinculado, se houver
     */
   public static final String NUM_PROC = "NUM_PROC";
   
   
   
   
   
   /*
     * 4 - Indicador da origem do processo: 0- SEFAZ; 1- Justiça Federal; 2- Justiça Estadual; 9- Outros

     */
   public static final String IND_PROC = "IND_PROC";
   
   
   
   /*
     * 5 -  Descrição resumida do processo que embasou o lançamento
     */
   public static final String PROC = "PROC";
   
   
   
   
   /*
     * 6 - Descrição complementar
     */
   public static final String  TXT_COMPL = " TXT_COMPL";
   
   
   

    public R1922() {
        setName("REGISTRO 1922: INFORMACOES ADICIONAIS DOS AJUSTES DA SUB-APURAÇÃO DO ICMS ");
        setDelimiter("|");
        
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1922"));
        //2
        addFieldArchetype(NUM_DA, new FieldStringMaximumLengthArchetype(255));
        //3
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
        //4
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
        //5
        addFieldArchetype(PROC, new FieldStringMaximumLengthArchetype(255));
        //6
        addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
        
    }

   
   
   
   
   
 
   
   
   
  
   
   
   
}
