//Desconto em conta de energia
/*
 A ELETROSHOCK S.A. é uma empresa de distribuição de energia bastante justa
(pelo menos ela se diz ser!). Ela faz cobrança proporcional com a renda da família e
do bairro. O programa deve imprimir uma mensagem de erro caso o bairro digitado
seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da tabela,
não haverá desconto. Se a renda OU o consumo forem valores negativos, deve ser
emitida uma mensagem de erro.
O programa deve ler o código do bairro (S: Santa Ana; I: Industriários; T:
Tabatinga), a renda da família e o consumo em reais e obter o desconto de acordo
com a tabela abaixo:
 */
import java.util.Scanner;

public class ExercicioS05E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu bairro: (S) Santa Ana, (I) Industriários ou (T) Tabatinga?");
        String bairro = sc.nextLine();

        System.out.println("Qual sua renda?");
        double renda = sc.nextDouble();
        
        System.out.println("Qual o valor consumido?");
        double valorConsumo = sc.nextDouble();

        sc.close();

        int desconto = 0;

        if (!bairro.equalsIgnoreCase("S") && !bairro.equalsIgnoreCase("I") && !bairro.equalsIgnoreCase("T")){
            System.out.println("Bairro inválido");
        } else if (renda < 0 || valorConsumo < 0) {
            System.out.println("Renda e Consumo não podem ser negativos");
        } else if (bairro.equalsIgnoreCase("S") && renda >= 50 && renda <= 500){
            desconto = 50;
            System.out.printf("Valor a pagar: R$ %.2f", valorConsumo - desconto);
        } else if (bairro.equalsIgnoreCase("S") && renda > 500 && renda <= 1000) {
            desconto = 25;
            System.out.printf("Valor a pagar: R$ %.2f", valorConsumo - desconto);
        } else if (bairro.equalsIgnoreCase("I") && renda >= 240 && renda <= 1000) {
            desconto = 240;
            System.out.printf("Valor a pagar: R$ %.2f", valorConsumo - desconto);
        } else if (bairro.equalsIgnoreCase("I") && renda > 1000 && renda <= 5000) {
            desconto = 120;
            System.out.printf("Valor a pagar: R$ %.2f", valorConsumo - desconto);
        } else if (bairro.equalsIgnoreCase("T") && renda > 5000 && renda <= 10000){
            desconto = 720;
            System.out.printf("Valor a pagar: R$ %.2f", valorConsumo - desconto);
        } else if (bairro.equalsIgnoreCase("T") && renda > 10000 && renda <= 20000) {
            desconto = 360;
            System.out.printf("Valor a pagar: R$ %.2f", valorConsumo - desconto);
        }
    
        
        







    }
    
}
