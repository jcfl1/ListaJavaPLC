//Após isso, crie uma classe principal (Main) e instancie uma conta. 
//  Após isso, mostre a senha de letras dessa conta e seu número de identificação. Ademais, modifique a senha de letras 
//  com o uso de um método setter respectivo e mostre a senha de letras dessa conta agora modificada.

public class Main {
    public static void main(String[] args){
        
        Conta novaConta = new Conta(45, 3, "QWERTY123", "123321");

        System.out.println("Senha de letras da conta : " + novaConta.getSenhas().getSenhaMista());
        System.out.println("Numero de identificacao da conta: " + novaConta.getId());

        novaConta.getSenhas().setSenhaMista("salve321");

        System.out.println("Nova senha da conta: " + novaConta.getSenhas().getSenhaMista());

    }
}
