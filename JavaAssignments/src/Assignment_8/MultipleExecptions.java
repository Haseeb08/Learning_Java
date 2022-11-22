package Assignment_8;

import java.util.*;

/*
Assignment - 8
Create three new types of exceptions.
Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed,
even if a NullPointerException is thrown.
*/
public class MultipleExecptions extends Exception{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Check your eligibility for driving license : ");
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        sc.close();
        try {
            if(age<= 0 || age >100)
                throw new InValidInputException("Enter a valid age.");
            else {
                if(age<18)
                    throw new UnderAgeForLisenceException("Age must be 18 or above for driving license");
                else if(age>50)
                    throw new OverAgeForLisenceException("Age must be 50 or under ror driving license");
                else
                    System.out.println("You are good to have driving license");
            }
        }


        catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
        }
        finally {
            System.out.println("Welcome again!!");
        }
    }
}