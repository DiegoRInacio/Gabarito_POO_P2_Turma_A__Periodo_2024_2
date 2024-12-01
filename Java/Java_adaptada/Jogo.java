// Classe Personagem
abstract class Personagem {
    protected String nome;
    protected String cor;
    protected int vidas;

    public Personagem(String nome, String cor, int vidas) {
        this.nome = nome;
        this.cor = cor;
        this.vidas = vidas;
    }

    public abstract void andar();
    public abstract void pular();
}

// Classe Mario
class Mario extends Personagem {
    public Mario(String nome, String cor, int vidas) {
        super(nome, cor, vidas);
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando rapidamente.");
    }

    @Override
    public void pular() {
        System.out.println(nome + " deu um super pulo!");
    }
}

// Classe Luigi
class Luigi extends Personagem {
    public Luigi(String nome, String cor, int vidas) {
        super(nome, cor, vidas);
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando tranquilamente.");
    }

    @Override
    public void pular() {
        System.out.println(nome + " deu um pulo alto e gracioso!");
    }
}

// Classe principal (Main)
public class Jogo {
    public static void main(String[] args) {
        // Instanciando personagens
        Personagem mario = new Mario("Mario", "Vermelho", 3);
        Personagem luigi = new Luigi("Luigi", "Verde", 3);

        // Lista de personagens
        Personagem[] personagens = {mario, luigi};

        // Demonstração de polimorfismo
        for (Personagem personagem : personagens) {
            personagem.andar();
            personagem.pular();
        }
    }
}
