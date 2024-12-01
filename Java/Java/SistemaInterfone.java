// Questão 3
abstract class Interfone {
    protected String modelo;
    protected String endereco;

    public Interfone(String endereco) {
        this.modelo = "Intelbras - Allo WT7";
        this.endereco = endereco;
    }

    public void ligarPara() {}

    public void registrarChamada(String horario, String duracao) {}
}

class InterfoneResidencial extends Interfone {
    String proprietario;
    String numero;

    public InterfoneResidencial(String endereco, String proprietario, String numero) {
        super(endereco);
        this.proprietario = proprietario;
        this.numero = numero;
    }

    @Override
    public void ligarPara() {
        System.out.println("Ligar para "+proprietario+" e numero "+ numero);
    }

    @Override
    public void registrarChamada(String horario, String duracao) {
        System.out.println("Chamada Registrada: ");
        System.out.println("Nome "+proprietario);
        System.out.println("Horário: "+horario);
        System.out.println("Duração "+duracao);
    }
}

class SistemaInterfone {
    public static void main(String[] args) {
        InterfoneResidencial interfone = new InterfoneResidencial("Rua A 12", "Zé da Manga", "229856412");

        interfone.ligarPara();

        interfone.registrarChamada("15:23", "2 minutos");
    }
}
