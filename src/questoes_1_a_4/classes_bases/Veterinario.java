package questoes_1_a_4.classes_bases;

public class Veterinario {

    public static void examinar(Animal animal){
        System.out.println("O veterinário está examinando " + animal.getNome());
        animal.emitirSom();
    }
}
