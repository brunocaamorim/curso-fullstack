// Reajuste de salário

/*
 Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder
aumentos salariais a seus funcionários. Aqueles com salário superior a R$500, terão
aumento de 10%, enquanto os que ganham mais de R$300 terão aumento de 7%. Os
demais funcionários terão aumento de apenas 5%. Escreva um programa que
receba como entrada o salário atual de um funcionário, calcule e exiba o valor de
seu novo salário já com o aumento concedido.
 */

 import java.util.Scanner;

public class ExercicioS05E19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o salário atual do funcionário?");
        double salario = sc.nextDouble();

        sc.close();

        double percentual;

        if (salario > 500) {
            percentual = 0.10;
        } else if (salario > 300) {
            percentual = 0.07;
        } else {
            percentual = 0.05;
        }

        double novoSalario = salario * (1 + percentual);
        
        System.out.printf("Novo salário: R$ %.2f", novoSalario);







        
    }
    
}
