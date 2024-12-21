package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double somaNotas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        int qntdNotas = scanner.nextInt();

        double[] notas = new double[qntdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i+1) + "° nota: ");
            double nota = scanner.nextDouble();
            notas[i] = nota;
        }


        for (double nota: notas) {
            somaNotas += nota;
        }

        System.out.println("A média do aluno é: " + somaNotas/notas.length);
    }
}
