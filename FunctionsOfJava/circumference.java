import java.util.Scanner;
public class circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for Radius : ");
        int radius = input.nextInt();
        double Circumference = 2*3.14*radius;
        System.out.println("The value for circumference is : "+Circumference);
    }
}
