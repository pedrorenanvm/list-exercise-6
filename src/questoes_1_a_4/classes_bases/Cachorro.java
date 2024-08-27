package questoes_1_a_4.classes_bases;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo");
    }

    @Override
    public void movendose() {
        System.out.println("O cachorro está correndo");
    }
}
