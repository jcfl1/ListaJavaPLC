// [Q4] Crie uma classe Conta e uma classe Senha. Nesse caso, uma Conta tem um número de identificação, uma agência e 
// uma Senha que deve ser um atributo da na classe Conta, fazendo assim a composição da classe Senha na classe Conta. Na
//  classe Senha temos duas senhas: uma composta de letras com números, exemplo A1B2C3, e outra somente de números, 
//  exemplo, 123456. Em ambas classes, crie o construtor com todos os atributos passados por passagem de argumentos 
//  (parâmetros); e faça o encapsulamento com a criação de getters e setters. Crie todas as variáveis e métodos com o 
//  modificador de acesso protegido em ambas classes. Após isso, crie uma classe principal (Main) e instancie uma conta. 
//  Após isso, mostre a senha de letras dessa conta e seu número de identificação. Ademais, modifique a senha de letras 
//  com o uso de um método setter respectivo e mostre a senha de letras dessa conta agora modificada.

public class Conta{
    protected int id;
    protected int agencia;
    protected Senha senhas;

    protected Conta(int id, int agencia, String senhaMista, String senhaNumerica){
        this.id = id;
        this.agencia = agencia;
        this.senhas = new Senha(senhaMista, senhaNumerica);
    }

    protected int getId(){
        return this.id;
    }

    protected int getAgencia(){
        return this.agencia;
    }

    protected Senha getSenhas(){
        return this.senhas;
    }

    protected void setId(int id){
        this.id = id;
    }

    protected void setAgencia(int agencia){
        this.agencia = agencia;
    }

    protected void setSenhas(String senhaMista, String senhaNumerica){
        this.senhas = new Senha(senhaMista, senhaNumerica);
    }

}