public class Student {// Student class created
    //1. Instance Variables
    public String name;
    public int studentID;
    public double gpa;

    //2.Constructor
    public Student(String newName, int newstudentID, double newGPA)
    {
        this.name = newName;
        this.studentID = newstudentID;
        this.gpa = newGPA;
    }
    //3.Instance Methods
    //Prints the student's name, ID, and GPA to the console
    public void printStudentInfo()//void method
    {
        System.out.println("Name: " + name);
        System.out.println("Student's ID: " + studentID);
        System.out.println("Student's GPA: " + gpa);
    }
    public void updateGpa(double newGPA)//void method
    {
        this.gpa = newGPA;
        System.out.println(name + "'s GPA has been updated to " + this.gpa);
    }
    public boolean isOnHonorRoll()//non void method
    {
        return this.gpa >= 3.5;
    }

    //4. Static Method
    public static void displaySchoolMessage()
    {
        System.out.println("Welcome to our School!");
    }

    public static void main(String[] args)
    {
        //1. Create two student objects with different data
        Student stu1 = new Student("Carson Dunn",101101,2.6  );
        Student stu2 = new Student("Clark Dunn", 200101, 3.7);
        //2. Call the printStudentInfo() method on each of your students objects
        stu1.printStudentInfo();
        stu2.printStudentInfo();
        //3. Call the isOnHonorRoll method for each student object
        System.out.println("Is " + stu1.name + " on the honor roll? " + stu1.isOnHonorRoll());
        System.out.println("Is " + stu2.name + " on the honor roll? " + stu2.isOnHonorRoll());
        //4. Modify the GPA of one of student objects
        stu1.updateGpa(3.8);
        //5.run the isOnHonorRoll method again
        System.out.println("Is " + stu1.name + " now on the honor roll? " + stu1.isOnHonorRoll());
       //6.Call your static method
        displaySchoolMessage();
    }
}
