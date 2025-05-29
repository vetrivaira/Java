package userInput;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        Scanner inputUserData = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String name = inputUserData.nextLine();
        System.out.print("Enter Your Age :");
        int age = inputUserData.nextInt();
        inputUserData.nextLine();
        System.out.print("Enter Your Address :");
        String address = inputUserData.nextLine();

        System.out.println("User Input Name is: "+name);
        System.out.println("User Input Age is: "+age);
        System.out.println("User Input Address is: "+address);
    }

}
