import java.util.Scanner;
public class prime_number {
    static void prime_number_checker(int num){
        if(num < 2){
            System.out.println("Neither prime nor composite");
            return;
        }
        int i=2;
        while(i <= Math.floor(Math.pow(num, 0.5))) {
            if (num % i == 0) {
                System.out.println("It is not a prime number");
                return;
            }
            i++;
        }
        System.out.println("It is a prime number");

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=input.nextInt();
        prime_number_checker(num);
    }
}