import java.util.Scanner;
public class skorost {
  public static void main(String[] arg) {
    int x = 50;
    Scanner s = new Scanner(System.in);
    System.out.println("Current speed:");
    int a = s.nextInt();

    if (x > a) {
      System.out.println("Below normal");
    } else if (x < a) {
      System.out.println("Exceeded the speed limit");
    } else if (x == a) {
      System.out.println("Set speed");
    }

  }

}
