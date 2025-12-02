public class StrEqual {
    public static void main(String[] args) {
        String s1 = "Karel";
        String s2 = new String("Karel");
        String s3 = s1;

        if (s1 == s2)
        {
            System.out.println("s1 and s2 are equal");
        }
        else
        {
            System.out.println("s1 and s2 are not equal");
        }
        if (s1 == s3)
        {
            System.out.println("s1 and s3 are equal");
        }
        else
        {
            System.out.println("s1 and s3 are not equal");
        }
    }
}