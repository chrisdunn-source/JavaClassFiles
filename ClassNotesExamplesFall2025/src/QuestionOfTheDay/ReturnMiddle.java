package QuestionOfTheDay;
/*
November 5, 2025
Given the following call, what value would be returned for findTheMiddle(18675309)?
Note: str.length() will return the length of a string.
For example if str = "Hello", str.length() will return 5.
 */
public class ReturnMiddle {
    public static void main(String[] args) {
        System.out.println(findTheMiddle(18675309));
    }
    public static String findTheMiddle(int number)
    {
        String stringNum = "" + number;
        int mid = stringNum.length()/2;

        if(stringNum.length() % 2 == 1)
        {
            return stringNum.substring(mid,mid+1);
        }
        else
        {
            return stringNum.substring(mid-1,mid+1);
        }
    }
}
/*
Input: number is 18675309.
String stringNum = "" + number;
    The number is converted to text: stringNum becomes "18675309".
int mid = stringNum.length()/2;
    The length of "18675309" is 8.
    mid is calculated as $8 / 2$, which is 4.
if(stringNum.length() % 2 == 1)
    Is the length (8) odd? No, 8 divided by 2 has a remainder of 0 ($8 \div 2 = 4 remainder 0).
    The condition is false (0 == 1 is false).
The code skips the if block and executes the else block:else { return stringNum.substring(mid-1,mid+1); }
return stringNum.substring(mid-1,mid+1);
    We substitute the value of mid (which is 4) into the arguments:stringNum.substring(4-1, 4+1) becomes stringNum.substring(3, 5).
    The substring function cuts out the characters starting at position 3 and ending before position 5.
    The string "18675309" has positions:| Position | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 || :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- || Digit | 1 | 8 | 6 | 7 | 5 | 3 | 0 | 9 |
    The characters at position 3 and position 4 are '7' and '5'. The resulting text is "75".
    The value returned for findTheMiddle(18675309) would be "75".
 */
