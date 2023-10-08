import java.util.Scanner;

public class armstrong_number {
    static int Counting(int num){
        int count=0;
        while(num>0) {
            int remainder = num % 10;
            if (remainder >= 1) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
    static void Armstrong_Identification(int num, int count){
        int number=num;
        int armstrong=0;
        while(num>0){
            int remainder=num%10;
            armstrong+=(Math.pow(remainder,count));
            num=num/10;
        }
        if (number==armstrong){
            System.out.println(armstrong +" "+"is an Armstrong number");
        }
        else{
            System.out.println(armstrong+" "+"is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int counts=Counting(num);
        Armstrong_Identification(num, counts);
    }
}
