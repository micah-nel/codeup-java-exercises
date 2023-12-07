import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args){
//        double discountPercent = 2.3;
//        boolean is2point3 = discountPercent <= 2.3;
//        System.out.println(is2point3);
//        boolean isLoggedIn = true;
//        boolean isAdmin = true;
//
//        if (!isAdmin) {
//            System.out.println("Yay welcome back Admin");
//        }
//        String myName = "Micah";
//        String ceoName ="Micah";
//        if (myName == ceoName) {
//        System.out.println("We have the same name");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//        boolean confirmation = userInput.equals("y");
//        System.out.println(confirmation);

//        String myName = "Micah";
//        if (myName != null){
//            System.out.print("myName had value");
//        }
//        int i = 1;
//        while (i < 10){
//            System.out.println("i is "+ i);
//            i++;
//        }
//        do {
//           System.out.println("i is "+ i);
//            i++;
//        }while (i<=0);

        for(int i = 1; i < 10; i++){
            if (i ==5) {
                continue;
            }
            System.out.println("i is " + i);
        }
    }
}
