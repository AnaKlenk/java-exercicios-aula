public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private int pagarMensal;
    private boolean status;

    //construtor
    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    public void statusAtual(){
        System.out.println("-------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
    //Tipo da conta vai aceitar apenas 2 valores, ou poupança ou corrente: cc > corrente e cp > poupança
    public void abrirConta(){
        status = true;
        if (getTipo() == "CC") {
            setSaldo(50);
        } else if (getTipo() == "CP") {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }
    // 2 - Método de abrir conta, na hora de abrir a conta eu mudo o status para verdadeiro, se a conta estiver fechada é falso
    public void fecharConta(){
        if (getStatus()){
            if (getSaldo() > 0){
                System.out.println("A conta não pode ser fechada porque ainda tem dinheiro!");
            } else if(getSaldo() < 0){
                System.out.println("A consta não pode ser fechada porque esta em debito!");
            } else{
                System.out.println("Conta fechada.");
                this.status = false;
            }
        }else {
            System.out.println("Não ha conta para fechar");
        }
    }
    // 4 - Método depositar, para fazer um depósito ela tem que estar aberta.
    public float depositar(int v){
        if (getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("deposito feito na conta de: " + getNome());
        }else{
        System.out.println("Não ha conta para depoistar");
        }
        return getSaldo();
    }
    // 5 -  Método sacar, também tem que estar aberta e também terá que ter saldo para fazer o saque.
    public float sacar(int v){
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            }
        }
        System.out.println("Saque feito na conta de: " + getNome());
        return getSaldo();
    }
    // 6 - Método de pagar mensalidade, no momento que chamar a mensalidade será cobrada do saldo, cada vez que o metodo for chamado o cliente da CC vai pagar 12 reais de mensalidade e poupança 20REais
    public String pagarMensal(String t){
        if (getTipo() == "CC") {
            setSaldo(getSaldo() - 12);
        } else if (getTipo() == "CP"){
            setSaldo(getSaldo() - 20);
        }
        return getTipo();
    } 
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getPagarMensal() {
        return pagarMensal;
    }

    public void setPagarMensal(int pagarMensal) {
        this.pagarMensal = pagarMensal;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    }

// A Classe vai ter:
// +numConta            +abrirConta()
// #tipo                        +fecharConta()
// -dono                      +depositar()     
// -saldo                      +sacar()
// -status                     +pagarMensal()

// 1 - Tipo da conta vai aceitar apenas 2 valores, ou poupança ou corrente: cc > corrente e cp > poupança
// 2 - Método de abrir conta, na hora de abrir a conta eu mudo o status para verdadeiro, se a conta estiver fechada é falso. Na hora de criar uma conta, voce vai declarar se ela é corrente ou poupança. Se for corrente ele ganha 50 R$, se for poupança ele começa com R$ 150.
// 3 - Método fechar conta, para fechar conta ele não pode ter dinheiro lá dentro, nem debito.
// 4 - Método depositar, para fazer um depósito ela tem que estar aberta.
// 5 -  Método sacar, também tem que estar aberta e também terá que ter saldo para fazer o saque.
// 6 - Método de pagar mensalidade, no momento que chamar a mensalidade será cobrada do saldo, cada vez que o metodo for chamado o cliente da CC vai pagar 12 reais de mensalidade e poupança 20REais

// Atributo numero da conta, terá getnumConta e setnumConta(), todos atributos terão get ou setter.

// Também teremos um método construtor, nesse método sempre que uma nova conta for criada o seu status vai ser definido como fechada e o saldo como 0.