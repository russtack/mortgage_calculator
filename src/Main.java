import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int principal;

        while(true){
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal>100)
                break;
            System.out.println("Principal must be over 100");

        }

        int months;
        while (true) {
            System.out.print("Months: ");
            months = scanner.nextInt();
            if(months>11)
                break;
            System.out.println("Enter more than 11");

        }

        float interest;
        while (true) {
            System.out.print("Interest: ");
            interest = scanner.nextFloat() / 100 / 12;
            if (interest>0.9/100/12)
                break;
            System.out.println("Interest should be at least 1%");
        }

        double result = (principal*interest*Math.pow((1+interest),months)/(Math.pow((1+interest),months)-1));

        System.out.println("Yr monthly payeoumount is "+result);

    }
}