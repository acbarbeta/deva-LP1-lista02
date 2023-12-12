import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que deseja multiplicar: ");
        int fator = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int produto = fator * i;
            System.out.printf("%d x %d = %d%n", fator, i, produto);
        }
    }
}
