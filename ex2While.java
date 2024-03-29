import java.util.Scanner;

public class ex2While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numero no quadrante X:");
    int x = sc.nextInt();
    System.out.println("Digite o numero no quadrante Y:");
    int y = sc.nextInt();

    while (x != 0 || y != 0) {
      if (x > 1 && y > 1) { // certo
        System.out.println("Primeiro Quadrante");
        System.out.println("Digite novamente o de X:");
        x = sc.nextInt();
        System.out.println("Digite novamente o de Y:");
        y = sc.nextInt();
      }
      else if (x < 0 && y > 0) {
        System.out.println("Segundo Quadrante!");
        System.out.println("Digite novamente o de X:");
        x = sc.nextInt();
        System.out.println("Digite novamente o de Y:");
        y = sc.nextInt();
      } 
      else if (x < 0 && y < 0) {
        System.out.println("Terceiro Quadrante!");
        System.out.println("Digite novamente o de X:");
        x = sc.nextInt();
        System.out.println("Digite novamente o de Y:");
        y = sc.nextInt();
      }
      else if (x > 1 && y < 0) { 
        System.out.println("Quarto Quadrante!");
        System.out.println("Digite novamente o de X:");
        x = sc.nextInt();
        System.out.println("Digite novamente o de Y:");
        y = sc.nextInt();
      } 
      if (x == 0 || y == 0) {
        System.out.println();
        break;
      }
    }
    sc.close();
  }
}
