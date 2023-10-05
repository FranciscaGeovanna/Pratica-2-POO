import java.util.Scanner;

public class pratica2 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        int op;
        int num1;
        int num2;

        System.out.printf("Escolha a operação que deseja fazer: \n");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICAÇÃO");

        op = resposta.nextInt();

        System.out.print("Informe o primeiro número: ");
        num1 = resposta.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = resposta.nextInt();
    }
}
