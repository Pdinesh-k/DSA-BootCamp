import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter the value of x : ");
      int x = input.nextInt();
      System.out.print("enter the value of y : ");
      int y = input.nextInt();
      System.out.print("enter the value of z : ");
      int z = input.nextInt();
      System.out.println("the largest element is : " + Math.max(x,Math.max(y,z)));

    }
}
