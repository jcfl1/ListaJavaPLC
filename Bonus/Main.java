public class Main {
    public static void main(String[] args){
        String expr = "3==2?4:4-3";

        ExprOpTernario minhaExpr = new ExprOpTernario(expr);

        System.out.println(minhaExpr.avaliar(expr));
        System.out.println(minhaExpr.imprimirArvore(expr));

        System.out.println(minhaExpr);
    }

}
