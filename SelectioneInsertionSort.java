import java.util.Scanner;

public class SelectioneInsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Atividade 1: Solicitar a quantidade de elementos do vetor
        System.out.print("Digite a quantidade de elementos do vetor: ");
        int n = sc.nextInt();

        // Atividade 2: Criar o vetor com o tamanho informado
        int[] vetor = new int[n];

        // Atividade 3: Solicitar a digitação de todos os valores
        for (int i = 0; i < n; i++) {
            System.out.print("Posição [" + (i + 1) + "]: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nValores digitados:");

        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}