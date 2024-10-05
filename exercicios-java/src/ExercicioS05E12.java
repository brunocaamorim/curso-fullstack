// Classificação de animais
/*
 Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível
segundo o esquema abaixo, da esquerda para a direita. Em seguida conclua qual
dos animais seguintes foi escolhido, através das três palavras fornecidas.
 */
import java.util.Scanner;

public class ExercicioS05E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe se o animal é: vertebrado ou invertebrado?");
        String palavra1 = sc.nextLine().trim(); //coloquei 'trim()' para remover os espaços em branco por ventura incluídos

        System.out.println("Informe se o animmal é: ave, mamifero, inseto ou anelideo?");
        String palavra2 = sc.nextLine().trim();
        
        System.out.println("Informe se o animmal é: carnivoro, onivoro, herbivoro ou hematofago?");
        String palavra3 = sc.nextLine().trim();

        sc.close();

        //inseri 'equalsIgnoreCase()' para ignorar maiúsculas e minúsculas.

        if (palavra1 .equalsIgnoreCase("vertebrado") && palavra2 .equalsIgnoreCase("ave") && palavra3 .equalsIgnoreCase("carnivoro")){
            System.out.println("águia");
        } else if (palavra1 .equalsIgnoreCase("vertebrado") && palavra2 .equalsIgnoreCase("ave") && palavra3 .equalsIgnoreCase("onivoro")){
            System.out.println("pomba");
        } else if (palavra1 .equalsIgnoreCase("vertebrado") && palavra2 .equalsIgnoreCase("mamifero") && palavra3 .equalsIgnoreCase("onivoro")){
            System.out.println("homem");
        } else if (palavra1 .equalsIgnoreCase("vertebrado") && palavra2 .equalsIgnoreCase("mamifero") && palavra3 .equalsIgnoreCase("herbivoro")){
            System.out.println("vaca");
        } else if (palavra1 .equalsIgnoreCase("invertebrado") && palavra2 .equalsIgnoreCase("inseto") && palavra3 .equalsIgnoreCase("hematofago")){
            System.out.println("pulga");
        } else if (palavra1 .equalsIgnoreCase("invertebrado") && palavra2 .equalsIgnoreCase("inseto") && palavra3 .equalsIgnoreCase("herbivoro")){
            System.out.println("lagarta");
        } else if (palavra1 .equalsIgnoreCase("invertebrado") && palavra2 .equalsIgnoreCase("anelideo") && palavra3 .equalsIgnoreCase("hematofago")){
            System.out.println("sanguessuga");
        } else if (palavra1 .equalsIgnoreCase("invertebrado") && palavra2 .equalsIgnoreCase("anelideo") && palavra3 .equalsIgnoreCase("onivoro")){
            System.out.println("minhoca");
        } else {
            System.out.println("Alguma das informações foi escrita errado");
        }
        }


    }
