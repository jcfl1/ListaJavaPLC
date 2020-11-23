public class ExprAritmetica implements Expression{
    private ArithmeticNode tree;

    public ExprAritmetica(ArithmeticNode tree){
        this.tree = tree;
    }

    public ExprAritmetica(String expr){
        if(isValue(expr))
            this.tree = new ValueNode(expr);
        else 
            this.tree = new OperatorNode(expr);
    }

    private static boolean isValue(String expr){
        for(int i=0; i<expr.length(); i++){
            if(expr.charAt(i) < '0' || expr.charAt(i) > '9') return false;
        }
        return true;
    }

    public ArithmeticNode getTree(){
        return this.tree;
    } 

    public void setTree(ArithmeticNode tree){
        this.tree = tree;
    }

    public String avaliar(String expr){
        ExprAritmetica novaExpressao = new ExprAritmetica(expr);
        return String.valueOf(novaExpressao.getTree().avaliar());
    }

    public String imprimirArvore(String expr){
        ExprAritmetica novaExpressao = new ExprAritmetica(expr);
        return novaExpressao.getTree().imprimirArvore();
    }

    public String toString(){
        return "ExprAritmetica[ " + this.getTree() + " Adressing " + super.toString() + " ]";
    }

}
