public class ValueNode extends ArithmeticNode{
    private double value;

    public ValueNode(double value){
        super(null, null);
        this.value = value;
    }

    public ValueNode(String value){
        super(null, null);
        this.value = Integer.parseInt(value);
    }

    public double getValue(){
        return this.value;
    }

    public double avaliar(){
        return this.getValue();
    }

    public String imprimirArvore(){
        return "(" + String.format("%.0f", this.getValue()) + ")";
    }

}
