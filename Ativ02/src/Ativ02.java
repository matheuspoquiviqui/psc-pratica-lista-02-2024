import java.util.Scanner;

public class Ativ02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        char continuar = 's'; 

        while (continuar == 's') {
            System.out.print("Qual operação matemática deseja fazer? (+), (-), (*), (/): ");
            char operador = scanner.next().charAt(0);
            System.out.print("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            double resultado = 0;
            switch (operador) {
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    if (n2 != 0) {
                        resultado = n1 / n2;
                    } else {
                        System.out.println("ERRO: Divisão por 0 não é permitida");
                        return;
                    }
                    break;
                default:
                    System.out.println("Erro: Símbolo de operação inválido!");
                    break;
            }
            System.out.println("Resultado: " + n1 + " " + operador + " " + n2 + " = " + resultado);
            System.out.print("Deseja fazer outra operação? (s) ou (n): ");
            continuar = scanner.next().charAt(0);
        }
        System.out.println("Programa encerrado!");
        scanner.close();
    }
}