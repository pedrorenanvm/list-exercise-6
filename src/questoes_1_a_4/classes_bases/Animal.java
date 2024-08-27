package questoes_1_a_4.classes_bases;

public class Animal {

    private String nome;

    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("questoes_1_a_4.classes_bases.Animal está emitindo som");
    }

    public void movendose(){
        System.out.println("questoes_1_a_4.classes_bases.Animal está se movendo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
