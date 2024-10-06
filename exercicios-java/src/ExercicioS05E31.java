import java.util.Scanner;

public class ExercicioS05E31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua primeira nota: ");
        double nota1 = sc.nextDouble();

        if (nota1 < 0 || nota1 > 10) {
            System.out.println("NOTA 1 INVÁLIDA");
        } else {
            System.out.println("Informe sua segunda nota: ");
            double nota2 = sc.nextDouble();

            if (nota2 < 0 || nota2 > 10) {
                System.out.println("NOTA 2 INVÁLIDA");
            } else {
                System.out.println("MÉDIA = " + ((nota1 + nota2) / 2));
            }

        }

    sc.close();

    }
    
}
