package challenges.level.one;

import java.util.Scanner;

public class trezentosDeEsparta {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu palpite: ");

        int palpite = teclado.nextInt();

        while(palpite!=3000){

            String msg = palpite < 1000 ?"Um pouco mais..." : "Um pouco menos...";
            System.out.println(msg);


            System.out.println("Digite seu próximo palpite");
            palpite = teclado.nextInt();
        }
        System.out.println("Parabéns! Seremos 300 contra 3.000 persas");
    }
}
