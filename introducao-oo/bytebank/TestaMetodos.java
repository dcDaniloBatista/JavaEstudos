public class TestaMetodos {
    
    public static void main(String[] args) {
        
        Conta contaInicial = new Conta();
        Cliente contaTitular = new Cliente();

        contaInicial.setTitular(contaTitular);
        
        contaTitular.setNome("Danilo Batista");
        contaTitular.setCpf("12345678900");
        contaTitular.setProfissao("Designer");
        contaInicial.setAgencia(11112);
        contaInicial.setNumero(555556);

        Conta contaDestino = new Conta();
        Cliente contaTitularDestino = new Cliente();

        contaTitularDestino.setNome("Julio Silva");
        contaTitularDestino.setCpf("98765432100");
        contaTitularDestino.setProfissao("Desenvolvedor");
        contaDestino.setAgencia(44445);
        contaDestino.setNumero(99990);

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