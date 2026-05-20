public class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;

    public void status(){
    System.out.print("Nome: " + this.nome);
    System.out.print("\nIdade: " + this.idade);
    System.out.print("\nFalando: " + (this.falando ? "Sim" : "Não"));
    System.out.println("\nComendo: " + (this.comendo ? "Sim" : "Não"));
    }
    public void falar(){
        if(falando == true){
            System.out.println(this.nome + " ja esta falando ");
        } else if(comendo){
            System.out.println(this.nome + " esta comendo ");
        }else{
            System.out.println(this.nome + " comecou a falar ");
            this.falando = true;
        }
    }
    public void pararFalar(){
        this.falando = false;
    }
    public void comer(String alimento){
        this.comendo = true;
        System.out.println(this.nome + " Esta comendo " + alimento);
    }
    public void pararComer(){
        this.comendo = false;
    }
}