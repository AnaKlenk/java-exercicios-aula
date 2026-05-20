public class Carro {
    public String marca;
    public String modelo;
    public int velocidade = 0;
    public boolean ligado;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public boolean Ligado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar(){
        this.setLigado(true);;
        System.out.println("Carro ligado!\n");
    }
    public void desligar(){
        this.setLigado(false);
        System.out.println("Carro desligado!\n");
    }
    public void acelerar(){
        if (ligado == true){
            this.setVelocidade(velocidade += 10);
            System.out.println("Acelerando!\n");
        }
        else{
            System.out.println("Não é possível acelerar, carro desligado!\n");
        }
    }
    public void freiar(){
        if(ligado == true){
            this.setVelocidade(velocidade -= 10);
            System.out.println("Freiando!\n");
        }
    }
    public void status(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Ligado: " + ligado);

    }
}
// Marca, modelo, velocidade e se está ligado
// ou desligado
