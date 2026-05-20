public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();

        c1.marca = "Ford";
        c1.modelo = "Spin";
        c1.velocidade = 20;

        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.status();
        c1.freiar();
        c1.status();
        c1.desligar();
        
    }
}
// Crie 2 objetos da classe Carro.
// - Defina valores diferentes para cada um.
// - Execute uma sequência de ações, por exemplo:
// ligar → acelerar → acelerar → status → frear → status → desligar