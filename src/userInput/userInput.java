package userInput;
import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name :");  
        String name = scan.nextLine();
        System.out.print("Enter your Age :");
        int age = scan.nextInt();

        System.out.println("User Name is: "+name);
        System.out.println("User Age is: "+age);
    }

}
