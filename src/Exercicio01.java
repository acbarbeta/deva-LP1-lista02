import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int x = input.nextInt();

        if ((x % 2 != 0) || ((x % 2 == 0) && (x>=6 && x<=20))) {
            System.out.println("Weird");
        } else if (((x % 2 == 0) && (x >= 2 && x <= 5)) || ((x % 2 == 0) && (x > 20))) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Entrada inválida.");
        }
    }
}