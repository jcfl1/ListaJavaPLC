// [Q5] Implemente a modelagem Q3 abaixo. Em outras palavras: 
// Implemente a interface Colecao e a classe abstrata Pessoa definindo os modificadores de acessos dos atributos como protegidos 
// (protected), seu construtor, seus métodos (getters e setters), os quais, todos os setters serão métodos abstratos. 

// Após isso, implemente as classes (concretas) Professor e Aluno. Note que Professor e Aluno são subclasses de Pessoa. 

// Em outra classe, de nome ColecaoVetor, instancie um vetor de Pessoas de nome dados e de tamanho 5.

// Crie então uma classe chamada Principal que conterá o método vazio e estático padrão para execução de um programa java (public static void main(String[] args)). 

// Dentro desse último método mencionado, crie uma instância da classe ColecaoVetor. 

// Ainda na “main” insira a partir da função inserir, três objetos Pessoa na instância criada, podendo ser Professor ou Aluno e cada vez que um desses dois
//  tipos de Pessoa for inserido, faça uso da função tamanhoColecaoNaoNull para informar quantas vagas existem de inserção e retorne o nome de cada Pessoa inserida.

public class ColecaoVetor implements Colecao{
    protected Pessoa[] dados;
    private int index;
    private static int TAMANHO_MAXIMO = 5;

    public ColecaoVetor(){
        this.dados = new Pessoa[5];
        this.index = 0;
    }

    public void inserir(Pessoa p){
        if(this.index == TAMANHO_MAXIMO) return;

        this.dados[this.index] = p;

        System.out.println(p.getNome() + " foi inserido(a) na colecao");

        this.index++;
    }

    public int tamanhoColecaoNaoNull(){
        return TAMANHO_MAXIMO - this.index;
    }

}
