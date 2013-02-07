package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 07/02/2013 09:24:13
 * @author Thiago Balthazar
 */
public class RD195 extends LineArchetype{
    
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D195"
     */
    public static final String COD_OBS = "COD_OBS";    
    /*
     * C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460)
     * Informar o c�digo da observa��o do lan�amento.
      Valida��o: o c�digo informado deve constar do registro 0460.
     */
    public static final String TXT_COMPL = "TXT_COMPL";
    /*
     * Descri��o complementar do c�digo de observa��o
      Utilizado para complementar a observa��o do lan�amento fiscal, quando a descri��o do
      c�digo do lan�amento informado no registro 0460 for de informa��o gen�rica.
    */

    public RD195() {
    
        setName("REGISTRO D195: OBSERVA�OES DO LAN�AMENTO FISCAL");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D195"));
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
    
    }
    
  
            
  }
