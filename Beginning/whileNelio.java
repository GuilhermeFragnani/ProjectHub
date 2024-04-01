import java.util.Scanner;
public class whileNelio {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number until get it the correct: ");
    int x = sc.nextInt();

    while (x != 0) {
      System.out.println("Incorrect number, type it again: ");
      x = sc.nextInt();
    }  

    if (x == 0){
      System.out.println("Congrats, you get it");
    }


    sc.close();
    }
}
