package questoes_1_a_4.classes_bases;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }
    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora do limite das jaulas.");
            System.out.println("Tente outro índice");
        }
    }
    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.println("Jaula " + (i + 1) + ":");
                animal.emitirSom();

                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    animal.movendose();
                }
                System.out.println();
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
                System.out.println();
            }
        }
    }
}
