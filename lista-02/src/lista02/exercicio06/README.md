# Exercício 6 (CDs,Filmes e Jogos):

### Implemente o cadastramento de itens de uma Loja que vende CDs, Filmes e Jogos.

- Um CD tem as seguintes informações: título, ano, tempo de duração, comentários, artista e quantidade de faixas;
- Um Filme tem as seguintes informações: título, ano, tempo de duração, comentários e diretor
- Um Jogo tem as seguintes informações: título, ano, tempo de duração, comentários, número de jogadores e plataforma

Escreva as classes necessárias para representar o enunciado usando o conceito de herança, polimorfismo e as boas práticas de encapsulamento. Utilize uma superclasse Item agrupando os dados comuns das demais classes.

Criar métodos para mostrar os dados comuns de todos os itens e outros para mostrar as peculiaridades de cada item.

Criar um método para retornar a plataforma de um jogo

Escrever uma classe Principal para:

Criar 10 filmes, cds e jogos, atribuindo os valores através de construtores ou através de métodos sets.
Armazenar os itens criados em um vetor.
Percorrer o vetor mostrando os dados dos itens armazenados (dados comuns + dados específicos de cada item)
Quando for jogo, mostrar separadamente a plataforma

# Resolução 

- Tendo em vista que o exercício pede para que aplicamos o conceito de herança e utilizarmos uma superclasse Item que agrupa os atributos em comum das demais classes, temos que identificar os atributos em comum entre as classes CD, Filme e Jogo. Sendo estes: 
    - Título
    - Ano
    - Tempo de duração 
    - Comentários 
    - ```java
      public abstract class Item{
        private String titulo; 
        private int ano; 
        private int tempoDeDuracao; 
        private String comentarios;
        //getters, setters e métodos
      }
      ```
- Agora que definimos a classe ```Item```, construimos as classes ```Cd```, ```Filme``` e ```Jogo``` com seus atributos adicionais
    - ```java
      public class Cd extends Item{
      //atributos e metodos 
      }
      ```
    - ```java
      public class Filme extends Item{
      //atributos e metodos
      }
      ```
  - ```java
      public class Jogo extends Item{
      //atributos e metodos
      }
      ```
    
- Declaramos um vetor com o tamanho 30 cujo o seu tipo é ```item``` e então adicionaremos os itens nesse vetor 
  - ```java
      Item[] itens = new Item[30];
    ```

- Para aplicarmos o conceito de polimorfismo, utilizaremos o seguinte método da classe ```item```:
  - ```java
    public void mostrarDados(){
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + tempoDeDuracao + " minutos");
        System.out.println("Comentários: " + comentarios);
    }
    ```
    Que nas classes que extende a classe Item, deve ter um comportamento diferente, mostrando os atributos que as difere uma das outras. 
  - ```java
    @override
    public void mostrarDados(){
        super.mostrarDados()
        System.out.println("Diretor: " + diretor);
    }
    ```
- Para percorrer o vetor usaremos a estrutura de repetição forEach. 