# Algoritmo e Programação — Exemplos de Aula

Repositório com os **códigos-fonte usados em sala de aula** na disciplina de
**Algoritmo e Programação** do curso de Análise e Desenvolvimento de Sistemas da **Ânima Educação**.

Cada arquivo é um programa Java pequeno, autônomo e comentado, criado durante a aula
para demonstrar **um conceito de cada vez**. O objetivo não é ter uma aplicação, e sim
uma trilha de exemplos que acompanha a progressão do conteúdo do semestre.

---

## Objetivos de aprendizagem

Ao final da trilha de exemplos, o estudante deve ser capaz de:

- Entender o ciclo **editar → compilar → executar** de um programa Java.
- Declarar e usar **variáveis** e **tipos primitivos** (`int`, `double`).
- Ler dados do teclado com `Scanner` e exibir resultados com `System.out`.
- Escrever **expressões aritméticas** e entender divisão inteira vs. divisão real.
- Tomar decisões com **estruturas condicionais** (`if`, `else if`, `else`, `if` aninhado).
- Combinar condições com **operadores lógicos** (`&&`, `||`) e **relacionais** (`<`, `>=`, `==`).
- Repetir instruções com **laços** (`while` e `for`) e usar **acumuladores** e **contadores**.
- Escrever **métodos** com parâmetros e retorno, entender **escopo de variáveis** (passagem por
  valor) e **decompor** um programa maior em métodos reutilizáveis.

---

## Pré-requisitos

| Ferramenta | Versão recomendada | Observação |
|---|---|---|
| **JDK** (Java Development Kit) | 17 ou superior (ambiente da disciplina usa **JDK 25**) | Configurado dentro do IntelliJ (File ▸ Project Structure ▸ SDK) |
| **IntelliJ IDEA Community** | Última versão estável | Única IDE usada na disciplina — o projeto já vem com os metadados prontos (`.idea/`, `*.iml`) |

> Este repositório é pensado para ser aberto e executado **somente pelo IntelliJ**.
> Não há instruções de linha de comando (`javac`/`java` direto no terminal) porque a
> disciplina padroniza o fluxo pela IDE do início ao fim.

---

## Estrutura do repositório

```
algoritmo-programacao/
├── README.md
├── src/
│   ├── 1-introducao/                # UA1 · Aula 04
│   │   ├── CalculaMedia.java        # variáveis, entrada/saída, aritmética (demo)
│   │   └── PrecoComDesconto.java    # exercício oficial de laboratório da Aula 04
│   ├── 2-condicao/                  # UA2 · Aula 06 — Parte A
│   │   ├── CalculaResultado.java    # if/else if/else, if aninhado, for (demonstração guiada)
│   │   ├── MaiorDeTres.java         # A1 — maior de 3 números, com empate
│   │   ├── ClassificaTriangulo.java # A2 — equilátero / isósceles / escaleno
│   │   ├── CalculaIMC.java          # A3 — IMC e faixa de classificação
│   │   └── AnoBissexto.java         # A4 — ano bissexto (operadores lógicos)
│   ├── 3-repeticao/                 # UA2 · Aula 06 — Parte B e Desafio
│   │   ├── SomaCinco.java           # laço while + acumulador (demo)
│   │   ├── Contador.java            # laço for + contador (demo)
│   │   ├── SomaAteN.java            # B1 — soma de 1 até N
│   │   ├── MediaCincoNotas.java     # B2 — média de 5 notas + quantas acima da média
│   │   ├── ContarParesAteZero.java  # B3 — laço com sentinela (para ao digitar 0)
│   │   ├── MenuDoWhile.java         # B4 — menu com do-while
│   │   ├── TabuadaCompleta.java     # D3 — laço aninhado (for dentro de for)
│   │   ├── FizzBuzz.java            # D1 — FizzBuzz de 1 a 100
│   │   └── ValidarSenha.java        # D2 — validação com do-while
│   └── 4-metodos/                   # UA2 · Aula 08
│       ├── CalculaMediaMetodo.java  # anatomia de um método (parâmetros + retorno)
│       ├── Dobro.java               # passagem por valor / escopo
│       ├── MetodosSimples.java      # métodos com parâmetros e retorno (Parte A)
│       ├── SituacaoAluno.java       # decomposição de um programa em métodos (Parte B, gabarito)
│       └── MaiorSobrecarga.java     # sobrecarga de métodos (desafio opcional)
└── out/                             # artefatos de compilação do IntelliJ (ignorado no Git)
```

As pastas são numeradas **na ordem em que os assuntos são apresentados no curso**.
Novos exemplos devem ser adicionados à pasta do tópico correspondente ou a uma nova
pasta numerada (`5-...`, `6-...` — veja o [Roadmap de conteúdo](#roadmap-de-conteúdo)).

> **Importante:** os arquivos **não declaram `package`**. As subpastas servem apenas para
> organizar o material didaticamente — todas as classes estão no *pacote default*. Isso muda
> a forma de compilar e executar (veja abaixo).

---

## Como executar (pelo IntelliJ IDEA)

1. **Abra o projeto:** `File ▸ Open...` e selecione a pasta raiz `algoritmo-programacao`
   (o IntelliJ reconhece o `algoritmo-programacao.iml` automaticamente).
2. **Confirme o SDK:** `File ▸ Project Structure ▸ Project` — deve haver um JDK 17+
   selecionado. Se a lista estiver vazia, use `Add SDK ▸ Download JDK`.
3. **Abra o arquivo** do exemplo que quer rodar (ex.: `src/3-repeticao/Contador.java`).
4. **Execute:** clique no ícone ▶️ verde na margem esquerda, ao lado de
   `public class ... {` ou de `public static void main`, e escolha **Run**. Também
   funciona com `Ctrl+Shift+F10` (Windows/Linux) ou `Ctrl+R` (macOS).
5. A saída aparece na aba **Run**, na parte inferior da janela.

### Programas que leem dados do teclado

A maioria dos exemplos usa `Scanner` e fica aguardando entrada (exceções: `FizzBuzz` e
`TabuadaCompleta`, que não leem nada). Depois de clicar em ▶️, digite os valores
**diretamente na aba Run** — ela funciona como um terminal simples: digite o valor e
pressione Enter a cada `leitor.nextX()` do programa.

> **Números decimais:** o `Scanner` respeita o *locale* do sistema. Em ambiente
> configurado em português, use **vírgula** (`7,5`); em inglês, use **ponto** (`7.5`).
> Se aparecer `InputMismatchException` na aba Run, tente trocar o separador.

### Reexecutar rapidamente

Depois da primeira execução de uma classe, o IntelliJ guarda uma **Run Configuration**
para ela: use o botão ▶️ verde na barra de ferramentas superior (ou `Shift+F10` /
`Ctrl+R`) para rodar de novo a última classe executada, sem precisar reabrir o arquivo.

---

## Descrição dos exemplos

> **Como usar esta seção:** cada item cita, quando existir, o exercício oficial de
> laboratório que ele resolve (ex. "A1", "B2", "D3") conforme numerado nos slides da
> respectiva aula. Itens sem essa referência são demonstrações do professor (usadas em
> "Demonstração guiada" ou como refatoração de um exemplo anterior), não exercícios
> avaliados.

### UA1 · Aula 04 — `1-introducao/`

#### 1. `CalculaMedia.java`

**Conceitos:** declaração de variáveis `double`, leitura com `Scanner.nextDouble()`,
concatenação de `String` com `+`, expressão aritmética e precedência de parênteses.

Lê duas notas, exibe os valores digitados e calcula a média aritmética
`(nota + outraNota) / 2`.

```
Digite sua nota
7.5
Digite a outa nota
8.0
Nota: 7.5
Digite Outra Nota: 8.0
Média: 7.75
```

*Discussão em aula:* por que `(nota + outraNota) / 2` e não `nota + outraNota / 2`?
O que mudaria se as variáveis fossem `int`?

#### 2. `PrecoComDesconto.java` — exercício oficial da Aula 04

Continuação, em Java, do "Problema 2" que a turma já havia resolvido em pseudocódigo na
Aula 02 (fluxograma/pseudocódigo). Lê o preço original e o percentual de desconto,
calcula `valorDesconto = preco * percentualDesconto / 100` e `precoFinal = preco -
valorDesconto`, e exibe os três valores.

**Entrega esperada dos alunos:** fluxograma + pseudocódigo (das Aulas 2–3) e o `.java`
funcionando — entrega individual, feedback formativo (sem nota numérica).

### UA2 · Aula 06 — Parte A (condicionais) — `2-condicao/`

#### 3. `CalculaResultado.java` — demonstração guiada

**Conceitos:** laço `for`, validação de faixa de valores, `if / else if / else`,
`if` aninhado, operadores relacionais e lógicos (`<`, `>`, `>=`, `==`, `||`, `&&`).

Repete 5 vezes: lê uma nota, valida se está entre 0 e 10 e classifica o resultado:

| Condição | Saída |
|---|---|
| `nota < 0` ou `nota > 10` | `Nota inválida!` |
| `nota >= 6` | `Aprovado` (e `Nota Cheia!!!` se `nota == 10`) |
| `nota >= 4` e `nota < 6` | `Exame Final` |
| caso contrário | `Reprovado` |

*Discussão em aula:* diferença entre `if` encadeado e vários `if` independentes;
por que a ordem das condições importa; risco de comparar `double` com `==`.

#### 4. `MaiorDeTres.java` — exercício A1

Lê 3 números e informa o maior, tratando o caso de os três serem iguais (empate).

#### 5. `ClassificaTriangulo.java` — exercício A2

Lê os 3 lados de um triângulo e classifica: `Equilátero`, `Isósceles`, `Escaleno` ou
`Não formam triângulo` (checa a desigualdade triangular antes de classificar).

#### 6. `CalculaIMC.java` — exercício A3

Calcula o IMC (`peso / altura²`) e mostra a faixa: abaixo do peso, peso normal,
sobrepeso ou obesidade.

#### 7. `AnoBissexto.java` — exercício A4

Diz se um ano é bissexto: `divisível por 4 E (não divisível por 100 OU divisível por
400)`. Bom exemplo para discutir por que o parêntese muda o resultado da expressão.

### UA2 · Aula 06 — Parte B e Desafio (repetição) — `3-repeticao/`

#### 8. `SomaCinco.java` — demonstração guiada

**Conceitos:** laço `while`, variável **acumuladora** (`soma`), variável de controle (`i`),
incremento `i++`.

Soma os números de 1 a 5, imprimindo o valor parcial a cada passo:

```
1
3
6
10
15
```

*Discussão em aula:* o que acontece se esquecermos o `i++`? (laço infinito).

#### 9. `Contador.java` — demonstração guiada

**Conceitos:** laço `for`, variável **contadora**, comparação `while` × `for`.

Imprime os números de 1 a 5, um por linha. É a versão "enxuta" do controle de repetição
que no `while` exige três linhas separadas (inicialização, condição, incremento).

#### 10. `SomaAteN.java` — exercício B1

Soma todos os inteiros de 1 até `N`, com `N` lido do teclado (generaliza `SomaCinco`
para um limite variável, usando `for`).

#### 11. `MediaCincoNotas.java` — exercício B2

Lê 5 notas, calcula a média e diz quantas notas ficaram acima da média. Usa um
`double[]` de 5 posições só para guardar as notas e revisitá-las na segunda contagem —
arrays em si só são formalizados na UA3, então trate isso como um "empréstimo" pontual
de sintaxe, não como o tópico da aula.

#### 12. `ContarParesAteZero.java` — exercício B3 (sentinela)

Lê números até o usuário digitar `0`; ao final, mostra quantos foram pares. Padrão
**sentinela**: o primeiro número é lido *antes* do `while`, e cada iteração lê o próximo
no final do corpo — por isso a condição de parada nunca é testada com um valor "velho".

#### 13. `MenuDoWhile.java` — exercício B4

Menu com `do-while`: `1-somar`, `2-multiplicar`, `3-sair`. Repete até o usuário escolher
`3`. Bom exemplo de `do-while` porque o menu precisa aparecer **pelo menos uma vez**
antes de qualquer validação.

#### 14. `TabuadaCompleta.java` — desafio D3 (laço aninhado)

Imprime a tabuada de 1 a 10 usando **laço aninhado** (um `for` dentro de outro): o `for`
externo percorre a tabuada (1 a 10), o `for` interno percorre o multiplicador (1 a 10).

> **Nota de planejamento (resolvida em 09/09/2026):** este era o item pendente da Aula 07
> (07/09/2026), que caiu em feriado nacional — Independência do Brasil — e não teve
> reposição nem aula assíncrona; a turma não viu laços aninhados formalmente. Este
> arquivo cobre a **sintaxe** do laço aninhado (o `D3` do laboratório da Aula 06 já
> previa esse exercício como desafio opcional), mas não substitui a discussão teórica
> mais aprofundada que a Aula 07 traria (ex. complexidade, mais variações de laços
> aninhados) — avaliar com a coordenação se vale a pena retomar isso como leitura
> complementar no AVA.

#### 15. `FizzBuzz.java` — desafio D1

O clássico FizzBuzz de 1 a 100: múltiplo de 3 → `Fizz`, de 5 → `Buzz`, de ambos →
`FizzBuzz`, senão o próprio número.

#### 16. `ValidarSenha.java` — desafio D2

Repete a leitura de uma senha (`do-while`) até que ela tenha 6 ou mais caracteres.

### UA2 · Aula 08 — `4-metodos/`

#### 17. `CalculaMediaMetodo.java`

**Conceitos:** anatomia de um método (`static`, tipo de retorno, nome, parâmetros, `return`).

Refatoração de `1-introducao/CalculaMedia.java`: em vez de calcular a média dentro do
`main`, o cálculo vira o método `calcularMedia(double n1, double n2)`.

*Discussão em aula:* aponte, no código, cada parte da assinatura do método
(`static`, `double`, `calcularMedia`, `(double n1, double n2)`, `return`).

#### 18. `Dobro.java`

**Conceitos:** parâmetros são cópias (**passagem por valor**), escopo local.

```
5 10
```

`x` permanece `5` mesmo depois de `dobro(x)` alterar `n` — `n` é uma variável local do
método, independente de `x`. `y` recebe o valor retornado (`10`).

*Discussão em aula:* por que `x` não muda? O que aconteceria se `dobro` fosse `void` e
só imprimisse `n` em vez de retornar?

#### 19. `MetodosSimples.java` — exercício Parte A

Quatro métodos de aquecimento chamados a partir do `main`: `soma`, `areaRetangulo`,
`ehPar` e `saudacao` — métodos com retorno (`int`, `double`, `boolean`) e um `void`.

#### 20. `SituacaoAluno.java` — exercício Parte B (gabarito)

**Conceitos:** decomposição de um programa em métodos reutilizáveis, `Scanner` como
parâmetro, escopo (a variável `media` só existe dentro de `calcularMedia`).

Lê 3 notas, calcula a média, classifica (`Aprovado` ≥ 7, `Recuperação` 4–6,9,
`Reprovado` < 4) e exibe o resultado — tudo decomposto em `lerNota`, `calcularMedia`,
`classificar` e `exibirResultado`, com o `main` apenas orquestrando as chamadas.

*Discussão em aula (escopo, Parte C):* peça para os alunos tentarem imprimir `media`
dentro do `main` (fora de `calcularMedia`) e lerem o erro `cannot find symbol` do
compilador — não corrija o arquivo para isso, é para o erro aparecer ao vivo.

#### 21. `MaiorSobrecarga.java` — desafio opcional

Sobrecarga de métodos (*overloading*) — duas versões de `maior`, uma para `int` e outra
para `double`. Java escolhe a versão certa pelos parâmetros da chamada.

---

## Convenções do repositório

- **Um programa por arquivo**, com uma classe `public` contendo `main`. O nome da classe
  é igual ao nome do arquivo.
- **Idioma português** em nomes de variáveis, comentários e mensagens.
- Código **propositalmente simples**: sem frameworks, sem build tool, sem tratamento de
  exceções, sem abstrações. O foco é a legibilidade para quem está começando.
- Alguns exemplos contêm **pequenos erros de digitação** nas mensagens (ex.: *"outa nota"*).
  Isso é comum em código escrito ao vivo; corrija apenas se for objetivo da aula.
- Não há testes automatizados, *lint* nem CI — e não se pretende adicionar, dada a
  finalidade didática do repositório.

---

## Fluxo de trabalho sugerido para os alunos

1. Faça um *fork* ou clone deste repositório e abra a pasta no IntelliJ IDEA.
2. Antes de cada aula, execute pelo IntelliJ os exemplos da pasta correspondente ao tópico.
3. Modifique os exemplos: mude valores, condições e limites e **preveja a saída antes
   de rodar**.
4. Crie suas próprias variações em uma pasta pessoal (ex.: `src/exercicios/`).

---

## Roadmap de conteúdo

Pastas já criadas (1 a 4) cobrem a **UA1** (sequencial) e a **UA2** (condicionais,
repetição e métodos). Próximos tópicos que devem ganhar pastas, seguindo a ordem das
Unidades de Aprendizagem do Plano de Aulas da disciplina:

- `5-arrays/` — arranjos unidimensionais (UA3 — Aulas 11–12)
- `6-matrizes-colecoes/` — arranjos bidimensionais, coleções, busca/inserção/remoção (UA3 — Aulas 13–14)
- `7-poo-classes/` — classes, objetos e encapsulamento (UA5 — Aulas 21–22)
- `8-poo-avancado/` — herança, polimorfismo, interfaces e exceções (UA6 — Aulas 23–26)

> A UA4 (Aulas 15–18) é o projeto Java integrador — não introduz sintaxe nova, então não
> deve gerar uma pasta própria; seus exemplos combinam os tópicos de `1-` a `6-`.

---

## Licença e uso

Material didático de uso educacional na disciplina de Algoritmo e Programação da
Ânima Educação (AGES). Livre para consulta, cópia e adaptação por estudantes e docentes.

**Professor:** Welber Macedo
