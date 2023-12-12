import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = false;
        while (sair != true) {
            Menu();
            int operacao = input.nextInt();

            switch (operacao) {
                case 1:
                    Soma();
                    break;
                case 2:
                    Subtracao();
                    break;
                case 3:
                    Divisao();
                    break;
                case 4:
                    Multiplicacao();
                    break;
                case 5:
                    Resto();
                    break;
                case 6:
                    Raiz();
                    break;
                case 7:
                    Potencia();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Selecione uma opção válida");
                    break;

            }
        }


    }

    public static void Menu() {
        System.out.println("***************");
        System.out.println("CALCULADORA");
        System.out.println("*************** \n");
        System.out.println("Digite a opção correspondente à operação que deseja realizar:  \n");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Resto");
        System.out.println("6 - Raiz");
        System.out.println("7 - Potência");
        System.out.println("0 - Sair");

    }

    public static void Soma() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int soma = primeiroNumero + segundoNumero;

        System.out.printf("%d + %d = %d%n%n", primeiroNumero, segundoNumero, soma);
    }

    public static void Subtracao() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int subtracao = primeiroNumero - segundoNumero;

        System.out.printf("%d - %d = %d%n%n", primeiroNumero, segundoNumero, subtracao);
    }

    public static void Divisao() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        int segundoNumero = 0;
        while (segundoNumero == 0) {
            System.out.println("Digite o segundo número");
            segundoNumero = input.nextInt();
            if (segundoNumero == 0) {
                System.out.println("Insira um número válido");
            }
        }
        double divisao = primeiroNumero / segundoNumero;

        System.out.printf("%d / % d = %.2f%n%n", primeiroNumero, segundoNumero, divisao);
    }

    public static void Multiplicacao() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int multiplicacao = primeiroNumero * segundoNumero;

        System.out.printf("%d * %d = %d%n%n", primeiroNumero, segundoNumero, multiplicacao);
    }

    public static void Resto() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = input.nextInt();
        int segundoNumero = 0;
        while (segundoNumero == 0) {
            System.out.println("Digite o segundo número");
            segundoNumero = input.nextInt();
            if (segundoNumero == 0) {
                System.out.println("Insira um número válido");
            }
        }

        int resto = primeiroNumero%segundoNumero;

        System.out.printf("%d %% %d = %d%n%n", primeiroNumero, segundoNumero, resto);
    }

    public static void Raiz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o radicando: ");
        int radicando = input.nextInt();

        double raiz = Math.sqrt(radicando);

        System.out.printf("%d ^(1/2) = %.2f%n%n", radicando, raiz);


    }

    public static void Potencia() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = input.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = input.nextInt();

        int potencia = (int) Math.pow(base, expoente);
        System.out.printf("%d ^ %d = %d%n%n", base, expoente, potencia);
    }

}
