import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any fruit name : ");
        String fruit = input.next();
//        switch(fruit){
//            case "Mango" :{
//                System.out.println("king of fruits");
//                break;
//            }
//            case "Apple" :{
//                System.out.println("A sweet red fruit");
//                break;
//            }
//            case "Orange" :{
//                System.out.println("Round fruit");
//                break;
//            }
//            default :
//                System.out.println("enter the valid fruit  : ");

//        }
        switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit ");
            default -> System.out.println("enter the valid fruit");
        }

    }

}
