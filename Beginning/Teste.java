import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour;

    System.out.println("What time is it? ");
    hour = sc.nextInt();

    if (hour < 12) {
      System.out.println("Good Morning!");
    } else if (hour < 18) {
      System.out.println("Good Evening!");
    } else {
      System.out.println("Good Night!");  
    }
    sc.close();
  }
}