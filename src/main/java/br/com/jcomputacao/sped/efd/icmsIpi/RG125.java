package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 14/02/2013 09:40:40
 * @author Vinicius Diana
 */
public class RG125 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "G125" 
     */
    public static final String REGISTRO = "REG";
    
    /*
     * 2 -   Código individualizado do bem ou componente adotado no controle patrimonial do estabelecimento informante

     */
    public static final String  COD_IND_BEM = " COD_IND_BEM";
    
     /*
     * 3 -  Data da movimentação ou do saldo inicial 

     */
    public static final String  DT_MOV  = " DT_MOV ";
    
    /*
     * 4 - Tipo de movimentação do bem ou componente: SI = Saldo inicial de bens imobilizados; IM = Imobilização de bem individual; IA = Imobilização em Andamento - Componente; CI = Conclusão de Imobilização em Andamento ? Bem Resultante; MC = Imobilização oriunda do Ativo Circulante; BA = Baixa do bem - Fim do período de apropriação; AT = Alienação ou Transferência; PE = Perecimento, Extravio ou Deterioração; OT = Outras Saídas do Imobilizado 

     */
    public static final String TIPO_MOV  = "TIPO_MOV ";
    
   /*
     * 5 -  Valor do ICMS da Operação Própria na entrada do bem ou componente 

     */ 
    public static final String  VL_IMOB_ICMS_OP = " VL_IMOB_ICMS_OP";
    
    /*
     * 6 - Valor do ICMS da Oper. por Sub. Tributária na entrada do bem ou componente

     */
 public static final String  VL_IMOB_ICMS_ST = " VL_IMOB_ICMS_ST";
 
 /*
  * 7 - Valor do ICMS sobre Frete do Conhecimento de Transporte na entrada do bem ou componente

  */
 public static final String VL_IMOB_ICMS_FRT = "VL_IMOB_ICMS_FRT";
 
 /*
  * 8 - Valor do ICMS - Diferencial de Alíquota, conforme Doc. de Arrecadação, na entrada do bem ou componente

  */
public static final String VL_IMOB_ICMS_DIF = "VL_IMOB_ICMS_DIF";

/*
  * 9 - Número da parcela do ICMS 

  */
public static final String  NUM_PARC  = " NUM_PARC ";


/*
  * 10 -   Valor da parcela de ICMS passível de apropriação (antes da aplicação da participação percentual do valor das saídas tributadas/exportação sobre as saídas totais) 


  */
public static final String VL_PARC_PASS = "VL_PARC_PASS";

    public RG125() {
        setName("REGISTRO G125 MOVIMENTACAO DE BEM OU COMPONENTE DO ATIVO IMOBILIZADO");
        setDelimiter("|"); 
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("G125"));
        //2
        addFieldArchetype(COD_IND_BEM, new FieldStringMaximumLengthArchetype(60));
        //3
        addFieldArchetype(DT_MOV, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //4
     addFieldArchetype(TIPO_MOV, new FieldStringFixedLengthArchetype(2));
        //5
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(VL_IMOB_ICMS_OP, f2);
        //6
         FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15,2);
        f3.setFormat(fw);
        addFieldArchetype(VL_IMOB_ICMS_ST, f3);
        //7
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
        f4.setFormat(fw);
        addFieldArchetype(VL_IMOB_ICMS_FRT, f4);
        //8
        FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
        f5.setFormat(fw);
        addFieldArchetype(VL_IMOB_ICMS_DIF, f5);
        //9
        addFieldArchetype(NUM_PARC, new FieldIntegerMaximumLengthArchetype(3));
        //10
         FieldDecimalMaximumLengthArchetype f6 = new FieldDecimalMaximumLengthArchetype(15,2);
        f6.setFormat(fw);
        addFieldArchetype(VL_PARC_PASS, f6);
    }

    



    

}
