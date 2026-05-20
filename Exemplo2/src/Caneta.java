public class Caneta {
    String cor;
    float ponta;
    boolean tampada;

    public void status(){
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.tampada);
        System.out.println();
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void rasbicar(){
        if(this.tampada == true){
            System.out.println("Estou tampada! Não posso rabiscar");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }
}
