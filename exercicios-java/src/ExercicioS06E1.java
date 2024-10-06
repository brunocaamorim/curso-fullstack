//Desafio 1

public class ExercicioS06E1 {
    public static void main(String[] args) {

        long quantidade = 1;
        long soma = 1;

        System.out.println("Casa 1 - Qtd: 1 - Soma: 1");

        for (int i = 2; i <= 64; i++){
            quantidade = 2 * quantidade;
            soma = soma + quantidade;
            
            
            System.out.println("Casa " + i + " - Qtd: " + quantidade + " - Soma: " + soma);
        }

        




    }
}
