package Sala_invertida;

    import java.util.Scanner;
    public class Exercicio02 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o número do dia da semana?");
            int dia = sc.nextInt();

            if (dia == 1) {
                System.out.println("O dia é domingo");
            } else if (dia == 2) {
                System.out.println("O dia é segunda-feira");
            } else if (dia == 3) {
                System.out.println("O dia é terça-feira");
            } else if (dia == 4) {
                System.out.println("O dia é quarta-feira");
            } else if (dia == 5) {
                System.out.println("O dia é quinta-feira");
            } else if (dia == 6) {
                System.out.println("O dia é sexta-feira");
            } else if (dia == 7) {
                System.out.println("O dia é sábado");
            } else {
                System.out.println("Valor inválido");
            }
        }
    }

