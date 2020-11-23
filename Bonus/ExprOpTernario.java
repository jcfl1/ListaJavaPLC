public class ExprOpTernario implements Expression{
    private ExprLogica primeiraExpr;
    private Expression segundaExpr;
    private Expression terceiraExpr;

    public ExprOpTernario(ExprLogica primeiraExpr, Expression segundaExpr, Expression terceiraExpr){
        this.primeiraExpr = primeiraExpr;
        this.segundaExpr = segundaExpr;
        this.terceiraExpr = terceiraExpr;
    }

    public ExprOpTernario(String expr){
        
        int posInterrogacao = charFirstPos(expr, '?');
        
        if(posInterrogacao == -1){
            System.out.println("Um erro ocorreu, nao foi encontrado o ? do opTernario");
            return;
        }

        ExprLogica primeiraExpr = new ExprLogica(expr.substring(0, posInterrogacao));

        int posDoisPontos = charFirstPos(expr, ':');

        if(posDoisPontos == -1){
            System.out.println("Um erro ocorreu, nao foi encontrado o : do opTernario");
            return;
        }

        String segundaStr = expr.substring(posInterrogacao+1, posDoisPontos), terceiraStr = expr.substring(posDoisPontos+1, expr.length());
        int tp2 = discoverTypeOfExpr(segundaStr);
        int tp3 = discoverTypeOfExpr(terceiraStr);
        
        Expression segundaExpr, terceiraExpr;

        if(tp2 == 0) segundaExpr = new ExprAritmetica(segundaStr);
        else segundaExpr = new ExprLogica(segundaStr);

        if(tp3 == 0) terceiraExpr = new ExprAritmetica(terceiraStr);
        else terceiraExpr = new ExprLogica(terceiraStr);

        this.primeiraExpr = primeiraExpr;
        this.segundaExpr= segundaExpr;
        this.terceiraExpr = terceiraExpr;
    }

    public ExprLogica getPrimeiraExpr(){
        return this.primeiraExpr;
    }

    public Expression getSegundaExpr(){
        return this.segundaExpr;
    }

    public Expression getTerceiraExpr(){
        return this.terceiraExpr;
    }

    public String avaliar(String expr){
        ExprOpTernario novaExpr = new ExprOpTernario(expr); 
        int posInterrogacao = charFirstPos(expr, '?'), posDoisPontos = charFirstPos(expr, ':');
        String segundaStr = expr.substring(posInterrogacao+1, posDoisPontos), terceiraStr = expr.substring(posDoisPontos+1, expr.length());

        if(novaExpr.getPrimeiraExpr().getTree().avaliar()){
            return novaExpr.getSegundaExpr().avaliar(segundaStr);
        }
        return novaExpr.getTerceiraExpr().avaliar(terceiraStr);
    }

    public String imprimirArvore(String expr){
        ExprOpTernario novaExpr = new ExprOpTernario(expr); 
        int posInterrogacao = charFirstPos(expr, '?'), posDoisPontos = charFirstPos(expr, ':');
        String segundaStr = expr.substring(posInterrogacao+1, posDoisPontos), terceiraStr = expr.substring(posDoisPontos+1, expr.length());

        System.out.println(novaExpr.getSegundaExpr().imprimirArvore(segundaStr));

        return novaExpr.getPrimeiraExpr().getTree().imprimirArvore() + "?" + novaExpr.getSegundaExpr().imprimirArvore(segundaStr) + ":" + novaExpr.getTerceiraExpr().imprimirArvore(terceiraStr);
    }

    private int charFirstPos(String expr, char c){
        for(int i=0; i<expr.length(); i++){
            if(expr.charAt(i) == c) return i;
        }
        return -1;
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

    public String toString(){
        return "ExprOpTernario[ " + this.getPrimeiraExpr() + "|" + this.getSegundaExpr() + "|" + this.getTerceiraExpr() + " Adressing " + super.toString() + " ]";
    }

}