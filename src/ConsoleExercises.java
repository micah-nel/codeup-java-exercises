import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class ConsoleExercises{
    public static void main(String [] args){
//        double pi = 3.14159;
//        System.out.printf(" The value of pi is approximately, %s", pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 3 words");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        System.out.printf("First word: %s%nSecond word: %s%nThird word: %s", firstWord,secondWord,thirdWord);

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
