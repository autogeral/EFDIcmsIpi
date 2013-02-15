package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 08:20:12
 * @author Vinicius Diana
 */
public class RG130 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "G130" 
     */
   public static final String REGISTRO  = "REGISTRO ";
   /*
     * 2 - Indicador do emitente do documento fiscal: 0- Emissão própria; 1- Terceiros
 
     */
    public static final String  IND_EMIT    = " IND_EMIT   ";
    /*
     * 3 - Código do participante : - do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas

 
     */
   public static final String  COD_PART   = " COD_PART  ";
   /*
     * 4 - Indicador do emitente do documento fiscal: 0- Emissão própria; 1- Terceiros
 
     */
   public static final String COD_MOD  = "COD_MOD ";
   /*
     * 5 - Série do documento fiscal 
 
     */
   public static final String SERIE   = "SERIE  ";
   /*
     * 6 -  Número de documento fiscal 
 
     */
   public static final String NUM_DOC  = "NUM_DOC ";
   /*
     * 7 - Chave do documento fiscal eletrônico
 
     */
   public static final String CHV_NFE_CTE   = "CHV_NFE_CTE  ";
   /*
     * 8 - Data da emissão do documento fiscal 
 
     */
   public static final String  DT_DOC  = " DT_DOC ";

    public RG130() {
        setName("Registro 130 - identificacao do documento fiscal");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("G130"));
        //2
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        //3
         addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
          //4
          addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
          //5
          addFieldArchetype(SERIE, new FieldStringMaximumLengthArchetype(3));
          //6
          addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
          //7
          addFieldArchetype(CHV_NFE_CTE, new FieldStringFixedLengthArchetype(44));
          //8
          addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }
  
   
   
   

}
