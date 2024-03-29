import java.util.Scanner;
public class whileNelio {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número até acertar o correto: ");
    int x = sc.nextInt();

    while (x != 0) {
      System.out.println("Número incorreto, digite novamente: ");
      x = sc.nextInt();
    } // Repete até acertar a condição 

    if (x == 0){
      System.out.println("Parabéns, você acertou o número");
    }


    sc.close();
    }
}
