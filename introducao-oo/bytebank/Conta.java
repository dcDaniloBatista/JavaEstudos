public class Conta {

    int agencia;
    int numero;
    String titular;
    double saldo;

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
        System.out.println("\n\tTitular:\t" + this.titular);
        System.out.println("\n\tAgência:\t" + this.agencia);
        System.out.println("\tConta:\t\t" + this.numero);
        System.out.println("\n\tSaldo:\t\tR$ " + this.saldo + "0\n");
    }

}