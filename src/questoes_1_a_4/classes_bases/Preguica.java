package questoes_1_a_4.classes_bases;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguça está emitindo um som");
    }

    @Override
    public void movendose() {
        System.out.println("A preguiça está subindo em arvorés");
    }
}
