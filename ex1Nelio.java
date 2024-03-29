import java.util.Scanner;
public class ex1Nelio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  int n1;
  System.out.println("Digite um numero: ");
  n1 = sc.nextInt();
  
  if (n1 >= 0){
    System.out.println("Esse número é positivo!");
    }else{
      System.out.println("Esse número é negativo!");
      sc.close();
    }
  }
}
