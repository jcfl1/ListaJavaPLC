public class OperatorNode extends ArithmeticNode{
    private char operator;

    public OperatorNode(ArithmeticNode left, ArithmeticNode right, char operator){
        super(left, right);
        this.operator = operator;
    }
    
    public OperatorNode(String expr){
        // Devemos procurar logo pelos operadores de MENOR precedencia, para deixar os de MAIOR precedencia mais perto das folhas
        // Para que assim eles sejam avaliados antes dos de MENOR precedencia.
        // Sendo assim vamos procurar logo pelos de menor precedencia.

        // Indexes: 0 -> Adicao, 1 -> Subtracao, 2 -> Multiplicacao, 3 -> Divisao

        super(null, null);

        char[] operadores = {'+','-','*','/'};
        int[] primeiraPosOperadores = {-1, -1, -1, -1};
        char charAtual;

        for(int i=expr.length()-1; i >= 0; i--){
            charAtual = expr.charAt(i);

            for(int j=0; j<4; j++){
                if(charAtual == operadores[j] && primeiraPosOperadores[j] == -1){
                    primeiraPosOperadores[j] = i;
                }
            }
        }

        for(int i=0; i<4; i++){
            if(primeiraPosOperadores[i] != -1){
                String leftExpr = expr.substring(0, primeiraPosOperadores[i]);
                String rightExpr = expr.substring(primeiraPosOperadores[i] + 1, expr.length()); 
                
                ArithmeticNode left, right;

                if(isValue(leftExpr)) left = new ValueNode(leftExpr);
                else left = new OperatorNode(leftExpr);

                if(isValue(rightExpr)) right = new ValueNode(rightExpr);
                else right = new OperatorNode(rightExpr);
                
                this.setLeft(left);
                this.setRight(right);
                this.setOperator(operadores[i]);
                
                return;
            }
        }

        System.out.println("ALGO DEU ERRADO, NAO TEM NENHUM OPERADOR EM UM NODE DE OPERADOR");

    }

    private static boolean isValue(String expr){
        for(int i=0; i<expr.length(); i++){
            if(expr.charAt(i) < '0' || expr.charAt(i) > '9') return false;
        }
        return true;
    }

    public char getOperator(){
        return this.operator;
    }

    private void setOperator(char operator){
        this.operator = operator;
    }

    public double avaliar(){
        
        double l = this.getLeft().avaliar();
        double r = this.getRight().avaliar();
        
        if(this.getOperator() == '+') return l+r;
        else if(this.getOperator() == '-') return l-r;
        else if(this.getOperator() == '*' ) return l*r;
        else if(this.getOperator() == '/'){
            
            if(r == 0){
                System.out.println(" POR 0!!! ERRO!");
                return l/r;
            }

            else{
                return l/r;
            }

        }
        else{
            System.out.println("Operador desconhecido. Erro inesperado");
            return 1;
        }
    }

    public String imprimirArvore(){
        return "(" + this.getLeft().imprimirArvore() + this.getOperator() + this.getRight().imprimirArvore() + ")";
    }

}
