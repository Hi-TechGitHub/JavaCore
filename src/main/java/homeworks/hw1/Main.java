package homeworks.hw1;
import homeworks.hw1.other.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print a: ");

        int answerA = in.nextInt();
        System.out.print("Print b: ");
        int answerB = in.nextInt();
        int resPlus = Plus.plus(answerA, answerB);
        int resMinus = Minus.minus(answerA, answerB);
        System.out.println("Answer \"Plus\" equals " + resPlus);
        System.out.println("Answer \"Minus\" equals " + resMinus);
    }
}
