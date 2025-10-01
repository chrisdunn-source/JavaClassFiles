package Chaper18_Arrays;

/*
Problem 1: WeekDays

Class name: WeekDays

    Write a program to instantiate a String array called days to contain all seven days of the week, in whatever language you like (NOT English or Spanish), French, German, etc.) and then output all the array elements in forwards order using a for loop, with a space between each pair of days.
    For any language your instructor does not know, be prepared to provide backup documentation justifying your language choice for weekday names.
    For example, in English, the output would be:
    Sunday Monday Tuesday Wednesday Thursday Friday Saturday
    In Spanish, the output would be:
    domingo lunes martes miercoles jueves viernes sabado
 */
public class WeekDays {
    public static void main(String[] args) {
        String [] norwegianDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < norwegianDays.length; i++)
        {
            System.out.print(norwegianDays[i] + " ");
        }
    }
}
