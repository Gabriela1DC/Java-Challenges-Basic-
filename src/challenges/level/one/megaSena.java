package challenges.level.one;

import java.util.Scanner;

public class megaSena {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu palpite: ");

        int palpite = teclado.nextInt();

        while(palpite!=1000){

            String msg = palpite < 1000 ?"Um pouco mais..." : "Um pouco menos...";
            System.out.println(msg);


            System.out.println("Digite seu próximo palpite");
            palpite = teclado.nextInt();
        }
        System.out.println("Parabéns! Você ganhou na Mega Sena");
    }
}
