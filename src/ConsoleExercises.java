import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class ConsoleExercises{
    public static void main(String [] args){
//        double pi = 3.14159;
//        System.out.printf(" The value of pi is approximately, %s", pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Enter a word");
        String firstWord = sc.nextLine();
        System.out.printf("your first word is %s", firstWord);

        System.out.println(" \nEnter a 2nd word");
        String secondWord = sc.nextLine();
        System.out.printf("your second word is %s", secondWord);

        System.out.println(" \nEnter a 3rd word");
        String thirdWord = sc.nextLine();
        System.out.printf("your third word is %s", thirdWord);

        System.out.print("Enter the length of the class room");
        int firstNum =sc.nextInt();
        System.out.printf("your number for length is %s", firstNum);

        System.out.println(" \nEnter the width");
        int secondNum = sc.nextInt();
        System.out.printf("your number for width %s", secondNum);

        System.out.printf("\nyou entered %s for your length", firstNum);
        System.out.printf("\nyou entered %s for your width", secondNum);
        double area = firstNum * secondNum;
        System.out.printf("your area is %s", area);


    }
}
