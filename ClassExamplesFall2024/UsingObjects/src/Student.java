

public class Student {//class
    private String name; //instance variable
    private int idNumber;//instance variable
    private String className = "AP Computer Science Principles";//instance variable
    private boolean over18;
    public Student(String newName, int newID)//constructor with parameters
    {
        name = newName;
        idNumber = newID;
    }
    public Student()//no args constructor
    {

    }
    public void setName()
    {
        name = "Coach Dunn";
    }
    public void setIdNumber(int newIdNumber)
    {
        idNumber = newIdNumber;
    }
    public String getClassName()
    {
        return className;
    }

    public boolean calculateAge(int age)
    {

        return age > 18;
    }








    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Lucus Gonzelezas", 124523);
        s1.setName();
        System.out.println(s1.name + " " + s1.idNumber);
        System.out.println(s2.name + " " + s2.idNumber);
        s2.setIdNumber(236542);
        System.out.println(s2.name + " " + s2.idNumber);
        System.out.println(s2.getClassName());
        System.out.println(s2.className);


    }



}
