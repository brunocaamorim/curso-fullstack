//Verificação de idade e altura

import java.util.Scanner;

public class ExercicioS05E26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua alteura em metros: ");
        float altura = sc.nextFloat();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.close();

        int brinquedo1;
        int brinquedo2;
        int brinquedo3;

        if (altura >= 1.5 && idade >= 12) {
            brinquedo1 = 1;
        } else {
            brinquedo1 = 0;
        } 
        
        if (altura >= 1.4 && idade >= 14) {
            brinquedo2 = 1;
        } else {
            brinquedo2 = 0;
        }

        if (altura >= 1.7 && idade >= 16) {
            brinquedo3 = 1;
        } else {
            brinquedo3 = 0;
        }

        System.out.println("A quantidade de brinquedos que a criança poderá brincar é: " + (brinquedo1 + brinquedo2 + brinquedo3)
        );





    }
}
