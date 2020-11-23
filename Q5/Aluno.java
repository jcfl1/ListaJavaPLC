// [Q5] Implemente a modelagem Q3 abaixo. Em outras palavras: 
// Implemente a interface Colecao e a classe abstrata Pessoa definindo os modificadores de acessos dos atributos como protegidos 
// (protected), seu construtor, seus métodos (getters e setters), os quais, todos os setters serão métodos abstratos. 

// Após isso, implemente as classes (concretas) Professor e Aluno. Note que Professor e Aluno são subclasses de Pessoa. 

// Em outra classe, de nome ColecaoVetor, instancie um vetor de Pessoas de nome dados e de tamanho 5.

// Crie então uma classe chamada Principal que conterá o método vazio e estático padrão para execução de um programa java (public static void main(String[] args)). 

// Dentro desse último método mencionado, crie uma instância da classe ColecaoVetor. 

// Ainda na “main” insira a partir da função inserir, três objetos Pessoa na instância criada, podendo ser Professor ou Aluno e cada vez que um desses dois
//  tipos de Pessoa for inserido, faça uso da função tamanhoColecaoNaoNull para informar quantas vagas existem de inserção e retorne o nome de cada Pessoa inserida.

public class Aluno extends Pessoa{
    protected String matricula;
    protected String curso;
    
    public Aluno(String nome, String cpf, String matricula, String curso){
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
}
