// Deve existir também uma classe main, 
// que recebe a entrada em formato de string, avaliar o tipo da expressão, instância um objeto do tipo da expressão
//  se é aritmética ou lógica e então a avalia e printa a árvore respectiva aquela expressão dada.

public class Main {
    public static void main(String[] args){
        String expr = "2*3+4/6/6*4";

        Expression minhaExp;

        int tp = discoverTypeOfExpr(expr);
        if(tp == 0) minhaExp = new ExprAritmetica(expr);
        else minhaExp = new ExprLogica(expr);

        System.out.println(minhaExp.imprimirArvore(expr));
        System.out.println(minhaExp.avaliar(expr));

        //Usando o toString aqui
        System.out.println(minhaExp);
    }

    public static int discoverTypeOfExpr(String expr){
        // 0 para ExprAritmetica, 1 para ExprLogica
        char aux;
        for(int i=0; i<expr.length(); i++){
            aux = expr.charAt(i);
            if(aux == '>' || aux == '<' || aux == '=') return 1;
        }
        return 0;
    }
}
