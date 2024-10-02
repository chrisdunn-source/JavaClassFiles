package Chapter8;
import java.util.*;
public class Payroll {
    public static void main(String[] args) {
        double rate;
        int hoursWorked;
        double regularPay;
        final int FULL_WEEK = 40;
        final double OT_RATE = 1.5;
        double overtimePay;


        Scanner input = new Scanner(System.in);
        System.out.print("How many hours did you work this week? ");
        hoursWorked = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        rate = input.nextDouble();

        if (hoursWorked > FULL_WEEK)
        {
            regularPay = FULL_WEEK * rate;
            overtimePay =  (hoursWorked - FULL_WEEK) * OT_RATE * rate;
        }
        else
        {
            regularPay = hoursWorked * rate;
            overtimePay = 0.0;
        }
        wageDisplay(regularPay,overtimePay);
    }

    public static void wageDisplay(double rg, double ot)
    {
        System.out.println("Regular Pay: " + rg);
        System.out.println("Overtime Pay: " + ot);
        System.out.println("Regular Pay: $%.2f" + rg);
        System.out.println("Regular Pay: $%.2f" + ot);

    }





}
