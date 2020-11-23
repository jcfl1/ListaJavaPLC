public class LogicNode extends ExprNode{
    private String logicOperator;

    public LogicNode(ArithmeticNode left, ArithmeticNode right, String logicOperator){
        super(left, right);
        this.logicOperator = logicOperator;
    }

    public LogicNode(String expr){

        super(null, null);

        int opPosition = getLogicOperatorPos(expr);

        if(opPosition == -1){
            System.out.println("Nao ha nenhum operador logico nessa expressao. Erro");
            this.logicOperator = ">";
            return;
        }

        String logicOperator = getLogicOperatorStr(expr, opPosition);
        String leftExpr, rightExpr;
        
        ArithmeticNode left, right;
        
        leftExpr = expr.substring(0, opPosition);
        if(logicOperator.length() == 1) rightExpr = expr.substring(opPosition + 1, expr.length()); 
        else rightExpr = expr.substring(opPosition + 2, expr.length());

        if(isValue(leftExpr)) left = new ValueNode(leftExpr);
        else left = new OperatorNode(leftExpr);

        if(isValue(rightExpr)) right = new ValueNode(rightExpr);
        else right = new OperatorNode(rightExpr);
        
        this.setLeft(left);
        this.setRight(right);
        this.setLogicOperator(logicOperator);
    }

    public String getLogicOperator(){
        return this.logicOperator;
    }

    private void setLogicOperator(String logicOperator){
        this.logicOperator = logicOperator;
    }

    public boolean avaliar(){
        double l = this.getLeft().avaliar();
        double r = this.getRight().avaliar();

        String op = this.getLogicOperator();

        if(op.equals(">")) return l > r;
        else if(op.equals(">=")) return l>=r;
        else if(op.equals("<")) return l < r;
        else if(op.equals("<=")) return l <= r;
        else if(op.equals("!=")) return l != r;
        else if(op.equals("==")) return l == r;
        else{
            System.out.println("Erro! Operador desconhecido.");
            return false;
        }
    }

    public String imprimirArvore(){
        return "(" + this.getLeft().imprimirArvore() + this.getLogicOperator() + this.getRight().imprimirArvore() + ")";
    }
    
    private static boolean isValue(String expr){
        for(int i=0; i<expr.length(); i++){
            if(expr.charAt(i) < '0' || expr.charAt(i) > '9') return false;
        }
        return true;
    }
    
    private static int getLogicOperatorPos(String expr){
        char[] logicOperators = {'>', '<', '!', '='};
    
        for(int i=0; i<expr.length(); i++){
            for(int j=0; j<4; j++){
                if(expr.charAt(i) == logicOperators[j]) return i;
            }
        }
    
        return -1;
    }
    
    private static String getLogicOperatorStr(String expr, int opPosition){
        if(expr.charAt(opPosition) == '>'){
            if(expr.charAt(opPosition+1) == '=') return ">=";
            return ">";
        }
        else if(expr.charAt(opPosition) == '<'){
            if(expr.charAt(opPosition+1) == '=') return "<=";
            return "<";
        }
        else if(expr.charAt(opPosition) == '!'){
            return "!=";
        }
        else if(expr.charAt(opPosition) == '='){
            return "==";
        }
        System.out.println("Erro! Nenhum operador logico foi encontrado");
        return ">";
    }
}


