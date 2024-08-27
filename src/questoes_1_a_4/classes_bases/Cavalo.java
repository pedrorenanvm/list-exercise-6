package questoes_1_a_4.classes_bases;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando");
    }

    @Override
    public void movendose() {
        System.out.println("O cavalor está cavalgando");
    }
}
