import java.util.Scanner;

public class SistemaLogin {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String usuarioCorreto = "admin";
    String senhaCorreta = "1234";

    String usuario;
    String senha;

    int tentativas = 0;
    int tentativasMax = 3;

    System.out.println("========= LOGIN =========");

    while (tentativas < tentativasMax) {

      System.out.println("\nDigite o seu nome de usuário: ");
      usuario = sc.nextLine();

      System.out.println("\nDigite a sua senha: ");
      senha = sc.nextLine();

      if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {

        System.out.println("\nLogin realizado com sucesso!");
        break;
      } else {
        tentativas++;

        if (tentativas < tentativasMax) {
          System.out.println("\nUsuário ou senha incorretos.");
          System.out.println("Tentativas restantes: " + (tentativasMax - tentativas));
        } else {
          System.out.println("\nNúmero máximo de tentativas atingido.");
          System.out.println("Tente novamente mais tarde.");
        }
      }
    }

    sc.close();
  }
}
