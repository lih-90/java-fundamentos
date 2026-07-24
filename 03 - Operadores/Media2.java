import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        if (nota1 < 0 || nota1 > 10 ||
            nota2 < 0 || nota2 > 10) {

            System.out.println("Nota inválida! Digite valores entre 0 e 10.");

        } else {

            double peso1 = 2;
            double peso2 = 3;

            double media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

            System.out.printf("Média: %.2f%n", media);
        }

        sc.close();
    }
}