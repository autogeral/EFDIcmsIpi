package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 13/02/2013 10:40:29
 * @author Vinicius Diana
 */
public class RC195 extends LineArchetype {
    
   /*
    * 1 - Texto fixo contendo "C195"
    */
   public static final String REGISTRO = "REGISTRO";
   
   /*
    * 2 -  Código da observação do lançamento fiscal (campo 02 do Registro 0460)

    */
   public static final String  COD_OBS = " COD_OBS";
   
   /*
    * 3 -  Descrição complementar do código de observação.

    */
   public static final String  TXT_COMPL = " TXT_COMPL";
   
   
   public RC195(){
       setName("Observacoes do lancamento fiscal (Codigo 01 , 1B e 55)");
       setDelimiter("|");
       //1
       addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C195"));
       //2
       addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
       //3
       addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
   }

}
