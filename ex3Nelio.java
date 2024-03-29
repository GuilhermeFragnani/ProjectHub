import java.util.Scanner;

public class ex3Nelio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2;
    System.out.println("Digite um numero: ");
    n1 = sc.nextInt();

    System.out.println("Digite outro numero: ");
    n2 = sc.nextInt();

    if (n1 % n2 == 0 || n2 % n1 ==0) {
      System.out.println("Esses números SÃO múltiplos!");
    } else {
      System.out.println("Esses números NÃO são múltiplos");
    }
    sc.close();
  }
}