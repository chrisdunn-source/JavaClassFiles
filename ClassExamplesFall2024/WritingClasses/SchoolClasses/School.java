package SchoolClasses;

public class School {
    private String name;
    private int gradeLevels;
    private int studentCount;
    public static int totalSchools;

    public School()
    {
        this.name = "Unknown School";
        this.gradeLevels = 0;
        this.studentCount = 0;
        totalSchools++;
    }
    public School(String newName, int newGradeLevel, int newStudentCount )
    {
        this.name = newName;
        this.gradeLevels = newGradeLevel;
        this.studentCount = newStudentCount;
        totalSchools++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevels() {
        return gradeLevels;
    }

    public void setGradeLevels(int gradeLevels) {
        this.gradeLevels = gradeLevels;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void addStudents(int addStudents)
    {
        studentCount += addStudents;
    }
    public void removeStudents(int subStudents )
    {
        studentCount -= subStudents;
    }

    public void displaySchoolInfo()
    {
        System.out.println("School Name: " + name);
        System.out.println("Number of Grade Levels: " + gradeLevels );
        System.out.println("Total Number of Students: " + studentCount);
    }
    public static int getTotalSchools()
    {
        return totalSchools;
    }

    public String toString()
    {
     return "School Name: " + getName() + "\nNumber of Grade Levels " + getGradeLevels()  + "\nNumber of Students " + getStudentCount();
    }

}
