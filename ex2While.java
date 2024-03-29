import java.util.Scanner;

public class ex2While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type a number at quadrant X:");
    int x = sc.nextInt();
    System.out.println("Type a number at quadrant  Y:");
    int y = sc.nextInt();

    while (x != 0 || y != 0) {
      if (x > 1 && y > 1) { // certo
        System.out.println("First quadrant");
        System.out.println("Type again X:");
        x = sc.nextInt();
        System.out.println("Type again Y:");
        y = sc.nextInt();
      }
      else if (x < 0 && y > 0) {
        System.out.println("Second Quadrant!");
        System.out.println("Type again X:");
        x = sc.nextInt();
        System.out.println("Type again Y:");
        y = sc.nextInt();
      } 
      else if (x < 0 && y < 0) {
        System.out.println("Third Quadrant!");
        System.out.println("Type again X:");
        x = sc.nextInt();
        System.out.println("Type againY:");
        y = sc.nextInt();
      }
      else if (x > 1 && y < 0) { 
        System.out.println("Fourth Quadrant!");
        System.out.println("Type again X:");
        x = sc.nextInt();
        System.out.println("Type again Y:");
        y = sc.nextInt();
      } 
      if (x == 0 || y == 0) {
        System.out.println("No one!");
        break;
      }
    }
    sc.close();
  }
}
