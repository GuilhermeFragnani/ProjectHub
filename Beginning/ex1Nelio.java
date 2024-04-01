import java.util.Scanner;

public class ex1Nelio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1;
    System.out.println("Type a number: ");
    n1 = sc.nextInt();

    if (n1 >= 0) {
      System.out.println("This number is positive!");
    } else {
      System.out.println("This number is negative!");
      sc.close();
      // comentario
    }
  }
}
