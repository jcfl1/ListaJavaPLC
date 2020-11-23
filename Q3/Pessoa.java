// [Q3] Faça uma classe que modele uma pessoa. Uma pessoa no escopo para essa questão tem nome, idade, grau de escolaridade, identidade de gênero, 
// orientação sexual e sexo biológico. Todos os atributos devem ser  protegidos (protected). Crie o construtor default dessa classe e um outro construtor 
// com todos os atributos passados por passagem de argumentos (parâmetros). Faça o encapsulamento da seguinte forma: crie os métodos getter para todos os
//  atributos, e os setter somente para idade, nome, grau de escolaridade. Defina uma classe do tipo enumerável (Pesquise!) para o criar as constantes 
//  string da identidade de gênero, sendo elas: cisgênero, transgênero, gênero fluido e não-binário. Crie também os métodos (comportamentos) de uma pessoa
//   (também conhecida por ser humano), sendo eles, dormir, cagar, comer, estudar, viver, sobreviver e trabalhar. Nesses últimos casos, basta colocar um 
//   system.out.println mantendo assim a coesão da classe. Após isso, crie a classe principal (Main), crie um objeto do tipo pessoa, e
//  instancie ela com o construtor default e com o outro construtor. Fique à vontade para usar os métodos criados com a instância criada, mas não precisa ser todos.

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String escolaridade;
    protected Genero genero;
    protected String orientacaoSexual;
    protected String sexoBiologico;

    public Pessoa(){
        this.nome = "Enzo";
        this.idade = 0;
        this.escolaridade = "Nenhuma";
        this.genero = Genero.NAO_BINARIO;
        this.orientacaoSexual = "Desconhecido";
        this.sexoBiologico = "Desconhecido";
    }

    public Pessoa(String nome, int idade, String escolaridade, Genero genero, String orientacaoSexual, String sexoBiologico){
        this.nome = nome;
        this.idade = idade;
        this.escolaridade = escolaridade;
        this.genero = genero;
        this. orientacaoSexual = orientacaoSexual;
        this.sexoBiologico = sexoBiologico;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getEscolaridade(){
        return this.escolaridade;
    }

    public Genero getGenero(){
        return this.genero;
    }

    public String getOrientacaoSexual(){
        return this.orientacaoSexual;
    }

    public String getSexoBiologico(){
        return this.sexoBiologico;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    void setEscolaridade(String escolaridade){
        this.escolaridade = escolaridade;
    }

    void dormir(int horas){
        System.out.println(this.getNome() + " dormiu por " + horas + " horas.");
    }

    void cagar(){
        System.out.println(this.getNome() + " precisou ir fazer suas necessidades.");
    }

    void comer(String comida){
        System.out.println(this.getNome() + " saboreou um(a) delicioso(a) " + comida + ".");
    }

    void estudar(String assunto, int horas){
        System.out.println(this.getNome() + " foi estudar " + assunto + " por " + horas + " horas.");
    }

    void viver(){
        System.out.println(this.getNome() + " esta vivendo.");
    }

    void sobreviver(){
        System.out.println(this.getNome() + " esta sobrevivendo.");
    }

    void trabalhar(int horas){
        System.out.println(this.getNome() + " foi trabalhar por " + horas + " horas.");
    }

}
