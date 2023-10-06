import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        int op;
        int num1;
        int num2;
        int r;
        
        do{
            System.out.print("\nEscolha a operação que deseja fazer: \n");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - DIVISÃO");
            System.out.println("4 - MULTIPLICAÇÃO");

            System.out.printf("\nInforme o número da operação escolhida: ");
            op = resposta.nextInt();

            if (op == 0 || op > 4){
                System.out.print("Por favor digite um número válido");
                break;
            }

            System.out.print("Informe o primeiro número: ");
            num1 = resposta.nextInt();
            System.out.print("Informe o segundo número: ");
            num2 = resposta.nextInt();

            if (op == 1){
                int soma = num1 + num2;
                System.out.printf("\nRESULTADO DA SOMA:\n %d + %d = %d\n", num1, num2, soma);
            }
            else if (op == 2){
                int subtracao = num1 - num2;
                System.out.printf("\nRESULTADO DA SUBTRAÇÃO:\n %d - %d = %d\n", num1, num2, subtracao);
            }
            else if (op == 3){
                int divisao = num1 / num2;
                System.out.printf("\nRESULTADO DA DIVISÃO:\n   %d / %d = %d\n", num1, num2, divisao);
            }
            else if (op == 4){
                int multiplicacao = num1 * num2;
                System.out.printf("\nRESULTADO DA MULTIPLICAÇÃO:\n %d * %d = %d\n", num1, num2, multiplicacao);
            }

            System.out.printf("\nDeseja fazer mais uma operação? ");
            System.out.printf("Digite 0 para NÃO e 1 para SIM: ");
            r = resposta.nextInt();

        } while (r == 1);
    }
}