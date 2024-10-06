//Cálculo de conta de água
/*
 A empresa local de abastecimento de água, a Saneamento Básico da Cidade (SBC),
está promovendo uma campanha de conservação de água, distribuindo cartilhas e
promovendo ações demonstrando a importância da água para a vida e para o meio
ambiente. Para incentivar mais ainda a economia de água, a SBC alterou os preços
de seu fornecimento de forma que, proporcionalmente, aqueles clientes que
consumirem menos água paguem menos pelo metro cúbico.
Todo cliente paga mensalmente uma assinatura de R$ 7, que inclui uma franquia de
10 m3 de água. Isto é, para qualquer consumo entre 0 e 10 m3, o consumidor paga a
mesma quantia de R$ 7 reais (note que o valor da assinatura deve ser pago mesmo
que o consumidor não tenha consumido água). Acima de 10 m3, cada metro cúbico
subsequente tem um valor diferente, dependendo da faixa de consumo. A SBC
cobra apenas por quantidades inteiras de metros cúbicos consumidos. A tabela
abaixo especifica o preço por metro cúbico para cada faixa de consumo:

 */
import java.util.Scanner;

public class ExercicioS05E22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o consumo de água em metros cúbicos:");
        int consumo = sc.nextInt();

        sc.close();
        int franquia = 7;
        int faixaPreco1 = 1;
        int faixaPreco2 = 2;
        int faixaPreco3 = 5;
        int contaTotal = 0;
        
        if (consumo <= 10) {
            contaTotal = franquia;
        } else if (consumo <= 30) {
            contaTotal = franquia + ((consumo - 10) * faixaPreco1);
        } else if (consumo <= 100) {
            contaTotal = franquia + (20 * faixaPreco1) + ((consumo - 30) * faixaPreco2);
        } else if (consumo > 100) {
            contaTotal = franquia + (20 * faixaPreco1) + (70 * faixaPreco2) + ((consumo - 100) * faixaPreco3);
        }

        System.out.println("Valor em reais: " + contaTotal);






        
    }
}
