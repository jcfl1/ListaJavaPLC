public class Main {

    public static void main(String[] args){

        Pessoa bebe = new Pessoa();
        Pessoa julio = new Pessoa("Julio", 18, "Ensino Superior Incompleto", Genero.CIS, "Hetero", "Masculino");


        julio.comer("macarrao");
        bebe.cagar();
        julio.estudar("PLC", 5);
        julio.dormir(7);
        bebe.dormir(4);
        bebe.cagar();
        julio.viver();
        bebe.dormir(6);
        julio.trabalhar(3);

        System.out.println("O genero de Julio eh: " + julio.getGenero());
        System.out.println("O genero do bebe eh: " + bebe.getGenero());
    }

}
