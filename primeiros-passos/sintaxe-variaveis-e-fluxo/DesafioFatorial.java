public class DesafioFatorial {

    public static void main(String[] args) {

        int fatorial = 0;

        for (int contador = 0; contador < 11; contador++){

            if (contador == 0){
                fatorial = 1;
            } else {
                fatorial *= contador;
            }
            System.out.println("O fatorial de " + contador + " é " + fatorial + ".");
        }

    }

}
