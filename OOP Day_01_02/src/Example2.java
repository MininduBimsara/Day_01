import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){

     /*   int y = 125 ;
        double x = y ;
        System.out.println(y);

        String p = "125";
        int q = Integer.parseInt(p) ;
        System.out.println(q);

        int k = 125;
        String l = String.valueOf(k) ;
        System.out.println(l);

        double a = 125.00 ;
        int b = (int) a ;
        System.out.println(b);
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks For the Exam:");
        int marks = input.nextInt();

        if(marks >= 75){
            System.out.println("A");
        } else if (marks >=50) {
            System.out.println("B");
        } else if (marks >=25) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }

}
