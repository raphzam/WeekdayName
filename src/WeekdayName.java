import java.util.Scanner;

public class WeekdayName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //An array that holds weekday names which corresponds to its place in the array
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //Declare weekNum
        int weekNum;

        //Keep prompting user for weekNum if they input anything less than 1 or greater than 7
        do {
            System.out.print("Enter the weekday number: ");
            weekNum = input.nextInt();
        } while (weekNum < 1 || weekNum > 7);

        //Pass user input pack in to the array
        //Sunday is at 0, but user would not type 0 day so subtract 1 from user input
        System.out.println("It is " + weekDays[weekNum - 1]);
    }
}