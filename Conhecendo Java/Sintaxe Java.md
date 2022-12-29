# Anatomia da classe

### O que é?

A consolidação de todo o codigo do projeto.

A escrita de codigos de um programa é feito atraves da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome do nosso arquivo, classes, atributos e métodos.

É muito comum mesclarmos expressões no idioma americano com o nosso vocabulario. Existem projetos que recomendam que toda a implementação do seu projeto seja na lingua inglesa.

**Sintaxe de declaração de uma nova classe:**

    public class MinhaClass {
        //seu código aqui
    }

# Padrão de nomeclatura

Quando se trata de escrever na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padroões estão expressos nos itens abaixo:

- <u>Arquivo .java</u>:  Todo arquivo .java deve começar com a letra maiuscula. Se a palafra for composta, a segunda deve tambem ser maiscula, exemplo:
  
       Calculadora.java, CalculadoraCientifica.java

- <u>Nome da classe no arquivo</u>: A classe deve possuir o mesmo nome do arquivo.java, exemplo:
  
      // arquivo Calculadora.java
      
      public class Calculadora {
          /codigo
      }

- <u>Nome da variavel</u>: Toda variavel deve ser escrita com letra minuscula, porem, se a palavra for composta, a primeira letra da segunda palavra deveá ser maiuscula, exemplo: 
  
      ano e anoFabricacao
  
   O nome dessa pratica para nomear variaveis se chama "camelCase".

## ! Existe uma regra adicional para variveis quando na mesma queremos identificar que que ela não sofrera alterações de valor, exemplo: queremos determinar que a variavel "br" sempre apresentara "Brasil" e nunca mudara o seu valor, logo, determinamos como escrita o codigo abaixo:

      final String BR = "Brasil"
      double PI = 3,14
      int ESTADOS_BRASILEIROS = 27
      int ANO_2000 = 2000

Para declarar uma variavel podemos utilizar caracteres, nomeros e simbolos, podem devemos seguir algumas regras de linguagem:

- Deve conter apenas letras, _ $ ou os nomeros de 0 à 9

- Deve, obrigatoriamente, se iniciar por uma letra (preferencialmente), "_" ou  $, jamais com numero.

- Deve iniciar com uma letra minuscula (boa pratica = ver abaixo)

- Não pode conter espaços.

- Não podemos uar palavras-chave da linguagem

- O nome dever ser unico dentro de um escopo
  
       1 // Declarações invalidas
       2 
       3 int numero&um = 1; //Os simbolos são _ e $.
       4 int 1nomero = 1; //Uma variavel não pode começar com numero.
       5  int numero um = 1; //Não pode ter espaços.
       6 int long = 1; //long faz parte das palavras-chave.
       7
       8 // delarações validas
       9 int numero$um = 1;
       10 int numero1 = 1;
       11 int numeroum = 1;
       12 int longo = 1;
       13

# Declarando variáveis e métodos

Como identificar entre declarações de variáveis e métodos em nosso program? Existe uma estrutura comum para ambas as finalidades, exemplo:

- Declara uma varoável em Java segue sempre a seguinte estrutura:
  
      1 //Estrutura
      2
      3 Tipo NomeBemDefinido = Atributo (opcional em alguns casos)
      4 
      5 //Exemplo 
      6
      7 int idade : 23;
      8 double altura = 1.62;
      9 dog spike; // observe que aqui a variavel spike não tem valor 

- Declarar métodos segue uma estrutura simple, como exemplificado a seguir:
  
      1 // Estrutura 2 3 TipoRetorno NomeObjetivoNoInfinitivo Parametros 
      4 
      5 // Exemplo 
      6 
      7 int somar (int nomeroUm, int numero2) 
      8 
      9 String formatarCep (long cep)


