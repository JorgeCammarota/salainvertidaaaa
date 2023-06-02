package Sala_invertida;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior = -5000000;
        for (int i = 0; i < 5; i++){
            System.out.println("digite um número");
            int digiteumnumero = sc.nextInt();
            if (digiteumnumero > maior){
                maior = digiteumnumero;
            }
        }
        System.out.println("o maior número é" + maior);
    }
}

