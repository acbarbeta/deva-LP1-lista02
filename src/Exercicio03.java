import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas notas serão usadas na média? ");
        int numeroDeNotas = input.nextInt();

        double somaDasNotas = 0;

        for (int nota = 0; nota < numeroDeNotas; nota++) {
            System.out.println("Insira o valor da nota " + (nota+1));
            double notaAtual = input.nextDouble();

            somaDasNotas += notaAtual;
        }

        double media = somaDasNotas / numeroDeNotas;

        System.out.printf("A média das notas é : %.2f", media );
    }
}
