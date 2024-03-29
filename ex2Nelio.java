import java.util.Scanner;
public class ex2Nelio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1;
  System.out.println("Digite um numero: ");
  n1 = sc.nextInt();
  
  if (n1 % 2 == 0){
    System.out.println("Esse número é Par!");
    } else {
      System.out.println("Esse número é Impar");
    
    sc.close();
    }
  }
}
