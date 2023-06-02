package Sala_invertida;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro número");
        int numerodatabuada = sc.nextInt();
        for ( int i = 0; i <  11; i++) {
            System.out.println(numerodatabuada + "*" + i + "=" + (numerodatabuada * i ));


        }
    }

}
