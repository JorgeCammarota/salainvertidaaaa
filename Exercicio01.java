package Sala_invertida;

import java.util.Scanner;
  class Exercicio1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor do produto 1:");
            double valor1 = sc.nextDouble();

            System.out.println("Digite o valor do produto 2:");
            double valor2 = sc.nextDouble();

            System.out.println("Digite o valor do produto 3:");
            double valor3 = sc.nextDouble();

            if (valor1 <= valor2 && valor1 <= valor3) {
                System.out.println("Produto 1 é o mais barato");
            }

            if (valor2 <= valor1 && valor2 <= valor3) {
                System.out.println("Produto 2 é o mais barato");
            }

            if (valor3 <= valor1 && valor3 <= valor2) {
                System.out.println("Produto 3 é o mais barato");
            }
        }
    }

