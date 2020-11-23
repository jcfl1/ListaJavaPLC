public class ExprLogica implements Expression{
    private LogicNode tree;

    public ExprLogica(LogicNode tree){
        this.tree = tree;
    }

    public ExprLogica(String expr){
        this.tree = new LogicNode(expr);
    }

    public LogicNode getTree(){
        return this.tree;
    }

    public void setTree(LogicNode tree){
        this.tree = tree;
    }

    public String avaliar(String expr){
        ExprLogica novaExpressao = new ExprLogica(expr);
        return String.valueOf(novaExpressao.getTree().avaliar());
    }

    public String imprimirArvore(String expr){
        ExprLogica novaExpressao = new ExprLogica(expr);
        return novaExpressao.getTree().imprimirArvore();
    }

    public String toString(){
        return "ExprLogica[ " + this.getTree() + " Adressing " + super.toString() + " ]";
    }
}