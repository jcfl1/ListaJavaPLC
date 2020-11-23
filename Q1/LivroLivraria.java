// [Q1] Crie uma classe abstrata Livro (modelando-a) que represente os atributos básicos de um livro, sem se preocupar
// com a sua finalidade. Em seguida, modele e crie as classes LivroLivraria e LivroBiblioteca, um que represente os dados
// básicos de um livro que está à venda em uma livraria e o outro que represente os dados básicos de um livro de uma 
// biblioteca (que pode ser emprestado a leitores).


public class LivroLivraria extends Livro{

    private int preco;
    private int qtdEstoque;
    private int codigo;

    public LivroLivraria(String nome, String autor, String descricao, int anoPub, int preco, int qtdEstoque, int codigo){
        super(nome, autor, descricao, anoPub);
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.codigo = codigo;        
    }

    public int getPreco(){
        return this.preco;
    }

    public int getQtdEstoque(){
        return this.qtdEstoque;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    public void addQtdEstoque(int qtdNovosLivros){
        this.qtdEstoque += qtdNovosLivros;
    }

    public void subtrairLivroDoEstoque(){
        this.qtdEstoque -= 1;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    //Retorna true caso foi possível realizar a venda, false caso contrário.
    public boolean venderLivro(int unidadesVendidas){

        if(unidadesVendidas > this.getQtdEstoque()){
            return false;
        }

        this.setQtdEstoque(this.getQtdEstoque() - unidadesVendidas);
        return true;
    }

}
