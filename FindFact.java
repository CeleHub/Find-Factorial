import java.util.Scanner;
public class FindFact {
    public static int fact(int num){
        if (num == 0){
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args){
        // System.out.println(fact(3));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int x = fact(number);
        System.out.println("The factorial of " + number + " is " + x);
    }
}
