package questoes_1_a_4.classes_test;

import questoes_1_a_4.classes_bases.*;

public class AnimaisTest {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Bob", 3);
        Animal cavalo = new Cavalo("Pangare", 5);
        Animal preguica = new Preguica("XLR8", 2);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            animal.emitirSom();
            System.out.println();
        }
    }
}
