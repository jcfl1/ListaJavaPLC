// Após isso, implemente as classes (concretas) Professor e Aluno. Note que Professor e Aluno são subclasses de Pessoa. 

// Em outra classe, de nome ColecaoVetor, instancie um vetor de Pessoas de nome dados e de tamanho 5.

// Crie então uma classe chamada Principal que conterá o método vazio e estático padrão para execução de um programa java (public static void main(String[] args)). 

// Dentro desse último método mencionado, crie uma instância da classe ColecaoVetor. 

// Ainda na “main” insira a partir da função inserir, três objetos Pessoa na instância criada, podendo ser Professor ou Aluno e cada vez que um desses dois
//  tipos de Pessoa for inserido, faça uso da função tamanhoColecaoNaoNull para informar quantas vagas existem de inserção e retorne o nome de cada Pessoa inserida.

public class Professor extends Pessoa{
    protected String formacao;
    protected String area;

    public Professor(String nome, String cpf, String formacao, String area){
        super(nome, cpf);
        this.formacao = formacao;
        this.area = area;
    }

    public String getFormacao(){
        return this.formacao;
    }

    public String getArea(){
        return this.area;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    public void setArea(String area){
        this.area = area;
    }
}
