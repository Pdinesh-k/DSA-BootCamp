public class countnums {
    public static void main(String[] args) {
        int num=353;
        int count=0;
        while(num>0){
            int remainder=num%10;
            if(remainder>=1){
                count++;
            }
            num=num/10;
        }
System.out.println(count);
    }
}
