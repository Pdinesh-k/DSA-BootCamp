import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
     int num1=0;
     int num2=1;
     int sum1=0;
     Scanner input = new Scanner(System.in);
     System.out.println("enter the range : ");
     int n = input.nextInt();
     int i=1;
     while(i<=n){
         System.out.println(sum1);
         num1=num2;
         num2=sum1;
         sum1=num1+num2;
         i++;
        }
    }

}
