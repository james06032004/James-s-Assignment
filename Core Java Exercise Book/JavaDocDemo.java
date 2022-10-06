import java.util.Scanner;


public class JavaDocDemo {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
      int x = reader.nextInt();
      int y = reader.nextInt();
      int sum = x + y;
      System.out.println("Sum is: " + sum);
  }
}