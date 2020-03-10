public class TestaCondicional2 {

    public static void main(String[] args) {

        System.out.println("Testa Condicionais\n");

        int idade = 21;
        int quantidadePessoas = 1;
        boolean acompanhado = true;

        if(idade >= 18 || quantidadePessoas >= 2){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente, você não pode entrar!");
        }

        if(idade >= 18 && quantidadePessoas >= 2){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente, você não pode entrar!");
        }

        if(idade >= 18 == acompanhado){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente, você não pode entrar!");
        }

        acompanhado = quantidadePessoas >= 2;

        if(idade >= 18 && acompanhado){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente, você não pode entrar!");
        }
    }

}
