import java.util.Scanner;

public class ex1While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type the 4 digit password:");
    int password = sc.nextInt();

    while (password != 2002) {
      System.out.println("Incorrect, type again: ");
      password = sc.nextInt();
    }
    if (password == 2002) {
      System.out.println("Access allowed");
    }
    sc.close();
  }
}
