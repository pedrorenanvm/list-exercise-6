package questoes_1_a_4.classes_test;

import questoes_1_a_4.classes_bases.*;

public class ZoologicoTest {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        // Criando diferentes animais
        Animal cachorro1 = new Cachorro("Evy", 3);
        Animal cavalo1 = new Cavalo("Spirit", 5);
        Animal preguica1 = new Preguica("XLR8", 2);
        Animal cachorro2 = new Cachorro("Max", 4);
        Animal cavalo2 = new Cavalo("Pegasus", 7);
        Animal preguica2 = new Preguica("Dorminhoca", 3);
        Animal cachorro3 = new Cachorro("Buddy", 2);
        Animal cavalo3 = new Cavalo("Link", 6);
        Animal preguica3 = new Preguica("Slowpoke", 1);
        Animal cachorro4 = new Cachorro("Growther", 5);

        zoologico.adicionarAnimal(0, cachorro1);
        zoologico.adicionarAnimal(1, cavalo1);
        zoologico.adicionarAnimal(2, preguica1);
        zoologico.adicionarAnimal(3, cachorro2);
        zoologico.adicionarAnimal(4, cavalo2);
        zoologico.adicionarAnimal(5, preguica2);
        zoologico.adicionarAnimal(6, cachorro3);
        zoologico.adicionarAnimal(7, cavalo3);
        zoologico.adicionarAnimal(8, preguica3);
        zoologico.adicionarAnimal(9, cachorro4);

        zoologico.percorrerJaulas();
    }
}
