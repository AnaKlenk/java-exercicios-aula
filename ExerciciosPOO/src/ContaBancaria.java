public class ContaBancaria {
    String titular;
    float saldo;
    float valor;

    public void status(){
        System.out.println(this.titular);
        System.out.println("saldo: " + this.saldo);
    }
    public void depositar(){
        saldo += valor;
        System.out.println("Voce depositou: "+ saldo);
        
    }
    public void sacar(){
        if(this.saldo <= this.valor){
            System.out.println("Voce pode sacar!");
            valor -= saldo;

        }else {
            System.out.println("Você não pode sacar");
        }
    }
}
