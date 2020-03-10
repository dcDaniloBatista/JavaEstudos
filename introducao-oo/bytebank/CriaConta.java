public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        System.out.println("\nEndereço de memória: " + primeiraConta);
        Conta segundaConta = new Conta();
        System.out.println("Endereço de memória: " + segundaConta);

        primeiraConta.saldo = 200.0;
        System.out.println("\n************** BYTEBANK **************");
        System.out.println("\n\tTitular:\t" + primeiraConta.titular);
        System.out.println("\n\tAgência:\t" + primeiraConta.agencia);
        System.out.println("\tConta:\t\t" + primeiraConta.numero);
        System.out.println("\n\tSaldo:\t\tR$ " + primeiraConta.saldo + "0");
        System.out.println("\n**************************************");

        primeiraConta.saldo += 100.0;
        System.out.println("\n************** BYTEBANK **************");
        System.out.println("\n\tTitular:\t" + primeiraConta.titular);
        System.out.println("\n\tAgência:\t" + primeiraConta.agencia);
        System.out.println("\tConta:\t\t" + primeiraConta.numero);
        System.out.println("\n\tSaldo:\t\tR$ " + primeiraConta.saldo + "0");
        System.out.println("\n**************************************");

        segundaConta.saldo = 50.0;
        System.out.println("\n************** BYTEBANK **************");
        System.out.println("\n\tTitular:\t" + segundaConta.titular);
        System.out.println("\n\tAgência:\t" + segundaConta.agencia);
        System.out.println("\tConta:\t\t" + segundaConta.numero);
        System.out.println("\n\tSaldo:\t\tR$ " + segundaConta.saldo + "0");
        System.out.println("\n**************************************");
    }

}