import java.util.Scanner;
public class Largesttnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value for a");
        int a = input.nextInt();
        System.out.println("enter the value for b");
        int b = input.nextInt();
        System.out.println("enter the value for c");
        int c = input.nextInt();
        int largest = a;
        if(a<b){
            largest = b;
        }
        if(b<c){
            largest=c;
        }
        System.out.println("The value of largest is "+largest);

    }
}
