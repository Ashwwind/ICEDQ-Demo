package automationTask;

public class ToCheckEvenOdd {

    public static void main(String[] args) {
        
        int number = 12;
        
        // To verify if the given number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " :- This is an even number");
        } else {
            System.out.println(number + " :- This is an odd number");
        }
    }
}
