import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter your age: ");
        int age = input.nextInt();
        int yes = (7 + (age/2));
        System.out.println (age + "-year olds should date somebody who is at least " + yes + " years old");

        
    }
}

