import java.util.Scanner;

public class Main { public static void main(String[] args){
        Scanner mrish = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = mrish.nextLine();
        System.out.println("hello"+ name);
        System.out.println("enter your  blood group ");

        String blood= mrish.nextLine();
        System.out.println("your  blood group  is "+ blood);
        System.out.println("enter your age  ");

       int age = mrish.nextInt();
        System.out.println("your age  "+ age);
    }
}