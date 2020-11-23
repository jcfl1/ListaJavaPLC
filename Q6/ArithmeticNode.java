public abstract class ArithmeticNode extends ExprNode{

    public ArithmeticNode(ArithmeticNode left, ArithmeticNode right){
        super(left, right);
    }

    public abstract double avaliar();
}