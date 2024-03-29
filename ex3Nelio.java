import java.util.Scanner;

public class ex3Nelio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2;
    System.out.println("Enter a number: ");
    n1 = sc.nextInt();

    System.out.println("Enter another number: ");
    n2 = sc.nextInt();

    if (n1 % n2 == 0 || n2 % n1 ==0) {
      System.out.println("These numbers are multiples!");
    } else {
      System.out.println("These numbers are not multiples!");
    }
    sc.close();
  }
}