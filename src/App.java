import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creating variables and instance of Scanner class
        int enteredNumber;
        Scanner input = new Scanner(System.in);

        //Getting number from user
        enteredNumber = input.nextInt();

        //Loop through enteredNumber and check divisibility
        int i = 1;
        int totalOfDivisors = 0;
        int numberOfDivisors = 0;
        double average;

        while(i <= enteredNumber)
        {
            if((i % 3 == 0) && (i % 4 == 0))
            {
                totalOfDivisors += i;
                numberOfDivisors++;
            }
            i++;
        }

        //Calculating average of total of numbers which are divisible with 3 and 4
        average = totalOfDivisors / numberOfDivisors;
        System.out.println("Wanted average: " + average);
        input.close();
    }
}
