public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        System.out.println("\nEndereço de memória: " + primeiraConta);
        Conta segundaConta = new Conta();
        System.out.println("Endereço de memória: " + segundaConta);

        primeiraConta.deposita(200.0);
        System.out.println("\n*********************** BYTEBANK ***********************");
        primeiraConta.impressao();
        segundaConta.impressao();
        System.out.println("\n********************************************************");

        primeiraConta.deposita(100.0);
        System.out.println("\n************** BYTEBANK **************");
        primeiraConta.impressao();
        segundaConta.impressao();
        System.out.println("\n**************************************");

        segundaConta.deposita(50.0);
        System.out.println("\n************** BYTEBANK **************");
        primeiraConta.impressao();
        segundaConta.impressao();
        System.out.println("\n**************************************");
    }

}