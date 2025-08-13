package challenges.level.one;

import java.util.ArrayList;
import java.util.List;

public class operadoresBit_a_Bit {

    public static void main(String[] args){

        //Representação Binária
        List<String> lista1_a_10 = new ArrayList<>();
        for (int i =10; i<=12; i++){
            var binaryValue=Integer.toBinaryString(i);
            lista1_a_10.add(binaryValue);
            // Acessa o último elemento que foi adicionado (índice: tamanho da lista - 1)
            int lastIndex = lista1_a_10.size() - 1;
            String lastAddedElement = lista1_a_10.get(lastIndex);

            System.out.printf("Número atual: %d (Representação Binária: %s)\n", i, lastAddedElement);

        }

        var value1 = lista1_a_10.get(0);
        var value2 = lista1_a_10.get(2);

        // Converte as strings para inteiros (base 2 para binário)
        var value1_int = Integer.parseInt(value1, 2); // 1
        var value2_int = Integer.parseInt(value2, 2); // 2


        var result1 = value1_int | value2_int;
        var binaryValue1 = Integer.toBinaryString(result1);
        System.out.printf("%s | %s = %s  ( Representação Binária: %s )\n", value1_int, value2_int, result1, binaryValue1);

        var result2 = value1_int & value2_int;
        var binaryValue2 = Integer.toBinaryString(result2);
        System.out.printf("%s & %s = %s  ( Representação Binária: %s )\n", value1_int, value2_int, result2, binaryValue2);


        var result3 = value1_int ^ value2_int;
        var binaryValue3 = Integer.toBinaryString(result3);
        System.out.printf("%s ^ %s = %s  ( Representação Binária: %s )\n", value1_int, value2_int, result3, binaryValue3);

        var result4 = ~value1_int;
        var binaryValue4 = Integer.toBinaryString(result4);
        System.out.printf("~%s = %s  ( Representação Binária: %s )\n", value1_int, result4, binaryValue4);

        var result5 = value1_int << value2_int;
        var binaryValue5 = Integer.toBinaryString(result5);
        System.out.printf("%s << %s = %s  ( Representação Binária: %s )\n", value1_int, value2_int, result5, binaryValue5);

        var result6 = value1_int >> value2_int;
        var binaryValue6 = Integer.toBinaryString(result6);
        System.out.printf("%s >> %s = %s  ( Representação Binária: %s )\n", value1_int, value2_int, result6, binaryValue6);

        var binarioDeOito = Integer.toBinaryString(8);
        System.out.printf("8 ( Representação Binária: %s )\n",binarioDeOito);
        var binarioDeDois = Integer.toBinaryString(2);
        System.out.printf("2 ( Representação Binária: %s )\n",binarioDeDois);

        var resultado1 = -8 >> 2;
        var binario1 = Integer.toBinaryString(resultado1);
        System.out.printf("-8 >> 2 = %s  ( Representação Binária: %s )\n",resultado1, binario1);

        var resultado2 = 8 >> 2;
        var binario2 = Integer.toBinaryString(resultado2);

        System.out.printf("8 >> 2 = %s  ( Representação Binária: %s )\n",resultado2, binario2);

        var result7 = value1_int >>> value2_int;
        var binaryValue7 = Integer.toBinaryString(result7);
        System.out.printf("%s >>> %s = %s  ( Representação Binária: %s )\n", value1_int, value2_int, result7, binaryValue7);


        System.out.printf("8 ( Representação Binária: %s )\n",binarioDeOito);
        System.out.printf("2 ( Representação Binária: %s )\n",binarioDeDois);

        var resultado3 = -8 >>> 2;
        var binario3 = Integer.toBinaryString(resultado3);
        System.out.printf("-8 >>> 2 = %s  ( Representação Binária: %s )\n",resultado3, binario3);

        var resultado4 = 8 >>> 2;
        var binario4 = Integer.toBinaryString(resultado4);

        System.out.printf("8 >>> 2 = %s  ( Representação Binária: %s )\n",resultado4, binario4);


    }


    /*

      0 = Represnta o false
      1 = Representa o true
      OBS: Os zeros a esquerda não aparecem no print

    * Número 10 == 1010
    * Número 12 == 1100
    * O operador | realização uma compração OU da seguinte maneira:
    * primeira casa do número 10 binário com a primeira casa do número 12 binário, no caso 1 ou 1 e o mesmo acontece para o restante das casas.
    * Se compararmos o 10 e o 11 veremos que o resultado será 11 devido a posição e os valores de cada casa.
    * O mesmo processo acontecer com o operador &, mas se comportando como o & na parte da comparação.
    * O operador ^ percorrer as casas e caso os números sejam iguais ele retorna 0 e se foram diferentes ele retorna 1
    * Funciona da mesma forma que NOT, percorreu todas casas existentes e onde encontrou 0 transformou em 1 e onde encotrou 1 transformou em 0. EX: 10==1010 ~10==0101
    *
    * SHIFT OPERATORS
    * O operador << deslocar os bits x (ou value2) posições para a esquerda ou seja se eu tenho 10==1010 ele se tornará 1010000000000000
    * O operador >> deslocar os bits a direita e verifica se o número a ser delocado é positivo ou negativo, se o número for positivo ele completa com o e se for negativo ele completa com 1.
    * EX: 8==1000 com o shift de 2 bits ele vai virar 0010, quando usamos o -8 veremos uma grande quantidade 1 a esquerda devido ao comportamento do shift com números negativos
    * O operador >>> se comporta de forma familiar com o >>, porém ele não faz a distinção de número positivo e número negativo, sempre preenchendo as casas a esquerda com 0
    *
    */




}
