import java.util.Scanner;

public class arthmetic {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.println("welcome to my CALCLS");
        System.out.print("please enter your first number ");  // number input
        int a = swap.nextInt();
        System.out.print("please enter your 2nd number");
        int b = swap.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a%b);
        System.out.println(a*b);
    }
    }
