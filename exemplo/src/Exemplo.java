public class Exemplo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pessoa p1 = new Pessoa(); 
        p1.nome = "Ana";
        p1.idade = 22;
        p1.altura = 1.72f;
        p1.apresentar();

        Pessoa p2 = new Pessoa(); //criando objetos a partir da classe
        p2.nome = "Felipe";
        p2.idade = 22;
        p2.altura = 1.85f;
        p2.apresentar();
    }
}

