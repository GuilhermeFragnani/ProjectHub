import java.util.Scanner;

public class ex1While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a senha de 4 dígitos:");
    int senha = sc.nextInt();

    while (senha != 2002) {
      System.out.println("Senha incorreta, digite novamente: ");
      senha = sc.nextInt();
    }
    if (senha == 2002) {
      System.out.println("Acesso permitido");
    }
    sc.close();
  }
}
