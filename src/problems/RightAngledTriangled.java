package src.problems;

import java.util.Scanner;

public class RightAngledTriangled {

    public static void main(String[] args) {
        int hypotenuse,base, perpendicular;//0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter h,b,p: ");
        hypotenuse = scanner.nextInt();
        base = scanner.nextInt();
        perpendicular = scanner.nextInt();

        if(hypotenuse*hypotenuse == (perpendicular*perpendicular) + (base*base)){
            System.out.println("Right angled triangled");
        }
        else {
            System.out.println("Not a right angled triangle");
        }

    }
}
