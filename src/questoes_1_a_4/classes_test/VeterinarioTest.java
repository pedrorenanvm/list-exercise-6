package questoes_1_a_4.classes_test;

import questoes_1_a_4.classes_bases.*;

public class VeterinarioTest {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Bob", 3);
        Animal cavalo = new Cavalo("Pangare", 5);
        Animal preguica = new Preguica("XLR8", 2);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            Veterinario.examinar(animal);
        }
    }
}
