public class TestaMetodos {
    
    public static void main(String[] args) {
        
        Conta contaInicial = new Conta();
        contaInicial.titular = "Danilo Batista";
        contaInicial.agencia = 11112;
        contaInicial.numero = 555556;
        contaInicial.saldo = 0;

        Conta contaDestino = new Conta();
        contaDestino.titular = "Julio Silva";
        contaDestino.agencia = 44445;
        contaDestino.numero = 99990;
        contaDestino.saldo = 0;

        System.out.println("\n*********************** BYTEBANK ***********************");
        contaInicial.impressao();
        contaDestino.impressao();
        System.out.println("\n********************************************************");

        contaInicial.deposita(240);
        contaDestino.deposita(300);

        System.out.println("\n*********************** BYTEBANK ***********************");
        contaInicial.impressao();
        contaDestino.impressao();
        System.out.println("\n********************************************************");

        contaDestino.saca(300);
        contaInicial.transfere(contaDestino, 1000);

        System.out.println("\n*********************** BYTEBANK ***********************");
        contaInicial.impressao();
        contaDestino.impressao();
        System.out.println("\n********************************************************");
    }
}