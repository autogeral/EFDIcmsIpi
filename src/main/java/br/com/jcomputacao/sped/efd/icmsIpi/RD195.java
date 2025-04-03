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
     * Código da observação do lançamento fiscal (campo 02 do Registro 0460)
     * Informar o código da observação do lançamento.
      Validação: o código informado deve constar do registro 0460.
     */
    public static final String TXT_COMPL = "TXT_COMPL";
    /*
     * Descrição complementar do código de observação
      Utilizado para complementar a observação do lançamento fiscal, quando a descrição do
      código do lançamento informado no registro 0460 for de informação genérica.
    */

    public RD195() {
    
        setName("REGISTRO D195: OBSERVAÇOES DO LANÇAMENTO FISCAL");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D195"));
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT_COMPL, new FieldStringMaximumLengthArchetype(255));
    
    }
    
  
            
  }
