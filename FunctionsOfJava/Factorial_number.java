import java.util.Scanner;
public class Factorial_number {
    static int Factorial_number_(int num){
        int sum=1;
        for (int i=num;i>=1;i--){
            sum=sum*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=input.nextInt();
        Factorial_number_(num);
        int sum=Factorial_number_(num);
        System.out.print("The factorial of a given number is "+sum);
    }

}
