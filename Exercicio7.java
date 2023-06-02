package Sala_invertida;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            System.out.println("digite um número");
            int digiteumnumero = sc.nextInt();
            lista.add(digiteumnumero);
        }
        System.out.println(lista);
    }
}