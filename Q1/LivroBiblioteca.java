import java.util.ArrayList;

public class LivroBiblioteca extends Livro{

    private ArrayList<String> pessoasQuePegaramEmprestado;
    private int qtdEstoque;
    private int codigo;

    public LivroBiblioteca(String nome, String autor, String descricao, int anoPub, int qtdEstoque, int codigo){
        super(nome, autor, descricao, anoPub);
        this.pessoasQuePegaramEmprestado = new ArrayList<String>();
        this.qtdEstoque = qtdEstoque;
        this.codigo = codigo;        
    }

    public int getQtdEstoque(){
        return this.qtdEstoque;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public ArrayList<String> getListaPessoas(){
        return this.pessoasQuePegaramEmprestado;
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

    // Verifica se um cliente pegou esse livro emprestado
    // Caso ele tenha pego, retorna true, caso contrario false.
    public boolean verificarCliente(String nomeCliente){
        return this.pessoasQuePegaramEmprestado.contains(nomeCliente);
    }

    // Voce so pode pegar emprestado 1 unidade do mesmo livro no maximo.
    // Caso o cliente possa pegar o livro emprestado retorna true, caso contrario false.
    public boolean pegarEmprestado(String nomeCliente){

        if(verificarCliente(nomeCliente) || getQtdEstoque() == 0) return false;

        this.pessoasQuePegaramEmprestado.add(nomeCliente);
        System.out.println(getListaPessoas().size());

        this.subtrairLivroDoEstoque();
        return true;
    }

}
