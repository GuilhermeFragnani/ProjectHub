import java.util.Scanner;
public class ex2Nelio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1;
  System.out.println("Type a number: ");
  n1 = sc.nextInt();
  
  if (n1 % 2 == 0){
    System.out.println("This number is even!");
    } else {
      System.out.println("This number is odd!");
    
    sc.close();
    }
  }
}
