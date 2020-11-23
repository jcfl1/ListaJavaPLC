public abstract class ExprNode {
    private ArithmeticNode left;
    private ArithmeticNode right;

    public ExprNode(ArithmeticNode left, ArithmeticNode right){
        this.left = left;
        this.right = right;
    }

    public ArithmeticNode getLeft(){
        return this.left;
    }

    public ArithmeticNode getRight(){
        return this.right;
    }

    public void setLeft(ArithmeticNode left){
        this.left = left;
    }

    public void setRight(ArithmeticNode right){
        this.right = right;
    }

    public abstract String imprimirArvore();
}
