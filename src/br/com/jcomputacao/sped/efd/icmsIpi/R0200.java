
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/01/2013 23:01:36
 * @author Murilo
 */
public class R0200 extends LineArchetype {

    public static final String REGISTRO     = "REG";
    public static final String COD_ITEM     = "COD_ITEM";
    public static final String DESCR_ITEM   = "DESCR_ITEM";
    public static final String COD_BARRA    = "COD_BARRA";
    public static final String COD_ANT_ITEM = "COD_ANT_ITEM";
    
    /**
     * Unidade informada anteriormente
     * @see br.com.jcomputacao.sped.efd.icmsIpi.R0190
     */
    public static final String UNID_INV     = "UNID_INV";
    /**
     * <ul>
     * <li>00 Mercadoria para Revenda</li>
     * <li>01 Materia-Prima</li>
     * <li>02 Embalagem</li>
     * <li>03 Produto em Processo</li>
     * <li>04 Produto Acabado</li>
     * <li>05 Subproduto</li>
     * <li>06 Produto Intermediario</li>
     * <li>07 Material de Uso e Consumo</li>
     * <li>08 Ativo Imobilizado</li>
     * <li>09 Servicos</li>
     * <li>10 Outros insumos</li>
     * <li>99 Outras</li>
     * </ul>
     */
    public static final String TIPO_ITEM    = "TIPO_ITEM";
    public static final String COD_NCM      = "COD_NCM";
    public static final String EX_IPI       = "EX_IPI";
    /**
     * Tabela 4.2.1
     * <ul>
     * <li>00 Servico</li>
     * <li>01 Animais vivos</li>
     * <li>02 Carnes e miudezas, comestiveis</li>
     * <li>03 Peixes e crustaceos, moluscos e os outros invertebrados aquaticos</li>
     * <li>04 Leite e laticinios; ovos de aves; mel natural; produtos comestiveis de origem animal, nao especificados nem compreendidos em outros Capitulos da TIPI</li>
     * <li>05 Outros produtos de origem animal, nao especificados nem compreendidos em outros Capitulos da TIPI</li>
     * <li>06 Plantas vivas e produtos de floricultura</li>
     * <li>07 Produtos horticolas, plantas, raizes e tuberculos, comestiveis</li>
     * <li>08 Frutas; cascas de citricos e de meloes</li>
     * <li>09 Cafe, cha, mate e especiarias</li>
     * <li>10 Cereais</li>
     * <li>11 Produtos da industria de moagem; malte; amidos e feculas; inulina; gluten de trigo</li>
     * <li>12 Sementes e frutos oleaginosos; graos, sementes e frutos diversos; plantas industriais ou medicinais; palha e forragem</li>
     * <li>13 Gomas, resinas e outros sucos e extratos vegetais</li>
     * <li>14 Materias para entrancar e outros produtos de origem vegetal, nao especificadas nem compreendidas em outros Capitulos da NCM</li>
     * <li>15 Gorduras e oleos animais ou vegetais; produtos da sua dissociacao; gorduras alimentares elaboradas; ceras de origem animal ou vegetal</li>
     * <li>16 Preparacoes de carne, de peixes ou de crustaceos, de moluscos ou de outros invertebrados aquaticos</li>
     * <li>17 Acucares e produtos de confeitaria</li>
     * <li>18 Cacau e suas preparacoes</li>
     * <li>19 Preparacoes à base de cereais, farinhas, amidos, feculas ou de leite; produtos de pastelaria</li>
     * <li>20 Preparacoes de produtos horticolas, de frutas ou de outras partes de plantas</li>
     * <li>21 Preparacoes alimenticias diversas</li>
     * <li>22 Bebidas, liquidos alcoolicos e vinagres</li>
     * <li>23 Residuos e desperdicios das industrias alimentares; alimentos preparados para animais</li>
     * <li>24 Fumo (tabaco) e seus suced�neos, manufaturados</li>
     * <li>25 Sal; enxofre; terras e pedras; gesso, cal e cimento</li>
     * <li>26 Minerios, escorias e cinzas</li>
     * <li>27 Combustiveis minerais, oleos minerais e produtos de sua destilacao; materias betuminosas; ceras minerais</li>
     * <li>28 Produtos quimicos inorg�nicos; compostos inorg�nicos ou org�nicos de metais preciosos, de elementos radioativos, de metais das terras raras ou de isotopos</li>
     * <li>29 Produtos quimicos org�nicos</li>
     * <li>30 Produtos farmac�uticos</li>
     * <li>31 Adubos ou fertilizantes</li>
     * <li>32 Extratos tanantes e tintoriais; taninos e seus derivados; pigmentos e outras materias corantes, tintas e vernizes, mastiques; tintas de escrever</li>
     * <li>33 Oleos essenciais e resinoides; produtos de perfumaria ou de toucador preparados e preparacoes cosmeticas</li>
     * <li>34 Saboes, agentes org�nicos de superficie, preparacoes para lavagem, preparacoes lubrificantes, ceras artificiais, ceras preparadas, produtos de conservacao e limpeza, velas e artigos semelhantes, massas ou pastas para modelar, "ceras para dentistas" e composicoes para dentistas � base de gesso</li>
     * <li>35 Materias albuminoides; produtos � base de amidos ou de feculas modificados; colas; enzimas</li>
     * <li>36 Polvoras e explosivos; artigos de pirotecnia; fosforos; ligas piroforicas; materias inflamaveis</li>
     * <li>37 Produtos para fotografia e cinematografia</li>
     * <li>38 Produtos diversos das industrias quimicas</li>
     * <li>39 Plasticos e suas obras</li>
     * <li>40 Borracha e suas obras</li>
     * <li>41 Peles, exceto a peleteria (peles com p�lo*), e couros</li>
     * <li>42 Obras de couro; artigos de correeiro ou de seleiro; artigos de viagem, bolsas e artefatos semelhantes; obras de tripa</li>
     * <li>43 Peleteria (peles com pelo*) e suas obras; peleteria (peles com pelo*) artificial</li>
     * <li>44 Madeira, carvao vegetal e obras de madeira</li>
     * <li>45 Cortica e suas obras</li>
     * <li>46 Obras de espartaria ou de cestaria</li>
     * <li>47 Pastas de madeira ou de outras materias fibrosas celulosicas; papel ou cartao de reciclar (desperdicios e aparas)</li>
     * <li>48 Papel e cartao; obras de pasta de celulose, de papel ou de cartao</li>
     * <li>49 Livros, jornais, gravuras e outros produtos das industrias graficas; textos manuscritos ou datilografados, planos e plantas</li>
     * <li>50 Seda</li>
     * <li>51 La e pelos finos ou grosseiros; fios e tecidos de crina</li>
     * <li>52 Algodao</li>
     * <li>53 Outras fibras t�xteis vegetais; fios de papel e tecido de fios de papel</li>
     * <li>54 Filamentos sinteticos ou artificiais</li>
     * <li>55 Fibras sinteticas ou artificiais, descontinuas</li>
     * <li>56 Pastas ("ouates"), feltros e falsos tecidos; fios especiais; cordeis, cordas e cabos; artigos de cordoaria</li>
     * <li>57 Tapetes e outros revestimentos para pavimentos, de materias t�xteis</li>
     * <li>58 Tecidos especiais; tecidos tufados; rendas; tapecarias; passamanarias; bordados</li>
     * <li>59 Tecidos impregnados, revestidos, recobertos ou estratificados; artigos para usos tecnicos de materias t�xteis</li>
     * <li>60 Tecidos de malha</li>
     * <li>61 Vestuario e seus acessorios, de malha</li>
     * <li>62 Vestuario e seus acessorios, exceto de malha</li>
     * <li>63 Outros artefatos t�xteis confeccionados; sortidos; artefatos de materias t�xteis, calcados, chapeus e artefatos de uso semelhante, usados; trapos</li>
     * <li>64 Calcados, polainas e artefatos semelhantes, e suas partes</li>
     * <li>65 Chapeus e artefatos de uso semelhante, e suas partes</li>
     * <li>66 Guarda-chuvas, sombrinhas, guarda-sois, bengalas, bengalas-assentos, chicotes, e suas partes</li>
     * <li>67 Penas e penugem preparadas, e suas obras; flores artificiais; obras de cabelo</li>
     * <li>68 Obras de pedra, gesso, cimento, amianto, mica ou de materias semelhantes</li>
     * <li>69 Produtos cer�micos</li>
     * <li>70 Vidro e suas obras</li>
     * <li>71 Perolas naturais ou cultivadas, pedras preciosas ou semipreciosas e semelhantes, metais preciosos, metais folheados ou chapeados de metais preciosos, e suas obras; bijuterias; moedas</li>
     * <li>72 Ferro fundido, ferro e aco</li>
     * <li>73 Obras de ferro fundido, ferro ou aco</li>
     * <li>74 Cobre e suas obras</li>
     * <li>75 Niquel e suas obras</li>
     * <li>76 Aluminio e suas obras</li>
     * <li>77 (Reservado para uma eventual utilizacao futura no SH)</li>
     * <li>78 Chumbo e suas obras</li>
     * <li>79 Zinco e suas obras</li>
     * <li>80 Estanho e suas obras</li>
     * <li>81 Outros metais comuns; ceramais ("cermets"); obras dessas materias</li>
     * <li>82 Ferramentas, artefatos de cutelaria e talheres, e suas partes, de metais comuns</li>
     * <li>83 Obras diversas de metais comuns</li>
     * <li>84 Reatores nucleares, caldeiras, maquinas, aparelhos e instrumentos mec�nicos, e suas partes</li>
     * <li>85 Maquinas, aparelhos e materiais eletricos, e suas partes; aparelhos de gravacao ou de reproducao de som, aparelhos de gravacao ou de reproducao de imagens e de som em televisao, e suas partes e acessorios</li>
     * <li>86 Veiculos e material para vias ferreas ou semelhantes, e suas partes; aparelhos mec�nicos (incluidos os eletromec�nicos) de sinalizacao para vias de comunicacao</li>
     * <li>87 Veiculos automoveis, tratores, ciclos e outros veiculos terrestres, suas partes e acessorios</li>
     * <li>88 Aeronaves e aparelhos espaciais, e suas partes</li>
     * <li>89 Embarcacoes e estruturas flutuantes</li>
     * <li>90 Instrumentos e aparelhos de optica, fotografia ou cinematografia, medida, controle ou de precisao; instrumentos e aparelhos medico-cirurgicos; suas partes e acessorios</li>
     * <li>91 Aparelhos de relojoaria e suas partes</li>
     * <li>92 Instrumentos musicais, suas partes e acessorios</li>
     * <li>93 Armas e municoes; suas partes e acessorios</li>
     * <li>94 Moveis, mobiliario medico-cirurgico; colchoes; iluminacao e construcao pre-fabricadas</li>
     * <li>95 Brinquedos, jogos, artigos para divertimento ou para esporte; suas partes e acessorios</li>
     * <li>96 Obras diversas</li>
     * <li>97 Objetos de arte, de colecao e antiguidades</li>
     * <li>98 (Reservado para usos especiais pelas Partes Contratantes)</li>
     * <li>99 Operacoes especiais (utilizado exclusivamente pelo Brasil para classificar operacoes especiais na exportacao)</li>
     * </ul>
     */
    public static final String COD_GEN      = "COD_GEN";
    /**
     * <p ALIGN="CENTER">&nbsp;<font face="Arial" size="2"><a name="anexo"></a>Lista de servi�os anexa � Lei
Complementar n� 116, de 31 de julho de 2003.</p>
</b>

<p>1 &#150; Servi�os de inform�tica e cong�neres.</p>

<p>1.01 &#150; An�lise e desenvolvimento de sistemas.</p>

<p>1.02 &#150; Programa��o.</p>

<p>1.03 &#150; Processamento de dados e cong�neres.</p>

<p>1.04 &#150; Elabora��o de programas de computadores, inclusive de jogos eletr�nicos.</p>

<p>1.05 &#150; Licenciamento ou cess�o de direito de uso de programas de computa��o.</p>

<p>1.06 &#150; Assessoria e consultoria em inform�tica.</p>

<p>1.07 &#150; Suporte t�cnico em inform�tica, inclusive instala��o, configura��o e
manuten��o de programas de computa��o e bancos de dados.</p>

<p>1.08 &#150; Planejamento, confec��o, manuten��o e atualiza��o de p�ginas
eletr�nicas.</p>

<p>2 &#150; Servi�os de pesquisas e desenvolvimento de qualquer natureza.</p>

<p>2.01 &#150; Servi�os de pesquisas e desenvolvimento de qualquer natureza.</p>

<p>3 &#150; Servi�os prestados mediante loca��o, cess�o de direito de uso e cong�neres.</p>

<p>3.01 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>3.02 &#150; Cess�o de direito de uso de marcas e de sinais de propaganda.</p>

<p>3.03 &#150; Explora��o de sal�es de festas, centro de conven��es, escrit�rios
virtuais, <b>stands</b><i>, </i>quadras esportivas, est�dios, gin�sios, audit�rios,
casas de espet�culos, parques de divers�es, canchas e cong�neres, para realiza��o de
eventos ou neg�cios de qualquer natureza.</p>

<p>3.04 &#150; Loca��o, subloca��o, arrendamento, direito de passagem ou permiss�o de
uso, compartilhado ou n�o, de ferrovia, rodovia, postes, cabos, dutos e condutos de
qualquer natureza.</p>

<p>3.05 &#150; Cess�o de andaimes, palcos, coberturas e outras estruturas de uso
tempor�rio.</p>

<p>4 &#150; Servi�os de sa�de, assist�ncia m�dica e cong�neres.</p>

<p>4.01 &#150; Medicina e biomedicina.</p>

<p>4.02 &#150; An�lises cl�nicas, patologia, eletricidade m�dica, radioterapia,
quimioterapia, ultra-sonografia, resson�ncia magn�tica, radiologia, tomografia e
cong�neres.</p>

<p>4.03 &#150; Hospitais, cl�nicas, laborat�rios, sanat�rios, manic�mios, casas de
sa�de, prontos-socorros, ambulat�rios e
cong�neres.</p>

<p>4.04 &#150; Instrumenta��o cir�rgica.</p>

<p>4.05 &#150; Acupuntura.</p>

<p>4.06 &#150; Enfermagem, inclusive servi�os auxiliares.</p>

<p>4.07 &#150; Servi�os farmac�uticos.</p>

<p>4.08 &#150; Terapia ocupacional, fisioterapia e fonoaudiologia.</p>

<p>4.09 &#150; Terapias de qualquer esp�cie destinadas ao tratamento f�sico, org�nico e
mental.</p>

<p>4.10 &#150; Nutri��o.</p>

<p>4.11 &#150; Obstetr�cia.</p>

<p>4.12 &#150; Odontologia.</p>

<p>4.13 &#150; Ort�ptica.</p>

<p>4.14 &#150; Pr�teses sob encomenda.</p>

<p>4.15 &#150; Psican�lise.</p>

<p>4.16 &#150; Psicologia.</p>

<p>4.17 &#150; Casas de repouso e de recupera��o, creches, asilos e cong�neres.</p>

<p>4.18 &#150; Insemina��o artificial, fertiliza��o <b>in vitro</b><i> </i>e cong�neres.</p>

<p>4.19 &#150; Bancos de sangue, leite, pele, olhos, �vulos, s�men e cong�neres.</p>

<p>4.20 &#150; Coleta de sangue, leite, tecidos, s�men, �rg�os e materiais biol�gicos de
qualquer esp�cie.</p>

<p>4.21 &#150; Unidade de atendimento, assist�ncia ou tratamento m�vel e cong�neres.</p>

<p>4.22 &#150; Planos de medicina de grupo ou individual e conv�nios para presta��o de
assist�ncia m�dica, hospitalar, odontol�gica e cong�neres.</p>

<p>4.23 &#150; Outros planos de sa�de que se cumpram atrav�s de servi�os de terceiros
contratados, credenciados, cooperados ou apenas pagos pelo operador do plano mediante
indica��o do benefici�rio.</p>

<p>5 &#150; Servi�os de medicina e assist�ncia veterin�ria e cong�neres.</p>

<p>5.01 &#150; Medicina veterin�ria e zootecnia.</p>

<p>5.02 &#150; Hospitais, cl�nicas, ambulat�rios, prontos-socorros e cong�neres, na �rea
veterin�ria.</p>

<p>5.03 &#150; Laborat�rios de an�lise na �rea veterin�ria.</p>

<p>5.04 &#150; Insemina��o artificial, fertiliza��o <b>in vitro</b> e cong�neres.</p>

<p>5.05 &#150; Bancos de sangue e de �rg�os e cong�neres.</p>

<p>5.06 &#150; Coleta de sangue, leite, tecidos, s�men, �rg�os e materiais biol�gicos de
qualquer esp�cie.</p>

<p>5.07 &#150; Unidade de atendimento, assist�ncia ou tratamento m�vel e cong�neres.</p>

<p>5.08 &#150; Guarda, tratamento, amestramento, embelezamento, alojamento e cong�neres.</p>

<p>5.09 &#150; Planos de atendimento e assist�ncia m�dico-veterin�ria.</p>

<p>6 &#150; Servi�os de cuidados pessoais, est�tica, atividades f�sicas e cong�neres.</p>

<p>6.01 &#150; Barbearia, cabeleireiros, manicuros, pedicuros e cong�neres.</p>

<p>6.02 &#150; Esteticistas, tratamento de pele, depila��o e cong�neres.</p>

<p>6.03 &#150; Banhos, duchas, sauna, massagens e cong�neres.</p>

<p>6.04 &#150; Gin�stica, dan�a, esportes, nata��o, artes marciais e demais atividades
f�sicas.</p>

<p>6.05 &#150; Centros de emagrecimento, <b>spa </b>e cong�neres.</p>

<p>7 &#150; Servi�os relativos a engenharia, arquitetura, geologia, urbanismo, constru��o
civil, manuten��o, limpeza, meio ambiente, saneamento e cong�neres.</p>

<p>7.01 &#150; Engenharia, agronomia, agrimensura, arquitetura, geologia, urbanismo,
paisagismo e cong�neres.</p>

<p>7.02 &#150; Execu��o, por administra��o, empreitada ou subempreitada, de obras de
constru��o civil, hidr�ulica ou el�trica e de outras obras semelhantes, inclusive
sondagem, perfura��o de po�os, escava��o, drenagem e irriga��o, terraplanagem,
pavimenta��o, concretagem e a instala��o e montagem de produtos, pe�as e equipamentos
(exceto o fornecimento de mercadorias produzidas pelo prestador de servi�os fora do local
da presta��o dos servi�os, que fica sujeito ao ICMS).</p>

<p>7.03 &#150; Elabora��o de planos diretores, estudos de viabilidade, estudos
organizacionais e outros, relacionados com obras e servi�os de engenharia; elabora��o
de anteprojetos, projetos b�sicos e projetos executivos para trabalhos de engenharia.</p>

<p>7.04 &#150; Demoli��o.</p>

<p>7.05 &#150; Repara��o, conserva��o e reforma de edif�cios, estradas, pontes, portos e
cong�neres (exceto o fornecimento de mercadorias produzidas pelo prestador dos servi�os,
fora do local da presta��o dos servi�os, que fica sujeito ao ICMS).</p>

<p>7.06 &#150; Coloca��o e instala��o de tapetes, carpetes, assoalhos, cortinas,
revestimentos de parede, vidros, divis�rias, placas de gesso e cong�neres, com material
fornecido pelo tomador do servi�o.</p>

<p>7.07 &#150; Recupera��o, raspagem, polimento e lustra��o de pisos e cong�neres.</p>

<p>7.08 &#150; Calafeta��o.</p>

<p>7.09 &#150; Varri��o, coleta, remo��o, incinera��o, tratamento, reciclagem,
separa��o e destina��o final de lixo, rejeitos e outros res�duos quaisquer.</p>

<p>7.10 &#150; Limpeza, manuten��o e conserva��o de vias e logradouros p�blicos,
im�veis, chamin�s, piscinas, parques, jardins e cong�neres.</p>

<p>7.11 &#150; Decora��o e jardinagem, inclusive corte e poda de �rvores.</p>

<p>7.12 &#150; Controle e tratamento de efluentes de qualquer natureza e de agentes f�sicos,
qu�micos e biol�gicos.</p>

<p>7.13 &#150; Dedetiza��o, desinfec��o, desinsetiza��o, imuniza��o, higieniza��o,
desratiza��o, pulveriza��o e cong�neres.</p>

<p>7.14 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>7.15 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>7.16 &#150; Florestamento, reflorestamento, semeadura, aduba��o e cong�neres.</p>

<p>7.17 &#150; Escoramento, conten��o de encostas e servi�os cong�neres.</p>

<p>7.18 &#150; Limpeza e dragagem de rios, portos, canais, ba�as, lagos, lagoas, represas,
a�udes e cong�neres.</p>

<p>7.19 &#150; Acompanhamento e fiscaliza��o da execu��o de obras de engenharia,
arquitetura e urbanismo.</p>

<p>7.20 &#150; Aerofotogrametria (inclusive interpreta��o), cartografia, mapeamento,
levantamentos topogr�ficos, batim�tricos, geogr�ficos, geod�sicos, geol�gicos,
geof�sicos e cong�neres.</p>

<p>7.21 &#150; Pesquisa, perfura��o, cimenta��o, mergulho, perfilagem, concreta��o,
testemunhagem, pescaria, estimula��o e outros servi�os relacionados com a explora��o
e explota��o de petr�leo, g�s natural e de outros recursos minerais.</p>

<p>7.22 &#150; Nuclea��o e bombardeamento de nuvens e cong�neres.</p>

<p>8 &#150; Servi�os de educa��o, ensino, orienta��o pedag�gica e educacional,
instru��o, treinamento e avalia��o pessoal de qualquer grau ou natureza.</p>

<p>8.01 &#150; Ensino regular pr�-escolar, fundamental, m�dio e superior.</p>

<p>8.02 &#150; Instru��o, treinamento, orienta��o pedag�gica e educacional, avalia��o
de conhecimentos de qualquer natureza.</p>

<p>9 &#150; Servi�os relativos a hospedagem, turismo, viagens e cong�neres.</p>

<p>9.01 &#150; Hospedagem de qualquer natureza em hot�is, <b>apart-service</b> condominiais,
<b>flat</b>, apart-hot�is, hot�is resid�ncia, <b>residence-service</b>, <b>suite
service</b>, hotelaria mar�tima, mot�is, pens�es e cong�neres; ocupa��o por
temporada com fornecimento de servi�o (o valor da alimenta��o e gorjeta, quando
inclu�do no pre�o da di�ria, fica sujeito ao Imposto Sobre Servi�os).</p>

<p>9.02 &#150; Agenciamento, organiza��o, promo��o, intermedia��o e execu��o de
programas de turismo, passeios, viagens, excurs�es, hospedagens e cong�neres.</p>

<p>9.03 &#150; Guias de turismo.</p>

<p>10 &#150; Servi�os de intermedia��o e cong�neres.</p>

<p>10.01 &#150; Agenciamento, corretagem ou intermedia��o de c�mbio, de seguros, de
cart�es de cr�dito, de planos de sa�de e de planos de previd�ncia privada.</p>

<p>10.02 &#150; Agenciamento, corretagem ou intermedia��o de t�tulos em geral, valores
mobili�rios e contratos quaisquer.</p>

<p>10.03 &#150; Agenciamento, corretagem ou intermedia��o de direitos de propriedade
industrial, art�stica ou liter�ria.</p>

<p>10.04 &#150; Agenciamento, corretagem ou intermedia��o de contratos de arrendamento
mercantil (<b>leasing</b>), de franquia (<b>franchising</b>) e de faturiza��o (<b>factoring</b>).</p>

<p>10.05 &#150; Agenciamento, corretagem ou intermedia��o de bens m�veis ou im�veis, n�o
abrangidos em outros itens ou subitens, inclusive aqueles realizados no �mbito de Bolsas
de Mercadorias e Futuros, por quaisquer meios.</p>

<p>10.06 &#150; Agenciamento mar�timo.</p>

<p>10.07 &#150; Agenciamento de not�cias.</p>

<p>10.08 &#150; Agenciamento de publicidade e propaganda, inclusive o agenciamento de
veicula��o por quaisquer meios.</p>

<p>10.09 &#150; Representa��o de qualquer natureza, inclusive comercial.</p>

<p>10.10 &#150; Distribui��o de bens de terceiros.</p>

<p>11 &#150; Servi�os de guarda, estacionamento, armazenamento, vigil�ncia e cong�neres.</p>

<p>11.01 &#150; Guarda e estacionamento de ve�culos terrestres automotores, de aeronaves e
de embarca��es.</p>

<p>11.02 &#150; Vigil�ncia, seguran�a ou monitoramento de bens e pessoas.</p>

<p>11.03 &#150; Escolta, inclusive de ve�culos e cargas.</p>

<p>11.04 &#150; Armazenamento, dep�sito, carga, descarga, arruma��o e guarda de bens de
qualquer esp�cie.</p>

<p>12 &#150; Servi�os de divers�es, lazer, entretenimento e cong�neres.</p>

<p>12.01 &#150; Espet�culos teatrais.</p>

<p>12.02 &#150; Exibi��es cinematogr�ficas.</p>

<p>12.03 &#150; Espet�culos circenses.</p>

<p>12.04 &#150; Programas de audit�rio.</p>

<p>12.05 &#150; Parques de divers�es, centros de lazer e cong�neres.</p>

<p>12.06 &#150; Boates, <b>taxi-dancing</b> e cong�neres.</p>

<p>12.07 &#150; <b>Shows</b><i>, </i><b>ballet</b>, dan�as, desfiles, bailes, �peras,
concertos, recitais, festivais e cong�neres.</p>

<p>12.08 &#150; Feiras, exposi��es, congressos e cong�neres.</p>

<p>12.09 &#150; Bilhares, boliches e divers�es eletr�nicas ou n�o.</p>

<p>12.10 &#150; Corridas e competi��es de animais.</p>

<p>12.11 &#150; Competi��es esportivas ou de destreza f�sica ou intelectual, com ou sem a
participa��o do espectador.</p>

<p>12.12 &#150; Execu��o de m�sica.</p>

<p>12.13 &#150; Produ��o, mediante ou sem encomenda pr�via, de eventos, espet�culos,
entrevistas, <b>shows</b><i>, </i><b>ballet</b>, dan�as, desfiles, bailes, teatros,
�peras, concertos, recitais, festivais e cong�neres.</p>

<p>12.14 &#150; Fornecimento de m�sica para ambientes fechados ou n�o, mediante
transmiss�o por qualquer processo.</p>

<p>12.15 &#150; Desfiles de blocos carnavalescos ou folcl�ricos, trios el�tricos e
cong�neres.</p>

<p>12.16 &#150; Exibi��o de filmes, entrevistas, musicais, espet�culos, <b>shows</b>,
concertos, desfiles, �peras, competi��es esportivas, de destreza intelectual ou
cong�neres.</p>

<p>12.17 &#150; Recrea��o e anima��o, inclusive em festas e eventos de qualquer natureza.</p>

<p>13 &#150; Servi�os relativos a fonografia, fotografia, cinematografia e reprografia.</p>

<p>13.01 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>13.02 &#150; Fonografia ou grava��o de sons, inclusive trucagem, dublagem, mixagem e
cong�neres.</p>

<p>13.03 &#150; Fotografia e cinematografia, inclusive revela��o, amplia��o, c�pia,
reprodu��o, trucagem e cong�neres.</p>

<p>13.04 &#150; Reprografia, microfilmagem e digitaliza��o.</p>

<p>13.05 &#150; Composi��o gr�fica, fotocomposi��o, clicheria, zincografia, litografia,
fotolitografia.</p>

<p>14 &#150; Servi�os relativos a bens de terceiros.</p>

<p>14.01 &#150; Lubrifica��o, limpeza, lustra��o, revis�o, carga e recarga, conserto,
restaura��o, blindagem, manuten��o e conserva��o de m�quinas, ve�culos, aparelhos,
equipamentos, motores, elevadores ou de qualquer objeto (exceto pe�as e partes
empregadas, que ficam sujeitas ao ICMS).</p>

<p>14.02 &#150; Assist�ncia t�cnica.</p>

<p>14.03 &#150; Recondicionamento de motores (exceto pe�as e partes empregadas, que ficam
sujeitas ao ICMS).</p>

<p>14.04 &#150; Recauchutagem ou regenera��o de pneus.</p>

<p>14.05 &#150; Restaura��o, recondicionamento, acondicionamento, pintura, beneficiamento,
lavagem, secagem, tingimento, galvanoplastia, anodiza��o, corte, recorte, polimento,
plastifica��o e cong�neres, de objetos quaisquer.</p>

<p>14.06 &#150; Instala��o e montagem de aparelhos, m�quinas e equipamentos, inclusive
montagem industrial, prestados ao usu�rio final, exclusivamente com material por ele
fornecido.</p>

<p>14.07 &#150; Coloca��o de molduras e cong�neres.</p>

<p>14.08 &#150; Encaderna��o, grava��o e doura��o de livros, revistas e cong�neres.</p>

<p>14.09 &#150; Alfaiataria e costura, quando o material for fornecido pelo usu�rio final,
exceto aviamento.</p>

<p>14.10 &#150; Tinturaria e lavanderia.</p>

<p>14.11 &#150; Tape�aria e reforma de estofamentos em geral.</p>

<p>14.12 &#150; Funilaria e lanternagem.</p>

<p>14.13 &#150; Carpintaria e serralheria.</p>

<p>15 &#150; Servi�os relacionados ao setor banc�rio ou financeiro, inclusive aqueles
prestados por institui��es financeiras autorizadas a funcionar pela Uni�o ou por quem
de direito.</p>

<p>15.01 &#150; Administra��o de fundos quaisquer, de cons�rcio, de cart�o de cr�dito ou
d�bito e cong�neres, de carteira de clientes, de cheques pr�-datados e cong�neres.</p>

<p>15.02 &#150; Abertura de contas em geral, inclusive conta-corrente, conta de investimentos
e aplica��o e caderneta de poupan�a, no Pa�s e no exterior, bem como a manuten��o
das referidas contas ativas e inativas.</p>

<p>15.03 &#150; Loca��o e manuten��o de cofres particulares, de terminais eletr�nicos,
de terminais de atendimento e de bens e equipamentos em geral.</p>

<p>15.04 &#150; Fornecimento ou emiss�o de atestados em geral, inclusive atestado de
idoneidade, atestado de capacidade financeira e cong�neres.</p>

<p>15.05 &#150; Cadastro, elabora��o de ficha cadastral, renova��o cadastral e
cong�neres, inclus�o ou exclus�o no Cadastro de Emitentes de Cheques sem Fundos &#150;
CCF ou em quaisquer outros bancos cadastrais.</p>

<p>15.06 &#150; Emiss�o, reemiss�o e fornecimento de avisos, comprovantes e documentos em
geral; abono de firmas; coleta e entrega de documentos, bens e valores; comunica��o com
outra ag�ncia ou com a administra��o central; licenciamento eletr�nico de ve�culos;
transfer�ncia de ve�culos; agenciamento fiduci�rio ou deposit�rio; devolu��o de bens
em cust�dia.</p>

<p>15.07 &#150; Acesso, movimenta��o, atendimento e consulta a contas em geral, por
qualquer meio ou processo, inclusive por telefone, fac-s�mile, internet e telex, acesso a
terminais de atendimento, inclusive vinte e quatro horas; acesso a outro banco e a rede
compartilhada; fornecimento de saldo, extrato e demais informa��es relativas a contas em
geral, por qualquer meio ou processo.</p>

<p>15.08 &#150; Emiss�o, reemiss�o, altera��o, cess�o, substitui��o, cancelamento e
registro de contrato de cr�dito; estudo, an�lise e avalia��o de opera��es de
cr�dito; emiss�o, concess�o, altera��o ou contrata��o de aval, fian�a, anu�ncia e
cong�neres; servi�os relativos a abertura de cr�dito, para quaisquer fins.</p>

<p>15.09 &#150; Arrendamento mercantil (<b>leasing</b>) de quaisquer bens, inclusive cess�o
de direitos e obriga��es, substitui��o de garantia, altera��o, cancelamento e
registro de contrato, e demais servi�os relacionados ao arrendamento mercantil (<b>leasing</b>).</p>

<p>15.10 &#150; Servi�os relacionados a cobran�as, recebimentos ou pagamentos em geral, de
t�tulos quaisquer, de contas ou carn�s, de c�mbio, de tributos e por conta de
terceiros, inclusive os efetuados por meio eletr�nico, autom�tico ou por m�quinas de
atendimento; fornecimento de posi��o de cobran�a, recebimento ou pagamento; emiss�o de
carn�s, fichas de compensa��o, impressos e documentos em geral.</p>

<p>15.11 &#150; Devolu��o de t�tulos, protesto de t�tulos, susta��o de protesto,
manuten��o de t�tulos, reapresenta��o de t�tulos, e demais servi�os a eles
relacionados.</p>

<p>15.12 &#150; Cust�dia em geral, inclusive de t�tulos e valores mobili�rios.</p>

<p>15.13 &#150; Servi�os relacionados a opera��es de c�mbio em geral, edi��o,
altera��o, prorroga��o, cancelamento e baixa de contrato de c�mbio; emiss�o de
registro de exporta��o ou de cr�dito; cobran�a ou dep�sito no exterior; emiss�o,
fornecimento e cancelamento de cheques de viagem; fornecimento, transfer�ncia,
cancelamento e demais servi�os relativos a carta de cr�dito de importa��o,
exporta��o e garantias recebidas; envio e recebimento de mensagens em geral relacionadas
a opera��es de c�mbio.</p>

<p>15.14 &#150; Fornecimento, emiss�o, reemiss�o, renova��o e manuten��o de cart�o
magn�tico, cart�o de cr�dito, cart�o de d�bito, cart�o sal�rio e cong�neres.</p>

<p>15.15 &#150; Compensa��o de cheques e t�tulos quaisquer; servi�os relacionados a
dep�sito, inclusive dep�sito identificado, a saque de contas quaisquer, por qualquer
meio ou processo, inclusive em terminais eletr�nicos e de atendimento.</p>

<p>15.16 &#150; Emiss�o, reemiss�o, liquida��o, altera��o, cancelamento e baixa de
ordens de pagamento, ordens de cr�dito e similares, por qualquer meio ou processo;
servi�os relacionados � transfer�ncia de valores, dados, fundos, pagamentos e
similares, inclusive entre contas em geral.</p>

<p>15.17 &#150; Emiss�o, fornecimento, devolu��o, susta��o, cancelamento e oposi��o de
cheques quaisquer, avulso ou por tal�o.</p>

<p>15.18 &#150; Servi�os relacionados a cr�dito imobili�rio, avalia��o e vistoria de
im�vel ou obra, an�lise t�cnica e jur�dica, emiss�o, reemiss�o, altera��o,
transfer�ncia e renegocia��o de contrato, emiss�o e reemiss�o do termo de quita��o
e demais servi�os relacionados a cr�dito imobili�rio.</p>

<p>16 &#150; Servi�os de transporte de natureza municipal.</p>

<p>16.01 &#150; Servi�os de transporte de natureza municipal.</p>

<p>17 &#150; Servi�os de apoio t�cnico, administrativo, jur�dico, cont�bil, comercial e
cong�neres.</p>

<p>17.01 &#150; Assessoria ou consultoria de qualquer natureza, n�o contida em outros itens
desta lista; an�lise, exame, pesquisa, coleta, compila��o e fornecimento de dados e
informa��es de qualquer natureza, inclusive cadastro e similares.</p>

<p>17.02 &#150; Datilografia, digita��o, estenografia, expediente, secretaria em geral,
resposta aud�vel, reda��o, edi��o, interpreta��o, revis�o, tradu��o, apoio e
infra-estrutura administrativa e cong�neres.</p>

<p>17.03 &#150; Planejamento, coordena��o, programa��o ou organiza��o t�cnica,
financeira ou administrativa.</p>

<p>17.04 &#150; Recrutamento, agenciamento, sele��o e coloca��o de m�o-de-obra.</p>

<p>17.05 &#150; Fornecimento de m�o-de-obra, mesmo em car�ter tempor�rio, inclusive de
empregados ou trabalhadores, avulsos ou tempor�rios, contratados pelo prestador de
servi�o.</p>

<p>17.06 &#150; Propaganda e publicidade, inclusive promo��o de vendas, planejamento de
campanhas ou sistemas de publicidade, elabora��o de desenhos, textos e demais materiais
publicit�rios.</p>

<p>17.07 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>17.08 &#150; Franquia (<b>franchising</b>).</p>

<p>17.09 &#150; Per�cias, laudos, exames t�cnicos e an�lises t�cnicas.</p>

<p>17.10 &#150; Planejamento, organiza��o e administra��o de feiras, exposi��es,
congressos e cong�neres.</p>

<p>17.11 &#150; Organiza��o de festas e recep��es; buf� (exceto o fornecimento de
alimenta��o e bebidas, que fica sujeito ao ICMS).</p>

<p>17.12 &#150; Administra��o em geral, inclusive de bens e neg�cios de terceiros.</p>

<p>17.13 &#150; Leil�o e cong�neres.</p>

<p>17.14 &#150; Advocacia.</p>

<p>17.15 &#150; Arbitragem de qualquer esp�cie, inclusive jur�dica.</p>

<p>17.16 &#150; Auditoria.</p>

<p>17.17 &#150; An�lise de Organiza��o e M�todos.</p>

<p>17.18 &#150; Atu�ria e c�lculos t�cnicos de qualquer natureza.</p>

<p>17.19 &#150; Contabilidade, inclusive servi�os t�cnicos e auxiliares.</p>

<p>17.20 &#150; Consultoria e assessoria econ�mica ou financeira.</p>

<p>17.21 &#150; Estat�stica.</p>

<p>17.22 &#150; Cobran�a em geral.</p>

<p>17.23 &#150; Assessoria, an�lise, avalia��o, atendimento, consulta, cadastro,
sele��o, gerenciamento de informa��es, administra��o de contas a receber ou a pagar
e em geral, relacionados a opera��es de faturiza��o (<b>factoring</b>).</p>

<p>17.24 &#150; Apresenta��o de palestras, confer�ncias, semin�rios e cong�neres.</p>

<p>18 &#150; Servi�os de regula��o de sinistros vinculados a contratos de seguros;
inspe��o e avalia��o de riscos para cobertura de contratos de seguros; preven��o e
ger�ncia de riscos segur�veis e cong�neres.</p>

<p>18.01 - Servi�os de regula��o de sinistros vinculados a contratos de seguros;
inspe��o e avalia��o de riscos para cobertura de contratos de seguros; preven��o e
ger�ncia de riscos segur�veis e cong�neres.</p>

<p>19 &#150; Servi�os de distribui��o e venda de bilhetes e demais produtos de loteria,
bingos, cart�es, pules ou cupons de apostas, sorteios, pr�mios, inclusive os decorrentes
de t�tulos de capitaliza��o e cong�neres.</p>

<p>19.01 - Servi�os de distribui��o e venda de bilhetes e demais produtos de loteria,
bingos, cart�es, pules ou cupons de apostas, sorteios, pr�mios, inclusive os decorrentes
de t�tulos de capitaliza��o e cong�neres.</p>

<p>20 &#150; Servi�os portu�rios, aeroportu�rios, ferroportu�rios, de terminais
rodovi�rios, ferrovi�rios e metrovi�rios.</p>

<p>20.01 &#150; Servi�os portu�rios, ferroportu�rios, utiliza��o de porto,
movimenta��o de passageiros, reboque de embarca��es, rebocador escoteiro, atraca��o,
desatraca��o, servi�os de praticagem, capatazia, armazenagem de qualquer natureza,
servi�os acess�rios, movimenta��o de mercadorias, servi�os de apoio mar�timo, de
movimenta��o ao largo, servi�os de armadores, estiva, confer�ncia, log�stica e
cong�neres.</p>

<p>20.02 &#150; Servi�os aeroportu�rios, utiliza��o de aeroporto, movimenta��o de
passageiros, armazenagem de qualquer natureza, capatazia, movimenta��o de aeronaves,
servi�os de apoio aeroportu�rios, servi�os acess�rios, movimenta��o de mercadorias,
log�stica e cong�neres.</p>

<p>20.03 &#150; Servi�os de terminais rodovi�rios, ferrovi�rios, metrovi�rios,
movimenta��o de passageiros, mercadorias, inclusive&nbsp;&nbsp;&nbsp;&nbsp; suas
opera��es, log�stica e cong�neres.</p>

<p>21 &#150; Servi�os de registros p�blicos, cartor�rios e notariais.</p>

<p>21.01 - Servi�os de registros p�blicos, cartor�rios e notariais.</p>

<p>22 &#150; Servi�os de explora��o de rodovia. </p>

<p>22.01 &#150; Servi�os de explora��o de rodovia mediante cobran�a de pre�o ou ped�gio
dos usu�rios, envolvendo execu��o de servi�os de conserva��o, manuten��o,
melhoramentos para adequa��o de capacidade e seguran�a de tr�nsito, opera��o,
monitora��o, assist�ncia aos usu�rios e outros servi�os definidos em contratos, atos
de concess�o ou de permiss�o ou em &nbsp;&nbsp;&nbsp;&nbsp; normas oficiais.</p>

<p>23 &#150; Servi�os de programa��o e comunica��o visual, desenho industrial e
cong�neres. </p>

<p>23.01 &#150; Servi�os de programa��o e comunica��o visual, desenho industrial e
cong�neres.</p>

<p>24 &#150; Servi�os de chaveiros, confec��o de carimbos, placas, sinaliza��o visual, <b>banners</b>,
adesivos e cong�neres. </p>

<p>24.01 - Servi�os de chaveiros, confec��o de carimbos, placas, sinaliza��o visual, <b>banners</b>,
adesivos e cong�neres.</p>

<p>25 - Servi�os funer�rios. </p>

<p>25.01 &#150; Funerais, inclusive fornecimento de caix�o, urna ou esquifes; aluguel de
capela; transporte do corpo cadav�rico; fornecimento de flores, coroas e outros
paramentos; desembara�o de certid�o de �bito; fornecimento de v�u, essa e outros
adornos; embalsamento, embelezamento, conserva��o ou restaura��o de cad�veres.</p>

<p>25.02 &#150; Crema��o de corpos e partes de corpos cadav�ricos.</p>

<p>25.03 &#150; Planos ou conv�nio funer�rios.</p>

<p>25.04 &#150; Manuten��o e conserva��o de jazigos e cemit�rios.</p>

<p>26 &#150; Servi�os de coleta, remessa ou entrega de correspond�ncias, documentos,
objetos, bens ou valores, inclusive pelos correios e suas ag�ncias franqueadas; <b>courrier</b><i>
</i>e cong�neres.</p>

<p>26.01 &#150; Servi�os de coleta, remessa ou entrega de correspond�ncias, documentos,
objetos, bens ou valores, inclusive pelos correios e suas ag�ncias franqueadas; <b>courrier
</b>e cong�neres.</p>

<p>27 &#150; Servi�os de assist�ncia social.</p>

<p>27.01 &#150; Servi�os de assist�ncia social.</p>

<p>28 &#150; Servi�os de avalia��o de bens e servi�os de qualquer natureza.</p>

<p>28.01 &#150; Servi�os de avalia��o de bens e servi�os de qualquer natureza.</p>

<p>29 &#150; Servi�os de biblioteconomia.</p>

<p>29.01 &#150; Servi�os de biblioteconomia.</p>

<p>30 &#150; Servi�os de biologia, biotecnologia e qu�mica.</p>

<p>30.01 &#150; Servi�os de biologia, biotecnologia e qu�mica.</p>

<p>31 &#150; Servi�os t�cnicos em edifica��es, eletr�nica, eletrot�cnica, mec�nica,
telecomunica��es e cong�neres.</p>

<p>31.01 - Servi�os t�cnicos em edifica��es, eletr�nica, eletrot�cnica, mec�nica,
telecomunica��es e cong�neres.</p>

<p>32 &#150; Servi�os de desenhos t�cnicos.</p>

<p>32.01 - Servi�os de desenhos t�cnicos.</p>

<p>33 &#150; Servi�os de desembara�o aduaneiro, comiss�rios, despachantes e cong�neres.</p>

<p>33.01 - Servi�os de desembara�o aduaneiro, comiss�rios, despachantes e cong�neres.</p>

<p>34 &#150; Servi�os de investiga��es particulares, detetives e cong�neres.</p>

<p>34.01 - Servi�os de investiga��es particulares, detetives e cong�neres.</p>

<p>35 &#150; Servi�os de reportagem, assessoria de imprensa, jornalismo e rela��es
p�blicas.</p>

<p>35.01 - Servi�os de reportagem, assessoria de imprensa, jornalismo e rela��es
p�blicas.</p>

<p>36 &#150; Servi�os de meteorologia.</p>

<p>36.01 &#150; Servi�os de meteorologia.</p>

<p>37 &#150; Servi�os de artistas, atletas, modelos e manequins.</p>

<p>37.01 - Servi�os de artistas, atletas, modelos e manequins.</p>

<p>38 &#150; Servi�os de museologia.</p>

<p>38.01 &#150; Servi�os de museologia.</p>

<p>39 &#150; Servi�os de ourivesaria e lapida��o.</p>

<p>39.01 - Servi�os de ourivesaria e lapida��o (quando o material for fornecido pelo
tomador do servi�o).</p>

<p>40 &#150; Servi�os relativos a obras de arte sob encomenda.</p>

<p>40.01 - Obras de arte sob encomenda.</p>
     */
    public static final String COD_LST      = "COD_LST";
    public static final String ALIQ_ICMS    = "ALIQ_ICMS";
    public static final String CEST         = "CEST";
    
    public R0200() {
        setName("Registro 0200 - Identificacao dos itens");
        setDelimiter("|");
       addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("0200"));
       //2
        addFieldArchetype(COD_ITEM,     new FieldStringMaximumLengthArchetype(60));
        //3
        addFieldArchetype(DESCR_ITEM,   new FieldStringMaximumLengthArchetype(255));
        FieldArchetype fa = new FieldStringMaximumLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //4
        addFieldArchetype(COD_BARRA,    fa);
        fa = new FieldStringMaximumLengthArchetype(60);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //5
        addFieldArchetype(COD_ANT_ITEM, fa);
        //6
        addFieldArchetype(UNID_INV,     new FieldStringMaximumLengthArchetype(6));
        //7
        addFieldArchetype(TIPO_ITEM,    new FieldIntegerFixedLengthArchetype(2));
        //8
        fa = new FieldStringFixedLengthArchetype(8);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("");
        addFieldArchetype(COD_NCM,      fa);
        
        fa = new FieldStringMaximumLengthArchetype(3);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("");
        //9
        addFieldArchetype(EX_IPI,       fa);
        fa = new FieldIntegerFixedLengthArchetype(2);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("");
        //10
        addFieldArchetype(COD_GEN,      fa);
        fa = new FieldIntegerFixedLengthArchetype(5);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("00.00");
        //11
        addFieldArchetype(COD_LST,      fa);
        //12
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fda = new FieldDecimalMaximumLengthArchetype(6, 2);
        fda.setFullFillingNullable(false);
        fda.setNullableRepresentation("0,00");
        fda.setFormat(fw);
        addFieldArchetype(ALIQ_ICMS,    fda);
        
        fa = new FieldIntegerFixedLengthArchetype(7);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("");
        //13
        addFieldArchetype(CEST,      fa);
    }
}
