
package challenges.level.one.fundamentos_e_estruturasDeControle.resolucoes;

import java.util.Scanner;

public class calculadoraSimples {

    /**
     * DESAFIO: Calculadora Simples
     * * Crie uma calculadora que recebe dois números e um operador (+, -, *, /).
     * Use um switch para determinar a operação a ser realizada.
     * Inclua um tratamento para operadores inválidos.
     * * Conceitos aplicados: switch, Scanner, operadores aritméticos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0.0;
        boolean operacaoValida = true;

        System.out.println("---- Calculadora Simples ----");

        // 1. Recebe o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // 2. Recebe o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // 3. Recebe o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // 4. Utiliza o switch para realizar a operação
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                // Trata o caso de divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                operacaoValida = false;
        }

        // 5. Imprime o resultado se a operação for válida
        if (operacaoValida) {
            System.out.printf("Resultado da operação: %.2f %c %.2f = %.2f%n",
                    numero1, operador, numero2, resultado);
        }

        scanner.close();
    }
}
