import javax.swing.plaf.TreeUI;

abstract class Interfone1 {
    String modelo;
    String endereco;
    boolean ligando;
    int propietario;
    int policia;
    int bombeiro;
    int Samu;

    public Interfone1(String modelo, String endereco) {
        this.modelo = modelo;
        this.endereco = endereco;
        this.ligando = false;
        this.propietario = 0;
        this.policia = 0;
        this.bombeiro =0;
        this.samu = 0;

    }

    public void ligar_para() {
        System.out.println("ligação feita para joao ");
    }
    public void ligar(){
        if (!ligando){
            ligando = True;
            System.out.println("Ligando para " +nome+"");
        }
    }
    public void numero_Propietario(){
        if (propietario){
            propietario += 78787909;
            System.out.println("ligou");

        }
    }
    public void ligando_policia(){
        if (policia){
            policia += 190;
            System.out.println("ligou");

        }
    }
    public void ligando_bombeiros(){
        if (bombeiro){
            bombeiro += 193;
            System.out.println("ligou");

        }
    }
    public void Ligando_samu(){
        if (samu){
            samu += 192;
            System.out.println("ligou");

        }
    }
}

class InterfoneResidencial extends Interfone {
    String nome;
    String numero;
    public InerfoneResidencial(String modelo,String endereco,String nome, String numero){
        Super(modelo,endereco);
        this.nome = nome;
        this.numero= numero;

       }

    public void ligar(){
        if (!ligando){
            ligando = True;
            System.out.println("Ligando para " +nome+"");
        }
    }  
    
    public void registrar_chamada(){

    }

  public static void main(String[] args) {
    
    InrfoneResidencial telefone1 = new InrfoneResidencial("zé","rua nao sei","outro zé","ewew232");
    telefone1.ligar_para();
    telefone1.ligar();
    telefone1.numero_Propietario();
    telefone1.ligando_policia();
    telefone1.ligando_bombeiros();
    telefone1.Ligando_samu();
  }
       
}

      


       