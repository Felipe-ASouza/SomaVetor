import java.nio.channels.Pipe;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for(int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + vect[i];
        }
        double media = soma / n;

        System.out.print("Valores = ");
        for(int i = 0; i < n; i++){
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("\nSoma = %.2f%n", soma);
        System.out.printf("\nMédia = %.2f%n", media);
    }
}