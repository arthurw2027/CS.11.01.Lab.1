import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.println ("Enter your age: ");
        Scanner input  = new Scanner(System.in);
        int age = input.nextInt();
        int yes = (100 - age);
        System.out.println(age + "-year olds should read at least " +  yes  + " pages before giving up on a book.");

    }
}
