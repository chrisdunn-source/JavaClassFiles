public class Student {
    private int stuNum;
    private double gpa;

    public Student (int num, double avg)
    {
        stuNum = num;
        gpa = avg;
    }
    Student(double avg)
    {
        this(999,avg);
        System.out.println();
    }
    Student (int num)
    {
        this(num,0.00);
    }
    Student()
    {
        this(999,0.00);
    }

    public void showStudent()
    {
        System.out.println("Student #" + stuNum + " gpa is " + gpa);
    }
}
