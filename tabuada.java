import java.util.Scanner;

public class tabuada {
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        int r; 

        do{
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - DIVISÃO");
            System.out.println("4 - MULTIPLICAÇÃO");
            System.out.print("\nQual tabuada deseja? ");
            int tab = resposta.nextInt(); 

            if (tab == 0 || tab > 4){
                System.out.print("\nPor favor digite uma opção válida!");
                break;
            }

            System.out.print("Informe o número para ver sua tabuada: ");
            int num = resposta.nextInt();

            for(int i = 1; i <= 10; i++){
                if (tab == 1){
                    int soma = num + i;
                    System.out.printf("\n%2d + %2d = %2d", num, i, soma);
                }
                else if (tab == 4){
                    int mult = num * i;
                    System.out.printf("\n%2d * %2d = %2d", num, i, mult);
                }
            }

            if (tab == 2){ 
                for (int j = num; j <= (num + 10); j++){
                    int sub = j - num;
                    System.out.printf("\n%2d - %2d = %2d", j, num, sub);
                }
            }
            else if (tab == 3){
                for (int j = num; j <= num * 10; j++){
                    if (j % num == 0){
                        int div = j / num;
                        System.out.printf("\n%2d / %2d = %2d", j, num, div);
                    }
                }
            }

            System.out.print("\n\nDeseja ver mais alguma tabuada? Digite 0 para NÃO e 1 para SIM: ");
            r = resposta.nextInt();

            if(r == 0){
                System.out.println("\nEncerrando programa...");
            }

        } while(r == 1);

        resposta.close();
    }
}