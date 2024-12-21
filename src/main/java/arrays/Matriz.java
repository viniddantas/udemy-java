package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma.length; n++) {
                System.out.print("Digite a nota " + (n+1) + " do aluno " + (a+1) + " ");
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        System.out.print("A media total da sala foi: " + (total/(qtdeAlunos*qtdeNotas)));
    }
}
