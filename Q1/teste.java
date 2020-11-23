public class teste {
    public static void main(String[] args) {
        LivroLivraria dozeRegrasParaVida = new LivroLivraria("12 Regras para vida", "Jordan B Peterson", "Sei la cara, le ai", 2010, 50, 2, 12123);
        LivroBiblioteca terraPapagalli = new LivroBiblioteca("Terra Papagalli", "Desconhecido", "Leia e descubra", 1955, 2, 5121);

        System.out.println("Vamos agora fazer o teste do emprestimo de livros (biblioteca)\n");


        terraPapagalli.pegarEmprestado("Julio Cesar");
        System.out.println(terraPapagalli.getListaPessoas().get(0));
        if(!terraPapagalli.pegarEmprestado("Julio Cesar")){
            System.out.println("Esse cliente ja pegou esse livro emprestado.\n");
        }
        else{
            System.out.println("Livro emprestado com sucesso.\n");
        }

        
        System.out.println("Vamos agora fazer o teste da venda de livros (livraria)\n");
        
        
        if(dozeRegrasParaVida.venderLivro(2)) System.out.println("2 livros vendidos com sucesso\n");
        else System.out.println("Falha na venda dos 2 livros\n");

        if(dozeRegrasParaVida.venderLivro(1)) System.out.println("1 livro foi teoricamente vendido. Mas isso nao era pra acontecer!!!!!!!\n");
        else System.out.println("Nao foi possivel vender mais 1 livro. O estoque ja esta zerado.");

    }

}