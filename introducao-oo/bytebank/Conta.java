public class Conta {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("\n*********************** BYTEBANK ***********************");
            System.out.println("\n\tSaldo insuficiente!");
            System.out.println("\n********************************************************");
            return false;
        }
    }

    public boolean transfere(Conta contaDestino, double valor){
        if (this.saca(valor)){
            contaDestino.deposita(valor);
            System.out.println("\n*********************** BYTEBANK ***********************");
            System.out.println("\n\tTransferência foi realizada com sucesso!");
            System.out.println("\n********************************************************");
            return true;
        } else {
            return false;
        }

    }

    public void impressao(){
        System.out.println("\n\tTitular:\t" + titular.getNome());
        System.out.println("\n\tCPF:\t\t" + titular.getCpf());
        System.out.println("\n\tProfissão:\t" + titular.getProfissao());
        System.out.println("\n\tAgência:\t" + getAgencia());
        System.out.println("\tConta:\t\t" + getNumero());
        System.out.println("\n\tSaldo:\t\tR$ " + getSaldo() + "0\n");
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getNumero(){
        return this.numero;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public double getAgencia(){
        return this.agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

}