import java.util.Scanner;

public class ExercicioS05E40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura (em metros): ");
        float altura = sc.nextFloat();

        System.out.println("Informe seu peso (em Kg): ");
        float peso = sc.nextFloat();

        sc.close();

        if (altura <= 1.50) {
            if (peso < 50) {
                System.out.println("Engorde " + (50 - peso) + "Kg");
            } else if (peso > 50) {
                System.out.println("Emagreça " + (peso - 50) + "Kg");
            } else {
                System.out.println("Parabéns, peso ideal!");
            }
        }

        if (altura >= 1.51 && altura < 1.90) {
            if (peso < 70) {
                System.out.println("Engorde " + (70 - peso) + "Kg");
            } else if (peso > 70) {
                System.out.println("Emagreça " + (peso - 70) + "Kg");
            } else {
                System.out.println("Parabéns, peso ideal!");
            }
        }

        if (altura >= 1.91) {
            if (peso < 100) {
                System.out.println("Engorde " + (100 - peso) + "Kg");
            } else if (peso > 100) {
                System.out.println("Emagreça " + (peso - 100) + "Kg");
            } else {
                System.out.println("Parabéns, peso ideal!");
            }
        }






        
    }
    
}
