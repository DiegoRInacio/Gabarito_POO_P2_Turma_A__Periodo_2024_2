class Personagem:
    def __init__(self, nome, cor, vidas):
        self.nome = nome
        self.cor = cor
        self.vidas = vidas

    def andar(self):
        raise NotImplementedError("Este método deve ser implementado pela classe derivada.")

    def pular(self):
        raise NotImplementedError("Este método deve ser implementado pela classe derivada.")

    def interagir(self):
        raise NotImplementedError("Este método deve ser implementado pela classe derivada.")

class Mario(Personagem):
    def andar(self):
        print(f"{self.nome} está andando rapidamente.")

    def pular(self):
        print(f"{self.nome} deu um super pulo!")

    def interagir(self):
        print(f"{self.nome} pegou uma moeda!")

class Luigi(Personagem):
    def andar(self):
        print(f"{self.nome} está andando tranquilamente.")

    def pular(self):
        print(f"{self.nome} deu um pulo alto e gracioso!")

    def interagir(self):
        print(f"{self.nome} encontrou um cogumelo verde!")

# Instanciação dos personagens
mario = Mario(nome="Mario", cor="Vermelho", vidas=3)
luigi = Luigi(nome="Luigi", cor="Verde", vidas=3)

# Lista de personagens
personagens = [mario, luigi]

# Demonstração de polimorfismo
for personagem in personagens:
    personagem.andar()
    personagem.pular()
    personagem.interagir()

