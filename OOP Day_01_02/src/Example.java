import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Example {

    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        int[] CarsArray = new int[n];     // allocating memory to array

        for (int i =0 ; i< n ; i++){

            System.out.printf("Enter the %d Element of the array: ",i+1);
             CarsArray[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for(int j = i+1 ; j < n ; j++){

                if(CarsArray[i] < CarsArray[j]){
                    int temp = CarsArray[i];
                    CarsArray[i] = CarsArray[j];
                    CarsArray[j] = temp;
                }
            }
        }

        for (int i =0 ; i< n ; i++){
            System.out.println(CarsArray[i]);
        }

       */
        /*System.out.println("Enter a weekday :");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

        //performs the following operations on the string s:
        //s.substring(0, 1): Extracts the first character of the string s.
        //.toUpperCase(): Converts the first character to uppercase.
        //+: Concatenates the uppercase first character with the rest of the original string.
        //s.substring(1): Extracts the substring starting from the second character to the end of the original string.
        //.toLowerCase(): Converts the extracted substring to lowercase.
        //The result is the concatenation of the uppercase first character and the lowercase rest of the string.
        //In summary, this code capitalizes the first letter of the string s and converts the rest of the string to lowercase,
        //effectively ensuring that the entire string is in a title case format.

        switch (s){
            case "Monday":
                System.out.println(1);
                break;

            case "Tuesday":
                System.out.println(2);
                break;

            case "Wednesday":
                System.out.println(3);
                break;

            case "Thursday":
                System.out.println(4);
                break;

            case "Friday":
                System.out.println(5);
                break;

            case "Saturday":
                System.out.println(6);
                break;

            case "Sunday":
                System.out.println(7);
                break;

            default:
                System.out.println("Wrong Answer!");
               break;

        }*/
         /*LocalDateTime current_date =  LocalDateTime.now();
        DateTimeFormatter formatter    = DateTimeFormatter.ofPattern( "dd-MM-yyyy HH:mm:ss");

        String formatted_date_time = current_date.format(formatter);
        System.out.println(formatted_date_time);
        */


    }
}

