package challenges.level.one;

public class verificadorParidade {

    public static boolean ehPar(int numero) {
        // O operador '& 1' isola o último bit do número.
        // Se o último bit for 0, o número é par. Se for 1, é ímpar.
        return (numero & 1) == 0;
    }

    public static void main(String[] args) {
        int numeroPar = 10;
        int numeroImpar = 21;

        System.out.println(numeroPar + " é par? " + ehPar(numeroPar));     // Saída: true
        System.out.println(numeroImpar + " é par? " + ehPar(numeroImpar)); // Saída: false
    }

}

