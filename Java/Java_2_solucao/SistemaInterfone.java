// Classe Base Interfone (Abstrata)
abstract class Interfone {
    // Atributos
    protected String modelo;
    protected String endereco;
    
    // Construtor
    public Interfone(String modelo, String endereco) {
        this.modelo = modelo;
        this.endereco = endereco;
    }
    
    // Métodos Abstratos
    public abstract void ligarPara(String nome, String numero);
    public abstract void registrarChamada(String nome, String horario, String duracao);
}

// Subclasse InterfoneResidencial
class InterfoneResidencial extends Interfone {
    // Atributos para os contatos e números
    private String contato1;
    private String numero1;
    
    private String contato2;
    private String numero2;
    
    private String contato3;
    private String numero3;
    
    private String contato4;
    private String numero4;
    
    // Construtor
    public InterfoneResidencial(String modelo, String endereco) {
        super(modelo, endereco);
        // Inicializa os contatos e números como vazios
        this.contato1 = "";
        this.numero1 = "";
        this.contato2 = "";
        this.numero2 = "";
        this.contato3 = "";
        this.numero3 = "";
        this.contato4 = "";
        this.numero4 = "";
    }
    
    // Método para cadastrar contatos
    public void cadastrarContato(int index, String nome, String numero) {
        if (index == 1) {
            this.contato1 = nome;
            this.numero1 = numero;
        } else if (index == 2) {
            this.contato2 = nome;
            this.numero2 = numero;
        } else if (index == 3) {
            this.contato3 = nome;
            this.numero3 = numero;
        } else if (index == 4) {
            this.contato4 = nome;
            this.numero4 = numero;
        }
        System.out.println("Contato cadastrado: " + nome + " - Número: " + numero);
    }
    
    // Implementação do método ligarPara
    @Override
    public void ligarPara(String nome, String numero) {
        System.out.println("Ligando para " + nome + " no número " + numero);
    }
    
    // Implementação do método registrarChamada
    @Override
    public void registrarChamada(String nome, String horario, String duracao) {
        System.out.println("Chamada registrada: ");
        System.out.println("Nome: " + nome);
        System.out.println("Horário: " + horario);
        System.out.println("Duração: " + duracao);
    }
    
    // Método para realizar chamadas para todos os contatos
    public void realizarChamadas() {
        if (!contato1.isEmpty()) {
            ligarPara(contato1, numero1);
            registrarChamada(contato1, "10:00:00", "5 minutos");
        }
        if (!contato2.isEmpty()) {
            ligarPara(contato2, numero2);
            registrarChamada(contato2, "10:05:00", "4 minutos");
        }
        if (!contato3.isEmpty()) {
            ligarPara(contato3, numero3);
            registrarChamada(contato3, "10:10:00", "3 minutos");
        }
        if (!contato4.isEmpty()) {
            ligarPara(contato4, numero4);
            registrarChamada(contato4, "10:15:00", "6 minutos");
        }
    }
}

// Classe principal
public class SistemaInterfone {
    public static void main(String[] args) {
        // Instanciando o interfone residencial
        InterfoneResidencial interfone = new InterfoneResidencial("Intelbras", "Rua Exemplo, 123");
        
        // Cadastrando contatos
        interfone.cadastrarContato(1, "Proprietário", "1234-5678");
        interfone.cadastrarContato(2, "Polícia", "190");
        interfone.cadastrarContato(3, "Bombeiros", "193");
        interfone.cadastrarContato(4, "SAMU", "192");
        
        // Realizando chamadas para os contatos cadastrados
        interfone.realizarChamadas();
    }
}
