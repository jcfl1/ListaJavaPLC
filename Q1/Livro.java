// [Q1] Crie uma classe abstrata Livro (modelando-a) que represente os atributos básicos de um livro, sem se preocupar
// com a sua finalidade. Em seguida, modele e crie as classes LivroLivraria e LivroBiblioteca, um que represente os dados
// básicos de um livro que está à venda em uma livraria e o outro que represente os dados básicos de um livro de uma 
// biblioteca (que pode ser emprestado a leitores).


/*
    OBS:

    Era possivel deixar essa implementação melhor caso fossem adicionados os atributos "qtdEstoque" e "codigo" nessa classe
    abstrata "Livro", de forma que LivroLivraria e LivroBiblioteca herdassem esses atributos e seus respectivos metodos.
    
    Isso nao foi feito pois na instrucao da questao estava escrito "Crie uma classe abstrata Livro [...] sem se preocupar com a sua finalidade"
    Logo, sem se preocupar com a finalidade do livro, pensei em deixar essa classe somente com esses atributos essenciais.
*/

public abstract class Livro{
    private String nome;
    private String autor;
    private String descricao;
    private int anoPub;

    public Livro(String nome, String autor, String descricao, int anoPub){
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
        this.anoPub = anoPub;
    }

    public String getNome(){
        return this.nome;
    }

    public String getAutor(){
        return this.autor;
    }
   
    public String getDescricao(){
        return this.descricao;
    }
    
    public int getAnoPublicacao(){
        return this.anoPub;
    }

}