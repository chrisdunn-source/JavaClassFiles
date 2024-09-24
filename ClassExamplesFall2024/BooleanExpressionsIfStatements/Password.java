public class Password {
    /*
    Imagine we were building a program where users had to create and input a password in order to create an account on our site. We might start by creating a Password class that takes a password String as its input, and sets the value of the private String password to the value input by the user
     */
    private String password;//instance variable

    public Password(String passwordInput)//constructor
    {
        password = passwordInput;//assign value to instance variable
    }

    public static void main(String[] args) {
        Password try1 = new Password("ILikeMyPassword");
        try1.passwordStrength();
    }
    //passwordStrength()
    //void method
    //If the password is greater than 8 characters, we will print “Password Strength: Good”, otherwise, we will print “Password Strength: Bad”.
    public void passwordStrength()
    {
        if(password.length() > 8)
        {
            if(password.startsWith("#"))
            {
                System.out.println("Password Strength: Good");
            }
            else
            {
                System.out.println("You need to include a # at the start of your password!");
            }
        }
        else
        {
            System.out.println("Make sure your password is more than 8 characters long!");
        }

    }
}
