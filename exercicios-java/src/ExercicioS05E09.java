// Duração de evento
/*Faça um programa que receba via teclado o tempo de duração de um evento em
uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e
mostre-o expresso em horas, minutos e segundos. */

import java.util.Scanner;

public class ExercicioS05E09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a duração do evento em segundos: ");
        int duracao = sc.nextInt();

        sc.close();

        int horas = duracao / 3600;
        int restohoras = duracao % 3600;
        int minutos = restohoras / 60;
        int segundos = restohoras % 60;

        System.out.printf("HH:MM:SS = %02d:%02d:%02d", horas, minutos, segundos);

    }
    
}
